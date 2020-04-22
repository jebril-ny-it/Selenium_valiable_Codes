package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//CUSTOMIZED XPATH
public class CustomXPath {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies
		
		//ABSALOUT X PATH NOT RECOMENDED
		//1.PERFORMANCE ISSUES==TOO LONG WILL TAKE SOO MUCH TIME
		//2.NOT RELIABLE
		//3CAN BE CHANGED IN ANYTIME IN THE FUTUTRE
		
		
		
		driver.get("http:/www.half.ebay.com");
		// driver.findElement(By.xpath("//input[@class='gh-tb
		// ui-autocomplete-input']")).sendKeys("java");
		// driver.findElement(By.xpath("//input[@name='_nkw']")).sendKeys("java");
		//driver.findElement(By.xpath("//input[contains(@name,'_nkw')]")).sendKeys("java");

		//DYNAMIC ID
	
		//STARTS WITH
		//ID = '(TEST_123')
		//BY.ID('TEST_123')
		//BY.ID('TEST_456')
		//BY.ID('TEST_456')
		//ENDS WITH
		//by.id(test-test_4637_test)
		//by.id = 1234_tes_t
		//by.id = 6789_test_t
	
		//driver.findElement(By.xpath("//input[contains(@id,'test_123')")).sendKeys("example");
	
		//driver.findElement(By.xpath("//input[starts-with(@id,test_)]")).sendKeys("example2");
		
		//driver.findElement(By.xpath("//input[ends-with(a2id,'_test_t']")).sendKeys("example3");
	
		//FOR LINKS;; CUSTOM XPATH
		//ALL THE LINKS ARE REPRESENTED BY (A)HTML TAGS
	Thread.sleep(4000);
		driver.findElement(By.xpath("//a[contains(text(),' Daily Deals')]")).click();
		
	
	}

}
