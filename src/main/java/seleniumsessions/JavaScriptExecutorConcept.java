package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) {
	
		BrowserUtil brUtil  = new BrowserUtil();
		WebDriver driver =  brUtil.launchBrowser("firefox");
		brUtil.launchUrl("https://www.google.co.in");

		ElementUtil eleUtil = new ElementUtil(driver);
		JavaScriptUtil jsUtil = new JavaScriptUtil(driver);
		

		By serachText = By.xpath("//input[@title='Search']");
		WebElement element =  eleUtil.getElement(serachText);
		
		jsUtil.flash(element);
		
		eleUtil.doActionSendKeysAndEnter(serachText, "INDIA");

		}

}
