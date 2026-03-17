package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShadowDom {
    @Test
	public void shadow() throws InterruptedException {
    	// //div[@id='shadow-host']
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/shadowdom");
		////This Element is inside single shadow DOM.
		String cssSelectorForHost1 = "#shadow-host";
		Thread.sleep(1000);
		SearchContext shadow = driver.findElement(By.cssSelector("#shadow-host")).getShadowRoot();
		Thread.sleep(1000);
		String s = shadow.findElement(By.cssSelector("#my-btn")).getText();
		System.out.println(s);
		driver.close();
	}
	
    @Test
	public void text1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(month);
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
		System.out.println(year);
		//driver.findElement(By.xpath("//span[text()='Prev']")).click();
		System.out.println(month+"      "+year);  
	      while(!(month.equals("May") && year.equals("2023")))
	    		  {
	    	  
	    	  driver.findElement(By.xpath("//span[text()='Prev']")).click();
	    	  
	    	  month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			  year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			  Thread.sleep(1000);
			  System.out.println(month+"      "+year);
	      }
	      
	      driver.findElement(By.xpath("//a[text()='20']")).click();	
		 
	      String selectedDate = driver.findElement(By.id("datepicker")).getAttribute("value");
	      System.out.println("The date selected in the input box is: " + selectedDate);
		 driver.close();
	}
	
	
	
	
	
	
	
}
