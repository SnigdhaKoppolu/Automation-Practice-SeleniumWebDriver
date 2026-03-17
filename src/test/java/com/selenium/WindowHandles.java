package com.selenium;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandles {
	
	@Test
	public void multipleWindow() throws InterruptedException {
		 
		WebDriver driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/windows");
		System.out.println("Before Click "+driver.getTitle());
		
		 String currentPage = driver.getWindowHandle();
		 //System.out.println(currentPage);
		 System.out.println("-----------------------------");
		 driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		 Set<String> wHandles = driver.getWindowHandles();
		 
		Iterator<String> i1 = wHandles.iterator();
		
		while(i1.hasNext())
		{
			//System.out.println(i1.next());   //this will generate two unique ids each time we run it
			driver.switchTo().window(i1.next());
			Thread.sleep(5000);
			
			System.out.println("Title---> "+driver.getTitle());
			
			//to go back to previous page
		}
		Thread.sleep(5000);
		driver.switchTo().window(currentPage);
		
		 //How to get the data from set
		  //1. convert set to list
		  //2. set to iterator()   and iterator to next, hasNext
	}
		 @Test
		 public void getDatafromSet() {
			Set<String> s1 = new HashSet<>();
			s1.add("siri");
			s1.add("qt");
			
			//1.iterator
			Iterator <String> i1 = s1.iterator();
			System.out.println(i1.next());
			System.out.println(i1.next());
		 }
		 	 
		 
	}












