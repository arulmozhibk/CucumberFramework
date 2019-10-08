package com.org.client;

import com.org.model.HttpClient;
import groovy.transform.Synchronized;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class HttpClientHandler {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static HttpClientHandler httpClientHandler;

    private HttpClientHandler(){
    }

    public static HttpClientHandler createInstance(){
         if(httpClientHandler==null){
             synchronized(HttpClientHandler.class){
                 if(httpClientHandler==null){
                     httpClientHandler=new HttpClientHandler();
                     return httpClientHandler;
                 }
             }
         }
     return httpClientHandler;
    }

    public Response restConnector(HttpClient httpClient,String module){
        logger.debug("Invoking rest connector..");
        System.out.println("Base URI "+httpClient.getBaseURI());
        RestAssured.baseURI = "http://localhost:8080/user";

        RequestSpecification httpRequest = RestAssured.given();
        httpRequest.contentType(httpClient.getContentType());
        httpRequest.accept(httpClient.getAcceptContentType());
        httpRequest.body(httpClient.getJsonRequest());
        Response response = httpRequest.request(httpClient.getMethod(), httpClient.getServiceURL());
        logger.debug("Print Response : "+response);
        return response;
    }

}
