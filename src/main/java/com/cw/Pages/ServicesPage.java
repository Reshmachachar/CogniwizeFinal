package com.cw.Pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ServicesPage {

	WebDriver driver;
	public String servicePageUrl = "https://cogniwize.com/our-services/";
	public String bookAConsultation = "https://cogniwize.com/contact-us/";
	public String contactUsBtnUrl = "https://cogniwize.com/contact-us/";
	public String RPALinkUrl = "https://cogniwize.com/robotic-process-automation/rpa/";
	public String hyperAutomationlink = "https://cogniwize.com/robotic-process-automation/hyperautomation-services/";
	public String automationMigrationlink = "https://cogniwize.com/robotic-process-automation/automation-anywhere-migration/";
	public String ProcessMiningLink = "https://cogniwize.com/services/process-mining/";
	public String testAutomationSolution = "https://cogniwize.com/services/testing-services/test-automation-solutions/";
	public String MobileTestingservices = "https://cogniwize.com/services/testing-services/full-life-cycle-testing-services/mobile-testing-services/";
	public String APIandWebTestingServices = "https://cogniwize.com/services/testing-services/full-life-cycle-testing-services/api-and-web-app-testing-services/";
	public String PerformanceTestingServices = "https://cogniwize.com/services/testing-services/full-life-cycle-testing-services/performance-testing-services/";
	public String SecurityTestingServices = "https://cogniwize.com/services/testing-services/full-life-cycle-testing-services/security-testing-services/";
	public String digitalTestingServices = "https://cogniwize.com/digital-testing-services/";
	public String DigitalAssuranceAndTestingServices = "https://cogniwize.com/services/testing-services/digital-assurance/digital-assurance-and-testing-services/";
	public String artificialIntelligenceInTesting = "https://cogniwize.com/services/testing-services/next-gen-testing/artificial-intelligence-ai-in-testing/";
	public String iOTtestingServices = "https://cogniwize.com/services/testing-services/next-gen-testing/iot-testing-services/";
	public String bigDataAndAnalyticsTesting = "https://cogniwize.com/services/testing-services/digital-assurance/big-data-and-analytics-testing/";
	public String snowflakeTesting = "https://cogniwize.com/services/testing-services/digital-assurance/snowflake-testing/";
	public String qualityEngineering = "https://cogniwize.com/services/quality-engineering/";
	public String agileAndDevOpsTestingServices = "https://cogniwize.com/services/quality-engineering/agile-and-devops-testing-services/";
	public String performanceEngineeringServices = "https://cogniwize.com/services/quality-engineering/performance-engineering-services/";
	public String testDataManagementServices = "https://cogniwize.com/services/quality-engineering/test-data-management-services/";
	public String serviceVirtualizationAndDevOps = "https://cogniwize.com/services/quality-engineering/service-virtualization-and-devops/";
	public String SaasTestingTitle = "SaaS Testing Services | SaaS Automation Software Testing | Cogniwize";
	public String ServiceNowTesting = "ServiceNow Testing Services | Automated Test Framework in ServiceNow | Cogniwize";
	public String SalesForceTestingServices = "Salesforce Testing Services | Salesforce Automation Testing | Cogniwize";
	public String TestAdvisory = "Test Advisory and Transformation Services | Cogniwize";
	public String TestingCenter = "Testing Center of Excellence Services | Test Automation CoE | Cogniwize";
	public String SpecializedAdvisory = "Professional Testing Advisory Services and Support | Cogniwize";
	public String CherwellServices = "Cherwell Software Services | Cherwell Service Management | Cogniwize";

	public ServicesPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Mousehover(WebDriver driver, WebElement element) {
		Actions act = new Actions(driver);
		act.moveToElement(element).build().perform();
	}

	public void UserWindowHandle(WebDriver driver) {
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandles = driver.getWindowHandles();
		for (String handle : allhandles) {
			if (!parentHandle.equals(handle)) {
				driver.switchTo().window(handle);
			}
		}
	}

	// TC01_Homepage- navigation of service tab on homepage
	@FindBy(xpath = "(//span[@class='menu-text'])[2]")
	WebElement ServicesTab;

	public WebElement getServicesTab() {
		return ServicesTab;
	}

	// TC02_Services- hover on services dropdown
	@FindBy(xpath = "(//span[@class='menu-text'])[2]")
	WebElement ServicesDropdown;

	public WebElement getServicesDropdown() {
		return ServicesDropdown;
	}

	// TC03_Services- Book A Consultation link is clickable on services page
	@FindBy(xpath = "(//span[text()='Book a Consultation'])[1]") // (//span[text()='Know More'])[1]")
	WebElement BookAConsultationLink;

	public WebElement getBookAConsultationLink() {
		return BookAConsultationLink;
	}

	// TC04_Services- hovering on the "Contact Us" link on Services page
	@FindBy(xpath = "(//span[normalize-space()='Contact us'])[1]")

	WebElement ContactUsBtn;

	public WebElement getContactUsBtn() {
		return ContactUsBtn;
	}

	// TC05_Services- check if the "Contact Us" link is clickable & navigated on
	// services page
	@FindBy(xpath = "(//span[normalize-space()='Contact us'])[1]")

	WebElement ContactUsBtnClick;

	public WebElement getContactUsBtnClick() {
		return ContactUsBtnClick;
	}

	// TC06- To check if the all the links on services page comes under Testing
	// Services is clickable
	@FindBy(xpath = "(//span[.='Services'])[1]")
	WebElement hoverOn;

	public WebElement HoverOnServiceTabLink() {
		return hoverOn;
	}

	// -Link under Services Tab after hovering on it
	@FindBy(xpath = "(//ul[@class='sub-menu'])[2]/li/a")
	List<WebElement> WebElements;

	public List<WebElement> LinksOfServiceTab() {
		return WebElements;
	}

	// TC07_Services-RPA" link on services page comes under Robotic Processs
	// Automation is clickable & navigated
	@FindBy(xpath = "(//span[text()='RPA'])[1]")
	WebElement RPAlink;

	public WebElement getRPAlink() {
		return RPAlink;
	}

	// TC08_Services- HyperAutomation Services" link on services page comes under
	// Robotic Processs Automation is clickable & navigated
	@FindBy(xpath = "//span[text()='HyperAutomation Services']")
	WebElement HyperAutomationlink;

	public WebElement getHyperAutomationlink() {
		return HyperAutomationlink;
	}

	// TC09_Services- Automation Anywhere migration" link on services page comes
	// under Robotic Processs Automation is clickable & navigated
	@FindBy(xpath = "//span[text()='Automation Anywhere Migration']")
	WebElement AutomationMigrationlink;

	public WebElement getAutomationMigrationlink() {
		return AutomationMigrationlink;
	}

	// TC10-To check if the "Process Mining" link on services page comes under
	// Automation solution is clickable
	@FindBy(xpath = "((//ul[@class='sub-menu'])[2]/li/a)[4]")
	WebElement ProcessMining;

	public WebElement clickOnProcessMining() {
		return ProcessMining;
	}

	// TC11-To check if the all the links on services page comes under Testing
	// Services is clickable
	@FindBy(xpath = "(//span[.='Services'])[1]")
	WebElement hover;

	public WebElement HoverOnServiceTab() {
		return hover;
	}

	// -Link under Services Tab after hovering on it
	@FindBy(xpath = "(//ul[@class='sub-menu'])[3]/li/a")
	List<WebElement> webElements;

	public List<WebElement> LinksOfServicesTab() {
		return webElements;
	}

	// TC12-To check the navigation of "Test Automation Solution" link on services
	// page comes under Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li/a)[1]")
	WebElement TestAutomation;

	public WebElement clickOnTestAutomationSolution() {
		return TestAutomation;
	}

	// TC13-To check the navigation of "Mobile Testing services" link on services
	// page comes under Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li/a)[2]")
	WebElement MobileTesting;

	public WebElement clickOnMobileTestingservices() {
		return MobileTesting;
	}

	// TC14-To check the navigation of "API and Web Testing Services" link on
	// services page comes under Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li/a)[3]")
	WebElement APIandWebTesting;

	public WebElement clickOnAPIandWebTestingServices() {
		return APIandWebTesting;
	}

	// TC15-To check the navigation of "Performance Testing Services" link on
	// services page comes under Testing Services

	@FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li/a)[4]")
	WebElement PerformanceTesting;

	public WebElement clickOnPerformanceTestingServices() {
		return PerformanceTesting;
	}

	// TC16-To check the navigation of "Security Testing Services" link on services
	// page comes under Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[3]/li/a)[5]")
	WebElement SecurityTesting;

	public WebElement clickOnSecurityTestingServices() {
		return SecurityTesting;
	}

	// TC17_Click On Digital Testing Services when mouse hover on Services-
	@FindBy(xpath = "(//div[@class='fusion-megamenu-title']/a)[3]")
	WebElement DigitalTestingServices;

	public WebElement getDigitalTestingServices() {
		return DigitalTestingServices;
	}

	// TC18-To check the navigation of "Digital Assurance and Testing Services" link
	// on services page comes under Digital Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[4]/li/a)[1]")
	WebElement DigitalAssuAndTestingServices;

	public WebElement getclickOnDigitalAssuranceAndTestingServices() {
		return DigitalAssuAndTestingServices;
	}

	// TC19-To check the navigation of "Artificial Intelligence (AI) in Testing"
	// link on services page comes under Digital Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[4]/li/a)[2]")
	WebElement ArtificialIntelligenceInTesting;

	public WebElement getclickOnArtificialIntelligenceInTesting() {
		return ArtificialIntelligenceInTesting;
	}

	// TC20-To check the navigation of "IOT Testing Services" link on services page
	// comes under Digital Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[4]/li/a)[3]")
	WebElement IOTtestingServices;

	public WebElement getclickOnIOTtestingServices() {
		return IOTtestingServices;
	}

	// TC21-To check the navigation of "Big Data and Analytics Testing" link on
	// services page comes under Digital Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[4]/li/a)[4]")
	WebElement BigDataAndAnalyticsTesting;

	public WebElement getclickOnBigDataAndAnalyticsTesting() {
		return BigDataAndAnalyticsTesting;
	}

	// TC22-To check the navigation of "Snowflake Testing" link on services page
	// comes under Digital Testing Services
	@FindBy(xpath = "((//ul[@class='sub-menu'])[4]/li/a)[5]")
	WebElement SnowflakeTesting;

	public WebElement getclickOnSnowflakeTesting() {
		return SnowflakeTesting;
	}

	// TC23_Click On "Quality Engineering" when mouse hover on Services-
	@FindBy(xpath = "(//div[@class='fusion-megamenu-title']/a)[4]")
	WebElement QualityEngineering;

	public WebElement getClickOnQualityEngineering() {
		return QualityEngineering;
	}

	// TC24-To check the navigation of "Agile and DevOps Testing Services" link on
	// services page comes under Quality Engineering
	@FindBy(xpath = "((//ul[@class='sub-menu'])[5]/li/a)[1]")
	WebElement AgileAndDevOpsTestingServices;

	public WebElement getClickOnAgileAndDevOpsTestingServices() {
		return AgileAndDevOpsTestingServices;
	}

	// TC25-To check the navigation of "Performance Engineering Services" link on
	// services page comes under Quality Engineering
	@FindBy(xpath = "((//ul[@class='sub-menu'])[5]/li/a)[2]")
	WebElement PerformanceEngineeringServices;

	public WebElement getClickOnPerformanceEngineeringServices() {
		return PerformanceEngineeringServices;
	}

	// TC26-To check the navigation of "Test Data Management Services" link on
	// services page comes under Quality Engineering
	@FindBy(xpath = "((//ul[@class='sub-menu'])[5]/li/a)[3]")
	WebElement TestDataManagementServices;

	public WebElement getClickOnTestDataManagementServices() {
		return TestDataManagementServices;
	}

	// TC27-To check the navigation of "Service Virtualization and DevOps " link on
	// services page comes under Quality Engineering
	@FindBy(xpath = "((//ul[@class='sub-menu'])[5]/li/a)[4]")
	WebElement ServiceVirtualizationAndDevOps;

	public WebElement getClickOnServiceVirtualizationAndDevOps() {
		return ServiceVirtualizationAndDevOps;
	}

	// TC28_Click on on Saas Testing
	@FindBy(xpath = "//*[@id='menu-item-3581']/div/a")
	WebElement SaasTesting;

	public WebElement getSaasTesting() {
		return SaasTesting;
	}

	// TC29_Click on "service no testing" on Saas Testing
	@FindBy(xpath = "//li[@id='menu-item-3584']/a")
	WebElement serviceNow;

	public WebElement getServiceNow() {
		return serviceNow;
	}

	// TC30_Click on "salesforce testing services" on Saas Testing
	@FindBy(xpath = "//*[@id=\"menu-item-3581\"]/ul/li[2]/a")
	WebElement salesForce;

	public WebElement getSalesForce() {
		return salesForce;
	}

	// TC31_Click on "Test Transformation & Advisory Services" on Saas Testing
	@FindBy(xpath = "//*[@id=\"menu-item-3588\"]/div/a")
	WebElement testAutomation;

	public WebElement getTestAutomation() {
		return testAutomation;
	}

	// TC32_Click on "Testing Center of Excellence (TCoE) Setup" on Saas Testing

	@FindBy(xpath = "//*[@id=\"menu-item-3592\"]/a")
	WebElement testCenter;

	public WebElement getTestCenter() {
		return testCenter;
	}

	// TC33_Click on "Specialized Advisory Services" on Saas Testing
	@FindBy(xpath = "//*[@id=\"menu-item-3591\"]/a")
	WebElement advisoryService;

	public WebElement getAdvisoryService() {
		return advisoryService;
	}

	// TC34 click on "Cherwell Services"
	@FindBy(xpath = "//*[@id=\"menu-item-3593\"]/div/a")
	WebElement Cherwell;

	public WebElement getCherwell() {
		return Cherwell;
	}

}
