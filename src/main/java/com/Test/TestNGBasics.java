package com.Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGBasics {

	// PRE-CONDITIONS ANNOTATIONS --STARTING WITH @BEFORE
	@BeforeSuite // 1
	public void SetupApi() {
		System.out.println("@BeforeSuite  set up for system propertys for chrome ");
	}

	@BeforeTest // 2
	public void launchBrowser() {
		System.out.println("@BeforeTest  launch browwser");
	}

	@BeforeClass // 3
	public void login() {
		System.out.println("@BeforeClass  llogin to app");
	}

	@BeforeMethod // 4
	public void enterURL() {
		System.out.println("@BeforeMethod  enter url");
	}

	// TEST CASES -- STARTIONG WITH @TEST
	@Test // 5
	public void googleTitleTest() {
		System.out.println("@Test   google title test");
	}

	@Test
	public void searchTest() {
		System.out.println("@Test  search Test");
	}

	@Test
	public void googleLogoTest() {
		System.out.println("@Test  google logo test");
	}

	// POST CONDITIONS -- STARTING WITH @AFTER
	@AfterMethod // 6
	public void logout() {
		System.out.println("@AfterMethod  logout from app");
	}

	@AfterClass // 7
	public void closeBrowser() {
		System.out.println("@AfterClass  close browser");
	}

	@AfterTest // 8
	public void deleteAllCookies() {
		System.out.println(" @AfterTest  delete all cookies");
	}

	//THERE ARE DIFFERENT ANNOTATIONS IN TEST NG ALL PRE REQIZIT ANNOTATION
	//TEST CASE ANNOTATIONS
	//POST CONDITION ANNOTATIONS
	//SO YOU CAN DESIGN YOUR TEST-CASES IN A SEQUENCE MANNER
	
	//@BeforeSuite  set up for system propertys for chrome 
	//@BeforeTest  launch browwser
	//@BeforeClass  llogin to app

	//@BeforeMethod  enter url
	//@Test  google logo test
	//@AfterMethod  logout from app
	
	//@BeforeMethod  enter url
	//@Test   google title test
	//@AfterMethod  logout from app
	
	//@BeforeMethod  enter url
	//@Test  search Test
	//@AfterMethod  logout from app
	
	//@AfterClass  close browser
	 //@AfterTest  delete all cookies

}
