import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropDownSession {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Assignments\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		//WebDriver driver=new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Select sel=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		sel.selectByIndex(3);
		String selectedOption=sel.getFirstSelectedOption().getText();
		System.out.println(selectedOption);
		sel.selectByVisibleText("INR");
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByValue("USD");
	}

}
