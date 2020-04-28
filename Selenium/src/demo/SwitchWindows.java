package demo;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();          //first window opens here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.hdfcbank.com/");
		
		driver.findElement(By.id("loginsubmit")).click();// second window opens here
		 //to get the window handles of both windows and pass them into list named window
		
		ArrayList<String> windows = new ArrayList<>(driver .getWindowHandles());
		
		// to switch to the second window
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.linkText("CONTINUE TO NETBANKING")).click();
		
		//to come back to the first window
		
		driver.switchTo().window(windows.get(0));

	}

}
