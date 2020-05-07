

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[.='Use another account']")).click();
		driver.findElement(By.xpath("//div[.='Email or phone']")).sendKeys("mahanteshsb460@gmail.com");
		Thread.sleep(5000);
		driver.findElement(By.className("CwaK9")).click();
		driver.findElement(By.name("password")).sendKeys("Mantu777");
		Thread.sleep(5000);
		//driver.findElement(By.id("sign_in")).click();
		driver.findElement(By.className("CwaK9")).click();
	}	

}
