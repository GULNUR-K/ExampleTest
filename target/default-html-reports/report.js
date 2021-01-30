$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/DatePicker.feature");
formatter.feature({
  "name": "Use the date picker to set the date to 1 month in the future",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "User can Drag and drop element",
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
  "name": "the user is on the Date Picker page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.DatePickerStepDef.the_user_is_on_the_Date_Picker_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to select a date using date picker from Select Date field",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.DatePickerStepDef.the_user_should_be_able_to_select_a_date_using_date_picker_from_Select_Date_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to select a month from today\u0027s date",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.DatePickerStepDef.the_user_should_be_able_to_select_a_month_from_today_s_date()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});