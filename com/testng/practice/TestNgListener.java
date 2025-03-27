package com.testng.practice;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNgListener implements ITestListener {

	@Override
	 public void onTestSuccess(ITestResult result) {
		    System.out.println("ITestListener----> Success");
		  }
}
