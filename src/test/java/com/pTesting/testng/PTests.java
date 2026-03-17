package com.pTesting.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class PTests {


	@Test(priority=0)
	public void test1(){
		Reporter.log("test3 started execution");
		System.out.println("PTest  test3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.x.com");
		System.out.println(driver.getTitle());
		Reporter.log("Test3 completed "); // Reporter.log() is used to provide any information/logs into the report. 
		driver.quit();
		//driver.close();
	}

	@Test(priority=1)
	public void test2(){
		System.out.println("PTest  test4");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		Reporter.log("test4 completed");  //this message will be appended in the report not in the console
		driver.quit();
		//driver.close();
	}
    @Test(priority=2)
	public void test3(){
		System.out.println("PTest  test5");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.engvid.com");
		System.out.println(driver.getTitle());
		//we also append some screeenshots and files
		Reporter.log("<a href=C:\\snigdha(programs)\\seleniumwebdriver\\Screenshot.png>Click Me</a>");
		//driver.close();
		driver.quit();
	}
	
	@Test(priority=3)
	public void test4(){
		System.out.println("PTest  test1");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}

	@Test(priority=4)
	public void test5(){
		
		System.out.println("PTest  test2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		//System.out.println(driver.getTitle());
		String s = driver.getTitle();
		Reporter.log("Title "+s);  
		//driver.close();
		driver.quit();
	}

	}





