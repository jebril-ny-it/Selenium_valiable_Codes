package seleniumSessions;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokENLinkTest {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies

		// DYNAMIC WAIT
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launch url
		driver.get("https://makemysushi.com/404");

//		driver.findElement(By.name("email")).sendKeys("mjebril1990@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("Mohammad1226");
//		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

		Thread.sleep(5000);
		// LINKS --/a href<http://www.google.com>
		// IMAGE --/img href <http://www.amazon.com>

		// 1. GET THE LIST OF ALL THE LINKS AND IMAGES

		List<WebElement> linklist = driver.findElements(By.tagName("a"));

		linklist.addAll(driver.findElements(By.tagName("img")));

		System.out.println("size of full links and images--->" + linklist.size());

		List<WebElement> activeLinks = new ArrayList<WebElement>();

		// 2 iterate linkList ;;exclude all the links or images whitch dont have href
		// attribute
		for (int i = 0; i < linklist.size(); i++) {
			System.out.println(linklist.get(i).getAttribute("href"));
			if (linklist.get(i).getAttribute("href") != null && (! linklist.get(i).getAttribute("href").contains("mailto"))) {
				activeLinks.add(linklist.get(i));
			}
		}

		// get the size of active links
		System.out.println("activeLinks links And images---->" + activeLinks.size());

		// 3. check the href url with httpconnection api;;
		// 300 -- ok
		// 404 -- not found
		// 500 -- internal error
		// 400 -- bad response

		for (int j = 0; j < activeLinks.size(); j++) {

			HttpURLConnection connection = (HttpURLConnection) new URL(activeLinks.get(j).getAttribute("href"))
					.openConnection();

			connection.connect();
			String respponse = connection.getResponseMessage();
			connection.disconnect();
			System.out.println((activeLinks.get(j).getAttribute("href") + "---->" + respponse));
		}

	}

}
