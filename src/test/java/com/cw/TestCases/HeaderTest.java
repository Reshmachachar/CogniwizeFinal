package com.cw.TestCases;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cw.Pages.Footerpage;
import com.cw.Pages.HeaderPage;
import com.cw.commosActions.BaseTest1;
import com.cw.commosActions.BaseTest;

public class HeaderTest extends BaseTest1
{
	WebDriver driver;
	public HeaderTest() throws IOException 
	{
		driver=initiliseDriver();
	}

	//  TC01_Header-To check "Logo" is present and visible at right location 
	@Test (groups="Header")
	public void TC01_LogoIsPresent() throws IOException 
	{
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		boolean logobutton= header.getLogo().isDisplayed();
		assertTrue(logobutton);
	}

	// TC02_Header-To check "Logo" is clickable or not
	@Test(groups="Header") 
	public void TC02_LogoIsPresentAtRightside() throws IOException 
	{   
		Point pt=new Point(60,20);
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		Point location = header.getLogo().getLocation();
		System.out.println(location);
		Assert.assertEquals(pt,location);   

	}

	@Test(groups="Header") // TC03_Header-To check the navigation of "Logo"	
	public void TC03_LogoIsClickable () throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		header.getLogoclick().click();
		Assert.assertEquals(driver.getTitle(),header.logoUrl);

	}
	//TC04_Header-To check the "Company" tab link is present and visible at right location
	@Test(groups="Header") 
	public void TC04_companyTabIsPresent() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		assertTrue(header.getCompany().isDisplayed());
	}
	
	//TC05_Header-To check the "Services" tab link is present 
	@Test(groups="Header")
	public void TC05_serviceTabIsPresent() throws IOException
	{  
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		assertTrue(header.getService().isDisplayed());

	}
	//TC06_Header-To check the "Careers" tab link is present and visible at right location
	@Test(groups="Header")
	public void TC06_careerTabIsPresent() throws IOException
	{   
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver); 
		assertTrue(header.getCareer().isDisplayed());
	}
	//TC07_Header- To check the "Contact Us" tab link is present and visible at right location
	@Test(groups="Header")
	public void TC07_ContactUsIsPresent() throws IOException
	{   
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		assertTrue(header.getContactUs().isDisplayed());


	}
	//TC08_Header -To check the "Resources" tab link is present and visible at right location
	@Test (groups="Header") 
	public void TC08_ResourcesIsPresent() throws IOException
	{   
		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		assertTrue(header.getResources().isDisplayed());
	}
	// TC09_Header-To check the search box is present and visible at right location
	@Test(groups="Header")
	public void TC09_SearchTabIsPresent() throws IOException
	{

		driver.get(pro.getProperty("baseurl"));
		HeaderPage header=new HeaderPage(driver);
		assertTrue(header.getSearchtab().isDisplayed());

	}


}
