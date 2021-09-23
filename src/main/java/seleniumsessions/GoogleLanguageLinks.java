package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GoogleLanguageLinks {

	public static void main(String[] args) {

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.launchBrowser("chrome");
		brutil.launchUrl("https://google.co.in");

		By languageLink = By.xpath("//div[@id='SIvCob']/a");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.clickOnElements(languageLink, "मराठी");

	}
}
