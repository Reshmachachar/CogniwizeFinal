package com.cw.TestCases;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.cw.Pages.CareerPage;
import com.cw.commosActions.BaseTest1;
import com.cw.commosActions.BaseTest;

public class CogniwizeOnGoogle extends BaseTest1
{
	WebDriver driver;
	WebDriverWait wait;
	@Test
	public void Google() throws IOException, InterruptedException 
	{   int sum=0;
	driver=initiliseDriver(); 
	driver.get(pro.getProperty("googleLinkurl"));
	driver.findElement(By.xpath("  //input[@class='gLFyf']")).sendKeys("site:cogniwize.com",Keys.ENTER);
	WebElement next=driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]"));
	while(next!=null)
	{
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='res']//cite/parent::div/parent::a"));
		int eachPageLinks = links.size();
		for(WebElement link:links)
		{
			System.out.println(link.getAttribute("href"));
		}
		sum=sum+eachPageLinks;
		next.click();
		try {
			next=driver.findElement(By.xpath("//*[@id=\"pnnext\"]/span[2]"));  

		}catch(Exception e)
		{
			System.out.println("Done");
			break;
		}
	} 
	System.out.println("Total count is   "+sum);
	}
}

