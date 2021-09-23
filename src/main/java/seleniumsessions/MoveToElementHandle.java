package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MoveToElementHandle {

	public static void main(String[] args) throws InterruptedException {
		BrowserUtil brUtil = new BrowserUtil ();
		WebDriver driver = brUtil.launchBrowser("chrome");
		
		brUtil.launchUrl("https://book.spicejet.com/search.aspx");
		
		ElementUtil eleUtil = new ElementUtil (driver);
		driver.manage().window().maximize();
		By login = By.id("Login");
		By spiceMembers = By.xpath("(//a[@id='Login']//parent::li//following-sibling::ul)[1]/li/a[text()='SpiceClub Members']");
		By memberLogin = By.xpath("(//a[@id='Login']//parent::li//following-sibling::ul)[1]/li/ul/li/a[text()='Member Login']");
		eleUtil.threeLevelHandle(login,spiceMembers,memberLogin);
		brUtil.quitBrowser();
		
		
	}

}
