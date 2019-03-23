package com.qa.DDF;

import lib.ExcelDataconfig;

public class ExcelParamatization {

	public static void main(String[] args) {
		ExcelDataconfig excel=new ExcelDataconfig("C:\\Meenakshi\\ExcelData\\TestData.xlsx");
		System.out.println(excel.getData(0,0,0));

	}

}
