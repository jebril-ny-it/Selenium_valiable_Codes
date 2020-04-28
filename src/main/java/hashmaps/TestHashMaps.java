package hashmaps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestHashMaps {

	WebDriver driver;
	String credentials;
	String credentialsInfo[];

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://ui.freecrm.com");

	}

	@Test(priority = 1)
	public void loginWithMjayUserTest() {
		credentials = TestData.grtUserLoginInfo().get("customer");
		credentialsInfo = credentials.split("_");
		driver.findElement(By.name("email")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}

	@Test(priority = 2)
	public void loginWithNaveenUserTest() {
		credentials = TestData.grtUserLoginInfo().get("naveen");
		credentialsInfo = credentials.split("_");
		driver.findElement(By.name("email")).sendKeys(credentialsInfo[0]);
		driver.findElement(By.name("password")).sendKeys(credentialsInfo[1]);
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();

	}
}
