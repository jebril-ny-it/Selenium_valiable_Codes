package crmScreenShotExtenReport;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.TestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class FreeCRMExtentReportScreenShot {

	WebDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;

	@BeforeTest
	public void setExtent() {
		extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/ExtentReport.htm", true);
		extent.addSystemInfo("Host Name", "Jebril Mac");
		extent.addSystemInfo("User Name", "Mohammad Jebril");
		extent.addSystemInfo("Environment", "QA");
		extent.addSystemInfo("Java Version", "1.8");

	}

	@AfterTest
	public void endReport() {
		extent.flush();
		extent.close();
	}

	public static String getScreenShot(WebDriver driver, String scrennShotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyymmddmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots" + scrennShotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;

	}

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.FreeCRM.com");

	}

	@Test
	public void freeCRMTitle() {
		// initalization of test with extent
		extentTest = extent.startTest("freeCRMTitle");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "-1-Free CRM #1 cloud software for any business large or small");
	}

	@Test
	public void freeCRmLogoTest() {
		// initalization of test with extent
		extentTest = extent.startTest("freeCRmLogoTest");
		boolean b = driver.findElement(By.xpath("")).isDisplayed();
		Assert.assertTrue(b);
	}

	@AfterMethod
	public void tearDown(ITestResult result) throws IOException {
		// for failed tests
		if (result.getStatus() == ITestResult.FAILURE) {
			// to add name into the extent report = 2
			extentTest.log(LogStatus.FAIL, "Test case Failed is" + result.getName());
			// to add error/exception in extent report
			extentTest.log(LogStatus.FAIL, "Test case Failed is" + result.getThrowable());

			String ScreenShotPath = FreeCRMExtentReportScreenShot.getScreenShot(driver, result.getName());
			// to add screen shot in the extent report
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(ScreenShotPath));
			// to add screen video
			// extentTest.log(LogStatus.FAIL, extentTest.addScreencast(ScreenShotPath));

			// for slipped tests = 3
		} else if (result.getStatus() == ITestResult.SKIP) {
			extentTest.log(LogStatus.SKIP, "Test case skipped is" + result.getName());

			// if test case is passed =1
		} else if (result.getStatus() == TestResult.SUCCESS) {
			extentTest.log(LogStatus.PASS, "Test case PASSED ia " + result.getName());
		}
		{

		}
		// ending test and the current test prepare to create html report
		extent.endTest(extentTest);

		driver.quit();
	}

}
