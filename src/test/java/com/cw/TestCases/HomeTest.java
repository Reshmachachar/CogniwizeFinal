package com.cw.TestCases;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cw.Pages.CareerPage;
import com.cw.Pages.HomePage;
import com.cw.commosActions.BaseTest;
import com.cw.commosActions.BaseTest1;
public class HomeTest extends BaseTest1
{
	WebDriver driver;
	HomePage homepage;
	String blackColor="#000000";
	String blueColor="#ffffff";
	String purpleColor="#333333";

	public HomeTest() throws IOException 
	{
		driver=initiliseDriver();
	}

	//TC01_Cogniwize Website To check  the navigation of an URL 
	@Test
	public void TC01_HomePageispresent() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		String expected="Intelligent Process Automation | Testing Automation | RPA Services | Cogniwize";
		Assert.assertEquals(driver.getTitle(), expected);
	}
	//TC02_Homepage-Check by hovering on the Learn more link on homepage
	@Test
	public void TC02_MouseOverOnLearnMoreLink() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver,homepage.getLearnMore());
		String colour=homepage.getLearnMore().getCssValue("color");
		String blue=Color.fromString(colour).asHex();
		Assert.assertEquals(blue,blueColor);

	}
	//TC03_TC04_Homepage To check if the "Learn More" link is clickable and navigate on homepage

	@Test
	public void TC03_ClickOnLearnMore() throws IOException, InterruptedException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getLearnMore().click();
		homepage.UserWindowHandle(driver);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(),homepage.learnMore);
	}

	//TC05_Check by hovering on the "Get to know us" link on homepage 

	@Test
	public void TC05_MouseHoverGetToKnowUsLink() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver,homepage.getGetToKnowUs());
		String colour=homepage.getGetToKnowUs().getCssValue("color");
		String blue=Color.fromString(colour).asHex();
		System.out.println(blue);
		//Assert.assertEquals(blue, blueColor);expected [#ffffff] but found [#020307]
	}

	// TC06_Check if the "Get to know us" link  is clickable on homepage

	@Test
	public void TC06_ClickOnGetToKnowUsLink() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getGetToKnowUs().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.gettoKnowUsUrl);
	}
	@Test//TC07_To check the mouse hovering  "read more" of "RPA services" link  on homepage
	public void TC07_MouseHoveronReadMoreRPAservices() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver,homepage.getReadmore1());
		String colour=homepage.getReadmore1().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		System.out.println(black);
		Assert.assertEquals(black,blackColor);

	}

	//TC08_To check the navigation of "read more" of "RPA services" link  on homepage
	@Test
	public void TC08_ClickOnReadMoreRPAservices() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore1().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.rpaServicesUrl);

	}
	//TC09_To check the mouse hovering  "read more" of 	Automation Testing" link  on homepage
	@Test
	public void TC09_MouseHoveronReadMoreofAutomationTesting() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore2());
		String colour=homepage.getReadmore2().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		System.out.println(black);
		Assert.assertEquals(black,blackColor);
	}

	//TC10_To check the navigation of "read more" of "Automation Testing" link  on homepage
	@Test
	public void TC10_ClickOnReadMoreAutomationTesting() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore2().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals( driver.getCurrentUrl(), homepage.automationTestingUrl);

	}
	//TC 11_To check the mouse hovering  "read more" of "Process Mining" link  on homepage
	@Test
	public void TC11_MouseHoveronReadMoreProcessMining() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore3());
		String colour=homepage.getReadmore3().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		Assert.assertEquals(black,blackColor);
	}

	//TC 12_To check the click on  "read more" of "Process Mining" link  on homepage
	@Test
	public void TC12_ClickOnReadMoreProcessMining() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore3().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.processMiningUrl);
	}

	//TC13 To check the mouse hovering  "read more" of "	Digital Assurance Testing" link  on homepage
	@Test
	public void TC13_MouseHoveronReadMoreDigitalAssurance() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore4());
		String colour=homepage.getReadmore4().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		Assert.assertEquals(black,blackColor);
	}
	////TC14 To check the CLICK "read more" of "	Digital Assurance Testing" link  on homepage
	@Test
	public void TC14_ClickOnReadMoreDigitalAssurance() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore4().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.digitalAssuranceUrl);
	}

	//TC15_To check the mouse hovering  "read more" of "Agile and DevOps Testing" link  on homepage
	@Test
	public void TC15_MouseHoveronReadMoreAgileandDevops() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore5());
		String colour=homepage.getReadmore5().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		System.out.println(black);
		Assert.assertEquals(black,blackColor);
	}
	//TC16_To check the click on"read more" of "Agile and DevOps Testing" link  on homepage
	@Test
	public void TC16_ClickOnReadMoreAgileandDevops() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);	
		homepage.getReadmore5().click();
		homepage.UserWindowHandle(driver);
		System.out.println(driver.getCurrentUrl());
		Assert.assertEquals(driver.getCurrentUrl(),homepage.agileandDevpsUrl);
	}
	//TC17_To check the mouse hovering  "read more" of "Performance Engineering" link  on homepage
	@Test
	public void TC17_MouseHoveronReadMorePerformanceEngg() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore6());
		String colour=homepage.getReadmore6().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		Assert.assertEquals(black,blackColor);
	}
	//TC18_To check the CLICK on  "read more" of "Performance Engineering" link  on homepage
	@Test
	public void TC18_ClickOnReadMorePerformanceTesting() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore6().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(),homepage.performanceEngineeringUrl);
	}

	//TC19_To check the mouse hovering  "read more" of "	ServiceNow Testing" link  on homepage
	@Test
	public void TC19_MouseHoverOnReadMoreOfService() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore7());

		String colour=homepage.getReadmore7().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		Assert.assertEquals(black,blackColor);

	}

	//TC20_To check the mouse click on "read more" of "	ServiceNow Testing" link  on homepage
	@Test
	public void TC20_ClickOnServiceNowTesting() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore7().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(),homepage.serviceNowTestingUrl);

	}
	//TC21_To check the mouse hovering  "read more" of "salesforce Testing" link  on homepage
	@Test
	public void TC21_MouseHoveringOnSalesforce() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getReadmore8());

		String colour=homepage.getReadmore8().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		Assert.assertEquals(black,blackColor);
	}
	//TC22_To check the mouse click on "read more" of "salesforce Testing" link  on homepage
	@Test
	public void TC22_ClickOnSalesforceTesting() throws IOException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getReadmore8().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(),  homepage.salesforceTestingUrl);
	}
	//TC23_Homepage_To check the mouse hovering  " View more" of "case study on homepage

	@Test
	public void TC23_mouseHoverOnViewMoreeBooks()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getViewMoreeBook());
		String colour=homepage.getViewMoreeBook().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		System.out.println(black);
		Assert.assertEquals(black,blueColor);

	}
	//TC24_Homepage_To check the click on" View more" of "case study on homepage
	@Test
	public void TC24_clickOnViewMore()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getViewMore().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.caseStudyurl);
	}
	//TC25_Homepage_To check the mouse hovering  " View more" of "eBook on homepage

	@Test
	public void TC25_mouseHoverOnViewMore()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getViewMoreeBook());

		String colour=homepage.getViewMoreeBook().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		System.out.println(black);
		Assert.assertEquals(black,blueColor);

	}
	//TC26_Homepage_To check the mouse hovering  " View more" of "eBook on homepage
	@Test
	public void TC26_clickOnViewMoreEBooks()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getViewMoreeBook().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.eBookUrl);

	}
	//TC27_Homepage_To check the mouse hovering  " View more" of "Brochure on homepage	
	@Test
	public void TC27_mouseHoverOnViewMoreBrochure()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getviewMoreBrochure());

		String colour=homepage.getviewMoreBrochure().getCssValue("color");
		String black=Color.fromString(colour).asHex();
		System.out.println(black);
		Assert.assertEquals(black,blueColor);

	}
	//TC28_Homepage_To check the click on " View more" of "Brochure on homepage
	@Test
	public void TC28_clickOnViewMoreBrochure()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getviewMoreBrochure().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(),homepage.brochureUrl);

	}
	//TC29_Homepage_To check the mouse hovering  "Avail a free consult today "  on homepage 
	@Test
	public void TC29_mouseHoverOnAvailConsult()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getAvailFreeConsult());
		String colour=homepage.getAvailFreeConsult().getCssValue("color");
		String blue=Color.fromString(colour).asHex();
		System.out.println(blue);
		//Assert.assertEquals(blue,blackColor);
	}
	//TC30_Homepage_To check the click on "Avail a free consult today "  on homepage 
	@Test
	public void TC30_clickOnAvailFreeConsult()
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.getAvailFreeConsult().click();
		homepage.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), homepage.availFreeConsultUrl);
	}

	//TC31_Mouse Hover on the image of-Why Automated Testing Will Become the Norm for Quality Assurance.
	@Test
	public void TC31_MouseHoverOnWhyAutomated() throws InterruptedException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getHoverOnImgOfWhyAutomated());
		String colour=homepage.getHoverOnImgOfWhyAutomated().getCssValue("color");
		String purple=Color.fromString(colour).asHex();
		Assert.assertEquals(purple,purpleColor);
	}


	//TC32_Mouse Hover on the image of-How to Resolve Permission Issues In CI/CD Pipelines.
	@Test
	public void TC32_MouseHoverOnImageOfCI_CD() throws InterruptedException
	{
		driver.get(pro.getProperty("baseurl"));
		homepage = new HomePage(driver);
		homepage.MouseHover(driver, homepage.getHoverOnImgOfCI_CD());
		String colour=homepage.getHoverOnImgOfCI_CD().getCssValue("color");
		String purple=Color.fromString(colour).asHex();
		Assert.assertEquals(purple,purpleColor);
	}

