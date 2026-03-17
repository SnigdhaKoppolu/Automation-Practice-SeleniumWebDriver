package com.dropdown.selectclass;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class MultiSelectionDropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().deleteAllCookies();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.get("https://letcode.in/dropdowns");
        
	    Select select = new Select(driver.findElement(By.id("superheros")));
	    System.out.println("select all options based on value");
	    List<WebElement> multioptions = select.getOptions();
	    
	    for(WebElement multi:multioptions) {
	    	System.out.println(multi.getAttribute("value"));
	    }
	    select.selectByIndex(1);
	    select.selectByVisibleText("The Avengers");
	    select.selectByValue("am");
	    
	    List<WebElement> alloptions = select.getAllSelectedOptions();
	    for(WebElement option: alloptions) {
	    	System.out.println(option.getText());
	    }
	    select.deselectByValue("am");
	    Thread.sleep(2000);
	    select.deselectAll();
	    Thread.sleep(2000);
	    driver.quit();
	    
	}

}
