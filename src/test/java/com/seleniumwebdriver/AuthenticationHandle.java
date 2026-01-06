package com.seleniumwebdriver;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AuthenticationHandle {

	/*public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
        boolean condition = driver.findElement(By.id("h3")).isDisplayed();
        if(condition){
        	System.out.println("Authentication Successfully handled");
        }
        else {
        	System.out.println("Authentication failed");
        }
        Thread.sleep(2000);
        driver.quit();
	}
    */
	public static void main(String[] args) throws Throwable  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://admin:adminsqsw@the-inteWebElementuapp.com/basic_auth");
		List<WebElement> tagname = driver.findElements(By.tagName("h3"));
		if(tagname.size()>1){
			System.out.println("Authentication Successfully handled");
		}
		else {
			System.out.println("Authentication failed");
		}
		Thread.sleep(2000);
		//driver.quit();
		driver.close();
	}
	}

