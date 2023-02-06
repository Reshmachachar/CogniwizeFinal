package com.cw.TestCases;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cw.Pages.CareerPage;
import com.cw.Pages.HomePage;
import com.cw.Utilities.ExcelUtilities;
import com.cw.commosActions.BaseTest;
import com.cw.commosActions.BaseTest1;

public class CareersTest extends BaseTest1 {
	WebDriver driver;
	CareerPage career;
	String COLOR = "#ffffff";

	public CareersTest() throws IOException {
		driver = initiliseDriver();
		driver.get(pro.getProperty("baseurl"));
		career = new CareerPage(driver);
		
	}

	// TC04-To Check by hovering on the "know more" link on Career
	@Test(groups = "Smoke")
	public void TC04_HoverOnKnowMore() throws IOException, InterruptedException {

		career.CareersLink().click();
		career.MouseHover(driver, career.getKnowMore());
		String colour = career.getKnowMore().getCssValue("color");
		String blue = Color.fromString(colour).asHex();
		Assert.assertEquals(blue, COLOR);

	}

	// TC05-To check if the "Know More" link is clickable on Carrer
	@Test
	public void TC05_ClickOnKnowMore() throws IOException {

		career.CareersLink().click();
		career.getKnowMoreClick().click();
		Assert.assertEquals(career.getFooter().isDisplayed(), true);
	}

	// TC06-To check the navigation of "know more" link on Career
	@Test
	public void TC06_KnowMoreNavigation() throws IOException {

		career.CareersLink().click();
		career.getKnowMoreClick().click();
		Assert.assertEquals(career.getFooter().isDisplayed(), true);
	}

	// TC07-To check the dropdown have specified data.
	@Test
	public void TC07_AllJobTypeDropdown() throws IOException {
		
		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobTypeDropdown().click();
		Assert.assertEquals(career.getAllJobTypeOptions().isDisplayed(), true);
		
	}

	// TC08-To Check the dropdown have specified data.
	@Test
	public void TC08_AllJobExperienceDropdown() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobexperienceDropdown().click();
		Assert.assertEquals(career.getAllJobExperienceOptions().isDisplayed(), true);
	}

	// TC09-To Check the dropdown have specified data.
	@Test
	public void TC09_AllJobLocationDropdown() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJoblocationDropdown().click();
		Assert.assertEquals(career.getAllJobLocationOptions().isDisplayed(), true);
	}

	// TC10-To check the dropdown have specified "full time" field.
	@Test
	public void TC10_ClickOnFulltime() throws IOException, InterruptedException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobTypeDropdown().click();
		career.getFullTime().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.FullTime);
	}

	// TC11- To Check the dropdown have specified "1+ years" field.
	@Test
	public void TC11_ClickOn1Year() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobexperienceDropdown().click();
		career.getOnePlusYear().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.FirstYear);
	}

	// TC12-To check the dropdown have specified "2+ years" field.
	@Test
	public void TC12_ClickOn2Year() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobexperienceDropdown().click();
		career.getTwoPlusYear().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.SecondYear);
	}

	// TC13-To check the dropdown have specified "3+ years" field.
	@Test
	public void TC13_ClickOn3Year() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobexperienceDropdown().click();
		career.getThreePlusYear().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.ThirdYear);
	}

	// TC14-To check the dropdown have specified "5+ years" field.
	@Test
	public void TC14_ClickOn5Year() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJobexperienceDropdown().click();
		career.getFivePlusYear().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.FifthYear);
	}

	// TC15-To Check the dropdown have specified "pune" field.
	@Test
	public void TC15_PuneLocation() throws IOException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		career.getAllJoblocationDropdown().click();
		career.getPuneLocation().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.PuneLocation);
	}

	// TC17-To check the search box accept valid user input
	@Test
	public void TC17_ValidSearch() throws IOException, InterruptedException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
		ExcelUtilities EU = new ExcelUtilities();
		int rc = EU.getTheRowCount(pro.getProperty("excelPath"), pro.getProperty("sheetName"));

		for (int i = 1; i < rc + 1; i++) {
			String val = EU.readExcelData(pro.getProperty("excelPath"), pro.getProperty("sheetName"), i, 0);
			career.getData().sendKeys(val, Keys.ENTER);
			career.getData().clear();
			Assert.assertEquals(career.getValidOptions().isDisplayed(), true);
		}
	}

	// TC18-To check the search box accept invalid user input
	@Test
	public void TC18_InValidSearch() throws IOException, InterruptedException {

		career.CareersLink().click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,2000)");
		
		ExcelUtilities EU = new ExcelUtilities();
		int rc = EU.getTheRowCount(pro.getProperty("excelPath"), pro.getProperty("sheetName"));

		for (int i = 1; i < rc; i++) {
			String val = EU.readExcelData(pro.getProperty("excelPath"), pro.getProperty("sheetName"), i, 1);
			career.getData().sendKeys(val, Keys.ENTER);
			Assert.assertEquals(career.getErrorMsg().getText(), "Sorry! No jobs to show.");
			career.getData().clear();
		}
	}

	// TC20-To Check by hovering on the "Contact Us" link on Career
	@Test
	public void TC20_ContactUsLinkHoverOn() throws IOException, InterruptedException {

		career.CareersLink().click();
		career.MouseHover(driver, career.getContactUS());
		String colour = career.getContactUS().getCssValue("color");
		String blue = Color.fromString(colour).asHex();
		Assert.assertTrue(true, blue);
	}

	// TC21-To check if the "contact us" link is clickable on Carrer
	@Test
	public void TC21_ContactUsLink() throws IOException {

		career.CareersLink().click();
		career.getContactUS().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.ContactUs);
	}

	// TC22-To check the navigation of "contact Us" link on Career
	@Test
	public void TC22_NavigationOfContactUsLink() throws IOException {

		career.CareersLink().click();
		career.getContactUS().click();
		Assert.assertEquals(driver.getCurrentUrl(), career.ContactUs);
	}

	//To find broken links 
//	@Test
//	public void broken() throws IOException, InterruptedException
//	{
//
//		driver.get(pro.getProperty("CareerUrl"));
//		driver=Brokenlinks();
//	}

}















