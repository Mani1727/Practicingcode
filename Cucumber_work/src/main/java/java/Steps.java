package java;

import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Steps {
    private WebDriver driver;
    Locator Locate=new Locator();

    @Given("^the chrome is invoked and the url opened$")
    public void the_chrome_is_invoked_and_the_url_opened() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        String baseurl ="https://opensource-demo.orangehrmlive.com";
        driver.get(baseurl);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }
    @When("^the Login Username and Password entered$")
    public void the_login_username_and_password_entered() {
        String usename="Admin";
        String password="admin123";



        WebElement loginame = driver.findElement(Locate.Loginname);
        loginame.sendKeys(usename);
        WebElement logipassword = driver.findElement(Locate.Loginpass);
        logipassword.sendKeys(password);
        WebElement Loginbutton = driver.findElement(Locate.Loginbutton1);
        Loginbutton.click();


    }
    @Then("^the Homepage should open")
    public void the_homepage_should_open() {

        String Title = driver.getTitle();
        Assert.assertEquals("OrangeHRM", Title);
        System.out.println("Home page displayed ");
    }
    @And("the logout should process.")
    public void the_logout_should_process() {

        driver.findElement(Locate.logout_welcome).click();

        driver.findElement(Locate.logout).click();
    }



}
