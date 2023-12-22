package com.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class MyDataProvider {
	
	@DataProvider(name = "TestData")
	public Object[][] dataProvider() throws Exception
	{
	
		FileInputStream fis = new FileInputStream("C:\\Users\\Anil\\eclipse-workspace\\RiddhiProject1\\riddhi1\\excel\\project.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Test");
		int numberOfData = sheet.getPhysicalNumberOfRows();
		
		
		Object [][]testData = new Object [numberOfData][2];
		
		for (int i = 0; i < numberOfData; i++) 
		{
			XSSFRow row = sheet.getRow(i);
			XSSFCell username = row.getCell(0);
			XSSFCell password = row.getCell(1);
			testData[i][0]=username.getStringCellValue();
			testData[i][1]=password.getStringCellValue();
			
		}
		return testData;
	}
	
  
}
