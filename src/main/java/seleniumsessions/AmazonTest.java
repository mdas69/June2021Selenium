package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class AmazonTest {

	public static void main(String[] args) {

		BrowserUtil br = new BrowserUtil();
		WebDriver driver = br.launchBrowser("chrome");
		br.launchUrl("https://www.brazzers.com");

		String title = br.getPageTitle();
		if (title.contains("Amazon")) {
			System.out.println("title is correct");
		} else {
			System.out.println("Title is incorrect");
		}

		String url_received = br.getPageUrl();
		System.out.println(url_received);

		br.quitBrowser();
	}
}
