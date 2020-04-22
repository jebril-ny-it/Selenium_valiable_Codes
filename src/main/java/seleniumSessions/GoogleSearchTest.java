package seleniumSessions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies
		// DYNAMIC WAIT
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// launch url
		driver.get("http://www.google.com");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("testing");

		// USING DECENDENT = IT IS ISED FOR USING WHATS UNDER AN XPATH
		// IT WILL GIVE U COMPLETE VIEW OF THE HIGHERKY
		// USING DYNAMIC XPATH
		List<WebElement> list = driver.findElements(By
				.xpath("//ul[@role='listbox']//li/descendant::div[@class='jKWzZXdEJWi__suggestions-inner-container']"));
		System.out.println("total numbers of suggestions=" + list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getText());
			if (list.get(i).getText().contains("testing center near me")) {
				list.get(i).click();
				break;
			}
		}

	}

}
