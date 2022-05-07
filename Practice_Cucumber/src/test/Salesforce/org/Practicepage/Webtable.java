package org.Practicepage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Webtable extends Pracicepage {

    @FindBy(xpath = "//legend[contains(text(),'Web Table Example')]/parent::fieldset/table[@id='product']/tbody/tr/th")
    List<WebElement> columnheading;
    @FindBy(xpath = "//legend[contains(text(),'Web Table Example')]/parent::fieldset/table[@id='product']/tbody/tr/td[3]")
    List<WebElement> webtabledata;
    private boolean Matched1;
    //    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
//    @FindBy(xpath = "")
//    WebElement ;
    String s;
    int jkk;
    int c = 2;


    Webtable() {
        PageFactory.initElements(driver, this);
    }

    public void Webtableretrievingdata() throws ParseException {

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scroll(0,600)");
        NumberFormat f = NumberFormat.getNumberInstance();

      /*  for (WebElement data : webtabledata)
        {
            List<String>names= Arrays.asList(data.getText());

        }
*/


        for (WebElement data : webtabledata) {
            jkk = Integer.parseInt(data.getText());
            int i = 1;
            System.out.println(jkk);
            if (jkk == 25) {
                List<WebElement> matched = driver.findElements(By.xpath("//legend[contains(text(),'Web Table Example')]/parent::fieldset/table[@id='product']/tbody/tr[" + (c) + "]/td[1]"));
                for (WebElement match : matched) {
                    s = match.getText();
                    System.out.println("the matched data in  = " + c + "  " + s);
                }


            } else
                System.out.println("no matched found");
            c++;

        }

    }


}
