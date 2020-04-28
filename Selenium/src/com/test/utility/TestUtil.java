package com.test.utility;

import java.util.ArrayList;

import com.excel.utiltiy.Xls_Reader;

public class TestUtil{ 
	
 static Xls_Reader reader;

	public static ArrayList<Object[]> getDataFromExcel() {
		
		 ArrayList<Object[]> mydata = new ArrayList<Object[]>();
		 try {
			 Xls_Reader reader = new Xls_Reader("C:\\Users\\Faiza\\eclipse-workspace\\Selenium\\src\\com\\testdata\\EbayRegTestData.xlsx");
		      
		 }
		 catch( Exception e) {
			 e.printStackTrace();
		 }
		 
		// int rowCount = reader.getRowCount("RegTestData");
		 for(int rowNum = 2; rowNum<= reader.getRowCount("RegTestData") ; rowNum++ ) {
				
				String firstName= reader.getCellData("RegTestData","firstname", rowNum);
				
				
				String lastName= reader.getCellData("RegTestData","lastname", rowNum);
				
				
				String email = reader.getCellData("RegTestData","email", rowNum);
				
				
				String passWord= reader.getCellData("RegTestData","password", rowNum);
				
		        Object[] ob = {firstName, lastName, email, passWord};
		        mydata.add(ob);
		 
		// return mydata;
	}
		return mydata;
	

}
}
