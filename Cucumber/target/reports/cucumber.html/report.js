$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Feature/loginTest.feature");
formatter.feature({
  "name": "Validate login page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is in DemoQA boostore login page",
  "keyword": "Given "
});
formatter.match({
  "location": "steps.StepDefinition.user_is_in_DemoQA_boostore_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username \"harryPotter\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password \"Abcd@1234\"",
  "keyword": "When "
});
formatter.match({
  "location": "steps.StepDefinition.user_enters_password(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks on login button",
  "keyword": "And "
});
formatter.match({
  "location": "steps.StepDefinition.clicks_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should land on profile page",
  "keyword": "Then "
});
formatter.match({
  "location": "steps.StepDefinition.user_should_land_on_profile_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});