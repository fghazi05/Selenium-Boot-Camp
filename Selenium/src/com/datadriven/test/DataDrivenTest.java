package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utiltiy.Xls_Reader;

public class DataDrivenTest {

	public static void main(String[] args) {
		
		Xls_Reader reader = new Xls_Reader("C:\\Users\\Faiza\\eclipse-workspace\\Selenium\\src\\com\\testdata\\EbayRegTestData.xlsx");
		
		String firstName= reader.getCellData("RegTestData","firstname", 2);
		System.out.println(firstName);
		
		String lastName= reader.getCellData("RegTestData","lastname", 2);
		System.out.println(lastName);
		
		String email= reader.getCellData("RegTestData","email", 2);
		System.out.println(email);
		
		String passWord= reader.getCellData("RegTestData","password", 2);
		System.out.println(passWord);
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		 
		 driver.findElement(By.xpath("//*[@id=\"firstname\"]")).sendKeys(firstName);
	     driver.findElement(By.xpath("//*[@id=\"lastname\"]")).sendKeys(lastName);
		 driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(email);
		 driver.findElement(By.xpath("//*[@id=\"PASSWORD\"]")).sendKeys(passWord);
		 driver.findElement(By.id("ppaFormSbtBtn")).click();
	}

}
