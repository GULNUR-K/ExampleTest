
@wip1
Feature: Student should be able to enter all details into student registration form and submit
#  All mandatory details must be entered
#  A picture must be uploaded
#  On success a popup will be displayed detailing all information entered
#  Validation will be displayed on any mandatory fields that have not been entered correctly
  Background:
    Given the student is on the practice form page
    And the student should be able to enter all details into inboxes using following information
      | First Name      | Student                  |
      | Last Name       | Example                  |
      | Email           | studentExample@gmail.com |
      | Mobile          | 08976453421              |
      | Date of Birth   | 12 Feb 1986              |
      | Subjects        | History                  |
      | Current Address | 18 October Road          |
    Then the student should be able to select gender "Male" and hobbies "Reading"
    Then The student should able to upload a picture
    Then select state "NCR" and city "Delhi"

  Scenario: Validation for correct entering(Positive)
    And  The student should be able to submit
    Then message Thanks for submitting the form should be displayed on new popup

  Scenario: Validation for correct entering(Negative)
    And  The student should be able to clear one mandatory info
    Then The student should be able to see red color for missing info
