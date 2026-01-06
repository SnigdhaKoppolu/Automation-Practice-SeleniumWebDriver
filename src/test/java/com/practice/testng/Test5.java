package com.practice.testng;

import org.testng.annotations.Test;

public class Test5{
	@Test(invocationCount=5, priority=0)  //execute piece of code/test multiple times by using invocationCount attribute
	public void multipleTest() {
		System.out.println("This is test" );
		System.out.println("this is another part of test");
		System.out.println("---------------");
	}
	@Test(invocationCount=3, priority=1)
    public void multipleTests() {
		System.out.println("This is test2" );
		System.out.println("this is another part of test2");
		System.out.println("---------------");
	}
}
