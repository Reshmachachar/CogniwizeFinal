package com.cw.Reports;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.IResultMap;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Writable;

public class ExtentReportNG implements IReporter 
{
	private ExtentReport extent;
	ExtentTest logger;
	String storyName=this.getClass().getSimpleName();
	
	/*public void generateReport (List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory)
	{
	extent = new ExtentReport(outputDirectory + File.separator	+ storyName+".html", true);
	for (ISuite suite: suites)
	{
	Map<String, ISuiteResult> result=suite.getResults();
	for (ISuiteResult r: result.values())
	{
	
	ITestContext context= r.getTestContext();
	buildTestNodes (context.getPassedTests(), LogStatus.PASS); 
	buildTestNodes(context.getFailedTests(), LogStatus.FAIL);
	buildTestNodes(context.getSkippedTests(), LogStatus.SKIP);
	}
	}
	((Writable) extent).flush();
	extent.close();
	}
	private void buildTestNodes (IResultMap tests, LogStatus status)
  { 
		ExtentTest test;
   	if (tests.size() > 0) 
   	{
	for (ITestResult result: tests.getAllResults())
		{ 
		test =extent.startTest(result.getMethod().getMethodName());
		
	test.setStartedTime(getTime(result.getStartMillis())); 
	test.setEndedTime(getTime(result.getEndMillis()));  
         
		}
   	}
   	}*/
	}
