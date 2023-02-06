package com.cw.Pages;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	WebDriver driver;
	public String learnMore="https://cogniwize.com/robotic-process-automation/rpa/";
	public String gettoKnowUsUrl="https://cogniwize.com/about-us/";
	public String rpaServicesUrl="https://cogniwize.com/robotic-process-automation/rpa/";
	public String automationTestingUrl="https://cogniwize.com/services/testing-services/test-automation-solutions/";
	public String processMiningUrl="https://cogniwize.com/services/process-mining/";
	public String digitalAssuranceUrl="https://cogniwize.com/services/testing-services/digital-assurance/digital-assurance-and-testing-services/";
	public String agileandDevpsUrl="https://cogniwize.com/services/quality-engineering/agile-and-devops-testing-services/";
	public String serviceNowTestingUrl="https://cogniwize.com/services/testing-services/saas-testing/servicenow-testing/";
	public String salesforceTestingUrl="https://cogniwize.com/services/testing-services/saas-testing/salesforce-testing-service/";
	public String performanceEngineeringUrl="https://cogniwize.com/services/quality-engineering/performance-engineering-services/";
	public String caseStudyurl="https://cogniwize.com/case-study/";
	public String eBookUrl="https://cogniwize.com/ebook/";
	public String brochureUrl="https://cogniwize.com/brochures/";
	public String availFreeConsultUrl="https://cogniwize.com/contact-us/";
	public String CI_CD="https://cogniwize.com/blogs/how-to-resolve-permission-issues-in-ci-cd-pipelines/";
	public String RPA_Pharma="https://cogniwize.com/blogs/the-rise-of-robotic-process-automation-in-the-pharma/";
	public String WebSecurity="https://cogniwize.com/blogs/what-are-the-best-open-source-web-security-testing-tools/";
	public String WhyAutomated="https://cogniwize.com/blogs/why-automated-testing-will-become-the-norm-for-quality-assurance/";



	public HomePage(WebDriver driver) 
	{

		PageFactory.initElements(driver, this);
	}


	// Homepage-navigation of service tab on homepage
	@FindBy(xpath = "(//span[@class='menu-text'])[2]")
	WebElement ServicesTab;

	public WebElement getServicesTab() {
		return ServicesTab;
	}

	//TC01_Cogniwize Website To check  the navigation of an URL 

	//TC04_Homepage-Check by hovering on the Learn more link on homepage
	@FindBy(xpath="//a[@id='slider-32-slide-63-layer-1']") WebElement LearnMore;

	public WebElement getLearnMore() 
	{
		return LearnMore;
	}
	//TC05_Check by hovering on the "Get to know us" link on homepage
	@FindBy(xpath="(//a[@id='b1'])[1]") WebElement GetToKnowUs;

	public WebElement getGetToKnowUs()
	{
		return GetToKnowUs;
	}

	//TC06_To check the mouse hovering  "read more" of "RPA services" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[1]") WebElement readmore1;

	public WebElement getReadmore1()
	{
		return readmore1;
	}

	//TC08_To check the mouse hovering  "read more" of "Automation Testing" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[2]") WebElement readmore2;

	public WebElement getReadmore2() 
	{
		return readmore2;
	}
	//TC 11_To check the mouse hovering  "read more" of "Process Mining" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[3]") WebElement readmore3;

	public WebElement getReadmore3() {
		return readmore3;
	}
	//TC13 To check the mouse hovering  "read more" of "	Digital Assurance Testing" link  on homepage

	@FindBy(xpath="(//*[text()='Read more'])[4]") WebElement readmore4;

	public WebElement getReadmore4() {
		return readmore4;
	}

	//TC15_To check the mouse hovering  "read more" of "Agile and DevOps Testing" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[5]") WebElement readmore5;

	public WebElement getReadmore5() {
		return readmore5;
	}
	//TC17_To check the mouse hovering  "read more" of "Performance Engineering" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[6]") WebElement readmore6;

	public WebElement getReadmore6() {
		return readmore6;
	}

	//TC19_To check the mouse hovering  "read more" of "	ServiceNow Testing" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[7]") WebElement readmore7;

	public WebElement getReadmore7() {
		return readmore7;
	}
	//TC21_To check the mouse hovering  "read more" of "salesforce Testing" link  on homepage
	@FindBy(xpath="(//*[text()='Read more'])[8]") WebElement readmore8;

	public WebElement getReadmore8() 
	{
		return readmore8;
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

	//TC23_Homepage_To check the mouse hovering  " View more" of "case study on homepage
	@FindBy(xpath="(//*[text()='View More'])[1]") WebElement viewMore;

	public WebElement getViewMore()
	{
		return viewMore;
	}

	//TC25_Homepage_To check the mouse hovering  " View more" of "case study on homepage
	@FindBy(xpath="(//*[text()='View More'])[2]") WebElement viewMoreeBook;

	public WebElement getViewMoreeBook()
	{
		return viewMoreeBook;
	}
	//TC27_Homepage_To check the mouse hovering  " View more" of "Brochure on homepage
	@FindBy(xpath="(//*[text()='View More'])[3]") WebElement viewMoreBrochure;

	public WebElement getviewMoreBrochure()
	{
		return viewMoreBrochure;
	}
	//TC29_Homepage_To check the mouse hovering  "Avail a free consult today "  on homepage 
	@FindBy(xpath="(//*[@id=\"b1\"])[2]") WebElement availFreeConsult;

	public WebElement getAvailFreeConsult() {
		return availFreeConsult;
	}

	//TC31_Mouse Hover on the image of-Why Automated Testing Will Become the Norm for Quality Assurance.
	@FindBy(xpath="(//ul[@class='slides'])[1]") WebElement WhyAutomated1;

	public WebElement getHoverOnImgOfWhyAutomated() {
		return WhyAutomated1;
	}

	//TC32_Mouse Hover on the image of-How to Resolve Permission Issues In CI/CD Pipelines.
	@FindBy(xpath="(//ul[@class='slides'])[2]") WebElement HoverOnCI_CD;

	public WebElement getHoverOnImgOfCI_CD() {
		return HoverOnCI_CD;
	}

	//TC33_Mouse Hover on the image of-The Rise of Robotic Process Automation in the Pharma.
	@FindBy(xpath="(//ul[@class='slides'])[3]") WebElement HoverOnRP;

	public WebElement getHoverOnImgOfRiseOfRoboticProcess() {
		return HoverOnRP;
	}

	//TC34_Homepage_To click on-Why Automated Testing Will Become the Norm for Quality Assurance.
	@FindBy(xpath="//h2/a[text()='Why Automated Testing Will Become the Norm for Quality Assurance']") WebElement QA;

	public WebElement getClickOnWhyAutomated()  {
		return QA;
	}

	//TC35_Homepage_To click on - How to Resolve Permission Issues In CI/CD Pipelines.
	@FindBy(xpath="//h2/a[text()='How to Resolve Permission Issues In CI/CD Pipelines']") WebElement ClickOnCI_CD ;

	public WebElement getClickOnCI_CD() {
		return ClickOnCI_CD;
	}

	//TC36_Homepage_To click on - The Rise of Robotic Process Automation in the Pharma. .
	@FindBy(xpath="//h2/a[text()='The Rise of Robotic Process Automation in the Pharma']") WebElement ClickOnRP;

	public WebElement getClickOnRiseOfRoboticProcess() {
		return ClickOnRP;
	}
	//------------------------------------------------------------------------------------------

	//TC37_Homepage_Click on Read More link of-Why Automated Testing Will Become the Norm for Quality Assurance..
	@FindBy(xpath="(//a[@class='fusion-read-more'])[1]") WebElement readmore9;

	public WebElement getReadmore9() {
		return readmore9;
	}

	//TC38_Homepage_Click on Read More link of-How to Resolve Permission Issues In CI/CD Pipelines.
	@FindBy(xpath="(//a[@class='fusion-read-more'])[2]") WebElement readmore10;

	public WebElement getReadmore10() {
		return readmore10;
	}

	//TC39_Homepage_Click on Read More link of-The Rise of Robotic Process Automation in the Pharma.
	@FindBy(xpath="(//a[@class='fusion-read-more'])[3]") WebElement readmore11;

	public WebElement getReadmore11() {
		return readmore11;
	}

}