package com.qa.parameters;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	
	@BeforeMethod
	public void seetuo() {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadjebril/eclipse-workspace/com.seleniumSesions/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/");
		
	}
	
	@Test
	public void yahooLoginTest() {
		driver.findElement(By.xpath("")).clear();
		driver.findElement(By.xpath("")).sendKeys("");
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
