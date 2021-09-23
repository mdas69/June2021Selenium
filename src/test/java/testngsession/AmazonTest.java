package testngsession;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.sun.org.apache.xml.internal.serializer.utils.Utils;

import Utils.AssertionErrorMessage;

public class AmazonTest extends BaseTest{
	
		

	@Test (priority = 1, invocationCount = 2)
	public void pageTitleTest() {
		
		String title = driver.getTitle();
		System.out.println("pag e title is: " + title);
		Assert.assertEquals(title,
				"Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in",
				AssertionErrorMessage.TITLE_MISMATCH_MSG);
	}

	@Test(priority = 2)
	public void pageUrlTest() {
		String url = driver.getCurrentUrl();
		System.out.println("page url is: " + url);
		Assert.assertTrue(url.contains("amazon11"), AssertionErrorMessage.URL_MISMATCH_MSG);
	}

	@Test(priority = 3)
	public void searchBoxTest() {
		Assert.assertTrue(driver.findElement(By.id("twotabsearchtextbox")).isDisplayed());

	}

}