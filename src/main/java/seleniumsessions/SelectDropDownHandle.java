package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelectDropDownHandle {

	public static void main(String[] args) {
		
		String browser = "firefox";
		BrowserUtil brUtil = new BrowserUtil(); 
		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		By countryDropDown = By.id("Form_submitForm_Country");

		
		eleUtil.doSelectByVisibleText(countryDropDown, "India");
		eleUtil.doSelectByValue(countryDropDown, "Andorra");
		eleUtil.doSelectByIndex(countryDropDown, 10);
	}

}
