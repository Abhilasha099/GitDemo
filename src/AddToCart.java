import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abhil\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		int j=0;
		String[] veggies= {"Cucumber","Brocolli","Tomato"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
driver.manage().window().maximize();
List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));
for(int i=0 ;i<products.size();i++)
{
	String[] name= products.get(i).getText().split("-");
	String formattedName=name[0].trim();
	
	List itemsNeededList=Arrays.asList(veggies);
	
	if(itemsNeededList.contains(name))
		
	{
		j++;
		driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
		
		if(j==3)
		{
			break;
		}

		
		//click on add to cart
	}
	
	
}
	}

}
