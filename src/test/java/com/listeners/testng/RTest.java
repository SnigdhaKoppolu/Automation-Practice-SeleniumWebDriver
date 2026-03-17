package com.listeners.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RTest {
	
	@Test(retryAnalyzer=MyRetryListener.class)
	public void test1(){
		System.out.println("hello world");
		Assert.assertTrue(false);
		
	}

}
