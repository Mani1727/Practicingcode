package org.Practicepage;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class tabHandle extends Pracicepage{

    @FindBy(id = "opentab")
    WebElement tabbutton;
    @FindBy(xpath = "//div[@class='header-upper']/descendant::a[contains(text(),'Home')]")
    WebElement HomeButoninnewtab;
   /* @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
    @FindBy(xpath = "")
    WebElement ;
*/
    tabHandle()
    {
        PageFactory.initElements(driver,this);
    }

    public void tab()
    {
        String currentHandle= driver.getWindowHandle();
        tabbutton.click();
        Actions action= new Actions(driver);
        Set<String> handles=driver.getWindowHandles();
        for(String actual: handles)
        {

            if(!actual.equalsIgnoreCase(currentHandle))
            {
                //switching to the opened tab
                driver.switchTo().window(actual);

              action.moveToElement(HomeButoninnewtab).click().build().perform();

            }
        }
    }


}
