

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EquaLocation {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
		public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement NewpswTbx = driver.findElement(By.name("reg_email__"));
		int x1=NewpswTbx.getLocation().getX();
		WebElement Psw= driver.findElement(By.name("reg_passwd__"));
		int x2=NewpswTbx.getLocation().getX();
		driver.close();
		System.out.println(x1);
		System.out.println(x2);
		if(x1==x2)
		{
			System.out.println("UsName and Psw tex box are properly");
		}
			else
			{
				System.out.println("UsName and Psw tex box are Not properly");
		}
		
		}

}
