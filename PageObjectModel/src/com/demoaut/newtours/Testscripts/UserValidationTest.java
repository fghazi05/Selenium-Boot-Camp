package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;

public class UserValidationTest extends BaseTest {
	

	
	@Test
	public void validateUser() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		
		lp.loginApplication("mercury", "mercury");
		boolean signOffVisible = ff.getSignOff().isDisplayed();
		Assert.assertTrue(signOffVisible);
	}
	

}
