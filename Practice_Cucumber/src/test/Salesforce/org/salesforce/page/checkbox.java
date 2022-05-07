package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class checkbox {
    public static ChromeDriver driver1;


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        driver1 = new ChromeDriver();
        driver1.manage().timeouts().implicitlyWait(8000, TimeUnit.MILLISECONDS);
        driver1.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver1.manage().window().maximize();
        Assert.assertFalse(driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).isSelected());
        driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).click();
        System.out.println(driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).isSelected());
        Assert.assertTrue(driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).isSelected());
        Thread.sleep(2000);
        driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).click();
        System.out.println(driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).isSelected());
        driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).click();
        Assert.assertTrue(driver1.findElement(By.xpath("//label[contains(normalize-space(), 'Option1')]/input")).isSelected());

        System.out.println(driver1.findElements(By.xpath("//label[starts-with(normalize-space(), 'Option')]/input[starts-with(@id,'check')]")).size());
       driver1.findElement(By.xpath("//input[@name='enter-name']")).sendKeys("text");
        System.out.println("the entered text is  :  "+ "text");
       driver1.findElement(By.xpath("//input[@id='alertbtn']")).click();
        System.out.println("the Alert button is clicked ");
        Thread.sleep(4000);
       driver1.switchTo().alert().accept();
        System.out.println("the alert is accepted");
        driver1.findElement(By.xpath("//input[@id='confirmbtn']")).click();
        System.out.println("the confirm button is clicked ");
        Thread.sleep(3000);
        driver1.switchTo().alert().dismiss();
        System.out.println("the cancel is clicked");






        driver1.close();

    }
}
