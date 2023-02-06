package com.cw.Reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.cw.commosActions.BaseTest1;

public class ExtentReport extends BaseTest1
{
	static ExtentReports extentReport;
		
		public static ExtentReports getExtentReport()
		{
			
			String extentReportpath = System.getProperty("user.dir")+"\\Report\\Report.html";
			
			ExtentSparkReporter report=new ExtentSparkReporter("Report");
			
			report.config().setDocumentTitle("Cogniwize Website");
			
			report.config().setReportName("cogniwize website Report");
		    
			report.config().setTheme(Theme.DARK);
			
		    ExtentReports extent =new ExtentReports();
			
		    extent.attachReporter(report);
		    
		    extent.setSystemInfo("Project Name", "Cogniwize Website");
		    
		    extent.setSystemInfo("User Name","ABC");
		    
		    extent.setSystemInfo("Employee ID ","EMP0001");
		    
		    extent.setSystemInfo("Enviorment","Automation Testing");
		    
		    extent.setSystemInfo("State Demp","All state is passed"); 
		   
			return extentReport;
		}
	}


