package com.org.model.dto;


import com.org.model.User;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonProperty;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.annotation.JsonRootName;
import org.json.simple.JSONObject;

@JsonRootName("request")
public class UserRequest {
private static final long serialVersionUID=1L;

    @JsonProperty("clientInfo")
    public User clientInfo;
    @JsonProperty("userInfo")
    public User userInfo;

    public UserRequest() {
    }

    public User getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(User clientInfo) {
        this.clientInfo = clientInfo;
    }

    public User getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(User userInfo) {
        this.userInfo = userInfo;
    }


    public String generateJson(UserRequest userRequest){
        JSONObject requestParams = new JSONObject();
        User clientInfo=new User();
        User userInfo=new User();
        requestParams.put(clientInfo,userRequest.getClientInfo());

        return null;
    }


}
