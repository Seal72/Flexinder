package com.flexapp.controller.action.userEvaluation;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.session.UserSessionInfo;
import com.flexapp.model.dao.daoRepository.ClientDAO;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.List;
import java.util.Random;

public class LikeDislikeAction extends ActionSupport {

    private int actionUserId;

    private int currentUserId;

    private String jsonResponse;

    public String likeUser() throws Exception {

        ClientDAO clientDao = new ClientDAO();

        List clients = clientDao.getAllClients();

        Gson gson = new Gson();
        Random r = new Random();
        Client client = (Client) clients.get(Math.abs(r.nextInt() % clients.size()));
        setJsonResponse(gson.toJson(client));
        return "success";
    }

    public String dislikeUser() throws Exception {

        ClientDAO clientDao = new ClientDAO();

        List clients = clientDao.getAllClients();

        Gson gson = new Gson();
        Random r = new Random();
        Client client = (Client) clients.get(Math.abs(r.nextInt() % clients.size()));
        setJsonResponse(gson.toJson(client));
        return "success";
    }

    public String getRandomUser() throws Exception {

        ClientDAO clientDao = new ClientDAO();

        List clients = clientDao.getAllClients();

        Gson gson = new Gson();
        Random r = new Random();
        Client client = (Client) clients.get(Math.abs(r.nextInt() % clients.size()));

        setJsonResponse(gson.toJson(client));
        return "success";
    }

    public int getActionUserId() {
        return actionUserId;
    }

    public void setActionUserId(int actionUserId) {
        this.actionUserId = actionUserId;
    }

    public int getCurrentUserId() {
        return currentUserId;
    }

    public void setCurrentUserId(int currentUserId) {
        this.currentUserId = currentUserId;
    }

    public String getJsonResponse() {
        return jsonResponse;
    }

    public void setJsonResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }
}
