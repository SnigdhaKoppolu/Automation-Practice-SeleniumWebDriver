package com.seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownReusable {

    WebDriver driver=null;
	public void setup() {
	    driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
	public void launchApp(String url) {
		driver.get(url);
	}
	public void selectByIndex(WebElement element, int indexvalue) {
		Select select = new Select(element);
		select.deselectByIndex(indexvalue);
		
	}
	public void selectByVisibleText(WebElement element, String VisibleText) {
		Select select = new Select(element);
		select.deselectByVisibleText(VisibleText);
	}
	public static void main(String[] args) {
		DropdownReusable text = new DropdownReusable();
		text.setup();
		text.launchApp("https://www.facebook.com");
				
				

	}

}
