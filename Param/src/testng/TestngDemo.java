package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngDemo {
	@BeforeSuite
	public void setUp() {
		System.out.println("setup system property for chrome");
	}
	@BeforeClass
	public void launchBrowser() {
	
System.out.println("lounchBrowser");
}
	@BeforeTest
	public void login() {
		System.out.println("logon to app");
	}
	@BeforeMethod
	public void enterURL() {
		System.out.println("enter url");
	}
	@Test
	public void googleTitleTest() {
		System.out.println("google title test");
	}
	@AfterMethod
	public void logout() {
		System.out.println("logout from app");
	}
	@AfterTest
	public void deleteAllChookies() {
		System.out.println("delete all chookies");
	}
	@AfterClass
	public void closeBrowser() {
		System.out.println("close browser");
	}
	@AfterSuite
	public void generetReport() {
		System.out.println("generet report");
	}
}