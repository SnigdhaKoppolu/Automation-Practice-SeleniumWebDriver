package com.practice.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class OrangeHRMLoginTest {
   
	public static void main(String[] args) {
		WebDriver driver=null;
		try {
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement usernametextbox = driver.findElement(By.name("username"));
		usernametextbox.sendKeys("Admin");
		WebElement passwordtextbox = driver.findElement(By.name("password"));
		passwordtextbox.sendKeys("admin123");
		driver.findElement(By.tagName("button")).click();
		Thread.sleep(2000);
		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		
		String currentUrl = driver.getCurrentUrl();
		if(expectedUrl.equals(currentUrl))
		  {
			System.out.println("Login successful");
		  }
		else 
		{
		  System.out.println("Login failed - stayed on :"+currentUrl);	
		}
		}
	
	catch(Exception e)
		{
		 e.printStackTrace();
		}
	finally
	{
	  driver.quit();
	}
	}

	}

