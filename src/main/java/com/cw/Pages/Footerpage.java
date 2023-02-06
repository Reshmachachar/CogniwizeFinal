package com.cw.Pages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Footerpage 
{
WebDriver driver;


public Footerpage(WebDriver driver)
{
	
	PageFactory.initElements(driver, this);
}

public String hyperAutoUrl="https://cogniwize.com/robotic-process-automation/hyperautomation-services/";
public String testAutoUrl="Test Automation Services - Test Automation in Software Testing - Cogniwize";
public String digitalAssuUrl="Digital Quality Assurance and Testing | Cogniwize";
public String qualityEnggUrl="https://cogniwize.com/services/testing-services/quality-engineering/";
public String testTransUrl="https://cogniwize.com/services/testing-services/test-transformation-and-advisory-services/";
//TC01_Homepage To check the navigation of know more link on homepage
@FindBy(xpath="//rs-layer[@id='slider-32-slide-64-layer-7']") WebElement KnowMore ;

public WebElement getKnowMore()
{
	return KnowMore;
	

}
//TC03 Check by hovering on the social icon links on the footer of all pages
@FindBy(xpath="//*[@id=\"social_links-widget-3\"]/div[1]/div/a") WebElement social_icon;

public WebElement getSocial_icon() 
{
	return  social_icon;
}
//TC05-To check the navigation of social icon "Facebook" link present on footer of all pages
@FindBy(xpath="//a[@data-title='Facebook']")  WebElement facebook;

public WebElement getFacebook()
{
	return facebook;
}
//error message
@FindBy(xpath="//label[@id='email-10-error']")  WebElement errormessege;

public WebElement getErrormessege() 
{
	return errormessege;
}
//for success messege "Success! Watch your inbox for emails from info@cogniwize.com"
@FindBy(xpath="//div[@class='fusion-alert-content-wrapper']") WebElement success_messege;

public WebElement getSuccess_messege()
{
	return success_messege;
}



//TC06-To check the navigation of social icon "Twitter" link present on footer of all pages
@FindBy(xpath="//a[@data-title='Twitter']") WebElement twitter;

public WebElement getTwitter()
{
	return twitter;
}

//TC07-To check the navigation of social icon "YouTube" link present on footer of all pages
@FindBy(xpath="//a[@data-title='Youtube']") WebElement youtube;

public WebElement getYoutube() 
{
	return youtube;
}

//TC08-To check the navigation of social icon "LinkedIn" link present on footer of all pages
@FindBy(xpath="//a[@data-title='LinkedIn']") WebElement linkedin;

public WebElement getLinkedin()
{
	return linkedin;
}
//TC09-To check the navigation of social icon "Mail" link present on footer of all pages
@FindBy(xpath="//a[@data-title='Mail']") WebElement mail;

public WebElement getMail()
{
	return mail;
}

//TC12-To check if the "Subscribe" button is clickable present at the footer of all pages
@FindBy(xpath="//input[@value='Subscribe']") WebElement subscribeButton ;


public WebElement getSubscribeButton()
{
	return subscribeButton;
}
//TC13-To check email address field is accessible by clicking on it 
@FindBy(xpath="//input[@placeholder='Enter your email address']") WebElement emailid ;

public WebElement getEmailid()
{
	return emailid;
}

//TC14-To check email address field is accessible by clicking on it 
@FindBy(xpath="//input[@type='email']") WebElement email;

public WebElement getEmail() 
{
	return email;
}

// TC19 To check the copyright statement should be displayed in the footer section
@FindBy(xpath="//div[@class='fusion-copyright-notice']") WebElement copyright;


public WebElement getCopyright() 
{
	return copyright;
}


//TC20_Footer To check the"Robotic process Automation is clickable or not " in the footer section 
@FindBy(xpath="//a[text()='Robotics Process Automation']") WebElement  roboticProcess;


public WebElement getRoboticProcess() {
	return roboticProcess;
}
//TC21_To check the"Hyper Automation is clickable or not " in the footer section 
@FindBy(xpath="//a[text()='Hyperautomation']") WebElement hyperAutomation;


public WebElement getHyperAutomation() {
	return hyperAutomation;
}

//TC22_To check the"Testing Automation is clickable or not " in the footer section
@FindBy(xpath="//a[text()='Testing Automation']") WebElement testingAutomation;


public WebElement getTestingAutomation() {
	return testingAutomation;
}

//TC23_To check the"Digital Assurance and Testing Services " in the footer section 
@FindBy(xpath="//a[text()='Digital Assurance and Testing Services']")WebElement digitalAssurance;


public WebElement getDigitalAssurance() {
	return digitalAssurance;
}

//TC24_To check the"Quality Engineering Services" in the footer section 
@FindBy(xpath="//a[text()='Quality Engineering Services']")WebElement qualityEngineeringServices;


public WebElement getQualityEngineeringServices() {
	return qualityEngineeringServices;
}

//TC25_To check the"Test Transformation and Advisory Services" in the footer section 
@FindBy(xpath="//a[text()='Test Transformation and Advisory Services']")WebElement TestTransformationandAdvisoryServices;


public WebElement getTestTransformationandAdvisoryServices() {
	return TestTransformationandAdvisoryServices;
}
public void userWindowhandle(WebDriver driver)
{
	Set<String> mainWindow = driver.getWindowHandles();
	Iterator<String> itr = mainWindow.iterator();	 
	while(itr.hasNext())
	{
		String childWindow = itr.next();
		driver.switchTo().window(childWindow);
		}
}
}