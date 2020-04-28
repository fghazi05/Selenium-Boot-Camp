package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CBT {
	
	  WebDriver driver;
		
		@BeforeTest
		@Parameters("browser")
		public void openBrowser(String browser) {
			if(browser.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			driver = new ChromeDriver();
			}
			
			else if (browser.equals("InternetExplore")){
				System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
				 driver = new InternetExplorerDriver();
			}
			else if (browser.equals("Edge")) {
				System.setProperty("webdriver.edge.driver","MicrosoftWebDriver.exe");
				driver = new EdgeDriver();
			}
			else if (browser.equals("Firefox")) {
				FirefoxOptions options = new FirefoxOptions();
				options.setCapability("marionette", false);
			    driver = new FirefoxDriver(options);
			}
			
			
			
			
			
			
			 driver.manage().window().maximize();
			 driver.get("https://www.linkedin.com");

	}
		@Test(priority =0)
		public void verifyTitle() {
			String expectedTitle = "LinkedIn: Log In or Sign Up";
			String actualTitle =driver. getTitle();
			Assert.assertEquals(actualTitle, expectedTitle);
		}
		
		@Test(priority =1)
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
		



