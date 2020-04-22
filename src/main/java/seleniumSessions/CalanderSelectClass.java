package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalanderSelectClass {

	public static void main(String[] args) {
		
	
	WebDriver driver = new ChromeDriver();
	// MAXAMIZE WINDOW
	driver.manage().window().maximize();// MAXAMIZE WINDOW
	// delete all the cookies
	driver.manage().deleteAllCookies();// delete all the cookies

	// DYNAMIC WAIT
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	// launch url
	driver.get("http://ui.freecrm.com");

	driver.findElement(By.name("email")).sendKeys("mjebril1990@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Mohammad1226");
	driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

}
}