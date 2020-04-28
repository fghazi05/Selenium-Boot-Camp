package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utiltiy.Xls_Reader;

public class ParametrizedTest {

	public static void main(String[] args) {
		//WebDriver code:
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		 
	//get test data
     Xls_Reader reader = new Xls_Reader("C:\\Users\\Faiza\\eclipse-workspace\\Selenium\\src\\com\\testdata\\EbayRegTestData.xlsx");
      int rowCount = reader.getRowCount("RegTestData");
      
     //parameterization
     for(int rowNum = 2; rowNum<= rowCount ; rowNum++ ) {
		System.out.println("**************");
		String firstName= reader.getCellData("RegTestData","firstname", rowNum);
		System.out.println(firstName);
		
		String lastName= reader.getCellData("RegTestData","lastname", rowNum);
		System.out.println(lastName);
		
		String email = reader.getCellData("RegTestData","email", rowNum);
		System.out.println(email);
		
		String passWord= reader.getCellData("RegTestData","password", rowNum);
		System.out.println(passWord);
        
		 //enter data
		driver.findElement(By.xpath("//*[@id=\"firstname\"]")).clear();
	     driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);
	     
	     driver.findElement(By.xpath("//*[@id=\"lastname\"]")).clear();
	     driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastName);
	     
	     driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		 
		 driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).clear();
		 driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys(passWord);
		// driver.findElement(By.id("ppaFormSbtBtn")).click();
	}
}
}
