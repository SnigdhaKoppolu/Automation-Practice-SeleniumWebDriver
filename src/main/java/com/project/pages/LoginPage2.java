package com.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;

public class LoginPage2 {
	
	WebDriver driver;
	
	public LoginPage2(WebDriver d) {
		driver = d;
	}
	By username = By.xpath("//input[@id='username']");  
	//@FindBy(xpath="//input[@id='username']")
	//WebElement username;
	
	
	By password = By.xpath("//input[@id='password']");		
	//@FindBy(xpath="//input[@id='password']")
	//WebElement password;
	
	By login = By.xpath("//button[text()='Login']");
	//@FindBy(xpath="//button[text()='Login']")
	//WebElement login;

	
	//Action
	//enter username
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
		//username.sendKeys(user);  //"sendData"
	}
	
	
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
		//password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		driver.findElement(login).click();
		//login.click();
	}
	
	
}
