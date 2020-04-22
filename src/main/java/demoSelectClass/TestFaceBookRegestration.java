package demoSelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestFaceBookRegestration {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("Sara");

		// driver.findElement(By.xpath("//input[@id='u_0_b']")).click();

		driver.findElement(By.xpath("//button[@id='u_0_13']")).click();

		Select sel1 = new Select(driver.findElement(By.xpath("//select[@id='day']")));

		sel1.selectByIndex(3); // the 2nd day

		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='year']")));

		sel2.selectByValue("1990");

		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='month']")));

		sel3.selectByVisibleText("Dec");

		// driver.navigate().back();
		// driver.quit();

	}

}
