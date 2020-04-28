package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHovering {
	public static void main(String[] args) {
		    WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.amazon.com/gp/css/homepage.html?ref_=nav_youraccount_btn");
			
			  WebElement helloSignin = driver.findElement(By.cssSelector("#nav-link-accountList > span.nav-line-2"));
			  
			  Actions action = new Actions(driver);
			  action.moveToElement(helloSignin).build().perform();
			  driver.findElement(By.linkText("Your Recommendations")).click();
			  
			  driver.close();
	}

}
