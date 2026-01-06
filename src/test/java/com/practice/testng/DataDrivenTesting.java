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
import org.testng.annotations.Test;

public class DataDrivenTesting {
	//example program for "reading data from excel"
	// apachi poi
	// 1.location of the file
	// 2.
	@Test
	public void readData() throws EncryptedDocumentException, IOException {
		// 1.location of the file
		// File f = new File("C:\\snigdha(programs)\\seleniumwebdriver\\data.xlsx"); or
		File f = new File("./data.xlsx");

		// 2.create the connection (we need to create the connection with the excel file)
		FileInputStream fis = new FileInputStream(f);

		// 3.Type of file(b/c we have different types of files like mp4(video file),
		// mp3(image file), xlsx(excel file))
		Workbook wb = WorkbookFactory.create(fis);
		

		// 4.get the sheet
		Sheet s = wb.getSheetAt(0);

		// 5.get the row
		Row r = s.getRow(0);

		// 6.get the column
		Cell c = r.getCell(1);
		System.out.println(c);

	}

	@Test
	public void readFullExcelFile() throws EncryptedDocumentException, IOException {
		File f = new File("./data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);

		// 1.get the sheet
		Sheet s = wb.getSheetAt(0);

		// row and col
		int tRows = s.getLastRowNum(); // tRows: total rows
		for (int i = 0; i < tRows; i++) {
			Row r = s.getRow(i);
			for (int j = 0; j < r.getLastCellNum(); j++) {
				System.out.println(r.getCell(j));
			}
		}

	}
}
