

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeTbx {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.opensourcebilling.org/");
		Dimension EmailTbx = driver.findElement(By.id("email")).getSize();
		int height=EmailTbx.getHeight();
	int	width=EmailTbx.getWidth();
	System.out.println("email height is="+height);
	System.out.println("email height is="+width);
	}

}
