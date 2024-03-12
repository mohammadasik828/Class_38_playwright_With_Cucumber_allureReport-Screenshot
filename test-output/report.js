$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/CustomerLoginFunctionality.feature");
formatter.feature({
  "name": "Customer login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Customer Home Page slogan Welcome david",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I am in landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.i_am_in_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login menu",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.i_click_on_login_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Customer Login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.click_on_customer_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter User Id",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.enter_user_id()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Enter Password",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.i_enter_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I Click on Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.i_click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that I am in Home Page Slogan Welcome David",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.CustomerLoginFunctionality.verify_that_i_am_in_home_page_slogan_welcome_david()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});