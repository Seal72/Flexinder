package com.flexapp.model.dao.daoRepository;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.jpa.Like;
import com.flexapp.entity.jpa.Pair;
import com.flexapp.model.dao.exception.DAOException;

import javax.persistence.Query;
import java.util.List;


public class PairDAO extends DAO {

    public PairDAO() throws DAOException {
        super();
    }

    public List getPairs() throws DAOException {
        List pairs = null;
        try {
            Query query = entityManager.createQuery("select Pair from Pair pair");
            pairs = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return pairs;
    }

    public Pair getPairByUsers(Client firstUserId, Client secontUserId) throws DAOException {
        Pair pair = null;
        try {
            Query query = entityManager.createQuery("select pair from Pair pair where (" +
                    "(pair.firstUserId.clientId = " + firstUserId.getClientId() + " and pair.secondUserId.clientId = " + secontUserId.getClientId() + ") or " +
                            "(pair.secondUserId.clientId = " + secontUserId.getClientId() + " and pair.firstUserId.clientId = " + firstUserId.getClientId() + "))");
            pair = (Pair) query.getSingleResult();
        } catch (Exception e) {
            System.out.println(e);
        }
        return pair;
    }

    public void addPair(Pair pair){
        entityManager.merge(pair);
    }

}
