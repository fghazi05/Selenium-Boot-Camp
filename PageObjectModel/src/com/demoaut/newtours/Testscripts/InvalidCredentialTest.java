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
import com.demoaut.newtours.Pages.SignOn;

public class InvalidCredentialTest extends BaseTest {
	

	
	@Test
	public void validateUser() {
		Login lp = new Login(driver);
		SignOn so = new SignOn(driver);
		
		lp.loginApplication("mobile", "laptop");
		boolean signOnVisible = so.getSignOn().isDisplayed();
		Assert.assertTrue(signOnVisible);
	}
	
	


}
