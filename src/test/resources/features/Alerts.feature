
@navigate
Feature: User should be able to click second button and accept the alert

# Must click on 'On button click, alert will appear after 5 seconds'
# Must accept alert
  Scenario:
    Given the user is on the alert page
    And   the user should be able to click second button
    Then  after 5 second alerts is displayed
    Then  the user accept the alert