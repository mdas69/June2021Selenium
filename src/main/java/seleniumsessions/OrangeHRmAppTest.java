package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRmAppTest {

	public static void main(String[] args) {

		String browser = "chrome";
		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");
		System.out.println("Title of the page" + brUtil.getPageTitle());

		By orgName = By.id("Form_submitForm_subdomain");
		By firstName = By.id("Form_submitForm_Name");
		By email = By.id("Form_submitForm_Email");
		By phoneNumber = By.id("Form_submitForm_Contact");
		//By checkBox = By.id("Form_submitForm_SetDummyData");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(orgName, "Maruti Suzuki");
		eleUtil.doSendKeys(firstName, "Babu Singh");
		eleUtil.doSendKeys(email, "Babu96Singh@gmail.com");
		eleUtil.doSendKeys(phoneNumber, "1001001001");

	}

}
