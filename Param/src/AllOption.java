

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllOption {
	static{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/DELL/Desktop/Hotel.html");
		ArrayList<String> list=new ArrayList<String>();
		WebElement MtrBox = driver.findElement(By.id("mtr"));
		Select s=new Select(MtrBox);
		List<WebElement> Alloption = s.getOptions();
		int count = Alloption.size();
		System.out.println(count);
		for(int i=0;i<count;i++) {
			WebElement option = Alloption.get(i);
			String text = option.getText();
			list.add(text);
			System.out.println(text);
		}
		System.out.println("^|^");
		System.out.println(" - ");
		Collections.sort(list);
		for(String sortedtext:list) {
			System.out.println(sortedtext);
		}
		//driver.close();
	}
}
