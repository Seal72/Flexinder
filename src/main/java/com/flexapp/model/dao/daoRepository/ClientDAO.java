package com.flexapp.model.dao.daoRepository;

import com.flexapp.entity.jpa.Client;
import com.flexapp.model.dao.exception.DAOException;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class ClientDAO extends DAO {

    public ClientDAO() throws DAOException {
        super();
    }

    public List getAllClients() throws DAOException {
        List clients = null;
        try {
            Query query = entityManager.createQuery("select client from Client client");
            clients = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return clients;
    }

    public Client getClientById(int clientId) throws DAOException {
        Client client = null;
        try {
            Query query = entityManager.createQuery("select client from Client client where client.clientId = " + clientId);
            client = (Client) query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
        }
        return client;
    }

    public Client getClientByLoginPassword(String login, String password) throws DAOException {
        Client client = null;
        try {
            Query query = entityManager.createQuery("select client from Client client where client.login like '" + login + "' and client.password like '" + password + "'");
            client = (Client) query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
        }
        return client;
    }

    public void addClient(Client client){
        entityManager.merge(client);
    }

}
