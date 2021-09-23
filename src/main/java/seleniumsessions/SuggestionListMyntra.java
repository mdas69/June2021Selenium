package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SuggestionListMyntra{

	public static void main(String[] args) throws InterruptedException {

		BrowserUtil brUtil = new BrowserUtil();
		String browser = "chrome";
		WebDriver driver = brUtil.launchBrowser(browser);
		brUtil.launchUrl("https://myntra.com");
		ElementUtil eleUtil = new ElementUtil(driver);
		

		By searchbox = By.xpath("//input[@class='desktop-searchBar']");
		By suggestionList = By.xpath("//ul[@class='desktop-group']/li");
		
		 eleUtil.suggestionList(searchbox, suggestionList, "adidas", "Adidas Women Shoes");
	
	}

	

}
