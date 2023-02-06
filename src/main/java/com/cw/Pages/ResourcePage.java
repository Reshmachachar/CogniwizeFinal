package com.cw.Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResourcePage {

	WebDriver driver;

	public ResourcePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Mouse hover on resources tab.
	@FindBy(xpath = "(//span[@class='menu-text'])[5]") WebElement ResourceTab;

	public WebElement getHoverOnResourceTab() {
		return ResourceTab;
	}

	// Mouse hover on resources tab and click on blogs.
	@FindBy(xpath = "(//ul[@class='sub-menu fusion-switched-side']/li/a)[1]") WebElement Blogs;

	public WebElement getClickOnBlogs() {
		return Blogs;
	}

	//Mouse hover on resources tab and click on Case Studies.
	@FindBy(xpath = "(//ul[@class='sub-menu fusion-switched-side']/li/a)[2]") WebElement CaseStudies;

	public WebElement getCaseStudies() {
		return CaseStudies;
	}

	//Mouse hover on resources tab, click on Case Studies and then click on Continuous Delivery in PaaS for ServiceNow Application.
	@FindBy(xpath = "(//span[@class='fusion-column-inner-bg-image'])[1]") WebElement CaseStudies1;

	public WebElement getFirstCaseStudies() {
		return CaseStudies1;
	}
	
	public void UserWindowHandle(WebDriver driver)
	{
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		for(String handle:allhandles) {
			if (!parentHandle.equals(handle)) 
			{
				driver.switchTo().window(handle);
			}
		}
	}
	
	public void MouseHover(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	//Mouse hover on resources tab, click on Case Studies and then click on servicenow testing of paas application.
	@FindBy(xpath = "(//span[@class='fusion-column-inner-bg-image'])[2]") WebElement CaseStudies2;

	public WebElement getSecondCaseStudies() {
		return CaseStudies2;
	}

	//Mouse hover on resources tab, click on Case Studies and then click on Automate Customer Service with RPA Chatbots.
	@FindBy(xpath = "(//span[@class='fusion-column-inner-bg-image'])[3]") WebElement CaseStudies3;

	public WebElement getThirdCaseStudies() {
		return CaseStudies3;
	}

	//Mouse hover on resources tab, click on Case Studies and then click on RPA- Automate Bank Reconciliation Process.
	@FindBy(xpath = "(//span[@class='fusion-column-inner-bg-image'])[4]") WebElement CaseStudies4;

	public WebElement getFourthCaseStudies() {
		return CaseStudies4;
	}

	//Mouse hover on resources tab, click on Case Studies and then click on Automate Claim Processing with RPA Solution.
	@FindBy(xpath = "(//span[@class='fusion-column-inner-bg-image'])[5]") WebElement CaseStudies5;

	public WebElement getFifthCaseStudies() {
		return CaseStudies5;
	}

	//Download case study.
	@FindBy(xpath = "//*[@id=\"b1\"]") WebElement DownloadCaseStudy;

	public WebElement getDownloadCaseStudy() {
		return DownloadCaseStudy;
	}

	//Case study form is displayed or not:
	@FindBy(xpath = "//div[@class='fusion-layout-column fusion_builder_column fusion-builder-column-6 fusion_builder_column_1_2 1_2 fusion-flex-column']") WebElement CaseStudyForm;

	public WebElement getCaseStudyForm() {
		return CaseStudyForm;
	}

	//First Name in case study form:
	@FindBy(xpath = "//input[@name='text-254']") WebElement FirstName;

	public WebElement getFirstName() {
		return FirstName;
	}

	//error msg for wrong input(@,$,#):
	@FindBy(xpath = "//label[.='Letters only please']") WebElement errormsg;

	public WebElement geterrormsg() {
		return errormsg;
	}

	//Last Name in case study form:
	@FindBy(xpath = "//input[@name='text-720']") WebElement LastName;

	public WebElement getLastName() {
		return LastName;
	}

	//Email in case study form:
	@FindBy(xpath = "//input[@name='email-133']") WebElement Email;

	public WebElement getEmail() {
		return Email;
	}

	//Phone number in case study form:
	@FindBy(xpath = "//input[@name='tel-322']") WebElement Phone;

	public WebElement getPhone() {
		return Phone;
	}

	//Company Name in case study form:
	@FindBy(xpath = "//input[@name='text-729']") WebElement CompanyName;

	public WebElement getCompanyName() {
		return CompanyName;
	}

	//Select Country in case study form:
	@FindBy(xpath = "//select[@name='menu-82']") WebElement Country;

	public WebElement getCountry() {
		return Country;
	}

	//Select Country India in case study form:
	@FindBy(xpath = "//option[@value='India']") WebElement CountryValue;

	public WebElement getCountryValue() {
		return CountryValue;
	}

	//Text Area(Message Box) in case study form:
	@FindBy(xpath = "//textarea[@name='textarea-709']") WebElement TextArea;

	public WebElement getTextArea() {
		return TextArea;
	}

	//Download final case study form
	@FindBy(xpath = "//input[@id='submit']") WebElement CaseStudy;

	public WebElement getFinalCaseStudy() {
		return CaseStudy;
	}
	
//	public void UserWindowHandle2(WebDriver driver)
//	{
//		String parentHandle="";
//		String secondHandle = driver.getWindowHandle();
//		Set<String> allhandles1 = driver.getWindowHandles();
//		for(String handle1:allhandles1) {
//			if (!parentHandle.equals(handle1) && !secondHandle.equals(handle1)) 
//			{
//				driver.switchTo().window(handle1);
//			}
//		}
//	}


	

	

}
