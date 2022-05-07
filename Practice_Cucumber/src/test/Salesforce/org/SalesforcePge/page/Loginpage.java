package org.SalesforcePge.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.salesforce.Utilies.BaseClass;
import org.testng.Assert;

public class Loginpage extends BaseClass {


    @FindBy(xpath = "//input[@id='username']")
    WebElement Login_Username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement Login_PWd;
    @FindBy(xpath = "//input[@id='Login']")
    WebElement Login_LoginButton;
    @FindBy(xpath = "//div[@id='theloginform']/descendant::div[@id='error']")
    WebElement Errormessage;

    private String Username = "vijaynagaraj23@gmail.com.psasprod";
    private String PWd = "Pizzaburger@2303";
    WebDriverWait w =new WebDriverWait(driver,6);
    private String invalildUsername = "vijaynagaraj23gmail.com.psasprod";
    private String invalidPWd = "Pizzaburger2303";





    public Loginpage() {
        PageFactory.initElements(driver, this);
    }


    public void Login1() throws InterruptedException {
        driver.get("https://login.salesforce.com/?locale=in");
        Thread.sleep(2000);
        Login_Username.sendKeys(Username);
        Login_PWd.sendKeys(PWd);
        Login_LoginButton.click();

    }
    public void invalidlogin() {
        driver.get("https://login.salesforce.com/?locale=in");
        w.until(ExpectedConditions.titleIs("Login | Salesforce"));
        Login_Username.sendKeys(invalildUsername);
        Login_PWd.sendKeys(invalidPWd);
        Login_LoginButton.click();
    }

    public void invalidloginerrormessage()
    {

        w.until(ExpectedConditions.visibilityOf(Errormessage));
        Assert.assertEquals(Errormessage.getText(),"Please check your username and password. If you still can't log in, contact your Salesforce administrator.");


    }

    public void tryingwithoutpwd() {
        driver.get("https://login.salesforce.com/?locale=in");
        w.until(ExpectedConditions.titleIs("Login | Salesforce"));
        Login_Username.sendKeys(Username);
        Login_LoginButton.click();

    }
    public void tryingwithpwderror()
    {
        w.until(ExpectedConditions.visibilityOf(Errormessage));
        Assert.assertEquals(Errormessage.getText(),"Please enter your password.");
    }




}
