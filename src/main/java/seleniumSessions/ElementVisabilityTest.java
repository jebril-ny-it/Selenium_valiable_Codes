package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementVisabilityTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://register.freecrm.com/register/");

		// 1.isDiplayed()method; APPLICABLE FPR ALL ELEMENTS
		boolean b1 = driver.findElement(By.xpath("//button[@name='action']")).isDisplayed();
		// IT SHOULD RETURN TRUE
		System.out.println(b1);

		// 2.isEnabled()method
		boolean b2 = driver.findElement(By.xpath("//button[@name='action']")).isEnabled();
		// should returm false
		System.out.println(b2);
		boolean b3 = driver.findElement(By.xpath("//button[@name='action']")).isSelected();
		// should returm false
		System.out.println(b3);

		// 3.isSelected()method;ONLY APPLICABLE FOR CHECKBOX , DROPDOWN , RADIOBUTONS
		//when i dont click the check box it should bring a false
		boolean b5 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		System.out.println("b5 is###="+b5);
		
		driver.findElement(By.xpath("//input[@id='terms']")).click();
		boolean b4 = driver.findElement(By.xpath("//input[@id='terms']")).isSelected();
		System.out.println(b4);// should retun true
		
	}

}
