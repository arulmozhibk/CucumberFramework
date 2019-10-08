package com.org.def;

import cucumber.api.java.en.*;
import org.jetbrains.annotations.NotNull;
import org.junit.Assert;

public class LoginTestDefinition {

    @Given("I'm on login page url")
    public void i_m_on_login_page_url() {
        System.out.println("Scenario 1: Login Page url");
    }

    @When("I enter correct username as {string} and password as {string}")
    public void i_enter_correct_username_as_and_password_as(String string, String string2) {
        System.out.println("Entering Correct username and password");    }

    @Then("I should able to go home page")
    public void i_should_able_to_go_home_page() {
        System.out.println("Login successfully");

    }

    @Given("I'm on login Page url")
    public void i_m_on_login_Page_url() {
        System.out.println("Scenario 2: Login Page url");
    }

    @When("I enter incorrect username as {string} and password as {string}")
    public void i_enter_incorrect_username_as_and_password_as(String string, String string2) {
        System.out.println("Entering Correct username and wrong password");

    }

    @Then("I should go be in login page")
    public void i_should_go_be_in_login_page() {
        System.out.println("Login Failed, please enter correct password");
        /*int result =100;
        Assert.assertEquals(200,result);*/
    }


    @When("I enter multiple username as {string} and password as {string}")
    public void i_enter_multiple_username_as_and_password_as(String string, String string2) {
        System.out.println("Entering Correct multiple username and password");

    }

    @Then("I should go be in login page with response code {string}")
    public void i_should_go_be_in_login_page_with_response_code(@NotNull String responsecode) {
        Assert.assertEquals(Integer.parseInt(responsecode),100);
    }

}
