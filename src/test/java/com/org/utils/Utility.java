package com.org.utils;

import com.org.consts.Configs;
import com.org.model.HttpClient;
import com.org.model.dto.UserRequest;
import io.cucumber.datatable.dependency.com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import org.json.simple.JSONObject;

public class Utility {

    public static HttpClient initializeHttpClient(String env){
        HttpClient httpClient=new HttpClient();
        httpClient.setBaseURI(Utility.generateURL(env));
        httpClient.setAcceptContentType(ContentType.JSON);
        httpClient.setContentType(ContentType.JSON);
        httpClient.setMethod(Method.POST);
        return httpClient;
    }

    public static String generateURL(String env){
        String environment=null;
        if(env.equals("DEV") ){
            environment=Configs.BASEURI_DEV;
        }else if(env.equals("SIT")){
            environment= Configs.BASEURI_SIT;
        }else if(env.equals("UAT")){
            environment= Configs.BASEURI_UAT;
        }
        return environment;
    }


    public static String modeltoJson(UserRequest userRequest){
        ObjectMapper Obj = new ObjectMapper();
        String jsonStr="No Status received";
        try {
            jsonStr = Obj.writeValueAsString(userRequest);

            StringBuffer jsonBuilder=new StringBuffer();
            jsonBuilder.append("{\"request\":");
            jsonBuilder.append(jsonStr);
            jsonBuilder.append("}");
            jsonStr=jsonBuilder.toString();
            System.out.println("Printing modeltoJson "+jsonStr);
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsonStr;
    }

}
