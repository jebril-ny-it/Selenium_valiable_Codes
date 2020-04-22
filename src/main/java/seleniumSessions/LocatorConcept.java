package seleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.facebook.com");

		// 1. xpath -- 2ND PRIORITY
	//ABSALOUTE XPATH SHOULD NOT BE USED
	//ONLY RELATIVE X PATH	
		driver.findElement(By.xpath("//input[@id='u_0_m']")).sendKeys("perfect");
		driver.findElement(By.xpath("//input[@id='u_0_o']")).sendKeys("makesperfect");
		driver.findElement(By.xpath("//input[@id='u_0_r']")).sendKeys("9296353535");

		// 2.id---- #1 BEST ONE TO USE
		driver.findElement(By.id("u_0_m")).sendKeys("practice");
		driver.findElement(By.id("u_0_o")).sendKeys("makesperfect");

		// 3.name---3RD BEST
		driver.findElement(By.name("firstname")).sendKeys("practice");
		driver.findElement(By.name("lastname")).sendKeys("makes perfect");

		
		
		// 4.linktext--FOR LINKS TOP PRIORITY
		driver.findElement(By.linkText("Create a Page")).click();

	//5.partiallinktext NOT USEFULL	NOT RECOMENEDED
		driver.findElement(By.partialLinkText("a page")).click();
	
	//6. CSS SELECTOR	 USEFULL
		//IF ID IS THERE --->> #(ID)
		//IF CLASS IS THERE --> .(CLASS)
		driver.findElement(By.cssSelector("#u_0_m")).sendKeys(" usefull");
	
	//7.CLASS name not recomended
		driver.findElement(By.className("inputtext _58mg _5dba _2ph-")).sendKeys("not usefull");
	
	//8.tag name
	
	
	
	}

}
