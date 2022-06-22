package com.rookie.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.rookie.baseutil.LocateElements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_addnewproduct {
	private WebDriver driver;
	LocateElements locateElements = new LocateElements();
	
	
	@Given("i am on the home page")
	public void the_user_is_on_the_product_info_page() throws InterruptedException {
		// catalog

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\manikandansr\\eclipse-workspace\\rookie-cucumber-nopcommerce\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/Admin/Manufacturer/List");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();

	
		driver.findElement(locateElements.catalog).click();
	
		// selecting product
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		Thread.sleep(1000);
				driver.findElement(By.xpath("//div[@class='form-group row']/descendant::input[@id='SearchProductName']"))
				.sendKeys("Dummyuodate");
		driver.findElement(locateElements.Search_Button).click();
		Thread.sleep(800);
		
		Actions at = new Actions(driver);
		at.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(2000);
		driver.findElement(locateElements.Search_Selectingthe_Product_Checkbox).click();
		Thread.sleep(800);
		driver.findElement(locateElements.Search_Edit).click();
		Thread.sleep(800);

	}

	@When("i click on catelog")
	public void the_user_select_the_particular_product() throws InterruptedException {

		driver.findElement(By.xpath("//div[@class='input-group input-group-required']/input")).clear();
		driver.findElement(By.xpath("//div[@class='input-group input-group-required']/input")).sendKeys("Dummyuodate1");
		driver.findElement(locateElements.skuProductUniqueIdentifier).clear();
		driver.findElement(locateElements.skuProductUniqueIdentifier).sendKeys("123");
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(800);
		driver.findElement(locateElements.productPrice).sendKeys("500");
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-1800);");
		Thread.sleep(2000);
		driver.findElement(locateElements.saveButton).click();

		// Searching for delete
		driver.findElement(By.xpath(
				"/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/p[1]"))
				.click();
		driver.findElement(By.xpath("//div[@class='form-group row']/descendant::input[@id='SearchProductName']"))
				.sendKeys("Dummyuodate");
		driver.findElement(locateElements.Search_Button).click();
		Thread.sleep(800);
		jse.executeScript("window.scrollBy(0,400);");
		System.out.println("verified the product not present ");
		Thread.sleep(900);
		jse.executeScript("window.scrollBy(0,-400);");
		Thread.sleep(900);
		driver.findElement(locateElements.Search_ProductName).clear();
		Thread.sleep(900);
		driver.findElement(locateElements.Search_ProductName).sendKeys("Dummyuodate1");
		jse.executeScript("window.scrollBy(0,400);");
		Thread.sleep(2000);
		driver.findElement(locateElements.Search_Selectingthe_Product_Checkbox).click();
		Thread.sleep(800);

		WebElement verify_deletebutton = driver.findElement(By.id("delete-selected"));

		if (verify_deletebutton.isDisplayed()) {
			Assert.assertTrue("delete button is displayed", true);

		}
//		WebElement click_product = driver.findElement(By.name("checkbox_products"));
//		click_product.click();
		Thread.sleep(2000);
		jse.executeScript("window.scrollBy(0,-600);");
		Thread.sleep(1000);
		WebElement click_delete = driver.findElement(By.id("delete-selected"));
		click_delete.click();
		Thread.sleep(1000);

		WebElement click_confirm = driver.findElement(By.id("delete-selected-action-confirmation-submit-button"));
		click_confirm.click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='row search-row opened']/div")).click();
		Thread.sleep(800);
		
		//Logout
		 driver.findElement(By.xpath("//div[@class='collapse navbar-collapse']/descendant::a[2]")).click();
		 
		 driver.quit();
		 

	}
//
//	@When(": Click on delete")
//	public void click_on_delete() {
//
//		
//	}
//
//	@When(": Click on ok in the popup")
//	public void click_on_ok_in_the_popup() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then(": The product is deleted")
//	public void the_product_is_deleted() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}
