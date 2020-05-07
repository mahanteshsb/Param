




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automat {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("sele");
List<WebElement> autoSugg = driver.findElements(By.xpath("//span[contains(text(),'sele')]"));
int count = autoSugg.size();
System.out.println(count);
driver.close();


}}
