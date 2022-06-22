Feature: GoogleSearch

  Scenario: Login to HRm
    Given the chrome is invoked and the url opened
    When the Login Username and Password entered
    Then the Homepage should open
    And the logout should process.

