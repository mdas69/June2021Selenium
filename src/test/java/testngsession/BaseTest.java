package testngsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

	WebDriver driver;
	
	@Parameters({"browser","url"})
	@BeforeTest
	public void setUp(String browserName, String URL) {
		
		if (browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (browserName.equals("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}
		
		else {
			System.out.println("Pass the coorect browser");
		}

		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get(URL);
	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
