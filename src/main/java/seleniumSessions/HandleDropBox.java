package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropBox {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");
		
		
		// HANDLE DROP BOX
		
		Select select = new Select(driver.findElement(By.id("month")));
	
		select.selectByVisibleText("Dec");
		
	}

}
