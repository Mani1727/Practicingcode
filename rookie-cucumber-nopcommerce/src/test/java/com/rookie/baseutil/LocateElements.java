package com.rookie.baseutil;

import org.openqa.selenium.By;

public class LocateElements {

//	---------------------------LOGIN ID-------------------------------------------------------------------------

	public By userEmail = By.id("Email");
	public By password = By.id("Password");
	public By loginButton = By.xpath("//button[text()=\"Log in\"]");

//	-------------------------------------ADD PRODUCT--------------------------------------------

	public By pushBar = By.xpath("//a[@class='brand-link navbar-dark logo-switch']");
	public By catalog = By.xpath("//body/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/a[1]");
	public By products = By.xpath(
			"/html[1]/body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[2]/ul[1]/li[1]/a[1]/p[1]");
	public By addNew = By.xpath("//div[@class='float-right']/a");
	public By productName = By.xpath("//div[@class='col-md-9']/descendant::input[@id='Name']");	
	public By skuProductUniqueIdentifier = By.xpath("//div[@class='col-md-9']/descendant::input[@id='Sku']");
	public By ProductType=By.xpath("//div[@class='col-md-9']/descendant::select[@id='ProductTypeId']");
	public By productPrice = By.xpath("//div[@class='col-md-9']/descendant::input[@id='Price']/preceding-sibling::input");
	public By freeShipping = By.xpath("//div[@class='col-md-9']/descendant::input[@id='IsFreeShipping']");
	public By saveButton = By.xpath("//button[@name='save']");	

//------------------------SEARCH AND EDIT ------------	
	public By Product_info=By.xpath("//div[@class='content-header clearfix']/h1");
	public By Search_ProductName = By
			.xpath("//div[@class='form-group row']/descendant::input[@id='SearchProductName']");
	public By Search_Verify_Productname_title = By
			.xpath("//div[@class='label-wrapper']/div[@data-original-title='A product name.']/i");
	public By Search_Warehouse = By.xpath("//div[@class='col-md-8']//select[@id='SearchWarehouseId']");
	public By Search_CategoryID = By.xpath("//div[@class='col-md-8']//select[@id='SearchCategoryId']");
	public By Search_ProductType = By.xpath("//div[@class='col-md-8']//select[@id='SearchProductTypeId']");
	public By Search_Categories_Checkbox = By
			.xpath("//div[@class='col-md-8']//input[@id='SearchIncludeSubCategories']");
	public By Sku_Number = By.xpath("//div[@class='col-md-8']//input[@id='GoDirectlyToSku']");
	public By Manufacture = By.xpath("//div[@class='col-md-8']//select[@id='SearchManufacturerId']");
	public By vendor = By.xpath("//div[@class='col-md-8']//select[@id='SearchVendorId']");
	public By Search_Button = By.xpath("//div[@class='row']//button[@id='search-products']");
	public By Search_Selectingthe_Product_Checkbox=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[1]/input[@type='checkbox']");
	public By Search_ProductName_Verification=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[3]");
	public By Search_Sku_Verification=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[4]");
	public By Search_Price_Verification=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[5]");
	public By Search_Stock=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[6]");
	public By Search_Published=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[7]");
	public By Search_Edit=By.xpath("//div[@class='dataTables_scrollBody']/descendant::td[8]/a");
	
	
	

}
