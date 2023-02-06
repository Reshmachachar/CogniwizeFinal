package com.cw.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HeaderPage 
{
	WebDriver driver;

	public HeaderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String logoUrl="Intelligent Process Automation | Testing Automation | RPA Services | Cogniwize";
	
	
	//  TC01_Header-To check "Logo" is present and visible at right location 
	@FindBy(xpath="//a[@class='fusion-logo-link']") WebElement Logo ;

	public WebElement getLogo() 
	{
		return Logo;
	}

	// TC02_Header-To check "Logo" is clickable or not

	@FindBy(xpath="//div[@class='fusion-logo']") WebElement Logoclick ;

	public WebElement getLogoclick() 
	{
		return Logoclick;
	}
	// TC03_Header-To check the navigation of "Logo"	
	@FindBy(xpath="//div[@class='fusion-logo']") WebElement Logonavigate ;

	public WebElement getLogonavigate()
	{
		return Logonavigate;
	}
	//TC04_Header-To check the "Company" tab link is present and visible at right location
	@FindBy(xpath="(//span[@class='menu-text'])[1]") WebElement company;

	public WebElement getCompany() 
	{
		return company;
	}

	//TC05_Header-To check the "Services" tab link is present 
	@FindBy(xpath="(//span[@class='menu-text'])[2]") WebElement service;

	public WebElement getService() 
	{
		return service;
	}
	//TC06_Header-To check the "Careers" tab link is present and visible at right location
	@FindBy(xpath="(//span[@class='menu-text'])[3]") WebElement career;

	public WebElement getCareer() 
	{
		return career;
	}
	//TC07_Header- To check the "Contact Us" tab link is present and visible at right location
	@FindBy(xpath="(//span[@class='menu-text'])[4]") WebElement contactUs;

	public WebElement getContactUs()
	{
		return contactUs;
	}
	//TC08_Header -To check the "Resources" tab link is present and visible at right location
	@FindBy(xpath="(//span[@class='menu-text'])[5]") WebElement Resources;

	public WebElement getResources() 
	{
		return Resources;
	}
	
	// TC09_Header-To check the search box is present and visible at right location
	@FindBy(xpath="//a[@title='Search']")  WebElement searchtab;

	public WebElement getSearchtab()
	{
		return searchtab;
	}
	
	
	
}
