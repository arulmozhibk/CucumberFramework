package com.org.def;

import com.org.client.HttpClientHandler;
import com.org.consts.Configs;
import com.org.model.HttpClient;
import com.org.model.User;
import com.org.model.dto.UserRequest;
import com.org.utils.Utility;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import groovy.util.ConfigSlurper;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateUserDef  {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    HttpClientHandler httpClientHandler= HttpClientHandler.createInstance();
    HttpClient httpClient=new HttpClient();
    UserRequest userRequest = new UserRequest();

    Scenario scenario;
    @Before
    public void before(Scenario scenario) {
        System.out.println("Scenario Name "+scenario.getName());
    }

    @Given("As i'm an admin user, creating user in environment {string}")
    public void as_i_m_an_admin_user_creating_user_in_environment(String env) {
        httpClient=Utility.initializeHttpClient(env);
        httpClient.setServiceURL(Configs.CREATE_USER_URL);
    }

    @When("Executing in following as {string}")
    public void executing_in_following_as(String Scenario) {
        System.out.println("Executing scenario : "+Scenario);
    }

    @When("Admin user details as {string} {string} {string} {string}")
    public void admin_user_details_as(String string, String string2, String string3, String string4) {
            User clientInfo=new User();
            clientInfo.setAppId(string);
            clientInfo.setGroupId(string2);
            clientInfo.setUserId(string3);
            clientInfo.setPassword(string4);
            userRequest.setClientInfo(clientInfo);
    }

    @When("Entering user details as  {string} {string} {string} {string} {string} {string} {string} {string} {string}")
    public void entering_user_details_as(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9) {
        User userInfo=new User();
        userInfo.setAppId(string);
        userInfo.setGroupId(string2);
        userInfo.setUserId(string3);
        userInfo.setName(string4);
        userInfo.setAddress(string5);
        userInfo.setCountry(string6);
        userInfo.setRoleId(string7);
        userInfo.setEmail(string8);
        userInfo.setPassword(string9);
        userRequest.setUserInfo(userInfo);
    }

    @Then("API Response is {string}")
    public void api_Response_is(String string) {
       String jsonRequest=Utility.modeltoJson(userRequest);
       httpClient.setJsonRequest(jsonRequest);
       Response response=httpClientHandler.restConnector(httpClient, "/createuser");
       JsonPath jsonpath = response.jsonPath();
       System.out.println("Printing the reponse:  "+ response.getBody().asString());
       Assert.assertEquals(string,jsonpath.get("response.statusCode.responseCode"));;
    }


}
