package com.flexapp.controller.action.pair;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.jpa.Message;
import com.flexapp.entity.jpa.Pair;
import com.flexapp.entity.session.UserSessionInfo;
import com.flexapp.model.dao.daoRepository.ClientDAO;
import com.flexapp.model.dao.daoRepository.MessageDAO;
import com.flexapp.model.dao.daoRepository.PairDAO;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.List;


public class GerMessagesAction extends ActionSupport {

    private String jsonResponse;
    private String message;

    public String getMessages1() throws Exception {
        MessageDAO messageDAO = new MessageDAO();
        PairDAO pairDAO = new PairDAO();
        ClientDAO clientDAO = new ClientDAO();
        Client client1 = clientDAO.getClientById(101);
        Client client2 = clientDAO.getClientById(1);
        Pair pair = pairDAO.getPairByUsers(client1, client2);
        List messages = messageDAO.getMessagesByPair(pair);

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(messages));
        return "success";
    }

    public String getMessages2() throws Exception {
        MessageDAO messageDAO = new MessageDAO();
        PairDAO pairDAO = new PairDAO();
        ClientDAO clientDAO = new ClientDAO();
        Client client1 = clientDAO.getClientById(101);
        Client client2 = clientDAO.getClientById(2);
        Pair pair = pairDAO.getPairByUsers(client1, client2);
        List messages = messageDAO.getMessagesByPair(pair);

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(messages));
        return "success";
    }

    public String getMessages3() throws Exception {
        MessageDAO messageDAO = new MessageDAO();
        PairDAO pairDAO = new PairDAO();
        ClientDAO clientDAO = new ClientDAO();
        Client client1 = clientDAO.getClientById(101);
        Client client2 = clientDAO.getClientById(3);
        Pair pair = pairDAO.getPairByUsers(client1, client2);
        List messages = messageDAO.getMessagesByPair(pair);

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(messages));
        return "success";
    }

    public String sendMessage1() throws Exception {
        MessageDAO messageDAO = new MessageDAO();
        PairDAO pairDAO = new PairDAO();
        ClientDAO clientDAO = new ClientDAO();
        Client client1 = clientDAO.getClientById(101);
        Client client2 = clientDAO.getClientById(1);
        Pair pair = pairDAO.getPairByUsers(client1, client2);
        Message messageObj = new Message();
        messageObj.setUserIdFrom(client1);
        messageObj.setUserIdTo(client2);
        messageObj.setContent(message);
        messageDAO.addMessage(messageObj);

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(message));
        return "success";
    }

    public String sendMessage2() throws Exception {
        MessageDAO messageDAO = new MessageDAO();
        PairDAO pairDAO = new PairDAO();
        ClientDAO clientDAO = new ClientDAO();
        Client client1 = clientDAO.getClientById(101);
        Client client2 = clientDAO.getClientById(2);
        Pair pair = pairDAO.getPairByUsers(client1, client2);
        Message messageObj = new Message();
        messageObj.setUserIdFrom(client1);
        messageObj.setUserIdTo(client2);
        messageObj.setContent(message);
        messageDAO.addMessage(messageObj);

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(message));
        return "success";
    }

    public String sendMessage3() throws Exception {
        MessageDAO messageDAO = new MessageDAO();
        PairDAO pairDAO = new PairDAO();
        ClientDAO clientDAO = new ClientDAO();
        Client client1 = clientDAO.getClientById(101);
        Client client2 = clientDAO.getClientById(3);
        Pair pair = pairDAO.getPairByUsers(client1, client2);
        Message messageObj = new Message();
        messageObj.setUserIdFrom(client1);
        messageObj.setUserIdTo(client2);
        messageObj.setContent(message);
        messageDAO.addMessage(messageObj);

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(message));
        return "success";
    }

    public String getJsonResponse() {
        return jsonResponse;
    }

    public void setJsonResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
