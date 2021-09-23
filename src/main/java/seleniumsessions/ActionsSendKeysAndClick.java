package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;

public class ActionsSendKeysAndClick {

	public static void main(String[] args) {
		
		BrowserUtil brUtil = new BrowserUtil ();
		WebDriver driver = brUtil.launchBrowser("chrome");
		 
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		By emailID = By.xpath("//input[@id='input-email']");
		By password = By.xpath("//input[@id='input-password']");
		By Login = By.xpath("//input[@value='Login']");
		
		ElementUtil eleUtil = new ElementUtil (driver);
		driver.manage().window().maximize();
		eleUtil.doActionSendKeys(emailID, "MDAS");
		eleUtil.doActionSendKeys(password,"XXXX");
		eleUtil.doActionClick(Login);
		

	}

}
