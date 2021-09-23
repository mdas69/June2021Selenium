package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCart {

	public static void main(String[] args) {

		String browser = "firefox";
		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		System.out.println("Title of the page" + brUtil.getPageTitle());

		By firstName = By.id("input-firstname");
		By lastName = By.id("input-lastname");
		By email = By.id("input-email");
		By phoneNumber = By.id("input-telephone");
		By password = By.id("input-password");
		By confirmPasword = By.id("input-confirm");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(firstName, "Mangala Prasanna");
		eleUtil.doSendKeys(lastName, "Das");
		eleUtil.doSendKeys(email, "mdas@gmail.com");
		eleUtil.doSendKeys(phoneNumber, "9986808471");
		eleUtil.doSendKeys(password, "SAMSUNGgalaxy");
		eleUtil.doSendKeys(confirmPasword, "SAMSUNGgalaxy");

	}

}
