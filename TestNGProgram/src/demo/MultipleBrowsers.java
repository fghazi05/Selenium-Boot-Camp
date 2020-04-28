package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class MultipleBrowsers {
	
	@Test
	public void openBrowser() {
	//	System.setProperty("webdriver.ie.driver","IEDriverServer.exe");
	//	WebDriver driver = new InternetExplorerDriver();
	//	System.setProperty("webdriver.edge.driver","MicrosoftWebDriver.exe");
	//	WebDriver driver = new EdgeDriver();
	//	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
		FirefoxOptions options = new FirefoxOptions();
		options.setCapability("marionette", false);
		WebDriver driver = new FirefoxDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	

}
