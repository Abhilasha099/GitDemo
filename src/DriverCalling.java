import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverCalling {
	
	
	static WebDriver driver = null;
	
	
	public static WebDriver loadBrowser(String browserName) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Assignments\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			driver = new ChromeDriver();
             driver=new ChromeDriver(); 
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver","./softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	
	public static WebDriver loadBrowser(String browserName,String URL) {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver","C:\\Assignments\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");			driver = new ChromeDriver();
		} else if (browserName.equals("ie")) {
			System.setProperty("webdriver.ie.driver","./softwares\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver","./softwares\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.get(URL);
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		return driver;
	}
	
	public static WebDriver getDriver(){
		return driver;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://demo.opencart.com/";
		loadBrowser("chrome",url);
		

	}

}
