$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 2,
  "name": "",
  "description": "\tlogin feature",
  "id": "",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 398768,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@FirstDryRunTest"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "user name and password is entered",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "designation"
      ],
      "line": 20
    },
    {
      "cells": [
        "medha",
        "testing123",
        "engineer"
      ],
      "line": 21
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 22,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Validate the user details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.browser_is_open()"
});
formatter.result({
  "duration": 157866689,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_name_and_password_is_entered(DataTable)"
});
formatter.result({
  "duration": 4652296,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_submit()"
});
formatter.result({
  "duration": 114051,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_details()"
});
formatter.result({
  "duration": 171487,
  "status": "passed"
});
formatter.after({
  "duration": 190359,
  "status": "passed"
});
});