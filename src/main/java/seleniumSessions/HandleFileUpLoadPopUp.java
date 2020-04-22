package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUpLoadPopUp {

	public static void main(String[] args) {
		
		//TYPE == FILE MUST BE PRESENT TO UPLOAD A FILE
		//THIS IS HOW YOU HANDLE  UPLOADING A FILE
		//DONT SEND CLICK METHOD 
		//SENDKEYS AND ATTACH PATH OF THE FILE
		//TO UPLOAD AND ADD OR ATTACH THE FILE
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://html.com/input-type-file");

		driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("/Users/mohammadjebril/Documents/diagram java screen shots");

		
		
		
		
		
		
		
		
	}
	
}
