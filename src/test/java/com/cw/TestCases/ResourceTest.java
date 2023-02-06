package com.cw.TestCases;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;



import com.cw.Pages.ResourcePage;
import com.cw.Utilities.ExcelUtilities;
import com.cw.commosActions.BaseTest;
import com.cw.commosActions.BaseTest1;

public class ResourceTest extends BaseTest1{
	WebDriver driver;
	ResourcePage resource;

	public ResourceTest() throws IOException {
		driver=initiliseDriver();
		driver.get(pro.getProperty("baseurl"));
		resource = new ResourcePage(driver);	
	}

	//Hover on Resource tab on homepage
	@Test
	public void HoverOnResourceTab() throws IOException, InterruptedException { 

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
	}

	//click on blogs in Resource tab on homepage
	@Test
	public void ClickOnBlogs() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getClickOnBlogs().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://cogniwize.com/blogs/");
	}

	//click on Case Studies in Resource tab on homepage
	@Test
	public void ClickOnCaseStudies() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://cogniwize.com/case-study/");
	}

	//click on Continuous Delivery in PaaS for ServiceNow Application in Case Studies in Resource tab on homepage
	@Test
	public void ClickOnFirstCaseStudies() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://cogniwize.com/continuous-delivery-in-paas-for-servicenow-application-using-atf/");
	}

	//click on ServiceNow Testing of PaaS Application in Case Studies in Resource tab on homepage
	@Test
	public void ClickOnSecondCaseStudies() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getSecondCaseStudies().click();
		resource.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://cogniwize.com/servicenow-testing-of-paas-application-to-improve-product-performance/");
	}

	//click on Automate Customer Service with RPA Chatbots in Case Studies in Resource tab on homepage
	@Test
	public void ClickOnThirdCaseStudies() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getThirdCaseStudies().click();
		resource.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://cogniwize.com/automate-customer-service-with-rpa-chatbots/");
	}

	//click on RPA- Automate Bank Reconciliation Process in Case Studies in Resource tab on homepage
	@Test
	public void ClickOnFourthCaseStudies() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFourthCaseStudies().click();
		resource.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://cogniwize.com/automate-bank-reconciliation-process/");
	}

	//click on RPA- Automate Bank Reconciliation Process in Case Studies in Resource tab on homepage
	@Test
	public void ClickOnFifthCaseStudies() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFifthCaseStudies().click();
		resource.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), "https://cogniwize.com/automate-the-claim-processing-with-rpa-solution/");
	}

	//Mouse Hover on Download case study
	@Test
	public void TC_MouseHoverOnDownloadCaseStudy() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.MouseHover(driver, resource.getDownloadCaseStudy());
	}

	//Download case study
	@Test
	public void TC_DownloadCaseStudy() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		boolean actual = resource.getCaseStudyForm().isDisplayed();
		Assert.assertEquals(actual, true);
	}

	//Valid First Name in case study form
	@Test
	public void TC_ValidFirstName() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getFirstName().sendKeys(pro.getProperty("FirstName"));
		assertFalse(false, "Letters only please");

	}

	//Invalid First Name in case study form
	@Test
	public void TC_InValidFirstNameWithSpecialCharacters() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc+1;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 0);
			resource.getFirstName().sendKeys(val,Keys.ENTER);
			String actual = resource.geterrormsg().getText();
			Assert.assertEquals(actual, "Letters only please");
			resource.getFirstName().clear();
		}
	}

	//Invalid First Name in case study form
	@Test
	public void TC_InValidFirstNameWithNumbers() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc+1;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 1);
			resource.getFirstName().sendKeys(val,Keys.ENTER);
			String actual = resource.geterrormsg().getText();
			Assert.assertEquals(actual, "Letters only please");
			resource.getFirstName().clear();
		}
	}

	//Valid Last Name in case study form
	@Test
	public void TC_ValidLastName() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getLastName().sendKeys(pro.getProperty("LastName"));

		assertFalse(false, "Letters only please");
	}

	//Invalid Last Name in case study form
	@Test
	public void TC_InValidLastNameWithSpecialCharacters() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc+1;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 0);
			resource.getLastName().sendKeys(val,Keys.ENTER);
			String actual = resource.geterrormsg().getText();
			Assert.assertEquals(actual, "Letters only please");
			resource.getLastName().clear();
		}
	}

	//Invalid Last Name in case study form
	@Test
	public void TC_InValidLastNameWithNumbers() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc+1;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 1);
			resource.getLastName().sendKeys(val,Keys.ENTER);
			String actual = resource.geterrormsg().getText();
			Assert.assertEquals(actual, "Letters only please");
			resource.getLastName().clear();
		}
	}

	//Valid email in case study form
	@Test
	public void TC_ValidEmail() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getEmail().sendKeys(pro.getProperty("Email"));
		assertFalse(false, "Please enter a valid email address");
	}

	//InValid email in case study form
	@Test
	public void TC_InValidEmail() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getEmail().sendKeys(pro.getProperty("InValidEmail"));
		assertTrue(true, "Please enter a valid email address");
	}

	//InValid email in case study form
	@Test
	public void TC_InValidEmail_1() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getEmail().sendKeys(pro.getProperty("InValidEmail1"),Keys.ENTER);
		assertTrue(true, "Please enter a valid email address");
	}

	//InValid email in case study form
	@Test
	public void TC_InValidEmail_2() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getEmail().sendKeys(pro.getProperty("InValidEmail2"),Keys.ENTER);
		Assert.assertTrue(true, "Please enter a valid email address");
	}


	//Valid phone number in case study form
	@Test
	public void TC_ValidPhone() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getPhone().sendKeys(pro.getProperty("ValidPhoneNumber"));
		assertFalse(false, "Please specify a valid phone number");
	}

	//Invalid phone number in case study form
	@Test
	public void TC_InValidPhone_01() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getPhone().sendKeys(pro.getProperty("InvalidString"),Keys.ENTER);
		assertTrue(true, "Please specify a valid phone number");
	}

	//Invalid phone number in case study form
	@Test
	public void TC_InValidPhone_02() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getPhone().sendKeys("",Keys.ENTER);
		assertTrue(true, "This field is required.");
	}

	//Invalid phone number in case study form
	@Test
	public void TC_InValidPhone_03() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc+1;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 0);
			resource.getPhone().sendKeys(val,Keys.ENTER);
			assertTrue(true, "Please specify a valid phone number");
			resource.getPhone().clear();
		}
	}

	//Valid Company Name in case study form
	@Test
	public void TC_ValiCompanyName() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getCompanyName().sendKeys(pro.getProperty("CompanyName"),Keys.ENTER);
		assertFalse(false, "This field is required.");
	}

	//Invalid Company Name in case study form
	@Test
	public void TC_InValiCompanyName_01() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getCompanyName().sendKeys("",Keys.ENTER);
		assertTrue(true, "Please specify a valid Company Name");
	}

	//Invalid Company Name in case study form
	@Test
	public void TC_InValiCompanyName_02() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 2);
			resource.getCompanyName().sendKeys(val,Keys.ENTER);
			assertTrue(true, "Please specify a valid Company Name");
			resource.getCompanyName().clear();
		}
	}

	//Invalid Company Name in case study form
	@Test
	public void TC_InValiCompanyName_03() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		ExcelUtilities EU = new ExcelUtilities();
		int rc=EU.getTheRowCount(pro.getProperty("excelPath"),pro.getProperty("sheetName2"));

		for(int i=1;i<rc;i++) 
		{
			String val = EU.readExcelData(pro.getProperty("excelPath"),pro.getProperty("sheetName2"), i, 1);
			resource.getCompanyName().sendKeys(val,Keys.ENTER);
			assertTrue(true, "Please specify a valid Company Name");
			resource.getCompanyName().clear();
		}
	}

	//Selecting any Country in case study form
	@Test
	public void TC_SelectingCountryDropdown() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getCountry().click();
		resource.getCountryValue().click();
	}

	//Message Box in case study form
	@Test
	public void TC_MessageBox() throws IOException, InterruptedException {

		resource.MouseHover(driver, resource.getHoverOnResourceTab());
		resource.getCaseStudies().click();
		resource.getFirstCaseStudies().click();
		resource.UserWindowHandle(driver);
		resource.getDownloadCaseStudy().click();
		resource.getTextArea().sendKeys("Text area working fine");
	}

	//Download final case study form
