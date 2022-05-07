package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class AjaxMouseHoverSelenium {

    public static void main( String[] args ) throws InterruptedException {
        WebDriver driver1;
        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver1.get("https://www.amazon.com/");
        driver1.manage().window().maximize();
        Actions a = new Actions(driver1);

        a.moveToElement(driver1.findElement(By.xpath("//div[@id='nav-tools']/descendant::a[@id='nav-link-accountList']"))).build().perform();
        a.sendKeys(driver1.findElement(By.xpath("//input[@id='twotabsearchtextbox']")), "search").build().perform();
        a.contextClick(driver1.findElement(By.xpath("//a[@id='icp-nav-flyout']/span"))).build().perform();
        Thread.sleep(5000);
        driver1.close();


    }

}
