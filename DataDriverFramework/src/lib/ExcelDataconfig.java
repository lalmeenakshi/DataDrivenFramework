package lib;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataconfig{
XSSFWorkbook wb;
XSSFSheet sheet1;

public ExcelDataconfig(String excelpath) {
	File src = new File(excelpath);
	FileInputStream fis = null;
	try {
		fis = new FileInputStream(src);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	try {
		XSSFWorkbook wb= new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public String getData(int sheetnumber,int rownum, int colnum) {
 sheet1 =wb.getSheetAt(sheetnumber);
String data=sheet1.getRow(rownum).getCell(colnum).getStringCellValue();
return data;
}
}