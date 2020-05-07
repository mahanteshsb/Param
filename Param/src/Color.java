

import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Color {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		System.out.println("enter the url");
		Scanner sc=new Scanner(System.in);
		String url = sc.nextLine();
WebDriver driver=new ChromeDriver();
driver.get(url);
List<WebElement> allLink = driver.findElements(By.xpath("//a"));
int count = allLink.size();
System.out.println(count);
for(int i=0;i<count;i++) {
	WebElement link = allLink.get(i);
	String text = link.getText();
	System.out.println(text);
	
}
driver.close();
	}

}
