package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMessage {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver .get("https://www.facebook.com/");
		
		driver.findElement(By.id(("email"))).sendKeys("abc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.id("loginbutton")).click();
		 
		String expectedMessage = "Please try again later ";
				
        String actualMessage = driver.findElement(By.cssSelector("#error_box > div.fsl.fwb.fcb")).getText();
		if(expectedMessage.equals(actualMessage)) {
			System.out.println("Test case passed");
		}
		else {
			System.out.println("Test case failed");
		}
		
		driver.close();
	}
	  

}
