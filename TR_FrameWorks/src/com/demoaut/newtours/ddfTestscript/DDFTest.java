package com.demoaut.newtours.ddfTestscript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SignOn;

public class DDFTest {
WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		 System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.get("http://newtours.demoaut.com/");
	}
	@Test
	public void ddfTest() {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);
		lp.loginApplication(username, password);
		
		boolean signOnIsVisible = so.getSignOn().isDisplayed();
		Assert.assertTrue(signOnIsVisible);
	}

}
