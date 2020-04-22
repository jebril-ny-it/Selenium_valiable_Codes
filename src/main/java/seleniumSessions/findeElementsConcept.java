package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findeElementsConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies
		// dynamic wait
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http:/www.half.ebay.com");

		// get the count of all links on the page
		// get the text of each link on the page

		// ALL THE LINKS ARE REPRESENTED BY <a> HTML TAG
		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		// SIZE OF LINKLIST
		System.out.println(linklist.size());
		for (int i = 0; i < linklist.size(); i++) {
		String linktex = linklist.get(i).getText();
		System.out.println(linktex);
		}
	}

}
