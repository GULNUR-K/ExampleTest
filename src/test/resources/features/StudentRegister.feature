
@navigate
Feature: Student should be able to enter all details into student registration
  form and submit
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
    Then the student should be able to select gender "female" and hobbies "music"
    Then The student should able to upload a picture
    Then select state "NCR" and city "Delhi"
    And  The student should be able to submit

  Scenario: Validation for correct entering(Positive)
    Then message Thanks for submitting the form should be displayed on new popup

  Scenario: Validation for correct entering(Negative)
    Then Message will not be displayed if mandatory fields have not been entered correctly

