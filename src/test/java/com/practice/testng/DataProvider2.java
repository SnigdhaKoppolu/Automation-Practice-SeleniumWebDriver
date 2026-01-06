package com.practice.testng;

import org.testng.annotations.Test;

public class DataProvider2 {
	//connection between this class and dp.java class
	//we want to create one connection with this dataProvider but the data in the another class(Dp.class)
	
@Test(dataProvider = "readFullExcelFile" , dataProviderClass = Dp.class)
public void test1(String user, String password) {
	System.out.println(user+"   "+password);
}


}
