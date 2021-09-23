package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DropDownvalueWithoutSelect {

	public static void main(String[] args) {
		String browser = "chrome";
		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.clickdropDownValue(country, "pAkistan");

	}

}
