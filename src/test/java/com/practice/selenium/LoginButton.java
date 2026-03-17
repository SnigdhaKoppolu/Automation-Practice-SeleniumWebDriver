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
	driver.get("https://www.saucedemo.com/v1/inventory.html");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//driver.findElement(By.id("login-button")).click();
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
	//driver.findElement(By.xpath("//input[@value='Login']")).click();
	//driver.findElement(By.cssSelector("#login-button")).click();
}
}
