package sikiuli_Concept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class YoutubeVidepTest {

	public static void main(String[] args) throws FindFailed {

		WebDriver driver = new ChromeDriver();
		// MAXAMIZE WINDOW
		// driver.manage().window().maximize();// MAXAMIZE WINDOW
		// delete all the cookies
		driver.manage().deleteAllCookies();// delete all the cookies

		// DYNAMIC WAIT
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// launch url
		driver.get("https://www.youtube.com/watch?v=dTwZmQrA_5Y");

		// sikulii code
		// CreatE THE Object OF Screen CLASS -SIKULII
	
		// click play
		Screen s = new Screen();
		
		//Pattern settingimg = new Pattern("Youtube_settings.png");
		//s.wait(settingimg, 1000);
		 //s.click();
		//s.click();
	
		Pattern playimg = new Pattern("Youtube_play.png");
		s.wait(playimg, 1000);
		s.click();
		 s.click();

		// click pause
		Pattern pauseimg = new Pattern("YouTube_pause.png");
		s.wait(pauseimg, 1000);
		 s.click();
		s.click();

		driver.quit();

	}
}
