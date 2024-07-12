import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/");
		System.out.println(driver.findElement(By.linkText("Courses")).getText());
		
List<WebElement> links=		driver.findElements(By.xpath("//div[@class='navbar-collapse collapse clearfix']/ul/li/a"));
	for(WebElement str : links)
	{
	System.out.println(str.getText());
	}
	


	}
		
		
		
	

}
