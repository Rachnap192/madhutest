$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("samplelogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Validation",
  "description": "As a CS Rep I want to Login into Customer Service Portal",
  "id": "login-page-validation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login Success",
  "description": "",
  "id": "login-page-validation;login-success",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "The User is in the  login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "The User enters the valid credentials \"khegde-consultant@scholastic.com\" and \"welcome1\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User clicks on Login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should be redirected to Home page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition_login.the_User_is_in_the_login_page()"
});
formatter.result({
  "duration": 11573833543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "khegde-consultant@scholastic.com",
      "offset": 39
    },
    {
      "val": "welcome1",
      "offset": 78
    }
  ],
  "location": "StepDefinition_login.the_User_enters_the_valid_credentials_and(String,String)"
});
formatter.result({
  "duration": 1635065364,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_login.user_clicks_on_Login_button()"
});
formatter.result({
  "duration": 931480953,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition_login.user_should_be_redirected_to_Home_page()"
});
formatter.result({
  "duration": 245396,
  "status": "passed"
});
});