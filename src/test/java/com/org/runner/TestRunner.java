package com.org.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:features/user/CreateUser.feature",glue = "com.org.def",plugin = "html:target/cucumber-report-html")

/*
plugin = "html:target/cucumber-report-html
plugin = "json:target/cucumber-report-json.json
plugin = "junit:target/cucumber-report-junit.xml

*/
public class TestRunner {

//Run this class without glue and step def to get the def in console log

}
