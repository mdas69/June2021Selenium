package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TotalImages {

	public static void main(String[] args) {

		BrowserUtil brutil = new BrowserUtil();
		WebDriver driver = brutil.launchBrowser("chrome");
		brutil.launchUrl("https://amazon.in");

		ElementUtil eleutil = new ElementUtil(driver);
		By images = By.tagName("img");
		List<WebElement> imagesList =  eleutil.getElements(images);
		System.out.println("Total images on the page"+imagesList.size());
		int counter = 1;
		for (WebElement imgele : imagesList) {
			String attributeImage = imgele.getAttribute("alt");
			String srcImage = imgele.getAttribute("src");
			//if(!attributeImage.isEmpty())
			System.out.println(counter+ " "+attributeImage+"------>"+srcImage);
			counter++;
		}

	}
}
