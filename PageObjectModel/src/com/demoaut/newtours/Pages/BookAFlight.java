package com.demoaut.newtours.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight {
	
	@FindBy(name = "passFirst0")
	private WebElement FN;
	
	@FindBy(name = "passLast0")
	private WebElement LN;
	
	@FindBy(name = "creditnumber")
	private WebElement cNum;
	
	@FindBy(name = "buyFlights")
	private WebElement submit;
	
	public BookAFlight(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	public void flightBooking(String fName, String lName, String ccNum) {
		FN.sendKeys("fName");
		LN.sendKeys("lName");
		cNum.sendKeys("ccNum");
		submit.click();
	}

}
