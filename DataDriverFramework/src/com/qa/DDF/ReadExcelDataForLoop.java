package com.qa.DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelDataForLoop {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Meenakshi\\ExcelData\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheetAt(0);
		int rownum=sheet.getLastRowNum();
		System.out.println(rownum);
		for(int i=0;i<rownum;i++) {
			String value=sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println(value);
			
			
		}
		wb.close();

	}

}
