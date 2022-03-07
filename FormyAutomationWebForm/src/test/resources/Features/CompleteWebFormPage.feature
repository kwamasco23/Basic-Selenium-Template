@test

Feature: Complete out FormyWebForm

  Scenario: Fill out Formy Webform with data
    Given User navigates to Formy Web Form
    When User Fills the webform
    And Users clicks submit button
    Then Webform should be filled and completed