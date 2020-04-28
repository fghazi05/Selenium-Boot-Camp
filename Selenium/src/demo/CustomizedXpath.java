package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomizedXpath {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com");
			
			//driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("Java");
			
			//driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("Java");
			
			//driver.findElement(By.xpath("//input[contains(@class,'gh-tb ui-autocomplete-input')]")).sendKeys("Java");
			
			//Functions recommended for dynamic ids
			
			//starts-with
			//id = test_123
			//id = test_467
			//id = test_test_6534
			
			//ends-with
			//id = 23245_test
			//id = 63427_test_t
			
			//driver.findElement(By.xpath("//input[contains(@id,'test_')]")).sendKeys("Test");
			//driver.findElement(By.xpath("//input[starts-with(@id,'test_')]")).sendKeys("Test");
			//driver.findElement(By.xpath("//input[ends-with(@id,'_test_t')]")).sendKeys("Test");
			
			//for links
			driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).click();;

	}

}
