package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/java/com/feature", glue="com.stepdef")
public class Runner_dataDriven {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hari1\\eclipse-workspace\\DataDriven_framework\\driver\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
	}
	
	@AfterClass
	public static void teardown() {
		driver.close();
	}
}
