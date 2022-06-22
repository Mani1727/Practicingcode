package com.rookie.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.rookie.baseutil.elements;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class Steps_Login  {
	private elements locate; 
	private WebDriver driver;
	
	public Steps_Login(elements	util)
	{
		this.locate= util;
	}

	@Given("open the browser and launch the nopcommerce website")
	public void open_the_browser_and_launch_the_nopcommerce_website() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manikandansr\\eclipse-workspace\\rookie-cucumber-nopcommerce\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Manufacturer/List");
		driver.manage().window().maximize();

	}

	@When("the valid credential entered for login the nopcommerce.")
	public void the_valid_credential_entered_for_login_the_nopcommerce() throws InterruptedException {

		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

	}

	@Then("the homepage should open and validate the homepage title")
	public void the_homepage_should_open_and_validate_the_homepage_title() {

		String Title_Homepage = driver.getTitle();
		Assert.assertEquals("Manufacturers / nopCommerce administration", Title_Homepage);

	}
	
	@And("select the product from the catalog side bar")
	public void select_the_product_from_the_catalog_side_bar() {
//		driver.findElement(By.id("nopSideBarPusher")).click();
		//catalog
		driver.findElement(By.xpath("(//a[@class='nav-link active']/p[contains(text(),'Catalog')]")).click();
		//products
		driver.findElement(By.xpath("(//ul[@class='nav nav-treeview']/descendant::a[@class='nav-link'][1]/p[contains(text(),' Products')]")).click();
		
	}
	
	@Then("the product tab should open")
	public void the_product_tab_should_open()
	{
		//header for the product  
		WebElement Product_name=driver.findElement(By.xpath("//div[@class='content-header clearfix']/h1"));
		String Product_name1=Product_name.getText();
		Assert.assertEquals("Products", Product_name1);
		
	}

}
