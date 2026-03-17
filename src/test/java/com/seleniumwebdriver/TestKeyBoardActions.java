package com.seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestKeyBoardActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions action = new Actions(driver);
		
		WebElement doubleclickbtn = driver.findElement(By.xpath("//button[contains(text(),'Double-Click')]"));
		System.out.println("button found:" + doubleclickbtn.getText());
		action.doubleClick(doubleclickbtn).perform();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
		System.out.println("Double-Click alert accepted");
		
		WebElement rightclickbtn = driver.findElement(By.xpath("//span[contains(text(),'right click me')]"));
		action.contextClick(rightclickbtn).perform();
		System.out.println("right click performed , menu should be visible ");
		WebElement quitOption = driver.findElement(By.xpath("//span[text()='Quit']"));
		quitOption.click();

		Thread.sleep(3000);
		String quitAlertText = driver.switchTo().alert().getText();
		System.out.println("Second Alert says: " + quitAlertText);
		driver.switchTo().alert().accept();
		
		//driver.switchTo().alert().accept();
        //driver.close();
	}


}
