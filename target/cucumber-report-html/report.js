$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:features/user/CreateUser.feature");
formatter.feature({
  "name": "Create User Regression",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "As i\u0027m an admin user, creating user in environment \"SIT\"",
  "keyword": "Given "
});
formatter.step({
  "name": "Executing in following as \"\u003cScenario\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Admin user details as \"\u003cClientAppId\u003e\" \"\u003cClientGroupId\u003e\" \"\u003cClientUserId\u003e\" \"\u003cClientPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Entering user details as  \"\u003cappId\u003e\" \"\u003cgroupId\u003e\" \"\u003cuserId\u003e\" \"\u003cname\u003e\" \"\u003caddress\u003e\" \"\u003ccountry\u003e\" \"\u003croleId\u003e\" \"\u003cemail\u003e\" \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "API Response is \"\u003cresult\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Scenario",
        "ClientAppId",
        "ClientGroupId",
        "ClientUserId",
        "ClientPassword",
        "appId",
        "groupId",
        "userId",
        "name",
        "address",
        "country",
        "roleId",
        "email",
        "password",
        "result"
      ]
    },
    {
      "cells": [
        "CreateUserWithvalid Admin \u0026 UserInfo",
        "GIT",
        "GITGRP002",
        "GIUSR0009",
        "password",
        "GIT",
        "GITGRP015",
        "GIUSR0012",
        "Test1506",
        "Bedok Res",
        "SG",
        "3000",
        "tes1503@gmail.com",
        "password",
        "100"
      ]
    },
    {
      "cells": [
        "CreateUserWith invalid",
        "GIT",
        "GITGRP002",
        "GIUSR0005",
        "password",
        "GIT",
        "GITGRP015",
        "GIUSR0012",
        "Test1506",
        "Bedok Res",
        "SG",
        "3000",
        "tes1503@gmail.com",
        "password",
        "104"
      ]
    },
    {
      "cells": [
        "Incorrect credentials",
        "GIT",
        "GITGRP002",
        "GIUSR0005",
        "pass",
        "GIT",
        "GITGRP015",
        "GIUSR0012",
        "Test1506",
        "Bedok Res",
        "SG",
        "3000",
        "tes1503@gmail.com",
        "password",
        "105"
      ]
    }
  ]
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As i\u0027m an admin user, creating user in environment \"SIT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUserDef.as_i_m_an_admin_user_creating_user_in_environment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Executing in following as \"CreateUserWithvalid Admin \u0026 UserInfo\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserDef.executing_in_following_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin user details as \"GIT\" \"GITGRP002\" \"GIUSR0009\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserDef.admin_user_details_as(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entering user details as  \"GIT\" \"GITGRP015\" \"GIUSR0012\" \"Test1506\" \"Bedok Res\" \"SG\" \"3000\" \"tes1503@gmail.com\" \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserDef.entering_user_details_as(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API Response is \"100\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserDef.api_Response_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As i\u0027m an admin user, creating user in environment \"SIT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUserDef.as_i_m_an_admin_user_creating_user_in_environment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Executing in following as \"CreateUserWith invalid\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserDef.executing_in_following_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin user details as \"GIT\" \"GITGRP002\" \"GIUSR0005\" \"password\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserDef.admin_user_details_as(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entering user details as  \"GIT\" \"GITGRP015\" \"GIUSR0012\" \"Test1506\" \"Bedok Res\" \"SG\" \"3000\" \"tes1503@gmail.com\" \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserDef.entering_user_details_as(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API Response is \"104\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserDef.api_Response_is(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "As i\u0027m an admin user, creating user in environment \"SIT\"",
  "keyword": "Given "
});
formatter.match({
  "location": "CreateUserDef.as_i_m_an_admin_user_creating_user_in_environment(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Executing in following as \"Incorrect credentials\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserDef.executing_in_following_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Admin user details as \"GIT\" \"GITGRP002\" \"GIUSR0005\" \"pass\"",
  "keyword": "When "
});
formatter.match({
  "location": "CreateUserDef.admin_user_details_as(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Entering user details as  \"GIT\" \"GITGRP015\" \"GIUSR0012\" \"Test1506\" \"Bedok Res\" \"SG\" \"3000\" \"tes1503@gmail.com\" \"password\"",
  "keyword": "And "
});
formatter.match({
  "location": "CreateUserDef.entering_user_details_as(String,String,String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "API Response is \"105\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateUserDef.api_Response_is(String)"
});
formatter.result({
  "status": "passed"
});
});