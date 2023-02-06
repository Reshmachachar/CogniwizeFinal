package com.cw.TestCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.cw.Pages.HomePage;
import com.cw.Pages.ServicesPage;
import com.cw.commosActions.BaseTest;
import com.cw.commosActions.BaseTest1;


public class ServicesTest extends BaseTest1 {

	WebDriver driver;
	ServicesPage services;

	public ServicesTest() throws IOException {
		driver = initiliseDriver();
		driver.get(pro.getProperty("baseurl"));
		services = new ServicesPage(driver);

	}

	// TC01_Homepage-navigation of service tab on homepage
	@Test
	public void TC01_ClickOnServicesTab() throws IOException {

		services.getServicesTab().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.servicePageUrl);
	}

	// TC02_Services-hover on services dropdown
	@Test
	public void TC02_ClickOnServicesDropdown() throws IOException, InterruptedException {

		services.getServicesDropdown().click();
		services.Mousehover(driver, services.getServicesDropdown());
		// System.out.println(services.getServicesDropdown().getText());

	}

	// TC03_Services- Book A Consultation link is clickable on services page
	@Test
	public void TC03_BookAConsultationLink() throws IOException {

		services.getServicesTab().click();
		services.getBookAConsultationLink().click();
		services.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), services.bookAConsultation);
	}

	// TC04_Services- hovering on the "Contact Us" link on Services page
	@Test
	public void TC04_HoverOnContactUsBtn() throws IOException, InterruptedException {

		services.getServicesTab().click();
		services.Mousehover(driver, services.getContactUsBtn());
		Thread.sleep(3000);
		String colour = services.getContactUsBtn().getCssValue("color");
		String blue = Color.fromString(colour).asHex();
		System.out.println(blue);
	}

	// TC05_Services- check if the "Contact Us" link is clickable & navigated on
	// services page
	@Test
	public void TC05_ClickOnContactUsBtn() throws IOException, InterruptedException {

		HomePage homepage = new HomePage(driver);
		homepage.getServicesTab().click();
		services.Mousehover(driver, services.getContactUsBtnClick());
		services.getContactUsBtnClick().click();
		services.UserWindowHandle(driver);
		Assert.assertEquals(driver.getCurrentUrl(), services.contactUsBtnUrl);
	}

	// TC06- To check if the all the links on services page comes under Automation
	// solution is clickable
	@Test
	public void TC06_serviceLink() throws IOException, InterruptedException {

		services.Mousehover(driver, services.HoverOnServiceTabLink());
		List<WebElement> links = services.LinksOfServiceTab();
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();

			httpcon.connect();
			int response = httpcon.getResponseCode();
			if (response >= 400) {
				System.out.println(url + " " + "link is broken");
			} else {
				System.out.println(url + " " + "link is valid");

			}

		}
	}

	// TC07_Services- RPA link on services page comes under Robotic Processs
	// Automation is clickable & navigated
	@Test
	public void TC07_ClickOnRPAlink() throws IOException, InterruptedException {

		// services.getServicesTab().click();
		services.Mousehover(driver, services.getServicesTab());
		services.getRPAlink().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.RPALinkUrl);
	}

	// TC08_Services- HyperAutomation Services" link on services page comes under
	// Robotic Processs Automation is clickable & navigated
	@Test
	public void TC08_ClickOnHyperAutomationlink() throws IOException, InterruptedException {

		// services.getServicesTab().click();
		services.Mousehover(driver, services.getServicesTab());
		services.getHyperAutomationlink().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.hyperAutomationlink);
	}

	// TC09_Services- Automation Anywhere migration" link on services page comes
	// under Robotic Processs Automation is clickable & navigated
	@Test
	public void TC09_ClickOnAutomationMigrationlink() throws IOException, InterruptedException {

		// services.getServicesTab().click();
		services.Mousehover(driver, services.getServicesTab());
		services.getAutomationMigrationlink().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.automationMigrationlink);
	}

	// TC10-To check if the "Process Mining" link on services page comes under
	// Automation solution is clickable and navigated
	@Test
	public void TC10_ClickOnProcessMiningLink() throws IOException {

		services.Mousehover(driver, services.getServicesTab());
		services.clickOnProcessMining().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.ProcessMiningLink);
	}

	// TC11-To check if the all the links on services page comes under Testing
	// Services is clickable
	@Test
	public void TC11_services() throws IOException, InterruptedException {

		services.Mousehover(driver, services.HoverOnServiceTab());
		List<WebElement> links = services.LinksOfServicesTab();
		System.out.println(links.size());
		for (int i = 0; i < links.size(); i++) {
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpcon = (HttpURLConnection) link.openConnection();

			httpcon.connect();
			int response = httpcon.getResponseCode();
			if (response >= 400) {
				System.out.println(url + " " + "link is broken");
			} else {
				System.out.println(url + " " + "link is valid");

			}

		}
	}

	// TC12-To check the navigation of "Test Automation Solution" link on services
	// page comes under Testing Services
	@Test
	public void TC12_ClickOnTestAutomationSolutions() throws IOException {

		services.Mousehover(driver, services.getServicesTab());
		services.clickOnTestAutomationSolution().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.testAutomationSolution);
	}

	// TC13-To check the navigation of "Mobile Testing services" link on services
	// page comes under Testing Services
	@Test
	public void TC13_ClickOnMobileTestingServices() throws IOException {

		services.Mousehover(driver, services.getServicesTab());
		services.clickOnMobileTestingservices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.MobileTestingservices);
	}

	// TC14-To check the navigation of "API and Web Testing Services" link on
	// services page comes under Testing Services
	@Test
	public void TC14_ClickclickOnAPIandWebTestingServices() throws IOException {

		services.Mousehover(driver, services.getServicesTab());
		services.clickOnAPIandWebTestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.APIandWebTestingServices);
	}

	// TC15-To check the navigation of "Performance Testing Services" link on
	// services page comes under Testing Services
	@Test
	public void TC15_clickOnPerformanceTestingServices() throws IOException {

		services.Mousehover(driver, services.getServicesTab());
		services.clickOnPerformanceTestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.PerformanceTestingServices);
	}

	// TC16-To check the navigation of "Security Testing Services" link on services
	// page comes under Testing Services
	@Test
	public void TC16_clickOnSecurityTestingServices() throws IOException {

		services.Mousehover(driver, services.getServicesTab());
		services.clickOnSecurityTestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.SecurityTestingServices);
	}

	// TC17_Click On Digital Testing Services when mouse hover on Services-
	@Test
	public void TC17_ClickOnDigitalTestingServices() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getDigitalTestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.digitalTestingServices);
	}

	// TC18-To check the navigation of "Digital Assurance and Testing Services" link
	// on services page comes under Digital Testing Services
	@Test
	public void TC18_ClickOnDigitalAssuranceAndTestingServices() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getclickOnDigitalAssuranceAndTestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.DigitalAssuranceAndTestingServices);
	}

	// TC19-To check the navigation of "Artificial Intelligence (AI) in Testing"
	// link on services page comes under Digital Testing Services
	@Test
	public void TC19_ClickOnArtificialIntelligenceINTesting() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getclickOnArtificialIntelligenceInTesting().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.artificialIntelligenceInTesting);
	}

	// TC20-To check the navigation of "IOT Testing Services" link on services page
	// comes under Digital Testing Services
	@Test
	public void TC20_ClickOnIOTtestingServices() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getclickOnIOTtestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.iOTtestingServices);
	}

	// TC21-To check the navigation of "Big Data and Analytics Testing" link on
	// services page comes under Digital Testing Services
	@Test
	public void TC21_ClickOnBigDataAndAnalyticsTesting() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getclickOnBigDataAndAnalyticsTesting().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.bigDataAndAnalyticsTesting);
	}

	// TC22-To check the navigation of "Snowflake Testing" link on services page
	// comes under Digital Testing Services
	@Test
	public void TC22_ClickOnSnowflakeTesting() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getclickOnSnowflakeTesting().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.snowflakeTesting);
	}

	// TC23_Click On "Quality Engineering" when mouse hover on Services-
	@Test
	public void TC23_ClickOnQualityEngg() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getClickOnQualityEngineering().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.qualityEngineering);
	}

	// TC24-To check the navigation of "Agile and DevOps Testing Services" link on
	// services page comes under Quality Engineering
	@Test
	public void TC24_ClickOnAgileAndDevOpsTestingServices() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getClickOnAgileAndDevOpsTestingServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.agileAndDevOpsTestingServices);
	}

	// TC25-To check the navigation of "Performance Engineering Services" link on
	// services page comes under Quality Engineering
	@Test
	public void TC25_ClickOnPerformanceEngineeringServices() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getClickOnPerformanceEngineeringServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.performanceEngineeringServices);
	}

	// TC26-To check the navigation of "Test Data Management Services" link on
	// services page comes under Quality Engineering
	@Test
	public void TC26_ClickOnTestDataManagementServices() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getClickOnTestDataManagementServices().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.testDataManagementServices);
	}

	// TC27-To check the navigation of "Service Virtualization and DevOps " link on
	// services page comes under Quality Engineering
	@Test
	public void TC27_ClickOnServiceVirtualizationAndDevOps() throws IOException, InterruptedException {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getClickOnServiceVirtualizationAndDevOps().click();
		Assert.assertEquals(driver.getCurrentUrl(), services.serviceVirtualizationAndDevOps);
	}

	// TC28_Click on on Saas Testing
	@Test
	public void TC28_clickOnSaasTesting() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getSaasTesting().click();
		Assert.assertEquals(driver.getTitle(), services.SaasTestingTitle);

	}

	// TC29_Click on "service now testing" on Saas Testing
	@Test
	public void TC29_clickOnServiceNow() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getServiceNow().click();
		Assert.assertEquals(driver.getTitle(), services.ServiceNowTesting);

	}

	// TC30_Click on "SalesForce Testing on Saas Testing
	@Test
	public void TC30_clickOnSalesForce() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getSalesForce().click();
		Assert.assertEquals(driver.getTitle(), services.SalesForceTestingServices);

	}

	// TC31_Click on "Test Transformation & Advisory Services" on Saas Testing

	@Test
	public void TC31_clickOnTestAdvisory() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getTestAutomation().click();
		Assert.assertEquals(driver.getTitle(), services.TestAdvisory);

	}
	// TC32_Click on "Testing Center of Excellence (TCoE) Setup" on Saas Testing

	@Test
	public void TC32_clickOnTestingCenter() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getTestCenter().click();
		Assert.assertEquals(driver.getTitle(), services.TestingCenter);

	}

	// TC33_Click on "Specialized Advisory Services" on Saas Testing

	@Test
	public void TC33_clickOnSpecializedAdvisory() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getAdvisoryService().click();
		Assert.assertEquals(driver.getTitle(), services.SpecializedAdvisory);

	}

	// TC34- click on "Cherwell Services"
	@Test
	public void TC34_clickOnCherwellServices() {
		services.Mousehover(driver, services.HoverOnServiceTab());
		services.getCherwell().click();
		Assert.assertEquals(driver.getTitle(), services.CherwellServices);

	}

	// To find brokenLinks on Service page
//	@Test
//	public void broken() throws IOException, InterruptedException {
//		driver = initiliseDriver();
//		driver.get(pro.getProperty("servicePageUrl"));
//		driver = Brokenlinks();
//	}

}
