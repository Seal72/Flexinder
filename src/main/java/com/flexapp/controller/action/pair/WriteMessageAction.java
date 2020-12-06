package com.flexapp.controller.action.pair;

import com.flexapp.entity.session.UserSessionInfo;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;


public class WriteMessageAction extends ActionSupport {

    private String message;

    public String writeMessage() throws Exception {
        UserSessionInfo userSessionInfo = (UserSessionInfo) ServletActionContext.getRequest().getSession().getAttribute("CURRENT_USER_INFO");

        return "success";
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
