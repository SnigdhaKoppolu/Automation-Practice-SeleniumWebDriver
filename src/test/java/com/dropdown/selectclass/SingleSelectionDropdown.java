package com.dropdown.selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectionDropdown {
	public static void main(String[] args) {
		WebDriver driver = null;
	try {
      driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
      driver.get("https://letcode.in/dropdowns");
      WebElement fruitsdropdown = driver.findElement(By.id("fruits"));
      Select select = new Select(fruitsdropdown);
      //select.selectByIndex(3);
      //select.selectByVisibleText("Orange");
      select.selectByValue("2");
      WebElement element = select.getFirstSelectedOption();
      System.out.println("selected value is : "+element.getText());
      WebElement message = driver.findElement(By.xpath("//p[contains(text(), 'You have selected')]"));		
      List<WebElement> options = select.getOptions();
      
      for(WebElement option : options) {
    	  System.out.println(option.getText());
         }
      //driver.quit();
      }
	catch(Exception e) {
    	e.printStackTrace();
    }
	finally { 
		driver.quit();
	}
  
}}