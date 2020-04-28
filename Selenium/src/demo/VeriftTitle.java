package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VeriftTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.facebook.com/");
		 
		 String expectedTiltle = "Facebook - Log In or Sign Up";
		 String actualTitle = driver .getTitle();
		 
		 if(expectedTiltle.equals(actualTitle)) {
			 System.out.println("Test case passed");
		 }
			 else {
				 System.out.println("Test case failed");
			 
			 
		 }
		 driver.close();
	}     
	
}
