package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyMultipleFeatures {
	
    WebDriver driver;
	
	@BeforeTest
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		  driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.linkedin.com");

}
	@Test(priority =0, enabled= false)
	public void verifyTitle() {
		String expectedTitle = "LinkedIn: Log In or Sign Up";
		String actualTitle =driver. getTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
	@Test(priority =1,enabled= false)
	public void verifyText() {
		String expectedText = "Be great at what you do";
		String actualText = driver.findElement(By.cssSelector("#regForm > h2")).getText();
		Assert.assertEquals(actualText, expectedText);
	}
	
	@Test(priority =2)
	public void verifySignInBtnVisibility(){
		boolean signInBtnVisible = driver.findElement(By.id("login-submit")).isDisplayed();
		Assert.assertTrue(signInBtnVisible);
		
	}
	
	@Test(priority =3)
	public void searchBtnDisabled() {
		boolean searchBtnEnabled = driver.findElement(By.name("search")).isEnabled();
				Assert.assertFalse(searchBtnEnabled);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
		
			
		}
	
