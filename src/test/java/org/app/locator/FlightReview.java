package org.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FlightReview extends FlightResults{

	public static WebElement clickContinue() {
		return explicitlyWait(50,By.xpath("//button//div[text()='Continue']"));
	}
}
