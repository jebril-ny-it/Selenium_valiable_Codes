package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args) throws InterruptedException {
	
		//get()  vs navigate().to()
		//both are to launch a url but NAVIGATE().TO() IS TO LAUNCH AN EXTERNAL URL
		
		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://google.com");

		//back and forward button simulation 
		//THIS HOW TO SIMULATE NAVIGATIONS
		driver.navigate().to("https://amazon.com");

		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().forward();

		Thread.sleep(3000);

		driver.navigate().back();
		
		driver.navigate().refresh();
		driver.quit();
	}

}
