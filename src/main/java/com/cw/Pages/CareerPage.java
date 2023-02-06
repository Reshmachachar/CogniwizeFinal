package com.cw.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CareerPage {
	WebDriver driver;
	
	public String FullTime ="https://cogniwize.com/careers/?job__type_spec=full-time";
	public String FirstYear="https://cogniwize.com/careers/?job__experience_spec=1-years";
	public String SecondYear="https://cogniwize.com/careers/?job__experience_spec=2-years";
	public String ThirdYear ="https://cogniwize.com/careers/?job__experience_spec=3-years";
	public String FifthYear ="https://cogniwize.com/careers/?job__experience_spec=5-years";
	public String PuneLocation ="https://cogniwize.com/careers/?job__location_spec=pune";
	public String ContactUs ="https://cogniwize.com/contact-us/";
	
//Initialization
	public CareerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void MouseHover(WebDriver driver, WebElement element)
	{
		Actions act = new Actions(driver);
		act.moveToElement(element).perform();
	}

	//Click on Carrier option on Homepage
	@FindBy(xpath = "(//span[.='Careers'])[1]") WebElement Careers;

	public WebElement CareersLink(){
		return Careers;	
	}	

//Declaration part
	//TC04-In carrier page, Mouse hover on know more link
	@FindBy(xpath = "(//span[text()='Know More'])[1]") WebElement HoverOnKnowMore;

//utilization part 
	public WebElement getKnowMore() { 
		return HoverOnKnowMore;
	}

	//In carrier page, click on know more link
	@FindBy(xpath = "(//span[text()='Know More'])[1]") WebElement ClickOnKnowMore;

	public WebElement getKnowMoreClick() { 
		return ClickOnKnowMore;
	}

	//In carrier page, click on know more link goes to footer
	@FindBy(xpath = "(//span[text()='Know More'])[1]") WebElement KnowMoreFooter;

	public WebElement getKnowMoreFooter() {
		return KnowMoreFooter;

	}

	//In carrier page, when click on know more footer link is displayed or not
	@FindBy(xpath = "//div[@class='fusion-footer']") WebElement footer;

	public WebElement getFooter() {
		return footer;

	}

	//In carrier page, click on all job type dropdown
	@FindBy(xpath = "//span[text()='All Job Type']") WebElement allJobTypeDropdown;

	public WebElement getAllJobTypeDropdown() {
		return allJobTypeDropdown;

	}

	//In carrier page, after click on all job type dropdown, Options are displayed or not
	@FindBy(xpath = "(//div[@class='awsm-selectric-scroll'])[1]") WebElement allJobTypeOptions;

	public WebElement getAllJobTypeOptions() {
		return allJobTypeOptions;

	}


	//In carrier page, click on know more link and then click on all job experience dropdown
	@FindBy(xpath = "(//span[@class='label'])[2]") WebElement allJobexperienceDropdown;

	public WebElement getAllJobexperienceDropdown() {
		return allJobexperienceDropdown;	
	}

	//In carrier page, after click on all job experience dropdown, Options are displayed or not
	@FindBy(xpath = "(//div[@class='awsm-selectric-items'])[2]") WebElement allJobExpOptions;

	public WebElement getAllJobExperienceOptions() {
		return allJobExpOptions;
	}

	//In carrier page, click on know more link and then click on all job location dropdown
	@FindBy(xpath = "(//span[@class='label'])[3]") WebElement allJoblocationDropdown;

	public WebElement getAllJoblocationDropdown() {
		return allJoblocationDropdown;	
	}

	//In carrier page, after click on all job location dropdown, Options are displayed or not
	@FindBy(xpath = "(//div[@class='awsm-selectric-scroll'])[3]") WebElement allJobLocOptions;

	public WebElement getAllJobLocationOptions() {
		return allJobLocOptions;
	}

	//In carrier page, click on know more link and then click on all job type dropdown and then click on Full time option
	@FindBy(xpath = "//li[text()='Full Time']") WebElement ClickOnFullTime;

	public WebElement getFullTime() {
		return ClickOnFullTime;
	}

	//In carrier page, after click on all job type dropdown, Full time Option is  displayed or not
	@FindBy(xpath = "//span[@class='awsm-job-specification-term']") WebElement fullTimeOption;

	public WebElement getFullTimeOption() {
		return fullTimeOption;
	}



	//In carrier page, click on know more link and then click on all job experience dropdown and then click on 1+ Years Option
	@FindBy(xpath = "//li[text()='1+ Years']") WebElement ClickOn1Year;

	public WebElement getOnePlusYear() {
		return ClickOn1Year;	
	}

	//In carrier page, after click on all job experience dropdown, 1+ Year Options are displayed or not
	@FindBy(xpath = "//span[@class='awsm-job-specification-term' and text()='1+ Years']") WebElement OnePlusOptions;

	public WebElement getOnePlusOptions() {
		return OnePlusOptions;
	}

	//In carrier page, click on know more link and then click on all job experience dropdown and then click on 2+ Years Option
	@FindBy(xpath = "//li[text()='2+ Years']") WebElement ClickOn2Year;

	public WebElement getTwoPlusYear() {
		return ClickOn2Year;	
	}

	//In carrier page, after click on all job experience dropdown, 2+ Year Options are displayed or not
	@FindBy(xpath = "//span[@class='awsm-job-specification-term' and text()='2+ Years']") WebElement TwoPlusOptions;

	public WebElement getTwoPlusOptions() {
		return TwoPlusOptions;
	}

	//In carrier page, click on know more link and then click on all job experience dropdown and then click on 3+ Years Option
	@FindBy(xpath = "//li[text()='3+ Years']") WebElement ClickOn3Year;

	public WebElement getThreePlusYear() {
		return ClickOn3Year;	
	}

	//In carrier page, after click on all job experience dropdown, 3+ Year Options are displayed or not
	@FindBy(xpath = "//span[@class='awsm-job-specification-term' and text()='3+ Years']") WebElement ThreePlusOptions;

	public WebElement getThreePlusOptions() {
		return ThreePlusOptions;
	}

	//In carrier page, click on know more link and then click on all job experience dropdown and then click on 5+ Years Option
	@FindBy(xpath = "//li[text()='5+ Years']") WebElement ClickOn5Year;

	public WebElement getFivePlusYear() {
		return ClickOn5Year;	
	}

	//In carrier page, after click on all job experience dropdown, 5+ Year Options are displayed or not
	@FindBy(xpath = "//span[@class='awsm-job-specification-term' and text()='5+ Years']") WebElement FivePlusOptions;

	public WebElement getFivePlusOptions() {
		return FivePlusOptions;
	}

	//In carrier page, click on know more link and then click on all job location dropdown and then click on Pune Location
	@FindBy(xpath = "//li[text()='Pune']") WebElement ClickOnPuneLocation;

	public WebElement getPuneLocation() {
		return ClickOnPuneLocation;	
	}

	//In carrier page, after click on all job location dropdown, Pune options are displayed or not
	@FindBy(xpath = "//span[@class='awsm-job-specification-term' and text()='Pune']") WebElement PuneOptions;

	public WebElement getPuneOptions() {
		return PuneOptions;
	}


	//In carrier page, click on know more link and search for Valid Data 
	@FindBy(id = "awsm-jq-1") WebElement Search;

	public WebElement getData() {
		return Search;	
	}

	//In carrier page, click on know more link and search for Valid Data, Valid options are displayed or not
	@FindBy(xpath = "//div[@class='awsm-job-listings awsm-row awsm-grid-col-3']") WebElement ValidOptions;

	public WebElement getValidOptions() {
		return ValidOptions;
	}

	//In carrier page, click on know more link and search for InValid Data gives error msg
	@FindBy(xpath = "//p[text()='Sorry! No jobs to show.']") WebElement msg;

	public WebElement getErrorMsg() {
		return msg;	
	}

	//In carrier page and then click on contact button
	@FindBy(xpath = "//a[@href='https://cogniwize.com/contact-us/']") WebElement ContactUS;

	public WebElement getContactUS() {
		return ContactUS;	
	}
	
	

}
