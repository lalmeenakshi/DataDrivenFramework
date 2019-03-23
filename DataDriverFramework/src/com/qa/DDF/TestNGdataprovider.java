package com.qa.DDF;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.TestUtil;

public class TestNGdataprovider {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Kumar\\Downloads\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	     driver.get("https://www.facebook.com/");
	}
	@DataProvider()
	public Iterator<Object[]> getTestData() {
		ArrayList<Object[]> testdata=TestUtil.getDatafromExcel();
		return testdata.iterator();
		
	}
	@Test(dataProvider="getTestData")
	public void login(String username,String password) {
		driver.findElement(By.id("email")).clear();
	    driver.findElement(By.id("email")).sendKeys(username);
	    driver.findElement(By.id("pass")).clear();
	    driver.findElement(By.id("pass")).sendKeys(password);
	    driver.findElement(By.xpath("//input[@value='Log In']")).submit();
		
	}
	@AfterMethod
	public void teardown() {
		driver.quit();
		
		
	}

}


