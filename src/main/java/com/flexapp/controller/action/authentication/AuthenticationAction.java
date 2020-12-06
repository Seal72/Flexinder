package com.flexapp.controller.action.authentication;

import com.flexapp.entity.session.UserSessionInfo;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class AuthenticationAction extends ActionSupport {

    private String login;

    private String password;

    public String login() throws Exception {

        String sampleLogin = "alex";
        String samplePassword = "123123";

        String result;

        if(login.equals(sampleLogin) && password.equals(samplePassword)){
            result = "success";
            UserSessionInfo userSessionInfo = new UserSessionInfo();
            userSessionInfo.setLogin(login);
            userSessionInfo.setUserId(13);
            ServletActionContext.getRequest().getSession().setAttribute("CURRENT_USER_INFO", userSessionInfo);

        } else {
            result = "notAuthorized";
        }

        return result;
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
