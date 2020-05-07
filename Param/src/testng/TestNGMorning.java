package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGMorning {
	WebDriver Driver;
	
	@BeforeMethod
	public void lanchBrowser() {
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	Driver=new ChromeDriver();
	Driver.manage().window().maximize();
}
	@AfterMethod
	public void closeBrowser() {
		Driver.close();
	}
	@Test
	public void verifyGoogleTitlePage() throws InterruptedException {
		Driver.get("https://www.google.com/");
		Thread.sleep(2000);
		String TitlePage = Driver.getTitle();
		Assert.assertEquals(TitlePage, "Google");
	}
	@Test
	public void verifyyahooTitlePage() throws InterruptedException {
		Driver.get("https://in.yahoo.com/");
		Thread.sleep(2000);
		String TitlePage = Driver.getTitle();
		Assert.assertEquals(TitlePage, "Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment");
	}
	@Test
	public void verifyicicBankTitlePage() throws InterruptedException {
		Driver.get("https://www.icicibank.com/");
		Thread.sleep(2000);
		String TitlePage = Driver.getTitle();
		Assert.assertEquals(TitlePage, "Personal Banking, Online Banking Services - ICICI Bank");
	}
}