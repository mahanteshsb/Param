

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.vtiger.com/");
		Actions a=new Actions(driver);
		WebElement all = driver.findElement(By.partialLinkText("Resources"));
		a.moveToElement(all).perform();
		driver.findElement(By.xpath("//h6[contains(text(),'Contact')]")).click();
		String Phn = driver.findElement(By.xpath("//p[contains(.,'Bengaluru')]/../../a/p[2]")).getText();
		System.out.println(Phn);
		driver.close();
}}
