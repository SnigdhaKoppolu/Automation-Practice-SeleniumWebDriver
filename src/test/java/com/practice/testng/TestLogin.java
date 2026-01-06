package com.practice.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin{
	
	@BeforeMethod()
	public void befMethods() {
		System.out.println("Before Methods");
	}
	@BeforeTest
	public void setUp() {
		System.out.println("open chrome");
		 System.out.println("url");	
	}
	
	 @Test //(priority=1)
	 public void testxyz() {
		 System.out.println("Testxyz");
		 //System.out.println("valid username and password");
		 //System.out.println("login");
		 //System.out.println("validate");
		 
	 }
	 @AfterTest()
	 public void afterTest() {
		 System.out.println("After Test");
	 }
	 @AfterMethod()
	 public void afterMethod() {
		 System.out.println("After Method ");
	 }
	 @Test  //(priority=2)
	 public void testabc() {
		System.out.println("Test abc");
		//System.out.println("valid username and password");
		//System.out.println("login");
	   //System.out.println("validate");
		 
		 
	 }
 }





