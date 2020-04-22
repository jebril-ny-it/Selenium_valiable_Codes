package seleniumSessions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropFile {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {

		
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"/Users/mohammadjebril/eclipse-workspace/com.seleniumSesions/src/main/java/seleniumSessions/config.properties");

		prop.load(ip);

		System.out.println(prop.getProperty("name"));

		System.out.println(prop.getProperty("age"));

		String url = prop.getProperty("URL");

		System.out.println(url);

		String browserNAme = prop.getProperty("browser");
		
		System.out.println(browserNAme);
		
		if (browserNAme.equals("chrome")) {
			driver = new ChromeDriver();
		}else if (browserNAme.equals("FF")) {
			System.setProperty("webdriver.ghecko.driver", "path of ghecko driver");
		}

		driver.get(url);
		driver.findElement(By.xpath(prop.getProperty("firstname_xpath"))).sendKeys(prop.getProperty("FirstName"));
		driver.findElement(By.xpath(prop.getProperty("lastname_xpath"))).sendKeys(prop.getProperty("LastName"));
		driver.findElement(By.xpath(prop.getProperty("city_xpath"))).sendKeys(prop.getProperty("City"));

	}

}
