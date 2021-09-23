package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromdrver.exe\\chromedriver.exe");
		WebDriver driver  = new ChromeDriver();
		driver.get("https://yahoo.com");
		String title =  driver.getTitle();
		
		//validation point/checkpoint/actual vs expected result
		if (title.equals("Yahoo India | News, Finance, Cricket, Lifestyle and Entertainment"))
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Incorrect title");
		}
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}

}
