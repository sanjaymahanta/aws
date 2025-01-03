package com.aws;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class FirstTest {

	
	
	@Test
	public void openBrowser() {
		
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "usr/bin/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}
}