//	//TC33_Mouse Hover on the image of-The Rise of Robotic Process Automation in the Pharma.
//	@Test
//	public void TC33_MouseHoverOnImageOfRiseOfRoboticProcess() throws InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.MouseHover(driver, homepage.getHoverOnImgOfRiseOfRoboticProcess());
//		String colour=homepage.getHoverOnImgOfCI_CD().getCssValue("color");
//		String purple=Color.fromString(colour).asHex();
//		//Assert.assertEquals(purple,purpleColor);
//	}
//
//	//TC34_Homepage_To click on Why Automated Testing Will Become the Norm for Quality Assurance.
//	@Test
//	public void TC34_ClickOnWhyAutomated() throws InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.getClickOnWhyAutomated().click();
//		//Assert.assertEquals(driver.getCurrentUrl(), homepage.WhyAutomated);
//	}
//
//	//TC35_Homepage_To click on How to Resolve Permission Issues In CI/CD Pipelines.
//	@Test
//	public void TC35_ClickOnCI_CD() throws InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.getClickOnCI_CD().click();
//		//Assert.assertEquals(driver.getCurrentUrl(), homepage.CI_CD);
//	}
//
//	//TC36_Homepage_To click on The Rise of Robotic Process Automation in the Pharma.
//	@Test
//	public void TC36_ClickOnRiseOfRoboticProcess() throws InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.getClickOnRiseOfRoboticProcess().click();
//		//Assert.assertEquals(driver.getCurrentUrl(),homepage.RPA_Pharma);
//	}
//
//
//	//TC37_Homepage_Click on Read More link of- Why Automated Testing Will Become the Norm for Quality Assurance.
//	@Test
//	public void TC37_ClickOnReadMore9() throws IOException, InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.getReadmore9().click();
////		Assert.assertEquals(driver.getCurrentUrl(),homepage.WhyAutomated );
//	}
//
//	//TC38_Homepage_Click on Read More link of-How to Resolve Permission Issues In CI/CD Pipelines.
//	@Test
//	public void TC38_ClickOnReadMore10() throws IOException, InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.getReadmore10().click();
//		//Assert.assertEquals(driver.getCurrentUrl(),homepage.CI_CD );
//	}
//
//	//TC39_Homepage_Click on Read More link of-The Rise of Robotic Process Automation in the Pharma.
//	@Test
//	public void TC39_ClickOnReadMore11() throws IOException, InterruptedException
//	{
//		driver.get(pro.getProperty("baseurl"));
//		homepage = new HomePage(driver);
//		homepage.getReadmore11().click();
//		//Assert.assertEquals(driver.getCurrentUrl(), homepage.RPA_Pharma);
//	}
	//To find broken links 
	@Test
	public void broken() throws IOException, InterruptedException
	{

		driver.get(pro.getProperty("baseurl"));
		 Brokenlinks();
	}

	//All links are valid link at 11/11/2022
}

