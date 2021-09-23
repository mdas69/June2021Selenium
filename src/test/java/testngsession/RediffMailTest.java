package testngsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RediffMailTest extends BaseTest {
	
		
	@Test(priority = 1)
	public void pageTitleTest() {
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		String title = driver.getTitle();
		System.out.println("page title is: " + title);
		Assert.assertEquals(title,
				"Rediffmail");
	}

	@Test (priority = 2)
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is: " + url);
		Assert.assertTrue(url.contains("rediff"));
	}

	@Test (priority = 3)
	public void createAccountLink() {
		Assert.assertTrue(driver.findElement(By.xpath("//div[@class='create-new-account']/a")).isDisplayed());

	}

	
}
