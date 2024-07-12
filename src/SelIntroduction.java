import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Invoking browser
		System.setProperty("webdriver.chrome.driver", "C:\\Assignments\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		//ChromeDriver driver=new ChromeDriver();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");

	}

}
