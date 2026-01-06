package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameter1 {
	WebDriver driver;
    @Test
	public void t1() {
    	
		String s1 = "hello";
		System.out.println(s1=="hello");
	}
    
    
   @Test
   @Parameters("browser")
	public void test1(@Optional("Firefox")String browser) {
		
		//System.out.println("Run this tests on"+browser);
		if(browser.equals("Chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equals("Firefox")) {
		  driver = new FirefoxDriver();
		}driver.get("https://google.com");
	}
}
