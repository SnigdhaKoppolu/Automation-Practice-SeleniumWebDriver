package com.practice.testng;

import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;


public class SoftAssertions2 {
    @Test
	public  void test() {
		int exp=130;
		int a=110;    //int a=110;
		int b=20;
		int c=a+b;
		SoftAssert sf= new SoftAssert();
		sf.assertEquals(c, exp);   //130==30 --> false so  test failed  
		//if we write any code or statement  after the failed test it will be executed
		System.out.println("my name");   //eventhough test got failed 
		//to record the outcome of tests we have to use assertAll() 
		//sf.assertAll();   
		
		//we can write multiple assertions  sometimes we want to check multiple things not only the title of the page, we want to check is the button present or not is the button enabled, is there logout button anything we can use soft assertion
		//in soft assertion at the end we will be calling assertAll() method, if we don't call it wont record the test case
		
		//if we don't call assert all method then writing code is no use b/c  assertAll() make sure whatever the outcome those validations/ those assertions have generated it will be recorded  
	
    
        //SoftAssert sf= new SoftAssert();
	    sf.assertTrue(true);    //expecting true , but actual value is false   :  test failed
		
		sf.assertEquals(c, exp);
		sf.assertAll();
		//now test will be failed b/c the outcome of this is false but it will not be recorded
    }
    
    
}
