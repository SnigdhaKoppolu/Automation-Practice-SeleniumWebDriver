package com.login.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.project.pages.LoginPage;
import com.project.pages.LoginPage2;

public class LoginTest2 {

	WebDriver driver;
	LoginPage lp2;
	
	
	@Test
	public void loginTest2() {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		LoginPage2 lp2 = new LoginPage2(driver);
		lp2.enterUsername("user1");
		lp2.enterPassword("pass");
	}
	
}
