package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserTest {
	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		

		// test script
		driver.get("https://yahoo.com");
		String title = driver.getTitle();

		// validation point/checkpoint/actual vs expected result
		if (title.equals("Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment")) {
			System.out.println("Correct Title");
		} else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
