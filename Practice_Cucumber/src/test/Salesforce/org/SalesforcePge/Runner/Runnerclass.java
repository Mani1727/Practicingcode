package org.SalesforcePge.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

import javax.swing.text.html.HTML;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/Features"
        ,glue="src/test/Salesforce/org/SalesforcePge/stepdefinition",tags = "Postivetesting",publish = true
)
public class Runnerclass {
}
