$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/cucum6.feature");
formatter.feature({
  "name": "Search",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Search",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user enters product",
  "rows": [
    {
      "cells": [
        "iphone"
      ]
    },
    {
      "cells": [
        "travel kit"
      ]
    },
    {
      "cells": [
        "headphone"
      ]
    }
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "exercise6.user_enters_product(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify products displayed",
  "keyword": "And "
});
formatter.match({
  "location": "exercise6.verify_products_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the app",
  "keyword": "Then "
});
formatter.match({
  "location": "exercise6.close_the_app()"
});
formatter.result({
  "status": "passed"
});
});