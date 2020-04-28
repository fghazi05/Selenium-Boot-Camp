package demo;

import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/");
		
		driver.findElement(By.id("hp-widget__sfrom")).sendKeys("Bangalore (BLR)");
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("New Delhi (DEL)");
		WebElement comingmonth = driver.findElement(By.xpath("(//div[contains(@class,’last’)])[1]"));
		ArrayList<WebElement> columns = (ArrayList<WebElement>) comingmonth.findElements(By.tagName("td"));
		for(WebElement t : columns) {
			if(t.getText().equals("11")) {
			t.click();
			break;
			}	
		}
		//click on the search button
		//driver.findElement(By.id("searchBtn")).click();
		 
		//sort the price list from low to high
		//driver.findElement(By.id(""))
		
		

	}

}
