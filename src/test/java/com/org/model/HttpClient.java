package com.org.model;

import io.restassured.http.ContentType;
import io.restassured.http.Method;

public class HttpClient {

    public String baseURI;
    public ContentType ContentType;
    public ContentType acceptContentType;
    public String  jsonRequest;
    public Method method;
    public String serviceURL;


    public HttpClient() {
    }

    public String getBaseURI() {
        return baseURI;
    }

    public void setBaseURI(String baseURI) {
        this.baseURI = baseURI;
    }

    public io.restassured.http.ContentType getContentType() {
        return ContentType;
    }

    public void setContentType(io.restassured.http.ContentType contentType) {
        ContentType = contentType;
    }

    public io.restassured.http.ContentType getAcceptContentType() {
        return acceptContentType;
    }

    public void setAcceptContentType(io.restassured.http.ContentType acceptContentType) {
        this.acceptContentType = acceptContentType;
    }

    public String getJsonRequest() {
        return jsonRequest;
    }

    public void setJsonRequest(String jsonRequest) {
        this.jsonRequest = jsonRequest;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public String getServiceURL() {
        return serviceURL;
    }

    public void setServiceURL(String serviceURL) {
        this.serviceURL = serviceURL;
    }
}
