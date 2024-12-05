Feature: Signup

  Scenario: SignUp Functionality for new User
    Given Browser is opened
    And User is available in the create a new account page
    When User enters the First name and Last name
    When User enters the Email, Password and Confirm Password
    And User clicks the Create an account button
    Then User is successfully completed Signup functionality
    And User is navigated to Account information page
