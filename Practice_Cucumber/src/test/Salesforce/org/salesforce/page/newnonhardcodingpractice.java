package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class newnonhardcodingpractice {


    public static void main( String[] args ) {
        WebDriver driver;
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        WebElement Checkbox1 = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
        String string1 = Checkbox1.getAttribute("value");
        System.out.println(string1);
        Checkbox1.click();
        Select Dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        Dropdown2.selectByValue(string1);
        WebElement AlerttextBox = driver.findElement(By.xpath("//input[@id='name']"));
        AlerttextBox.sendKeys(string1);
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        Alert A = driver.switchTo().alert();
        String string2 = A.getText().split(",")[0].split(" ")[1];
        Assert.assertEquals(string1, string2);
        A.accept();
        driver.close();



    }
}









