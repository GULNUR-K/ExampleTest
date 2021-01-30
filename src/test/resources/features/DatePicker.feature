
@wip
Feature: Use the date picker to set the date to 1 month in the future

 # Must select a date using date picker from 'Select Date' field
 # Must be 1 month from today's date

  Scenario: User can Drag and drop element
    Given the user is on the Date Picker page
    Then  the user should be able to select a date using date picker from Select Date field
    And   the user should be able to select a month from today's date