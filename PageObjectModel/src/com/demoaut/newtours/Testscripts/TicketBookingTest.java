package com.demoaut.newtours.Testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.demoaut.newtours.Pages.BookAFlight;
import com.demoaut.newtours.Pages.FlightConfirmation;
import com.demoaut.newtours.Pages.FlightFinder;
import com.demoaut.newtours.Pages.Login;
import com.demoaut.newtours.Pages.SelectFlight;

public class TicketBookingTest extends BaseTest{
	
	
	
	@Test
	public void bookATicket() {
		Login lp = new Login(driver);
		FlightFinder ff = new FlightFinder(driver);
		SelectFlight sf = new SelectFlight(driver);
		BookAFlight bf = new BookAFlight(driver);
		FlightConfirmation fc = new FlightConfirmation(driver);
		
		
		lp.loginApplication("mercury","mercury");
		ff.findFlight();
		sf.flightSelection();
		bf.flightBooking("Faiza","Ghazi","7657867384");
		
		String expectedSuccessMessage = "Your itinerary has been booked!";
		String actualSuccessMessage  = fc.getSuccessMessage().getText();
		
		Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
		
		
	}
	
	
	

}
