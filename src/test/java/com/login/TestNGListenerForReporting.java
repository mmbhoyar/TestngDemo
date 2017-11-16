package com.login;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.demo.TestNGPIEChart;

public class TestNGListenerForReporting implements ITestListener{

	static int passValue=0;
	static int failValue=0;
	static int skipValue=0;
	
	public void onTestStart(ITestResult result) {
		System.out.println("your test name --"+result.getTestName());
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void onTestSuccess(ITestResult result) {
		passValue++;
	}

	public void onTestFailure(ITestResult result) {
		failValue++;
	}

	public void onTestSkipped(ITestResult result) {
		skipValue++;
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("inside ontestfailed");
		
	}

	public void onStart(ITestContext context) {
		System.out.println("started your test suite----");
	}

	public void onFinish(ITestContext context) {
		System.out.println("completed test suite executoin and here is your report");		
		try {
			TestNGPIEChart.generateChart(passValue, failValue, skipValue, 0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
}
