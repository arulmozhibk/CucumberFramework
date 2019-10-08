package com.org.model;


import org.jetbrains.annotations.NotNull;

public class Status {

    public String responseCode;
    public String responseMessage;

    public Status() {
    }

    public Status(String responseCode, String responseMessage) {
        this.responseCode = responseCode;
        this.responseMessage = responseMessage;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }

    public String getResponseCode() {   return responseCode;   }

    @NotNull
    @Override
    public String toString() {
        return "Status{" +
                "responseCode='" + responseCode + '\'' +
                ", responseMessage='" + responseMessage + '\'' +
                '}';
    }
}
