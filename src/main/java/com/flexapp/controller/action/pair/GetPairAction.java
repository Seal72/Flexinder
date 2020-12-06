package com.flexapp.controller.action.pair;

import com.flexapp.entity.session.UserSessionInfo;
import com.flexapp.entity.user.UserPairBean;
import com.google.gson.Gson;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class GetPairAction extends ActionSupport {

    private String jsonResponse;

    public String getPair() throws Exception {
        UserSessionInfo userSessionInfo = (UserSessionInfo) ServletActionContext.getRequest().getSession().getAttribute("CURRENT_USER_INFO");

        UserPairBean[] pairs = {
                new UserPairBean("Alex", "Karpov", 21, new LinkedList<String>(Arrays.asList("Coding", "Guitar"))),
                new UserPairBean("Artyom", "Moroz", 20, new LinkedList<String>(Arrays.asList("Coding", "Teaching"))),
                new UserPairBean("Kirill", "Malinovskiy", 20, new LinkedList<String>(Arrays.asList("Coding", "Startups"))),
                new UserPairBean("Maxim", "Dvoryakov", 20, new LinkedList<String>(Arrays.asList("Coding", "Football")))
        };

        Random r = new Random();

        Gson gson = new Gson();
        setJsonResponse(gson.toJson(pairs[Math.abs(r.nextInt() % 4)]));

        return "success";
    }

    public String getJsonResponse() {
        return jsonResponse;
    }

    public void setJsonResponse(String jsonResponse) {
        this.jsonResponse = jsonResponse;
    }
}
