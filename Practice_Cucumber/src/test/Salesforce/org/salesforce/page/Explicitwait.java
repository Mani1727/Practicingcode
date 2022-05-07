package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Explicitwait {


    public static void main(String[] args) {
        WebDriver driver1;
        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver1.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
        driver1.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver1,6);
        wait.until(ExpectedConditions.elementToBeClickable());
        driver1.findElement(By.xpath("//a[@href='javascript: void(0);loadAjax();']")).click();
        w.until(ExpectedConditions.elementToBeClickable(By.id("results")));
        System.out.println(driver1.findElement(By.id("results")).getText());

        driver1.close();

        implicit     -   the object not  found    if the object it wil work
                Explicit

    }
}
