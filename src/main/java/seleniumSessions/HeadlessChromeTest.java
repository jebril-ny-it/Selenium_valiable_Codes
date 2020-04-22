package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChromeTest {

	public static void main(String[] args) throws InterruptedException {

		//run headless chromeBrowser
		//mandatory options
		//1.chrome version should be greater than 59 on mac and 60 for windows
		//2.window-size-1400,800 argument
		ChromeOptions options = new ChromeOptions();
		options.addArguments("window-size-1400,800");
		options.addArguments("headless");

		WebDriver driver = new ChromeDriver(options);
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies
		// launch url
		driver.get("http://ui.freecrm.com");
		
		System.out.println("login page title==" + driver.getTitle());
		
		driver.findElement(By.name("email")).sendKeys("mjebril1990@gmail.com");
		
		driver.findElement(By.name("password")).sendKeys("Mohammad1226");
		
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Thread.sleep(5000);

		System.out.println("home page title==" + driver.getTitle());

	}

}
