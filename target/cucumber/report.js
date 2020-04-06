$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("appUnderTest.feature");
formatter.feature({
  "line": 1,
  "name": "Fedex Application Login",
  "description": "",
  "id": "fedex-application-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login Sign Up",
  "description": "",
  "id": "fedex-application-login;login-sign-up",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User is on Fedex login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User fills up the registration page with following information",
  "rows": [
    {
      "cells": [
        "Nehal",
        "Hasnain",
        "abc@ymail.ca",
        "abc@ymail.ca",
        "White Oaks",
        "Whitby",
        "1000",
        "5877008080",
        "nehal1234",
        "password1234",
        "password1234",
        "answer"
      ],
      "line": 6
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User selects Province, Country, Secret quesion",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User checks the check boxes",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Fdex user account is created succesfully",
  "keyword": "Then "
});
formatter.match({
  "location": "fedexStepDefination.user_is_on_fedex_login_page()"
});
formatter.result({
  "duration": 13936414300,
  "status": "passed"
});
formatter.match({
  "location": "fedexStepDefination.user_fills_up_the_registration_page_with_following_information(DataTable)"
});
formatter.result({
  "duration": 938587600,
  "status": "passed"
});
formatter.match({
  "location": "fedexStepDefination.user_selects_province_country_secret_quesion()"
});
formatter.result({
  "duration": 194934700,
  "status": "passed"
});
formatter.match({
  "location": "fedexStepDefination.user_checks_the_check_boxes()"
});
formatter.result({
  "duration": 240146300,
  "status": "passed"
});
formatter.match({
  "location": "fedexStepDefination.fdex_user_account_is_created_succesfully()"
});
formatter.result({
  "duration": 76800,
  "status": "passed"
});
});