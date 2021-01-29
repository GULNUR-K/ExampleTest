
@navigate
Feature: User should be able to click second button and accept the alert

# Must click on 'On button click, alert will appear after 5 seconds'
# Must accept alert
  Scenario: the user should have accept alert
    Given the user is on the alert page
    And   the user should be able to click second button
    Then  the user accept the alert