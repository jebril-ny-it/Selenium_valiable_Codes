package com.qa.parameters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {

	WebDriver driver;
	
	
	
	@Test
	@Parameters({"url","emailid","env","browser"})
	public void yahooLoginTest(String url ,String emailid,String env,String browser) {
		System.setProperty("webdriver.chrome.driver", "/Users/mohammadjebril/eclipse-workspace/com.seleniumSesions/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);
		driver.findElement(By.xpath("//input[@id='login-username']")).clear();
		driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys(emailid);
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		driver.findElement(By.xpath("//input[@id='login-signin']")).click();

		//driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
