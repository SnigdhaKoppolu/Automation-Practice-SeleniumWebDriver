package com.dropdown.selectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownReusable {
      
	WebDriver driver=null;
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	public void launchApp(String url) {
		driver.get(url);
		
	}
	
	
	public void selectValueByVisibleText(WebElement element, String visibletext) {
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	
	
	public void selectValueByIndex(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.selectByIndex(indexvalue);
	}
	
	
    public void closeBrowser() {
    	driver.quit();
    }
	
	
	public static void main(String[] args) throws InterruptedException {
		DropdownReusable test = new DropdownReusable();
		test.setUp();
		test.launchApp("https://letcode.in/dropdowns");
		//test.launchApp("https://google.com");
		//test.launchApp("https://facebook.com");
		WebElement language = test.driver.findElement(By.id("lang"));
		test.selectValueByVisibleText(language, "Python");
		
		WebElement country = test.driver.findElement(By.id("country"));
		test.selectValueByVisibleText(country, "Peru");
		
		test.selectValueByIndex(language, 1);
		
		Thread.sleep(Duration.ofSeconds(5));
		test.closeBrowser();
		
	}

}
