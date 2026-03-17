package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DealingWithCalender {
	
	//select 20 may 2026
	
	@Test
	public void test1() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		//driver.findElement(By.xpath("//input[@id='datepicker']"));
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		System.out.println(month);  //feb 
		
		String year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();
		System.out.println(year);   //2026
		
		//if month is not may nd year is not 2026
		    //-->click next
		while(!(month.equals("May")&&year.equals("2026")))
		{   
			driver.findElement(By.xpath("//span[text()='Next']")).click();
			 
            //we need to change month and year
			 month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
		     year = driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]")).getText();

			//logic-->break-->when month is may and year is 2025
			Thread.sleep(1000);
			System.out.println(month+"    "+year);
			
		}
		//i will be may 2026
		driver.findElement(By.xpath("//a[text()=20]")).click();
		//System.out.println("");
		
	}
	
	

}
