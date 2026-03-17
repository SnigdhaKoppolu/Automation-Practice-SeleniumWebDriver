package com.listeners.testng;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(YourListener.class)
public class MyTestClass extends SetUp {
	
       /* @Test
		public void test() {
			System.out.println("hello world");
			//Assert.assertTrue(true);    //pass
			Assert.assertTrue(false);    //false
		}*/
     @Test 
	public void test1() {
		driver =new ChromeDriver();
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();   //google
		//String expTitle="Googlex";
		String expTitle="Googlex";
		Assert.assertEquals(actTitle, expTitle);
     }
	@Test
		public void test2() {
			driver =new ChromeDriver();
			driver.get("https://www.fb.com");
			String actTitle = driver.getTitle();   
			//String expTitle="Facebook – log in or sign up";
			String expTitle="Facebook – log in or sign upaaaabdfdbb";
			Assert.assertEquals(actTitle, expTitle);
			 
		 
	}
	}


