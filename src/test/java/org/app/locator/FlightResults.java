package org.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightResults extends CheapFlights {

	public static WebElement popUpMail() {
		return explicitlyWait(50, By.xpath("//input[@kind='primary']"));
	}

	public static WebElement popUpGetDeals() {
		return explicitlyWait(50, By.xpath("//div[text()='Get Deals']"));
	}

	public static WebElement popUpViewFligth() {
		return explicitlyWait(50, By.xpath("//div[text()='View Flight Options']"));
	}

	public static WebElement departingFligth() {
		return explicitlyWait(50, By.xpath("(//span[@class='sc-kmtlux gEcEWQ'])[1]"));
	}
}
