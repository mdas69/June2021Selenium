package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AmazonFooterLinks {

	public static void main(String[] args) {
		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.launchBrowser("chrome");
		brutil.launchUrl("https://amazon.in");
		By amazonFooterLinks = By.xpath("//div[@class='navFooterVerticalRow navAccessibility']//a");
		ElementUtil eleutil = new ElementUtil(driver);
		
		//to check whether a particular footer link is present or not
		List <String> stringList =  eleutil.getLinksTextList(amazonFooterLinks);
		
		//Validation 
		//1.All footer links are available or not
		if (stringList.size()==21) {
			System.out.println("All footer links are available");
		}
		else System.out.println("Some footer links are missing");
		
		
		//2. Check Particular Footer Links are present or not
		if (stringList.contains("Help")) {
			System.out.println("Help is present");
		}
		else System.out.println("Help footer links are missing");
	}

}
