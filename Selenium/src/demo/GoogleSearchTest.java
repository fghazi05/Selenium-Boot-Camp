package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.google.com");
			
			driver.findElement(By.name("q")).sendKeys("testing");
			List <WebElement> list = driver.findElements(By.xpath("//ul[@role = 'listbox']//li/descendant::div[@class= 'sbl1']"));
			int listSize = list.size();
			System.out.println(listSize);
			
			for(int i=0 ; i<listSize; i++ ) {
				String suggestions = list.get(i).getText();
				System.out.println(suggestions);
				if(suggestions.contains("testing tools")) {
					list.get(i).click();
					break;
				}
		}

	}

}
