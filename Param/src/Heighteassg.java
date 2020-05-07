

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Heighteassg {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
Dimension UsName = driver.findElement(By.name("email")).getSize();
int h1=UsName.getHeight();
Dimension Psw = driver.findElement(By.id("pass")).getSize();
int h2=Psw.getHeight();
driver.close();
if(h1==h2)
{
	System.out.println("UsName and Psw height are equal");
}
	else
	{
		System.out.println("UsName and Psw height are  Not equal");
}
	}

}
