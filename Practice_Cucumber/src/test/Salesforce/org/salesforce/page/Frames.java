package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

    public static void main( String[] args ) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        Actions A = new Actions(driver);
        A.moveToElement(driver.findElement(By.xpath("//a[@href='/nested_frames']"))).click().build().perform();
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_top']")));
        driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='/frame_middle']")));
        System.out.println(driver.findElement(By.xpath("//div[@id='content']")).getText());
        driver.quit();


    }
}
