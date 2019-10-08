package com.org.client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;


@Test
public class UserRestAssuredTest {

    public void testCreateUser() {

        //HttpClient request/response - operation
        RestAssured.baseURI = "http://localhost:8080/user";
        RequestSpecification httpreq = RestAssured.given();
        httpreq.contentType(ContentType.JSON);
        httpreq.accept(ContentType.JSON);

        String requestJson = "{\"request\":{\"clientInfo\":{\"appId\":\"GIM\",\"groupId\":\"GIMGRP001\",\"userId\":\"GIUSR0004\",\"password\":\"password\"},\"userInfo\":{\"appId\":\"GIM\",\"groupId\":\"GIMGRP001\",\"userId\":\"GIUSR0010\",\"name\":\"Test1506\",\"address\":\"Bedok Res\",\"country\":\"SG\",\"roleId\":\"1001\",\"email\":\"tes1503@gmail.com\",\"password\":\"password\",\"createdDate\":\"2019-05-02T03:22:45\",\"modifiedDate\":\"2019-05-02T03:22:45\"}}}";
        System.out.println("JSON Request : \n" + requestJson);
        httpreq.body(requestJson);
        System.out.println("Print - Http Request Header : \n" + httpreq.get().getHeaders());

        Response response = httpreq.request(Method.POST, "/createuser");
        System.out.println("Response : \n" + response.getBody().asString());

        //Cucumber operation
        JsonPath jsonpath = response.jsonPath();
        System.out.println(" status code : " + jsonpath.get("response.status.responseCode"));
        System.out.println(" userinfo :  " + jsonpath.get("response.userInfo"));
    }
}






    /*    JSONObject requestParams = new JSONObject();
    requestParams.put("request","");
    requestParams.put("clientInfo","");
    requestParams.put("appId","GIT");
    requestParams.put("groupId","GITGRP001");
    requestParams.put("userId","GIUSR0004");
    requestParams.put("password","password");
    requestParams.put("userInfo","");
    requestParams.put("appId","GIM");
    requestParams.put("groupId","GIMGRP001");
    requestParams.put("userId","GIUSR0011");
    requestParams.put("name","Test1506");
    requestParams.put("address","Bedok Res");
    requestParams.put("country","SG");
    requestParams.put("roleId","1001");
    requestParams.put("email","tes1503@gmail.com\\");
    requestParams.put("createdDate","2019-05-02T03:22:45");
    requestParams.put("modifiedDate","2019-05-02T03:22:45");*/


        /*public void testgetUserById(){
        RestAssured.baseURI="http://localhost:8080/user";
        RequestSpecification httpreq=RestAssured.given();
        Response response= httpreq.request(Method.GET,"/userbyuserid/GIUSR0001");
        //System.out.println("Response string "+response.asString());
        //response.getBody().prettyPrint();
        //System.out.println("\n Response in pretty format "+response.getBody().prettyPrint()+" ***" );
        JsonPath jsonpath=response.jsonPath();
        System.out.println(" status code- response code : "+jsonpath.get("response.status.responseCode"));
        System.out.println(" status code "+jsonpath.get("response.status"));
        System.out.println(" userindo :  "+jsonpath.get("response.userInfo"));
    }*/
