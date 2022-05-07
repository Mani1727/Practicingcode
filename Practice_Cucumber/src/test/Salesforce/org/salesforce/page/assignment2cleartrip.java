package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class assignment2cleartrip {
public static ChromeDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        List<WebElement> product = driver.findElements(By.xpath("//h4[@class='product-name']"));
        for(int i=0;i<product.size();i++)
        {
            String Name=product.get(i).getText();

            System.out.println(Name+"/n");
            if(Name.contains("Cucumber"))
            {
                driver.findElements(By.xpath("//button[contains(text(),'ADD TO CART')]")).get(i).click();
                break;

            }

        }



    }
}
