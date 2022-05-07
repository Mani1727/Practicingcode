package org.Practicepage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Webtableassignement extends Pracicepage {
    @FindBy(xpath = "//legend[contains(text(),'Web Table Example')]/parent::fieldset/table[@id='product']/tbody")
    WebElement Webtable;
    @FindBy(xpath = "//legend[contains(text(),'Web Table Example')]/parent::fieldset/table[@id='product']/tbody/tr")
    WebElement row ;
//    @FindBy(xpath = "")
//    WebElement ;

    Webtableassignement()
    {
        PageFactory.initElements(driver, this);
    }

    public void finding_Total_Number_in_Webtable()
    {
        //scrolling down to the webtable
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scroll(0,600)");
//        for(WebElement data: Webtable)
        {

        }


    }
}
