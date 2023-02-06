package com.cw.commosActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.formula.atp.Switch;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest
{
	public Properties pro;
	public static WebDriver driver;

	//@BeforeClass
	
	public  WebDriver initiliseDriver() throws IOException   
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice\\n Headless\\n Without Headless");
		String options = sc.nextLine();
		
		if(options.equalsIgnoreCase("headless"))
		{
		pro=new Properties();
		String path=System.getProperty("user.dir")+"./src/main/java/com/cw/Properties/Config.properties";

		FileInputStream file1=new FileInputStream(path);	
		pro.load(file1); 
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("window-size=1366,768");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		fo.addArguments("window-size=1366,768");
		
		
		String Browsername=pro.getProperty("browser");
		if(Browsername.equalsIgnoreCase("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(co);

		}
		

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		}
		
		else if (options.equalsIgnoreCase("Without headless")) {
			pro=new Properties();
			String path=System.getProperty("user.dir")+"./src/main/java/com/cw/Properties/Config.properties";

			FileInputStream file1=new FileInputStream(path);	
			pro.load(file1); 
			
			String Browsername=pro.getProperty("browser");
			if(Browsername.equalsIgnoreCase("Chrome"))
			{
				

				WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();

			}
			else if(Browsername.equalsIgnoreCase("edge"))
			{

				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();

			}

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			

		}
		return driver;

	}
	//@AfterClass	
	public void TearDown() 
	{
		driver.quit();
		
	}

	
	
	public static String takesScreenshot(String testName,WebDriver driver) throws IOException
	{		
		File s=(File)((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String d = System.getProperty("user.dir")+"\\Screenshot\\"+testName+".png";
		FileUtils.copyFile(s, new File(d));
		return d;
	}
	
//	@AfterMethod
//	public void Aftermethod(ITestResult result) throws IOException
//	{
//		if(ITestResult.FAILURE==result.getStatus())
//		{
//			BaseTest1.takesScreenshot(result.getName(),driver);
//		}
//	}
//	
	


	public WebDriver Brokenlinks() throws InterruptedException, IOException
	{				 
		
		List<WebElement>links=driver.findElements(By.tagName("a"));// a is anchor tag
		System.out.println(links.size());
		//for(int i=0;i<links.size();i++)
		//{
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			URL Link=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection) Link.openConnection();
			httpcon.connect();
			int response = httpcon.getResponseCode();//broken links 
			if(response>=400)
			{
				System.out.println(url+" "+"link is broken");
			}
		}
		System.out.println("All links are valid link");
		return driver;
	}

}







