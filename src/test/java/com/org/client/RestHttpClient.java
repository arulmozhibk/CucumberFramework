package com.org.client;

import com.org.model.Status;
import com.org.model.dto.UserRequest;
import com.org.model.dto.UserResponse;
import gherkin.deps.com.google.gson.Gson;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RestHttpClient {

    public String getRestClient(@NotNull String restServiceUrl){
        String finalResponseCode="0";
        try {
            URL url = new URL(restServiceUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setDoOutput(true);
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/json");
            String input = "{\"request\":{\"clientInfo\":{\"appId\":\"GIT\",\"groupId\":\"GITGRP001\",\"userId\":\"GIUSR0004\",\"password\":\"password\"},\"userInfo\":{\"appId\":\"GIM\",\"groupId\":\"GIMGRP001\",\"userId\":\"GIUSR0011\",\"name\":\"Test1506\",\"address\":\"Bedok Res\",\"country\":\"SG\",\"roleId\":\"1001\",\"email\":\"tes1503@gmail.com\",\"password\":\"password\",\"createdDate\":\"2019-05-02T03:22:45\",\"modifiedDate\":\"2019-05-02T03:22:45\"}}}";
            OutputStream os = conn.getOutputStream();
            os.write(input.getBytes());
            os.flush();
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                finalResponseCode =String.valueOf(conn.getResponseCode());
                System.out.println(" HTTP Response code : "                       +finalResponseCode);
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            String output;
            System.out.println("Output from Server .... \n");
            while ((output = br.readLine()) != null) {
                finalResponseCode=output;
            }
            conn.disconnect();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return finalResponseCode;
    }
    public String modeltoJson(UserRequest userRequest){
        ObjectMapper Obj = new ObjectMapper();
        String jsonStr="No Status received";
        try {
             jsonStr = Obj.writeValueAsString(userRequest);
        }catch (Exception e){
            e.printStackTrace();
        }
    return jsonStr;
    }

    public UserResponse jsonStringtoModel(String strStatusCode){
        ObjectMapper Obj = new ObjectMapper();
        UserResponse userResponse=new UserResponse();
        Gson json=new Gson();

        try {
            System.out.println("strStatusCode  : "+strStatusCode);
            userResponse= json.fromJson(strStatusCode,UserResponse.class);
            System.out.println("Model value  : "+userResponse);
        }catch (Exception e){
            e.printStackTrace();
        }
        return userResponse;
    }

    public static void main(String args[])throws Exception
    {
        RestHttpClient restHttpClient=new RestHttpClient();
        String url="http://localhost:8080/user/createuser";
        String input="{\"request\":{\"clientInfo\":{\"appId\":\"GIT\",\"groupId\":\"GITGRP001\",\"userId\":\"GIUSR0004\",\"password\":\"password\"},\"userInfo\":{\"appId\":\"GIM\",\"groupId\":\"GIMGRP001\",\"userId\":\"GIUSR0011\",\"name\":\"Test1506\",\"address\":\"Bedok Res\",\"country\":\"SG\",\"roleId\":\"1001\",\"email\":\"tes1503@gmail.com\",\"password\":\"password\",\"createdDate\":\"2019-05-02T03:22:45\",\"modifiedDate\":\"2019-05-02T03:22:45\"}}}";
        restHttpClient.getRestClient(url);
        String responseCode;

        responseCode=restHttpClient.getRestClient(url);
        UserResponse userRes=restHttpClient.jsonStringtoModel(responseCode);
        //responseCode.
        System.out.println("Response code : "+userRes);
        System.out.println("Statuscode : "+userRes.getStatus()+" ");
        System.out.println(" Statuscode Response code : "+userRes.getStatus().getResponseCode()+" ");
        System.out.println(" userinfo : "+userRes.getUserInfo()+" ");
    }
}