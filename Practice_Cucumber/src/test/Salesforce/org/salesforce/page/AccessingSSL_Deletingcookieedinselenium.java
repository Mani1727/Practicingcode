package org.salesforce.page;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AccessingSSL_Deletingcookieedinselenium {

   public static WebDriver driver;
    public static void main( String[] args ) throws IOException {


        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://google.com");
        takescreenshot("googlehomepage");
        driver.quit();


    }

    public static void takescreenshot( String fileName ) throws IOException {
        File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src,new File("C://Users//manikandansr//IdeaProjects//Practice_Cucumber//src//Screensot"
                + "src/Screensot" +fileName+".jpg"));
    }


}
