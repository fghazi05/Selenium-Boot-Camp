package com.datadriven.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtil;

public class EbayTest {
	
	WebDriver driver ;
	
	@BeforeMethod
	public void setUp() {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Faiza\\eclipse-workspace\\Selenium\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		// driver.manage().deleteAllCookies();
		 
		 driver.get("https://reg.ebay.com/reg/PartialReg?ru=https%3A%2F%2Fwww.ebay.com%2F");
		
	}
	
	@DataProvider
	public  Iterator<Object[]>  getTestData() {
	 ArrayList<Object[]> testData =TestUtil.getDataFromExcel();
		return testData.iterator();
	}
	
	@Test(dataProvider = "getTestData")
	public void ebayRegPageTest(String firstName,String lastName, String email, String passWord) {
		
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
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
