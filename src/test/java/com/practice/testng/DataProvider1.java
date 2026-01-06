package com.practice.testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider1 {
    
	@Test(dataProvider="readFullExcelFile")
	public void test1(String user, String password) {
		System.out.println(user+"    "+password);
	}
	//@Test
	//public void test2() {
	//	System.out.println("username2"+" password2");
	//}
	//instead of writing separate tests we can store all these values in one data provider and then from data provider we can pass the values
	
	
	//store the data in the form of array or any other format(this array contains multiple data, size of the array is 3(rows),2(col's))
	@DataProvider
	public String[][] loginData() {
		String arr[][] = {{"username1","password1"}, {"username2","password2"}, {"username3","password3"}};
		                
		return arr;
		}
	@DataProvider
	public String[][] readFullExcelFile() throws EncryptedDocumentException, IOException {
		File f = new File("./data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		
		//1.get the sheet
		Sheet s = wb.getSheetAt(0);
		
		//rows and col
		int tRows = s.getLastRowNum();
		
		String arr2[][] = new String[tRows][2];
		
		for(int i=0; i<tRows; i++) {
			
			Row r = s.getRow(i);
			for(int j=0; i<tRows; i++) {
				Cell c = r.getCell(j);
				arr2[i][j]=c.toString();
			}
					
		}return arr2;
	}
	
	
	
	
	 
	}
	

