Feature: Salesforce Billing and Invoice

  @Postivetesting
  Scenario:
    When the User Login the Salesforce Application
    Then the User should see the Salesforce Homepage
    And When the User Clicks the Biling Tab
    Then the Billing Screen Should Display
    When the User clicks Generates or Regenerate the Billing for August 2021
    Then it Should Throw Success message
    And the User should select the invoice tab
    And Verify Generated invoice for the Student Who has Program Start date before August2021 .

    @NegativeTesting
    Scenario: Loginwithinvalid data
      When the User Enters the tries to Login the fucntion without Valid login credentials
      Then the error message should display

      @NegativeTesting
      Scenario: Loginwithout password
        When the User Enters the USername but tries to Login without the password
        Then the error message should display as "enter password"



