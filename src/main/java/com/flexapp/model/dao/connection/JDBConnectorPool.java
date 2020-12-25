package com.flexapp.model.dao.connection;

import com.flexapp.model.dao.exception.DBConnectionException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class JDBConnectorPool {

	private static JDBConnectorPool instance;
    private static String DB_URL;
    private static String user;
    private static String password;

	private final int initConnectionsCount = 5;
	private BlockingQueue<Connection> connections;
	
    public JDBConnectorPool() throws DBConnectionException {
    	if (instance != null) {
            return;
        }
        DB_URL = "jdbc:postgresql://localhost/flexinder";
        user = "postgres";
        password = "123";

        connections = new ArrayBlockingQueue<>(initConnectionsCount);
        try {
        	for (int i = 0; i < initConnectionsCount; ++i) {
                Connection connection = DriverManager.getConnection(DB_URL, user, password);
                if (connection == null) {
                    throw new DBConnectionException("Driver type is not correct in URL " + DB_URL + ".");
                }
                connections.add(connection);
                //logger.info("Connection " + i + " esteblished");
        	}
        } catch (SQLException e) {
            throw new DBConnectionException("Failed to establish connection", e);
        }
	}
    
    /**
     * return instance DBConnectorPool or create it
     *
     * @return instance of Singleton
     */
    public static synchronized JDBConnectorPool getInstance() throws DBConnectionException {
        if (instance == null) {
            instance = new JDBConnectorPool();
        }
        return instance;
    }
    
    public Connection getConnection() throws DBConnectionException {
    	 try {
             //logger.info("got connection from the pool");
             return connections.take();
         } catch (InterruptedException e) {
             throw new DBConnectionException("Failed to get connection from pool", e);
         }
    }
    
    /**
     * deinit database pool of connections
     *
     * @throws DBConnectionException if properties file loading error
     */
    public void deinitDBConnector() throws DBConnectionException {
        try {
        	while (connections.size() > 0) {
                connections.take().close();
            }
        } catch (SQLException e) {
            throw new DBConnectionException("Could not close database connection ", e);
        }catch (InterruptedException e) {
            throw new DBConnectionException("Problem with concurrent queue", e);
        }
        //logger.info("DB pool of connections deinited");
    }
    
    /**
     * return the connection to pool
     *
     * @param connection to add back to pool
     */
    public synchronized void releaseConnection(Connection connection) throws DBConnectionException {
        try {
            if (connection.isClosed()) {
                Connection newConnection = DriverManager.getConnection(DB_URL, user, password);
                connections.add(newConnection);
            } else {
                connections.add(connection);
            }
        } catch (SQLException e) {
            throw new DBConnectionException("Failed to establish connection", e);
        }

    }
    
}
