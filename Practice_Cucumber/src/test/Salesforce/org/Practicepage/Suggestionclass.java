package org.Practicepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Suggestionclass extends Pracicepage{

    @FindBy(xpath="//legend[contains(text(),'Suggession Class Example')]")
    WebElement Suggestionclasslabelname  ;

    @FindBy(xpath="//legend[contains(text(),'Suggession Class Example')]/following-sibling::input")
    WebElement  textbox ;
    @FindBy(xpath = "//li[@class='ui-menu-item']/div")
    List<WebElement>  listofsuggestion ;

    Suggestionclass()
    {
        PageFactory.initElements(driver, this);
    }

   public void verifyingtheheading()
    {
        String s;
        s = Suggestionclasslabelname.getText();
        Assert.assertEquals(s,"Suggession Class Example");
    }

    public void entertext(String a) throws InterruptedException {
        textbox.sendKeys(a);
        Thread.sleep(800);
        for(WebElement l:listofsuggestion)
        {
           if(l.getText()!=null)
           {
               String s= l.getText();

               if(s.equalsIgnoreCase(a))
               {
                   Actions ax=new Actions(driver);
                   ax.moveToElement(l).click().build().perform();

                   Thread.sleep(1000);
                   break;
               }

               else
               {
                   continue;
               }

           }
           else
           {
               System.out.println("the no suggestion present");
           }


        }

    }




}