//	@Test
//	public void TC_DownloadCaseStudyForm() throws IOException, InterruptedException {
//
//		resource.MouseHover(driver, resource.getHoverOnResourceTab());
//		resource.getCaseStudies().click();
//		resource.getFirstCaseStudies().click();
//		String parentHandle = driver.getWindowHandle();
//		Set<String> allhandles = driver.getWindowHandles();
//		for(String handle:allhandles) {
//			if (!parentHandle.equals(handle)) 
//			{
//				driver.switchTo().window(handle);
//			}
//		}
//		String secondHandle = driver.getWindowHandle();
//		resource.getDownloadCaseStudy().click();
//		resource.getFirstName().sendKeys(pro.getProperty("FirstName"));
//		resource.getLastName().sendKeys(pro.getProperty("LastName"));
//		resource.getEmail().sendKeys(pro.getProperty("Email"));
//		resource.getPhone().sendKeys(pro.getProperty("ValidPhoneNumber"));
//		resource.getCompanyName().sendKeys(pro.getProperty("CompanyName"));
//		resource.getCountry().click();
//		resource.getCountryValue().click();
//		resource.getTextArea().sendKeys("OK");
//		resource.getFinalCaseStudy().click();
//		Set<String> allhandles1 = driver.getWindowHandles();
//		for(String handle1:allhandles1) {
//			if (!parentHandle.equals(handle1) && !secondHandle.equals(handle1)) 
//			{
//				driver.switchTo().window(handle1);
//			}
//		}
//		String actual = driver.findElement(By.xpath("//span[.='Thank you for your interest in our collateral.']")).getText();
//		String expected = "THANK YOU FOR YOUR INTEREST IN OUR COLLATERAL.";
//		Assert.assertEquals(actual, expected);
//	}
}





