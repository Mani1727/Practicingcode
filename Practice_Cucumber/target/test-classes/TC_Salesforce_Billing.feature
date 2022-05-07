Feature: Salesforce Billing and Invoice
  Scenario: Demodummy
    When the User Login the Salesforce Application
    Then the User should see the Salesforce Homepage
    And When the User Clicks the Biling Tab
    Then the Billing Screen Should Display
    When the User clicks Generates or Regenerate the Billing for August 2021
    Then it Should Throw Success message
    And the User should select the invoice tab
    And Verify Generated invoice for the Student Who has Program Start date before August2021 .


