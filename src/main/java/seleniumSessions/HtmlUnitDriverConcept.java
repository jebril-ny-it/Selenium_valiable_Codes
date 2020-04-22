package seleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnitDriverConcept {

	public static void main(String[] args) {

		//WebDriver driver = new ChromeDriver();

		//HTML UNIT  DRIVER IS MOT AVAILABLE IN SELENIUM 3.X VERSIONS
		//HTML UNIT DRIVER  --  TO USE THIS CONCEPT ,WE HAVE TO DOWNLOAD THE FILE
		WebDriver driver = new HtmlUnitDriver();
		//3 ADVANTAGES
		//1.TESTING IS HAPPENING BEHOND THE SCENE --NO BROWSER IS LAUNCHING
		//2.EXCUTION OF TEST CASES IS --VERY FAST-- PERFORFMAncew of the script
		//3.NOT SUITABLE FOR ACTIONS CLASS--USER ACTIONS--MOUSEMOVMENT--DOUBLECLICK--DRAG AND DROP
		//4.GHOST DRIVER--NOTHING IS VISABLE
		//--HEADLESS BROWSER;
			//HTMLUNIT DRIVER---JAVA
			//PHANTOM JS --JAVA SCRIPT
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.Freecrm.com");

		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
	
		
		System.out.println("before login title is"+driver.getTitle());

		driver.findElement(By.xpath("//input[@placeholder='E-mail address']")).sendKeys("mjebril1990@gmail.com");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Mohammad1226");

		driver.findElement(By.xpath("	//div[@class='ui fluid large blue submit button']")).click();

		System.out.println("after loging title is this "+driver.getTitle());

	}
}
