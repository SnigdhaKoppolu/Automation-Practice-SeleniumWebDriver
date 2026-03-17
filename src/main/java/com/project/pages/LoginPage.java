package com.project.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//1.WebElement
	//2.for each webelement we need to create Method
	//3.Constructor
	
	
	//constructor
	public LoginPage(WebDriver driver) {
		//i.e  if any class wants to enter username it is necessary for that class to pass driver
		PageFactory.initElements(driver, this);
		//page factory is a class in java which has static methods in it
		//we call it to initialize the objects
	}
	
	
	
	@FindBy(xpath="//input[@id='username']")
	//@FindBy(id = "username")
	WebElement username;
	
	@FindBy(xpath="//input[@id='password']")
	//@FindBy(id = "password")
	WebElement password;
	
	@FindBy(xpath="//button[text()='Login']")
	//@FindBy(css = "button[type='submit']")
	WebElement login;

	
	//Action
	//enter username
	public void enterUsername(String user) {
		username.sendKeys(user);  
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOnLogin() {
		login.click();
	}
	
	
}
