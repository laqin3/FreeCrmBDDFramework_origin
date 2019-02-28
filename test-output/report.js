$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/laqin3/eclipse-workspace/cucumber/FreeCrmBDDFramework/src/main/java/features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "Free CRM login feature",
  "description": "",
  "id": "free-crm-login-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Free Crm Login Test Scenario",
  "description": "",
  "id": "free-crm-login-feature;free-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "user is already in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "title of login page is free crm",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "click on Login_in button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user enters username and user enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "user is on home page",
  "keyword": "And "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_already_in_login_page()"
});
formatter.result({
  "duration": 7930176545,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.title_of_login_page_is_free_crm()"
});
formatter.result({
  "duration": 24551639,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.click_on_Login_in_button()"
});
formatter.result({
  "duration": 3803141029,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_enters_username_and_user_enter_password()"
});
formatter.result({
  "duration": 427150631,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 124071042,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_home_page()"
});
formatter.result({
  "duration": 2903461285,
  "status": "passed"
});
});