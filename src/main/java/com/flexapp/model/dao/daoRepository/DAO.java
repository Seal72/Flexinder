package com.flexapp.model.dao.daoRepository;


import com.flexapp.model.dao.exception.DAOException;
import com.flexapp.model.dao.exception.DBConnectionException;
import com.flexapp.model.dao.connection.JDBConnectorPool;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public abstract class DAO {

    private EntityManagerFactory factory;

    public EntityManager entityManager;

    protected DAO() throws DAOException /*throws DAOException*/ {
        factory = Persistence.createEntityManagerFactory("Test_Local");
        entityManager = getEntityManagerFactory().createEntityManager();
    }


    protected EntityManagerFactory getEntityManagerFactory() {
        return factory;
    }

}
