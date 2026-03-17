package com.listeners.testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryListener implements IRetryAnalyzer{
	
	int count = 0;
	int tLimit = 3;    //total limit
	@Override
	public boolean retry(ITestResult result) {
		if(count < tLimit) {
			count++;
			return true;
		}
		return false;
	}

}
