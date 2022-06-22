package java;

import org.openqa.selenium.By;

public class Locator {

    //-----------------LOGIN PAGE -----------------------------------------*******************************

    By Loginname = By.xpath("//input[@name='txtUsername']");
    // Loginpassword
    By Loginpass = By.id("txtPassword");
    // Loginbutton
    // By
    // Loginbutton1=By.name("//div[@id='divLoginHelpLink']/following-sibling::div[1]/input");
    By Loginbutton1 = By.id("btnLogin");
    // Forget your password
    By Forget_your_password = By.xpath("//div[@id='divLoginHelpLink']/following-sibling::div/descendant::a");



    //---------------------------------------LOGOUT--------------------------------------------------------------------------
    By logout_welcome = By.id("welcome");
    By logout = By.linkText("Logout");




}
