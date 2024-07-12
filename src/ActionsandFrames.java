import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsandFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/");
		//driver.get("https://www.google.com/");
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	/*	Actions act=new Actions(driver);
		WebElement ele=driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		act.moveToElement(ele).click().keyDown(Keys.SHIFT).sendKeys("testing").build().perform();*/
	
	System.out.println("Hello fresh commit from US");
	System.out.println("Hello line 1");
	System.out.println("Hello line 2");
	System.out.println("Hello line 3");
	}

}
