package com.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class base_class_datadriven {

	public static WebDriver driver;
	
	public static void getdriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari1\\eclipse-workspace\\DataDriven_framework\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	public static WebDriver getURL(String type) {
		driver.get(type);
		return driver;
	}
	
	public static void ClickonElement(WebElement element) {
		element.click();
	}
	
	public static void Sendkeys(WebElement element , String data) {
		element.sendKeys(data);
}
}