package com.qa.DDF;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import lib.XlsReader;

public class Test1 {
	static WebDriver driver;

	public static void main(String[] args) {
		
	    XlsReader reader=new XlsReader("C:\\Meenakshi\\ExcelData\\TestData.xlsx");
	    String username=reader.getCellData("facebook","username",1);
	    System.out.println(username);
	    String password=reader.getCellData("facebook","password",1);
	    System.out.println(password);
	    System.setProperty("webdriver.gecko.driver","C:\\Users\\Kumar\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.get("https://www.facebook.com/");
	    driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log In']")).submit();
	    
	    
	}

}
