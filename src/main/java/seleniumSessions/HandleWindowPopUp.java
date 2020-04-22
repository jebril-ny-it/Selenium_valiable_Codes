package seleniumSessions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		//1.FILE UPLOAD POP UP == THREW BROWSE BOTTON;;;(type=file ,sendkeys)
		//2.alerts();=JAVASCRIPT POP US==ALERT POP UP:::alert api (accept(),dismiss())
		//3.WINDOW BROWSEER POP UP-->>OR ADVERTISING POP UP(windowhandler ap--getwindowhandles())
		
		// MAXAMIZE WINDOW
		driver.manage().window().maximize();// MAXAMIZE WINDOW
		
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies
		
		// DYNAMIC WAIT
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		// launch url
		driver.get("http://www.popuptest.com/goodpopups.html");

		driver.findElement(By.xpath("/html/body/table[2]/tbody/tr/td/font/b/a[3]")).click();

		Thread.sleep(2000);
		Set<String> handler = driver.getWindowHandles();

		Iterator<String> it = handler.iterator();

		String parentwindowid = it.next();
		System.out.println("parent window id:" + parentwindowid);

		String childwindowid = it.next();
		System.out.println("child winfdow id :" + childwindowid);

		driver.switchTo().window(childwindowid);
		Thread.sleep(2000);
		System.out.println("child window pop up  title" + driver.getTitle());
		driver.close();

		driver.switchTo().window(parentwindowid);
		Thread.sleep(2000);
		System.out.println("parent window title" + driver.getTitle());

		driver.quit();
	}

}
