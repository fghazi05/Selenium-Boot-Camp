package demo;

import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenshotDemo {
	
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
	public void ScreenshotTest() throws IOException{
		try {
			driver.findElement(By.name("userName")).sendKeys("mercury");
			driver.findElement(By.name("password")).sendKeys("mercury");
			driver.findElement(By.name("login")).click();
			driver.findElement(By.name("findFlights")).click();
			driver.findElement(By.name("reserveFlights")).click();
			driver.findElement(By.name("passFirst0")).sendKeys("Fiaza");
			driver.findElement(By.name("passLast")).sendKeys("Ghazi");
			driver.findElement(By.name("creditnumber")).sendKeys("76476517576");
			driver.findElement(By.name("buyFlights")).click();
			
			String expectedMessage = "Your itinerary has been booked!";
			String actualMessage = driver.findElement(By.cssSelector("body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr:nth-child(1) > td:nth-child(2) > table > tbody > tr:nth-child(3) > td > p > font > b > font:nth-child(2)")).getText();
			Assert.assertEquals(actualMessage, expectedMessage);
		
	}
		catch(Exception e) {
			takeScreenshot();
		}
		
	
	
	}
	private void takeScreenshot() {
		File ss = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//	FileUtils.copyFile(ss, new File("C:\\SeleniumJAVATraining\\Newtours" + new Random().nextInt())+ ".jpg");
		
	}

	@AfterTest
	public void closeBrowser() {
		driver.close();
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
