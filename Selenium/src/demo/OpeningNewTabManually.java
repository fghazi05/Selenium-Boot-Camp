package demo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpeningNewTabManually {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();          //first window opens here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.open()");
 //to get the window handles of both windows and pass them into list named window
		
		ArrayList<String> tabs = new ArrayList<>(driver .getWindowHandles());
		
		// to switch to the second window
		driver.switchTo().window(tabs.get(1));
		
		driver.get("https://www.linkedin.com/");

	}

}
