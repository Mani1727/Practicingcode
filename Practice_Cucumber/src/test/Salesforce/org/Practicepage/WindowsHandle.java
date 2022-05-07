package org.Practicepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandle extends Pracicepage {

    @FindBy(xpath = "//legend[contains(text(),'Switch Window Example')]")
    WebElement SwitchhandleHeading;
    @FindBy(xpath = "//legend[contains(text(),'Switch Window Example')]/following-sibling::button")
    WebElement openWindowbutton;
    @FindBy(xpath = "//a[contains(text(),'Home')]")
    WebElement HOmebutton;
    @FindBy(xpath = "//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-popup-background sumome-react-wysiwyg-background']/following-sibling::div[6]")
    WebElement Closebutto;
//    @FindBy(xpath = "")
//    WebElement ;


    WindowsHandle()
    {
        PageFactory.initElements(driver,this);
    }

    public void handlingwindow()
    {
        WebDriverWait wait =new WebDriverWait(driver,20);
        Actions A = new Actions(driver);
        A.moveToElement(openWindowbutton).click().build().perform();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> Ite = window.iterator();
        String Parentwindow = Ite.next();
        String ChildWindow = Ite.next();
        driver.switchTo().window(ChildWindow);
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='sumome-react-wysiwyg-component sumome-react-wysiwyg-popup-background sumome-react-wysiwyg-background']/following-sibling::div")));
        Closebutto.click();
        wait.until(ExpectedConditions.visibilityOf(HOmebutton));
        A.moveToElement(HOmebutton).build().perform();
        HOmebutton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='header-upper']/descendant::a[contains(text(),'Home')]")));
        driver.close();
        driver.switchTo().window(Parentwindow);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Practice Page')]")));




    }


}
