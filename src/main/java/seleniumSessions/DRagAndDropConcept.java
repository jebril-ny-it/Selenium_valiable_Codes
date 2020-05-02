package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DRagAndDropConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies

		driver.get("http://jqueryui.com/droppable");
		
		//ONLY USSE IF FRAME IS PRESENT
		driver.switchTo().frame(0);
		
		//ACTIONS CLASS TO DRAG ND DROP
		Actions action = new Actions(driver);
		
		//1.RITHER THIS WAY BOTH CAN BE DONE DONE
		WebElement sourceElement = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement targetElement = driver.findElement(By.xpath("//div[@id='droppable']"));
		action.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		
		//2.OR EITHER THIS WAY BOTH CAN BE DONE
		action.clickAndHold(driver.findElement(By.xpath("//div[@id='draggable']")))
		.moveToElement(driver.findElement(By.xpath("//div[@id='droppable']")))
		.release()
		.build()
		.perform();
		Thread.sleep(4000);
		driver.close();
	}

}
