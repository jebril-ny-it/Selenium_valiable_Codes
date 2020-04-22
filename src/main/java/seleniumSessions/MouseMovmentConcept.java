package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovmentConcept {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies

		driver.get("http://www.spicejet.com");

		// ACTIONS CLASS;;FOR MOUSE MOVEMENT
		Actions action = new Actions(driver);

		action.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();

		Thread.sleep(3000);
		driver.findElement(By.linkText("Priority Check-in")).click();

	}

}
