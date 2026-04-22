package com.practice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginButton {
@Test
public void loginTest() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://letcode.in/login");

	driver.findElement(By.xpath("//input[@placeholder='Enter Username']")).sendKeys("mor_2314");
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("83r5^_");
	driver.findElement(By.xpath("//button[text()='Login']")).click();
	
}
}
