package com.qa.DDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		File src = new File("C:\\Meenakshi\\ExcelData\\TestData.xlsx");
		FileInputStream fis= new FileInputStream(src);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet1 =wb.getSheetAt(0);
		String cellvalue=sheet1.getRow(0).getCell(0).getStringCellValue();
        System.out.println(cellvalue);
        wb.close();
	}

}
