package com.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrlDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com");
		//driver.get("https://www.facebook.com/");
		String pageurl=driver.getCurrentUrl();
		String title=driver.getTitle();
		System.out.println("Page URL is :" +pageurl);
		System.out.println("page title is "+title);
		if(title.equalsIgnoreCase("google"))
		//if(pageurl.equals("https://www.facebook.com/"))
		{
			System.out.println("test pass");
		}
		else 
		{
			System.out.println("test fail");
		}
		
		driver.quit();
	}

	}


