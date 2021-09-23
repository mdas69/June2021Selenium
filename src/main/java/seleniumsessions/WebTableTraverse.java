package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebTableTraverse {

	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();

		WebDriver driver = brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.w3schools.com/html/html_tables.asp");
		ElementUtil eleUtil = new ElementUtil(driver);
		By tableRows = By.xpath("//table[@id=\"customers\"]/tbody/tr");

		String a = "//table[@id=\"customers\"]/tbody/tr[";
		String b = "]/td[";
		String c = "]";
		eleUtil.printingWebTable(tableRows, a, b, c);
	

	}

}
