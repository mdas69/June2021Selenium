package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This utility is having different methods for different browser action
 * 
 * @author daspr
 *
 */
public class BrowserUtil {

	public WebDriver driver;

	/**
	 * Launches the browser and give you the reference of it for further use case
	 * @param browserName
	 * @return - This returns WebDriver reference.
	 */
	public WebDriver launchBrowser(String browserName) {
		// chrome
		if (browserName.equals("chrome")) {
			//System.setProperty("webdriver.chrome.driver", "D:\\chromdrver.exe\\chromedriver.exe");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}

		// firefox
		else if (browserName.equals("firefox")) {
			//System.setProperty("webdriver.gecko.driver", "D:\\geeckodriver\\geckodriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}

		else {
			System.out.println("Please pass the correct browser name");
		}

		return driver;
	}

	/**
	 * 
	 * @param url
	 */
	public void launchUrl(String url) {
		if (url == null) {
			return;
		}

		if (url.isEmpty()) {
			return;
		}

		driver.get(url);
	}

	/**
	 * 
	 * @return
	 */
	public String getPageTitle() {
		return driver.getTitle();
	}

	/**
	 * 
	 * @return
	 */
	public String getCurrentPageSource() {
		return driver.getPageSource();
	}
	
	/**
	 * 
	 * @return
	 */
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	/**
	 * 
	 */
	public void quitBrowser() {
		driver.quit();
	}

}
