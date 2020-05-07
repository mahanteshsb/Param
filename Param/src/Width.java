

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Width {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Dimension UsName = driver.findElement(By.name("reg_email__")).getSize();
		int w1=UsName.getWidth();
		Dimension Psw = driver.findElement(By.id("pass")).getSize();
		int w2=Psw.getWidth();
		driver.close();
		if(w1==w2)
		{
			System.out.println("UsName and Psw Width are equal");
		}
			else
			{
				System.out.println("UsName and Psw Width are  Not equal");
		}
			}


}
