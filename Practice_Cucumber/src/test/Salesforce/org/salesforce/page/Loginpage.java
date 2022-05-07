package org.salesforce.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.salesforce.Utilies.BaseClass;

public class Loginpage extends BaseClass {


    @FindBy(xpath = "//input[@id='username']")
    WebElement Login_Username;
    @FindBy(xpath = "//input[@id='password']")
    WebElement Login_PWd;
    @FindBy(xpath = "//input[@id='Login']")
    WebElement Login_LoginButton;
    private String Username = "vijaynagaraj23@gmail.com.psasprod";
    private String PWd = "Pizzaburger@2303";




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


}
