package com.practice.testng;

import org.testng.annotations.Test;

public class Testsss {

	@Test  //(enabled = false)   //this test won't execute 
	public void test1() {
		System.out.println("Hellow World");

	}

	// this test should get executed with in 5sec
	@Test(invocationTimeOut=5000)
	public void login() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("login test");
	}
	@Test(dependsOnMethods="login")
	public void logout() {
		System.out.println("logout test");
	}
	
}
