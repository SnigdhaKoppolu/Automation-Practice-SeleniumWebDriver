package com.pTesting.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PTest2 {
	
	@Test(priority=0)
	public void test1() {
		Logger lg= LogManager.getLogger(PTest2.class);
		System.out.println("PTest2  test3");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.x.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}
	
	@Test(priority=1)
	public void test2(){
		System.out.println("PTest2  test4");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}
    @Test(priority=2)
	public void test3(){
		System.out.println("PTest2  test5");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.engvid.com");
		System.out.println(driver.getTitle());
		// driver.close();
		driver.quit();
	}
	
	@Test(priority=3)
	public void test4(){
		System.out.println("PTest2  test1");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}

	@Test(priority=4)
	public void test5(){
		System.out.println("PTest2  test2");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		driver.quit();
	}
	

	

	}


