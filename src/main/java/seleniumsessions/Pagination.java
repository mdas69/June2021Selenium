package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 

public class Pagination {

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://classic.crmpro.com/index.html");
		ElementUtil eleUtil = new ElementUtil(driver);
		By username = By.name("username");
		By password = By.name("password");
		By loginbutton = By.xpath("//input[@value='Login']");
		String usersendKeys = "groupautomation";
		String passSendKeys = "Testa@12345";
		
		eleUtil.doSendKeys(username,usersendKeys);
		eleUtil.doSendKeys(password,passSendKeys);
		eleUtil.doClick(loginbutton);

	}

}
