package com.cw.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompanyPage {
	WebDriver driver;

	public String AboutUsTitle="About Us - Cogniwize";
	public String AboutUsUrl="https://cogniwize.com/about-us/";
	public String AboutACCSCIENTTitle="About ACCSCIENT - Cogniwize";
	public String AboutACCSCIENTurl="https://cogniwize.com/about-accscient/";
	public String OurServices="https://cogniwize.com/our-services/";
	public String ContactUs="https://cogniwize.com/contact-us/";
	public String GetQuote="Contact Us | Get a Quote Today | Cogniwize";


	public CompanyPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

	}
	public void MouseHover(WebDriver driver,WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element).perform();
	}


	// TC02_compnay dropdown on homepage
	@FindBy(xpath=("(//span[@class='menu-text'])[1]"))WebElement companyHomePage;
	public WebElement getcompanyHomePage()
	{
		return companyHomePage ;

	}

	@FindBy(xpath=("//*[@id=\"menu-item-4949\"]/a/span"))WebElement AboutAccscient;
	public WebElement getAboutAccscient()
	{
		return AboutAccscient ;

	}



	//TC03,Tc_04_ "about us"  
	@FindBy(xpath=("(//span[text()='About Us'])[1]"))WebElement aboutUsIsClickable;
	public WebElement getAboutUsIsClickable() 
	{
		return aboutUsIsClickable;

	}

	//Tc_05,Tc_06-Accsceint xpath
	@FindBy(xpath=("(//span[text()=\"About ACCSCIENT\"])[1]"))WebElement  accscientIsClickable;
	public WebElement getAccscientIsClickable()
	{
		return accscientIsClickable;
	}

	//Tc_08,Tc_09,Tc_10-for Know More link
	@FindBy(xpath=("(//span[@class='fusion-button-text'])[1]"))WebElement hoverOnKnowMoreLink;
	public WebElement getHoverOnKnowMoreLink() 
	{
		return hoverOnKnowMoreLink;
	}

	//Tc_12,Tc_12-Schedule consultation
	@FindBy(xpath=("//*[text()='Schedule a Consultation']"))WebElement HoverOnScheduleconsultation;
	public WebElement getHoverOnScheduleconsultation() {
		return HoverOnScheduleconsultation;
	}



}























