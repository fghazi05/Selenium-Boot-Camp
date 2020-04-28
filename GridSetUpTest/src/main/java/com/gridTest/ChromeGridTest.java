package com.gridTest;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ChromeGridTest {

	public static void main(String[] args) throws MalformedURLException {
		
		// 1.Define Desired Capabilities
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setBrowserName("chrome");
		cap.setPlatform(Platform.WINDOWS);
		 
		// 2.Chrome Options Definition
		
		ChromeOptions options = new ChromeOptions();
		options.merge(cap);
		
		String hubUrl = "http://10.0.0.94:4455/wd/hub";
		WebDriver driver = new RemoteWebDriver(new URL(hubUrl), options);
		
		driver.get("https://www.ebay.com");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
