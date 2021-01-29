$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/StudentRegister.feature");
formatter.feature({
  "name": "Student should be able to enter all details into student registration",
  "description": "  form and submit",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@navigate"
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
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_is_on_the_practice_form_page()"
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
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\n\tat com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(RegisterStepDef.java:39)\n\tat ✽.the student should be able to enter all details into inboxes using following information(file:///Users/macbookpro/idealProjects/AdvancedTechTest/src/test/resources/features/StudentRegister.feature:11)\n",
  "status": "pending"
});
formatter.step({
  "name": "the student should be able to select gender \"female\" and hobbies \"music\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_select_gender_and_hobbies(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The student should able to upload a picture",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_able_to_upload_a_picture()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select state \"NCR\" and city \"Delhi\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.select_state_and_city(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The student should be able to submit",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validation for correct entering(Positive)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.step({
  "name": "message Thanks for submitting the form should be displayed on new popup",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.message_Thanks_for_submitting_the_form_should_be_displayed_on_new_popup()"
});
formatter.result({
  "status": "skipped"
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
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_is_on_the_practice_form_page()"
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
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\n\tat com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_enter_all_details_into_inboxes_using_following_information(RegisterStepDef.java:39)\n\tat ✽.the student should be able to enter all details into inboxes using following information(file:///Users/macbookpro/idealProjects/AdvancedTechTest/src/test/resources/features/StudentRegister.feature:11)\n",
  "status": "pending"
});
formatter.step({
  "name": "the student should be able to select gender \"female\" and hobbies \"music\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_select_gender_and_hobbies(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The student should able to upload a picture",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_able_to_upload_a_picture()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "select state \"NCR\" and city \"Delhi\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.select_state_and_city(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "The student should be able to submit",
  "keyword": "And "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.the_student_should_be_able_to_submit()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "Validation for correct entering(Negative)",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@navigate"
    }
  ]
});
formatter.step({
  "name": "Message will not be displayed if mandatory fields have not been entered correctly",
  "keyword": "Then "
});
formatter.match({
  "location": "com.demoqa.step_definitions.RegisterStepDef.message_will_not_be_displayed_if_mandatory_fields_have_not_been_entered_correctly()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});