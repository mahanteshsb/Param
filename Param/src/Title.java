

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Title {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allTitle = driver.getWindowHandles();
		for(String WH:allTitle) {
			driver.switchTo().window(WH);
			System.out.println(driver.getTitle());
			driver.close();
			Thread.sleep(2000);
			
		}
	}
}
