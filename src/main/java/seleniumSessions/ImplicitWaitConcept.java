package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//1-ENETER URL
		driver.get("http://www.half.ebay.com");
		//2- MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		//3- delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies

		//BOTH ARE DYNAMIC WAIT==WILL CONTINUE IF ELEMTS ARE VIEWED WITH IN 5-SEC REST OF TIME IS IGNORED
		//PAGELOAD TIME OUT
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//IMPLICITLY WAIT FOR ELEMENTS==GLOBAL WAIT==IMPLICABLE FOR ALL THE ELEMENTS
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//THAN CONTINUE WITH ALL OF YOUR ACTIONS
	}

}
