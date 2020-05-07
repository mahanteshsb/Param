

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectOption {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		WebElement MtrBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MtrBox);
		/*s.selectByIndex(1);
		s.selectByValue("i");
		s.selectByVisibleText("Vada");
		if(s.isMultiple()) {
			s.deselectByIndex(2);
			s.deselectByValue("d");
			s.deselectByVisibleText("Idly");
			
		}*/
		
		

	}

}
