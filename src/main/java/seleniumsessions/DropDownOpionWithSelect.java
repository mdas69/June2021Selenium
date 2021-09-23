package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownOpionWithSelect {

	public static void main(String[] args) {

		String browser = "chrome";
		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");
		ElementUtil eleUtil = new ElementUtil(driver);
		List <String> countryList = eleUtil.getDropDownOptionsList(country);

		/*
		 * Validation Point
		 */
		if (countryList.contains("Zaire")) {
			System.out.println("Foreign Country Pass");
		}
		
		eleUtil.selectdropDownValue(country, "India");

	}

}
