package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DialogueBox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();          //first window opens here
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.barnesandnoble.com/");
		// close ad
		driver.findElement(By.cssSelector("#bx-close-outside-891353 > svg")).click();
		//click on sign in
		driver.findElement(By.id("signInLink")).click();
		
		//switch focus on the iframe
		WebElement dialogbox = driver.findElement(By.cssSelector("body > div.modal-sign-in.pa.focus"));
		driver.switchTo().frame("dialogBox");
		
		//enter email
		driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");

	}

}
