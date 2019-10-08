Feature: Create User Regression

  Scenario Outline:
    Given As i'm an admin user, creating user in environment "SIT"
    When Executing in following as "<Scenario>"
    When Admin user details as "<ClientAppId>" "<ClientGroupId>" "<ClientUserId>" "<ClientPassword>"
    And  Entering user details as  "<appId>" "<groupId>" "<userId>" "<name>" "<address>" "<country>" "<roleId>" "<email>" "<password>"
    Then API Response is "<result>"


    Examples:
    ##Positive scenarios
      | Scenario                            | ClientAppId | ClientGroupId | ClientUserId | ClientPassword | appId | groupId   | userId    | name     | address   | country | roleId | email             | password | result |
    #  | CreateUserWithvalid Admin & UserInfo | GIT_ADMIN_APPID | GIT_ADMIN_GROUPID | GIT_ADMIN_USERID | GIT_ADMIN_PASSWORD | GIT_USER_APPID | GIT_USER_GROUPID | GIT_USER_USERID | GIT_USER_NAME | GIT_USER_ADDRESS | GIT_USER_COUNTRY | GIT_USER_ROLEID | GIT_USER_EMAIL    | GIT_USER_PASSWORD | 100    |
      | CreateUserWithvalid Admin & UserInfo | GIT         | GITGRP002     | GIUSR0009    | password       | GIT   | GITGRP015 | GIUSR0012 | Test1506 | Bedok Res | SG      | 3000   | tes1503@gmail.com | password | 100    |
    ##Negative scenarios
    #  | Is admin exist                       | GIT_ADMIN_APPID | GIT_ADMIN_GROUPID | DummyAdminID     | GIT_ADMIN_PASSWORD | GIT_USER_APPID | GIT_USER_GROUPID | GIT_USER_USERID | GIT_USER_NAME | GIT_USER_ADDRESS | GIT_USER_COUNTRY | GIT_USER_ROLEID | GIT_USER_EMAIL    | GIT_USER_PASSWORD | 101    |

      | CreateUserWith invalid               | GIT         | GITGRP002     | GIUSR0005    | password       | GIT   | GITGRP015 | GIUSR0012 | Test1506 | Bedok Res | SG      | 3000   | tes1503@gmail.com | password | 104    |
      | Incorrect credentials                | GIT         | GITGRP002     | GIUSR0005    | pass           | GIT   | GITGRP015 | GIUSR0012 | Test1506 | Bedok Res | SG      | 3000   | tes1503@gmail.com | password | 105    |



