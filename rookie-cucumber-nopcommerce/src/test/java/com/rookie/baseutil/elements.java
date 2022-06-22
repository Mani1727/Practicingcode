package com.rookie.baseutil;

import org.openqa.selenium.By;



public class elements  {
	
// LOgin
	By userEmail = By.id("Email");
	By password = By.id("Password");
	By loginButton = By.xpath("//button[text()=\"Log in\"]");
	
//AddProduct	
	By pushBar = By.id("nopSideBarPusher");
	By catalog = By.xpath("(//a[@class='nav-link']/p)[1]");
	By products = By.xpath("(//a[@class='nav-link']/p)[2]");
	By addNew = By.xpath("//div[@class='float-right']/a");
	By productName = By.id("Name");
	By skuProductUniqueIdentifier = By.id("sku");
	By productPrice = By.id("Price");
	By freeShipping = By.name("IsFreeShipping");

}
