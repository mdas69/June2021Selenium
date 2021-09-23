package testngsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest{
	

	@Test(priority = 1)
	public void pageTitleTest() {
		//driver.get("https://www.Google.co.in/");
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		Assert.assertEquals(title,
				"Google");
	}

	@Test(priority = 2)
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is: " + url);
		Assert.assertTrue(url.contains("google"));
	}

	@Test(priority = 3)
	public void searchBoxTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@title='Search']")).isDisplayed());

	}

}
