package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RightClickMenuHandle {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil ();
		WebDriver driver = brUtil.launchBrowser("chrome");
		 
		brUtil.launchUrl("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		By contextClick = By.xpath("//span[text()='right click me']");
		By contextMenu = By.xpath("//li[contains(@class,'context-menu-item')]/span");
		
		ElementUtil eleUtil = new ElementUtil (driver);
		driver.manage().window().maximize();
		eleUtil.contextMenuClick(contextClick, contextMenu, "Paste");
		
	}

}
