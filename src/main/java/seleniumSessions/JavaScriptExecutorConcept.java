package seleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	static WebDriver driver;

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.freecrm.com");

		WebElement loginbutton = driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
		loginbutton.click();

		// #######will comment this out to use java script#########
		WebElement emailbox = driver.findElement(By.xpath("//input[@placeholder='E-mail address']"));
		// emailbox.sendKeys("mjebril1990@gmail.com");
		WebElement passwordbox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		// passwordbox.sendKeys("Mohammad1226");
		WebElement submitbtn = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		// submitbtn.click();
		// #######will comment this out to use java script#########

		// refresh page using java script
		//refreshbrowserUsingJs(driver);

		//scroll down
		scrollPagedownjs(driver);
		// hightlight
		flash(emailbox, driver);
		// draw a border
		drawborder(emailbox, driver);

		getPageInnerText(driver);

		// highlight
		flash(passwordbox, driver);
		// draw a border
		drawborder(passwordbox, driver);

		// highlight
		flash(submitbtn, driver);
		// draw a border
		drawborder(submitbtn, driver);

		// get title using java script
		System.out.println(getTitleByJs(driver));

		// get page text
		System.out.println(getPageInnerText(driver));

		// show a message
		// generateAlert(driver, "there is an issue with the login button on log in
		// page");

		// TAKE SCREEN SHOT AND STORE IN A FILE
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/mohammadjebril/eclipse-workspace/com.seleniumSesions/element.png"));

		// click on any element by using java script executor
		// clickElementbyjs(loginbutton, driver);

	}

	public static void flash(WebElement element, WebDriver driver) {

		JavascriptExecutor js = (JavascriptExecutor) driver;
		String bgcolor = element.getCssValue("backgroundColor");
		for (int i = 0; i < 100; i++) {
			changeColor("rgp(o,200,0)", element, driver);
			changeColor(bgcolor, element, driver);
		}

	}

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.backgroundcolor= '" + color + "'", element);
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
		}
	}

	public static void drawborder(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].style.border= '3px solid red'", element);
	}

	public static void generateAlert(WebDriver driver, String message) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('" + message + "')");
	}

	public static void clickElementbyjs(WebElement element, WebDriver driver) {
		// JavascriptExecutor js = ((JavascriptExecutor)driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	public static void refreshbrowserUsingJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("history.go(0)");

	}

	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String title = js.executeScript("return document.title;").toString();
		return title;
	}

	public static String getPageInnerText(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String pageText = js.executeScript("return document.documentElement.innerText;").toString();
		return pageText;
	}

	public static void scrollPagedownjs(WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	public static void scrollIntoView(WebElement element,WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
}
