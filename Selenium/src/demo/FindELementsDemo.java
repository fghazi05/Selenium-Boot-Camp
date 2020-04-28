package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindELementsDemo {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.ebay.com/");
			
			List<WebElement> linkList = driver.findElements(By.tagName("a"));
			
			int listSize= linkList.size();
			System.out.println(listSize);
			
			for(int i=0;i<listSize; i++) {
				String linkText =linkList.get(i).getText();
				System.out.println(linkText);
				
			}


	}

}
