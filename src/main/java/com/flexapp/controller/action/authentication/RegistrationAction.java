package com.flexapp.controller.action.authentication;

import com.flexapp.entity.jpa.Client;
import com.flexapp.model.dao.daoRepository.ClientDAO;
import com.opensymphony.xwork2.ActionSupport;

public class RegistrationAction extends ActionSupport {

    private String login;
    private String password;
    private String firstName;
    private String lastName;
    private String gender;

    public String logup() throws Exception {
        ClientDAO clientDao = new ClientDAO();
        Client client = new Client();
        client.setLogin(login);
        client.setPassword(password);
        client.setFirstName(firstName);
        client.setLastName(lastName);
        client.setGender(gender);
        clientDao.addClient(client);
        return "success";
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
