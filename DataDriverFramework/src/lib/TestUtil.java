package lib;

import java.util.ArrayList;

public class TestUtil {
	static XlsReader reader;
	public static ArrayList<Object[]> getDatafromExcel(){
		ArrayList<Object[]> mydata= new ArrayList<Object[]>();
		XlsReader reader=new XlsReader("C:\\Meenakshi\\ExcelData\\TestData.xlsx");
		int rowcount=reader.getRowCount("facebook");
		
		for(int rownum=0;rownum<=rowcount;rownum++) {
			String username=reader.getCellData("facebook","username", rownum);
			String password=reader.getCellData("facebook","password", rownum);
			Object[] ob = {username,password};
			mydata.add(ob);
	}
return mydata;
}
}


