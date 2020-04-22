package seleniumSessions;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenShotConcept {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.get("https://google.com");
		
		//TAKE SCREEN SHOT AND STORE IN A FILE
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		//Byte src2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//NOW COPY SCREENSHOT TO DESIRED LOCATION USING COPY FILE METHOD()
		FileUtils.copyFile(src,	new File("/Users/mohammadjebril/eclipse-workspace/com.seleniumSesions/google.png"));
	
		driver.close();
	}

}
