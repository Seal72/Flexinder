package com.flexapp.controller.action.userEvaluation;

import com.flexapp.entity.session.UserSessionInfo;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

public class LikeDislikeAction extends ActionSupport {

    private int actionUserId;

    private int currentUserId;

    public String likeUser() throws Exception {
        UserSessionInfo userSessionInfo = (UserSessionInfo) ServletActionContext.getRequest().getSession().getAttribute("CURRENT_USER_INFO");

        setCurrentUserId(userSessionInfo.getUserId());

        return "success";
    }

    public String dislikeUser() throws Exception {
        UserSessionInfo userSessionInfo = (UserSessionInfo) ServletActionContext.getRequest().getSession().getAttribute("CURRENT_USER_INFO");

        setCurrentUserId(userSessionInfo.getUserId());

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
}
