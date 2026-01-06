package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestsLogin {
	WebDriver driver;
	@BeforeMethod()
	public void setUp() {
		driver=new ChromeDriver();
	}
	@AfterMethod()
	public void tearDown() {
		driver.close();
	}
	@Test(priority=0)
	public void testxyz(){
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}
	@BeforeMethod()
	
   @Test(priority=1)
   public void testabc() {
	   driver.get("https://www.facebook.com/");
	   System.out.println(driver.getTitle());
   }
}
	