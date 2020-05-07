

import java.util.Scanner;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClosed {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
System.out.println("----------------bhf-------");
Scanner s=new Scanner(System.in);
String ExpTitle = s.nextLine();
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
Set<String> allWH = driver.getWindowHandles();
for(String Wh:allWH) {
	driver.switchTo().window(Wh);
	String AcyualTitle = driver.getTitle();
	System.out.println(AcyualTitle);
	if(AcyualTitle.equals(ExpTitle)) {
	}else {
		
		driver.close();
	}
}
	}
}
