package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("");

		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement rightclickBotton = driver.findElement(By.xpath(""));

		action.contextClick(rightclickBotton).build().perform();

		WebElement copy = driver.findElement(By.cssSelector(".context menu click copy"));

		String copyText = copy.getText();

		System.out.println(copyText);

		copy.click();

	}

}
