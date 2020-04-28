package demo;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.excel.utiltiy.Xls_Reader;

public class HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get("https://www.w3schools.com/html/html_tables.asp");
			
			
			//*[@id="customers"]/tbody/tr[2]/td[1]
			//*[@id="customers"]/tbody/tr[3]/td[1]
			//*[@id="customers"]/tbody/tr[4]/td[1]
			//*[@id="customers"]/tbody/tr[5]/td[1]
			//*[@id="customers"]/tbody/tr[7]/td[1]
			
			//*[@id="customers"]/tbody/tr[2]/td[2]
			//*[@id="customers"]/tbody/tr[3]/td[2]
          
			//Method 1
			String beforeXpath_company = "//*[@id=\"customers\"]/tbody/tr[";
			String afterXpath_company = "]/td[1]";
			
			String beforeXpath_contact = "//*[@id=\"customers\"]/tbody/tr[";
			String afterXpath_contact = "]/td[2]";
			
			List <WebElement> rows = driver.findElements(By.xpath("//table[@id= 'customers']//tr"));
			int rowCount = rows.size();
			System.out.println("Total number of rows " + (rowCount-1) );
			
			Xls_Reader reader = new Xls_Reader("C:\\Users\\Faiza\\eclipse-workspace\\Selenium\\src\\com\\testdata\\WebTableData.xlsx");
			
			if(!reader.isSheetExist("WebTableData")) {
			reader.addSheet("WebTableData");
			reader.addColumn("WebTableData", "Company");
			reader.addColumn("WebTableData", "Contact");
			}
			for(int i = 2; i<= rowCount ; i++) {
				
				String actualXpath_company = beforeXpath_company + i + afterXpath_company;
				String companyName= driver.findElement(By.xpath(actualXpath_company)).getText();
			    System.out.println(companyName);
			    reader.setCellData("WebTableData", "Company", i, companyName);
			    
			    String actualXpath_contact = beforeXpath_contact + i + afterXpath_contact;
				String contactName= driver.findElement(By.xpath(actualXpath_contact)).getText();
			    System.out.println(contactName);
			    reader.setCellData("WebTableData", "Contact", i, contactName);
				
			}
			driver.quit();
	}
			//Method 2
			//driver.findElement(By.xpath("a//[contains(text(),'test2 test2']/parent::td//preceding-sibling::td//input[@name = 'contact_id']")).click();
}
