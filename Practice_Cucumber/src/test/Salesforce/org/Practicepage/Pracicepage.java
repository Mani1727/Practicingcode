package org.Practicepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.text.ParseException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Pracicepage {
public static WebDriver driver;
String[] a={"india","british","canada"};




@Test(priority = 1)
    public void Setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("http://qaclickacademy.com/practice.php");
        driver.manage().window().maximize();

    }
@Test(priority = 2)
    public void radiobutton()
    {
        Radiobutton c = new Radiobutton();
        c.VerifyingtheRadioHeading();
        c.clickingradio1();
        c.clickingradio2();
        c.clickingradio3();


    }

    @Test(priority = 3)
    public void suggestion() throws InterruptedException {
        Suggestionclass s=new Suggestionclass();
        s.verifyingtheheading();

        s.entertext(a[1]);
    }

    @Test(priority = 4)
    public void webtableconcept() throws ParseException {
        Webtable n=new Webtable();
        n.Webtableretrievingdata();
    }

    @Test(priority = 5)
    public void Dropdown()
    {
        Dropdown n=new Dropdown();
        n.SelectingDropdown();

    }

    @Test(priority = 6)
    public void Windohand()
    {
        WindowsHandle a =new WindowsHandle();
        a.handlingwindow();
    }
    @Test(priority = 7)
    public void tabhandle()
    {
        tabHandle n=new tabHandle();
        n.tab();
    }

    @Test(priority = 8)
    public void teardown()
    {
        driver.close();
    }



}
