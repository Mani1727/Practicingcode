package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;

public class Brokenlinkinselenium {
public static WebDriver driver;


    public static void main( String[] args ) throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        alllink();
        driver.quit();
        SoftAssert a= new SoftAssert();


    }

    public static void alllink() throws IOException {
        List<WebElement> links=driver.findElements(By.xpath("//li[@class='gf-li']/a"));
        for(WebElement link:links)
        {
            String url=link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int ss= conn.getResponseCode();
            System.out.println("the link with text"+link+"Status code "+ss);

        }

    }
}
