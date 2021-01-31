$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/PracticeForm.feature");
formatter.feature({
  "name": "Student should be able to enter all details into student registration form and submit",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@wipi"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the student is on the practice form page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_is_on_the_practice_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student should be able to enter all details into inboxes using following information",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student should be able to select gender \"Male\" and hobbies \"Reading\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_be_able_to_select_gender_and_hobbies(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The student should able to upload a picture",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_able_to_upload_a_picture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select state \"NCR\" and city \"Delhi\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.select_state_and_city(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation for correct entering(Positive)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wipi"
    }
  ]
});
formatter.step({
  "name": "The student should be able to submit",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_be_able_to_submit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "message Thanks for submitting the form should be displayed on new popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.message_Thanks_for_submitting_the_form_should_be_displayed_on_new_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the student is on the practice form page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_is_on_the_practice_form_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student should be able to enter all details into inboxes using following information",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(java.util.Map\u003cjava.lang.String, java.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the student should be able to select gender \"Male\" and hobbies \"Reading\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_be_able_to_select_gender_and_hobbies(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The student should able to upload a picture",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_able_to_upload_a_picture()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select state \"NCR\" and city \"Delhi\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.select_state_and_city(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Validation for correct entering(Negative)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wipi"
    }
  ]
});
formatter.step({
  "name": "The student should be able to clear one mandatory info",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.the_student_should_be_able_to_clear_one_mandatory_info()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The student should be able to see red color for missing info",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.PracticeFormStepDef.The_student_should_be_able_to_see_red_color_for_missing_info()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});