package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class WindowsHandling {

    public static void main( String[] args ) throws InterruptedException {



      /*  WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
        Set<String> windows = driver.getWindowHandles(); //[parentid,childid,subchildId]
        Iterator<String> it = windows.iterator();
        String parentId = it.next();
        String childId = it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
        driver.findElement(By.cssSelector(".im-para.red")).getText();
        String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[ 1 ].trim().split(" ")[ 0 ];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(emailId);*/

        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        Thread.sleep(2000);
        driver.manage().window().maximize();
        Thread.sleep(800000);

        Actions A = new Actions(driver);
        A.moveToElement(driver.findElement(By.xpath("//a[@href='/windows']"))).click().build().perform();
        A.moveToElement(driver.findElement(By.xpath("//a[@href='/windows/new']"))).click().build().perform();
        Set<String> window = driver.getWindowHandles();
        Iterator<String> Ite = window.iterator();
        String Parentwindow = Ite.next();
        String ChildWindow = Ite.next();
        driver.switchTo().window(ChildWindow);
        System.out.println(driver.findElement(By.xpath("//h3")).getText());
        driver.switchTo().window(Parentwindow);
        System.out.println(driver.findElement(By.xpath("//a[@href='/windows/new']/preceding-sibling::h3")).getText());
        driver.quit();


    }


}
