package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTabelHandeling {

	public static void main(String[] args) throws InterruptedException {
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

		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
		// tr[@class='warning']//td[1]
		// tr[2]//td[1]
		// tr[3]//td[1]
		// tr[4]//td[1]
		// html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]
		// html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]
		// td[contains(text(),'Ahmad Mohammad')]
		// tr[@class='warning']//td[3]

		// METHOD #1
		String befor_xpath = "//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[";
		String after_xpath = "]/td[2]";
		Thread.sleep(2000);
		for (int i = 1; i <= 4; i++) {
			String name = driver.findElement(By.xpath(befor_xpath + i + after_xpath)).getText();
			System.out.println(name);
			if (name.contains("Iqra Khan")) // i=4{
				driver.findElement(
	By.xpath("//html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/table[1]/tbody[1]/tr[" + i+ "]/td[1]"))
						.click();
		}
		//didint work must try again
		//METHOD #2
	//	driver
	//	.findElement(By.xpath("//td[contains(text(),'Iqra Khan')]//preceding::td//input[@name='id']")).click();
	}

}
