

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Try {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		try {
			driver.get("https://webmail.au.syrahost.com/");
		System.out.println("page is loadede");
		}
		catch(Exception e){
			System.out.println("page is loadede");
			
		}
		driver.close();

	}

}
