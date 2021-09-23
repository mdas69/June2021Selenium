package testngsession;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasicsTest {

	@BeforeSuite
	public void DBConnection() {
		System.out.println("BS -- DBConnection");

	}

	@BeforeTest
	public void createUser() {
		System.out.println("BT -- create user");
	}

	@BeforeClass
	public void launchBrowser() {
		System.out.println("BC -- launch browser");
	}

	@BeforeMethod
	public void login() {
		System.out.println("BM -- login");
	}

	@Test
	public void homepageTest() {
		System.out.println("homepage test");
	}

	@Test
	public void addToCartTest() {
		System.out.println("add to cart test");
	}

	@Test
	public void paymentTest() {
		System.out.println("payment test");

	}

	@AfterMethod
	public void logout() {
		System.out.println("AM -- logout");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("AC -- close browser");
	}

	@AfterTest
	public void deleteUser() {
		System.out.println("AT -- delete browser");
	}

	@AfterSuite
	public void disconnectDB() {
		System.out.println("AS -- disconnect DB");
	}
}
