package com.qa.DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import lib.XlsReader;

public class ParamterizedTest
{

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kumar\\Downloads\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		XlsReader reader=new XlsReader("C:\\Meenakshi\\ExcelData\\TestData.xlsx");
		int rowcount=reader.getRowCount("facebook");
		reader.addColumn("facebook","status");
		for(int rownum=0;rownum<=rowcount;rownum++) {
			String username=reader.getCellData("facebook","username", rownum);
			String password=reader.getCellData("facebook","password", rownum);
			
		    driver.findElement(By.id("email")).clear();
		    driver.findElement(By.id("email")).sendKeys(username);
		    driver.findElement(By.id("pass")).clear();
		    driver.findElement(By.id("pass")).sendKeys(password);
		    driver.findElement(By.xpath("//input[@value='Log In']")).submit();
		    reader.setCellData("facebook","status", rownum,"Pass");
		    
			
			
			
		}
	}

}
