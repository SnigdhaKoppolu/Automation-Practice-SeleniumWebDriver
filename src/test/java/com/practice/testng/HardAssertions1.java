package com.practice.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class HardAssertions1 {
   String s;
   int a;
   @Test
   public void dbTest() {
	  int a=10;
	  Assert.fail();
	  System.out.println(a);
   }
   @Test
	public void test3() {  //hard assertion
	  System.out.println(s);
	  //System.out.println(a);
	  
	  //i want to write some value
	 Assert.assertNotNull(s);   //the value should not be null
	}
	@Test
	public void test1() {
		int exp=30;
		int a=10;
		int b=20;
		//the addition of two numbers above should be 30
		//if the outcome is 30 test passed , if not test failed
		int c=a+b;
		
		
		//In testng Asset is a class to validate the test
		Assert.assertEquals(c, exp);            //assertEquals(int actual, int expected)
		System.out.println("After Assertion");
		
		boolean bl = true;
		boolean b2 = true;
		
		Assert.assertTrue(bl);  //passing only one parameter  , expecting true
		Assert.assertFalse(b2);  //expecting false
	}
	
	@Test
	public void test2() {
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.google.com");
		driver.get("https://www.facebook.com");
		String actTitle=driver.getTitle();
		String expTitle="Google";
		//String expTitle="GoogleAbc";
		String cUrl = driver.getCurrentUrl();
		
		//if we write a test case it is important to validate a test. using assertion we can validate the test.at the end we validate the test with some expected output
		 
		//Assert.assertEquals(actTitle, expTitle, "Assertion1 got failed");  //if we want to pass some value it will be printed on console if the test case is getting failed
		Assert.assertEquals(actTitle, expTitle);
		//write the "code" here-----> if the test failed the code we write after the Assetetion it willnot executed
		//if test is passed-----> the code will be executed
		
		//Assert.assertEquals(cUrl, "https://www.google.com/");
		Assert.assertEquals(cUrl, "https://www.fb.com/");
        
		
	}
}
	