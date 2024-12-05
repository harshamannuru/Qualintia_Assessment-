Feature: Signin

  Scenario: Sigin Fuctionality
    Given browser is opene
    And User is available in the signin page
    When User enters the email and password
    And User clicks the signin button
    Then User is navigated to dashboard page
