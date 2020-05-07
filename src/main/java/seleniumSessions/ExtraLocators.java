package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ByIdOrName;
import org.openqa.selenium.support.pagefactory.ByAll;
import org.openqa.selenium.support.pagefactory.ByChained;

public class ExtraLocators {

	//DO NOT USE ALL METHODS TOGETHER 
	//THEY ARE LOCATING THE SAME ELEMENT
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		//DO NOT USE IMPLICITLY WAIT 
		//IT WILL SLOW DOWN YOUR TEST
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//by all selectors it will handle
		driver.findElement(new ByAll(By.name("1firstname"), By.id("u_0_m"), By.xpath("//input[@name='firstname']")))
				.sendKeys("JEBRIL");
		
		//BY ID OR FIRST NAME
		driver.findElement(new ByIdOrName("firstname")).sendKeys("JEBRIL");

		//BY CHAIN,,FOR VERY COMPLEX DOM
		driver.findElement(new ByChained(By.id("u_0_i"),
				By.xpath("//div[@class='uiStickyPlaceholderInput uiStickyPlaceholderEmptyInput']"),
				By.name("firstname"))).sendKeys("JEBRIL");
		
		
		
	}

}
