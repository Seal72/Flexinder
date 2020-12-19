package com.flexapp.model.dao.daoRepository;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.jpa.Message;
import com.flexapp.entity.jpa.Pair;
import com.flexapp.model.dao.exception.DAOException;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;


public class MessageDAO extends DAO {

    public MessageDAO() throws DAOException {
        super();
    }

    public List getMessages() throws DAOException {
        List messages = null;
        try {
            Query query = entityManager.createQuery("select message from Message message");
            messages = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return messages;
    }

    public List getMessagesByPair(Pair pair) throws DAOException {
        List messages = null;
        try {
            Query query = entityManager.createQuery("select message from Message message where (" +
                    "(message.userIdFrom = " + pair.getFirstUserId() + " and message.userIdTo = " + pair.getSecondUserId() + ") or " +
                            "(message.userIdTo = " + pair.getFirstUserId() + " and message.userIdFrom = " + pair.getSecondUserId() + "))");
            messages = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return messages;
    }

    public void addMessage(Message message){
        entityManager.merge(message);
    }

}
