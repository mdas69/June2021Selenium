package seleniumsessions;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDown {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		BrowserUtil brUtil = new BrowserUtil();
		String browser ="firefox";
		
		WebDriver driver =brUtil.launchBrowser(browser);
		 
		
	}

}
