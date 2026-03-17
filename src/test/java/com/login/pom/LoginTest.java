package com.login.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.project.pages.LoginPage;


public class LoginTest {
	
	WebDriver driver;
	LoginPage lp;
	
	@Test
	public void loginTest() {
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/login");
		
		//my driver contains
		//1.ChromeBrowser
		//2.loginpage/url
		lp = new LoginPage(driver);
		lp.enterUsername("practice");
		lp.enterPassword("SuperSecretPassword!");
		lp.clickOnLogin();
		
	}
	
	
	
}
