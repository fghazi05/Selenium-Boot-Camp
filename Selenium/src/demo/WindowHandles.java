package demo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver .get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();
		 Set<String> handler= driver.getWindowHandles();
		 Iterator<String> itr = handler.iterator();
		 
		 String parentWindowId = itr.next();
		 System.out.println("Parent Window Id :" + parentWindowId);
		 
		 String childWindowId = itr.next();
		 System.out.println("Child Window Id : " + childWindowId);
		 
		 driver.switchTo().window(childWindowId);
		 System.out.println("Title of child window : " + driver.getTitle());
		 driver.close();
		 
		 driver.switchTo().window(parentWindowId);
		 System.out.println("Title of parent window : " + driver.getTitle());

	}

}
