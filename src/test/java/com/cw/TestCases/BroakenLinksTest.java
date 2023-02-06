package com.cw.TestCases;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


import com.cw.commosActions.BaseTest;
import com.cw.commosActions.BaseTest1;



public class BroakenLinksTest extends BaseTest1
{
	WebDriver driver;
	@Test
	public void Broakenlinks() throws InterruptedException, IOException
	{
		driver=initiliseDriver();
		driver.get(pro.getProperty("baseurl"));
		Thread.sleep(5000);
		List<WebElement>links=driver.findElements(By.tagName("a"));// a is anchor tag
		System.out.println(links.size());
		for(int i=0;i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");//href is hyperlink reference 
			URL link=new URL(url);
			HttpURLConnection httpcon=(HttpURLConnection) link.openConnection();
			//link.getDefaultPort();
			Thread.sleep(20);
			httpcon.connect();
			int response = httpcon.getResponseCode();
			if(response>=400)
			{
				System.out.println(url+" "  + "link is broken");
			}
			else
			{
				System.out.println(url+" "  + "link is valid");

			}

		}
	}

}






