
@wip
Feature: Hover over the button and the input field

#  Must hover over the 'Hover me to see' button
#  Must hover over the 'Hover me to see' field

  Scenario: User can move on button
    Given the user is on the Tool Tips page
    And   the user should be able to hover over the Hover me to see button
    Then  the user should be able to hover over the Hover me to see field