package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorConcept {

	public static void main(String[] args) {
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver  = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		/*
		 * Maintain the by locator
		 */
		By orgName = By.id("Form_submitForm_subdomain");
		By firstName = By.id("Form_submitForm_Name");
		
		/*
		 * Call Element Utill class
		 */
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.doSendKeys(orgName, "Maruti Suzuki Accident");
		eleUtil.doSendKeys(firstName, "Babu Singh");
		
		
	
	}

}
