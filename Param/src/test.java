

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {
	static {
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
public static void main(String[] args) {

WebDriver driver=new ChromeDriver();
driver.get("file:///C:/Users/DELL/Desktop/Demo.html");
driver.findElement(By.partialLinkText("gle")).click();




	
	
	
}
}