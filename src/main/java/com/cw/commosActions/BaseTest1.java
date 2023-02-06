package com.cw.commosActions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
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

public class BaseTest1
{
	public Properties pro;
	public static WebDriver driver;

	//@BeforeClass
	public  WebDriver initiliseDriver() throws IOException   
	{
		pro=new Properties();
		String path=System.getProperty("user.dir")+"./src/main/java/com/cw/Properties/Config.properties";

		FileInputStream file1=new FileInputStream(path);	
		pro.load(file1); 
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		co.addArguments("window-size=1920,1080");

		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		fo.addArguments("window-size=1920,1080");



		String Browsername=pro.getProperty("browser");
		if(Browsername.equalsIgnoreCase("Chrome"))
		{


			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver(co);

		}


		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		return driver;

	}
	//@AfterClass	
	public WebDriver TearDown() 
	{
		driver.quit();
		return driver;
	}


	public static String takesScreenshot(String testName) throws IOException
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


	public void Brokenlinks() throws InterruptedException, IOException
	{				 

		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		for(WebElement link:links)
		{
			String url = link.getAttribute("href");
			URL Link=new URL(url);
			HttpsURLConnection httpcon=(HttpsURLConnection)Link.openConnection();
			httpcon.connect();
			int response = httpcon.getResponseCode();
			if(response>=400)
			{
				System.out.println(url+" "  + "link is broken"+response);
			}
		}
		System.out.println("All links are valid link");
		//return driver;
	}

}







