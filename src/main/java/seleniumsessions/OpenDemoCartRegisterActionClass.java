package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenDemoCartRegisterActionClass {

	public static void main(String[] args) throws InterruptedException {
		By firstName = By.xpath("//input[@id='input-firstname']");
		By lastName = By.xpath("//input[@id='input-lastname']");
		By email = By.xpath("//input[@id='input-email']");
		By telephone = By.xpath("//input[@id='input-telephone']");
		By password = By.xpath("//input[@id='input-password']");
		By passwordConfirm = By.xpath("//input[@id='input-confirm']");
		By subscribeYes = By.xpath("(//input[@name='newsletter'])[1]");
		By checkBox = By.xpath("//input[@name='agree']");
		By continuebutton = By.xpath("//input[@value='Continue']");
		
		BrowserUtil brUtil = new BrowserUtil ();
		WebDriver driver = brUtil.launchBrowser("chrome");
		 
		brUtil.launchUrl("https://demo.opencart.com/index.php?route=account/register");
				
		ElementUtil eleUtil = new ElementUtil (driver);
		driver.manage().window().maximize();
		
		eleUtil.doActionSendKeys(firstName, "Mangala");
		Thread.sleep(2000);
		eleUtil.doActionSendKeys(lastName, "Das");
		Thread.sleep(2000);
		eleUtil.doActionSendKeys(email, "m@gmail.com");
		Thread.sleep(2000);
		eleUtil.doActionSendKeys(telephone, "1234567890");Thread.sleep(2000);
		eleUtil.doActionSendKeys(password, "wallet123");Thread.sleep(2000);
		eleUtil.doActionSendKeys(passwordConfirm, "wallet123");Thread.sleep(2000);
		eleUtil.doActionClick(subscribeYes);Thread.sleep(2000);
		eleUtil.doActionClick(checkBox);Thread.sleep(2000);
		eleUtil.doActionClick(continuebutton);Thread.sleep(5000);
		brUtil.quitBrowser();

		
		
	}

}
