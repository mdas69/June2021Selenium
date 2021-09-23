package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalLinks {

	public static void main(String[] args) {

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.launchBrowser("chrome");
		brutil.launchUrl("https://google.com");
		
		ElementUtil eleutil = new ElementUtil(driver);
		By linktag = By.tagName("a");
		
		List<WebElement> linkslist = eleutil.getElements(linktag);
		for (WebElement e : linkslist) {
			String text = e.getText();
			
			if (!text.isEmpty()) {
				System.out.println(text);
				System.out.println("--");
			}

		}

	}

}
