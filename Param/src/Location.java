

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Location {
	static{
	System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
}
	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement NewpswTbx = driver.findElement(By.name("reg_passwd__"));
	int x=NewpswTbx.getLocation().getX();
	int y=NewpswTbx.getLocation().getY();
	System.out.println("x axis ="+x);
	System.out.println("y axis ="+y);
	driver.close();
	}

}
