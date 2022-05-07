package org.SalesforcePge.stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.*;
import org.SalesforcePge.page.Loginpage;

public class LoginpageStep {
    Loginpage Login=new Loginpage();

    @When("the User Login the Salesforce Application")
    public void the_user_login_the_salesforce_application() throws InterruptedException {

        Login.Login1();
    }
    @Then("the User should see the Salesforce Homepage")
    public void the_user_should_see_the_salesforce_homepage() {

        System.out.println("Success1");
    }
    @Then("When the User Clicks the Biling Tab")
    public void when_the_user_clicks_the_biling_tab() {
        System.out.println("Success2");
    }
    @Then("the Billing Screen Should Display")
    public void the_billing_screen_should_display() {
        System.out.println("Success3");
    }
    @When("the User clicks Generates or Regenerate the Billing for August 2021")
    public void the_user_clicks_generates_regenerate_the_billing_for_august() {

    }
    @Then("it Should Throw Success message")
    public void it_should_throw_success_message() {

    }
    @Then("the User should select the invoice tab")
    public void the_user_should_select_the_invoice_tab() {

    }
    @Then("Verify Generated invoice for the Student Who has Program Start date before August2021 .")
    public void verify_generated_invoice_for_the_student_who_has_program_start_date_before_august2021() {

    }

    @When("the User Enters the tries to Login the fucntion without Valid login credentials")
    public void the_user_enters_the_tries_to_login_the_fucntion_without_valid_login_credentials() {
        Login.invalidlogin();
    }
    @Then("the error message should display")
    public void the_error_message_should_display() {
       Login.invalidloginerrormessage();
    }

    @When("the User Enters the USername but tries to Login without the password")
    public void the_user_enters_the_u_sername_but_tries_to_login_without_the_password() {
        Login.tryingwithoutpwd();
    }
    @Then("the error message should display as {string}")
    public void the_error_message_should_display_as(String string) {

        Login.tryingwithpwderror();
    }





}
