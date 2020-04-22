package seleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverBasics {

	public static void main(String[] args) {

		// 1.FF BROWSER
		// GECKOdRIVER
		// System.setProperty("webdriver.gecho.driver",
		// "/Users/mohammadjebril/eclipse-workspace/com.seleniumSesions/geckodriver");
		// webDriver driver = new FirefoxDriver();

		// 2-CHROMEDRIVER
		// launch browser
		WebDriver driver = new ChromeDriver();
		// ENTER URL
		driver.get("http://www.google.com");
		String title = driver.getTitle();
		System.out.println(title);

		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("in-correct title");
		}
	
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}

}
