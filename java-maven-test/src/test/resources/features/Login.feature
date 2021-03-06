Feature: Logging in to an existing twitter handle
  I want to be able to log in and check my feeds in twitter

  Scenario: Check that error message displays when user logs into AT govt with invalid credentials
    Given I am in "https://at.govt.nz/"
    When I click 'Log in'
    And login as "John" with password "Doe"
    Then my login should be rejected with an error message
