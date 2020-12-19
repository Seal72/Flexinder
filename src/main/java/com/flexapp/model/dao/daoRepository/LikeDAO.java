package com.flexapp.model.dao.daoRepository;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.jpa.Like;
import com.flexapp.entity.jpa.Message;
import com.flexapp.entity.jpa.Pair;
import com.flexapp.model.dao.exception.DAOException;

import javax.persistence.Query;
import java.util.List;


public class LikeDAO extends DAO {

    public LikeDAO() throws DAOException {
        super();
    }

    public List getLikes() throws DAOException {
        List likes = null;
        try {
            Query query = entityManager.createQuery("select like from Like like");
            likes = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return likes;
    }

    public List getLikeByUsers(Client userId, Client targetUserId) throws DAOException {
        List likes = null;
        try {
            Query query = entityManager.createQuery("select like from Like like where (" +
                    "(like.userId = " + userId + " and like.targetUserId = " + targetUserId + ") or " +
                            "(like.userId = " + targetUserId + " and like.targetUserId = " + userId + "))");
            likes = query.getResultList();
        } catch (Exception e) {
            System.out.println(e);
        }
        return likes;
    }

    public void addLike(Like like){
        entityManager.merge(like);
    }

}
