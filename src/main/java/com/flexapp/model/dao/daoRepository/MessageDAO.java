package com.flexapp.model.dao.daoRepository;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.jpa.Message;
import com.flexapp.entity.jpa.Pair;
import com.flexapp.model.dao.exception.DAOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
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
                    "(message.userIdFrom.clientId = " + pair.getFirstUserId().getClientId() + " and message.userIdTo.clientId = " + pair.getSecondUserId().getClientId() + ") or " +
                            "(message.userIdTo.clientId = " + pair.getFirstUserId().getClientId() + " and message.userIdFrom.clientId = " + pair.getSecondUserId().getClientId() + "))");
            messages = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return messages;
    }

    public void addMessage(Message message){
        EntityTransaction t = entityManager.getTransaction();
        t.begin();
        entityManager.createNativeQuery("insert into message (user_id_from, user_id_to, content) values (" + message.getUserIdFrom().getClientId() + ", " + message.getUserIdTo().getClientId() + ", '" + message.getContent() + "')").executeUpdate();
        entityManager.flush();
        t.commit();
    }

}
