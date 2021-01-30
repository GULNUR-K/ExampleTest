$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/ModalDialogs.feature");
formatter.feature({
  "name": "Close the small modal",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "User can move on button",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the Modal Dialogs page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ModalDialogsDef.the_user_is_on_the_Modal_Dialogs_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to select Small modal button",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ModalDialogsDef.the_user_should_be_able_to_select_Small_modal_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to close the modal",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.ModalDialogsDef.the_user_should_be_able_to_close_the_modal()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});