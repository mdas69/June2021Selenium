package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GoIbbo {

	public static void main(String[] args) {
		By displayedMonth = By.cssSelector("div.DayPicker-Caption");
		By nextButton = By.xpath("(//div[@class='DayPicker-NavBar']/span)[2]");
		By departureDatePicker = By.id("departureCalendar");
		By returnDatePicker = By.id("returnCalendar");
		BrowserUtil brUtil = new BrowserUtil();
		
		WebDriver driver= brUtil.launchBrowser("chrome");
		brUtil.launchUrl("https://www.goibibo.com/flights/");
		ElementUtil eleUtil = new ElementUtil(driver);
		
		eleUtil.selectFutureDateCalendar(departureDatePicker,displayedMonth, nextButton, "August 2023", "33");
		eleUtil.selectFutureDateCalendar(returnDatePicker,displayedMonth, nextButton, "August 2023", "30");
		eleUtil.getElement(By.id("gi_search_btn")).click();

	}

}
