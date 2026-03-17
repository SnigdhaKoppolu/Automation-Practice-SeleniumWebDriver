package com.listeners.testng;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//we use predefined interface in testng (by mousehover on class - choose add unimplemented methods)
public class YourListener extends SetUp implements ITestListener {
	

		@Override
		public void onTestStart(ITestResult result) {
			System.out.println("Test Started");
		}

		@Override
		public void onTestSuccess(ITestResult result) {
			
			System.out.println("Test Passed");
		}

		@Override
		public void onTestFailure(ITestResult result) {
			System.out.println("Test failed");
			//take the screenshot on failed test case
			tkScreenshot();
			
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			
			System.out.println();
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
			System.out.println();
		}

		@Override
		public void onStart(ITestContext context) {
			
			System.out.println();
		}

		@Override
		public void onFinish(ITestContext context) {
		
			System.out.println();
		}
		
		public void tkScreenshot() {
			//1.convert driver to TakeScreenshot interface
			TakesScreenshot tk=(TakesScreenshot)driver;
			
			//2.call getScreenshot method
			File file = tk.getScreenshotAs(OutputType.FILE);
			
			//3.FileUtils.copyFile, src, destination
			try {
				String fileName = null;
				//FileUtils.copyFile(file,new File("./screenshots/scrn1.png"));
				FileUtils.copyFile(file, new File("./screenshots/" + fileName + ".png"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		
	}




