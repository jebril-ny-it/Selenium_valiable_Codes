package seleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandleing {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.rediff.com");

		driver.findElement(By.xpath("//a[contains(text(),'Create Account')]")).click();

		driver.findElement(By.xpath("//input[@id='Register']")).click();

		Thread.sleep(5000);

		//HOW TO HGANDLE AERTS
		//ALERT METHOD TO HANDLE POP UP'S IN BROWSER
		Alert alert = driver.switchTo().alert();

		System.out.println(alert.getText());

		String text = alert.getText();

		//VALIDATE YOUR TEXT;;;YOU MUST VALIDATE
		if (text.equals(
				"Your full name cannot be blank.\n" + "Please enter your firstname and lastname e.g. Sameer Bhagwat")) {
			System.out.println("correct error messAGE");
		} else {
			System.out.println("in-correct error meassage");
		}
		alert.accept();// click on okay btn;

		// alert.dismiss();//click on cancel btn
		//alert.sendKeys("");
		driver.quit();
	}
}