package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Base {

	public static WebDriver driver;

	
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kjeha\\eclipse-workspace\\com.salesforce.banking\\drivers\\chromedriver.exe");
				driver = new ChromeDriver();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
	}
}