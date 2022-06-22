package org.salesforce.steps;

import io.cucumber.java.en.*;
import org.salesforce.Utilies.BaseClass;
import org.salesforce.page.Loginpage;

public class Billing_Invoice {
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



}
