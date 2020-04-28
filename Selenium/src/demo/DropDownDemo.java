package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) {
		
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("http://newtours.demoaut.com/");
			
			driver.findElement(By.linkText("REGISTER")).click();
			
		   WebElement countries = driver.findElement(By.name("country"));
		   
		   Select drpdn = new Select(countries);
		   
		   drpdn.selectByVisibleText("TURKEY");
	}

}
