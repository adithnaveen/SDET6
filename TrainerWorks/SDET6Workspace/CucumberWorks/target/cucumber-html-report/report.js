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
formatter.scenario({
  "line": 5,
  "name": "",
  "description": "",
  "id": ";",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Browser is open",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user name and password is entered",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "designation"
      ],
      "line": 8
    },
    {
      "cells": [
        "harry",
        "peter",
        "engineer"
      ],
      "line": 9
    },
    {
      "cells": [
        "ben",
        "password",
        "team leader"
      ],
      "line": 10
    },
    {
      "cells": [
        "gayathri",
        "hello",
        "business\\\u0027 analyst"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "click on submit",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "Validate the user details",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStep.browser_is_open()"
});
formatter.result({
  "duration": 157663612,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.user_name_and_password_is_entered(DataTable)"
});
formatter.result({
  "duration": 3970452,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.click_on_submit()"
});
formatter.result({
  "duration": 92307,
  "status": "passed"
});
formatter.match({
  "location": "LoginStep.validate_the_user_details()"
});
formatter.result({
  "duration": 692922,
  "status": "passed"
});
});