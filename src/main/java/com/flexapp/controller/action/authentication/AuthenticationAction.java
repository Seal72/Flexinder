package com.flexapp.controller.action.authentication;

import com.flexapp.entity.jpa.Client;
import com.flexapp.entity.session.UserSessionInfo;
import com.flexapp.model.dao.daoRepository.ClientDAO;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class AuthenticationAction extends ActionSupport {

    private String login;
    private String password;

    public String login() throws Exception {
        ClientDAO clientDao = new ClientDAO();
        Client client = clientDao.getClientByLoginPassword(login, password);
        if(client != null){
            return "success";
        } else {
            return "notAuthorized";
        }
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
}
