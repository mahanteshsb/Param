

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
Set<String> allWH = driver.getWindowHandles();
for(String WH:allWH) {
	driver.switchTo().window(WH);
	System.out.println(driver.getTitle());
	driver.close();
}
}

}