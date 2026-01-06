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

public class Dp {
	@DataProvider
	public String[][] LoginDta() {
		String arr[][] = {{"username1","password1"}, {"username2","password2"}, {"username3","password3"}};
		                
		return arr;
		}
	@DataProvider
	public static String[][] readFullExcelFile() throws EncryptedDocumentException, IOException{
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


