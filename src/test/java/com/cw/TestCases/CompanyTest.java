package com.cw.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cw.Pages.CompanyPage;
import com.cw.commosActions.BaseTest;
import com.cw.commosActions.BaseTest1;

public class CompanyTest extends  BaseTest1{

	WebDriver driver;
	CompanyPage company;
	String blueColor="#ffffff";

	public CompanyTest() throws IOException {
		driver = initiliseDriver();
		driver.get(pro.getProperty("baseurl"));
		company = new CompanyPage(driver);
	}

	// TC02_compnay dropdown on homepage
	@Test   //TC02
	public void TC02_HoverOnCompanyDropdown() throws IOException 
	{
		company.MouseHover(driver,company.getcompanyHomePage());
		Assert.assertEquals(company.getAboutAccscient().isDisplayed(), true);
	}

	//TC03,Tc_04_ "about us"  
	@Test   
	public void TC03_ClickOnAboutUs() throws IOException, InterruptedException {
		company.getcompanyHomePage().click();
		company.getAboutUsIsClickable().click();
		Assert.assertEquals(driver.getTitle(),company.AboutUsTitle);
	}
	//Tc_05,Tc_06-Accsceint xpath
	@Test 
	public void TC04_AboutUsNavigation() throws IOException, InterruptedException {
		company.getcompanyHomePage().click();
		company.getAboutUsIsClickable().click();
		Assert.assertEquals(driver.getCurrentUrl(),company.AboutUsUrl);
	}

	//Tc_5
	@Test 
	public void TC05_AboutAccscientIsClickable() throws IOException, InterruptedException {
		company.getcompanyHomePage().click();
		company.getAccscientIsClickable().click();
		Assert.assertEquals(driver.getTitle(),company.AboutACCSCIENTTitle);

	}

	//Tc_6
	@Test 
	public void TC06_AboutAccscientNavigation() throws IOException, InterruptedException {
		company.getcompanyHomePage().click();
		company.getAccscientIsClickable().click();
		Assert.assertEquals(driver.getCurrentUrl(),company.AboutACCSCIENTurl);
	}

	//Tc_8
	@Test 
	public void TC08_HoverOnKnowMore() throws IOException, InterruptedException {

		company.getcompanyHomePage().click();
		company.getAboutUsIsClickable().click();
		company.MouseHover(driver, company.getHoverOnKnowMoreLink());
		String colour=company.getHoverOnKnowMoreLink().getCssValue("color");
		String blue=Color.fromString(colour).asHex();
		Assert.assertEquals(blue, blueColor);
	}
@Test
public void TC09_KnowMoreLinkIsClickable() throws IOException, InterruptedException {
        

        company.getcompanyHomePage().click();
        company.getAboutUsIsClickable().click();
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,500)");
        
        company.getHoverOnKnowMoreLink().click();
        Assert.assertEquals(driver.getCurrentUrl(),company.AboutUsUrl);

    }
	
	@Test //12
	public void TC12_HoverOnScheduleConsulation() throws IOException, InterruptedException {

		company.getcompanyHomePage().click();
		company.getAboutUsIsClickable().click();
		company.MouseHover(driver, company.getcompanyHomePage());
		String colour=company.getHoverOnKnowMoreLink().getCssValue("color");
		String blue=Color.fromString(colour).asHex();
		Assert.assertEquals(blue, blueColor);
	}
	@Test //13
	public void TC13_ScheduleConsulationIsClickable() throws IOException {
        company.getcompanyHomePage().click();
        company.getAboutUsIsClickable().click();
        JavascriptExecutor j=(JavascriptExecutor)driver;
        j.executeScript("window.scrollBy(0,3000)");
        company.getHoverOnScheduleconsultation().click();
        Assert.assertEquals(driver.getTitle(),company.GetQuote);
    }

	
//	@Test
//	public void broken() throws IOException, InterruptedException
//	{
//		driver.get(pro.getProperty("aboutUsurl"));
//		driver=Brokenlinks();
//
//	}
//	@Test
//	public void brokenforAccscientUrl() throws IOException, InterruptedException
//	{
//
//		driver.get(pro.getProperty("accscienturl"));
//		driver=Brokenlinks();
//	}

	//https://www.linkedin.com/company/cogniwize/ link is broken
}





