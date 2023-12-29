package org.app.locator;

import org.app.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheapFlights extends BaseClass{

	public static WebElement departureLocation() {
		return explicitlyWait(50, By.id("from1"));
	}
	
	public static WebElement destinationLocation() {
		return explicitlyWait(50, By.id("to1"));
	}
	
	public static WebElement Date(int i) {
		return driver.findElement(By.xpath("//td[@data-month='11']//a[text()='"+i+"']"));
	}
	
	public static WebElement addPersonAdult() {
		return explicitlyWait(50,By.xpath("//button[@tabindex='6']"));
	}
	
	public static WebElement addPersonSeniors() {
		return explicitlyWait(50,By.xpath("//button[@tabindex='8']"));
	}
	
	public static WebElement addPersonChildren() {
		return explicitlyWait(50,By.xpath("//button[@tabindex='10']"));
	}
	
	public static WebElement addPersonInfantsInLap() {
		return explicitlyWait(50,By.xpath("//button[@tabindex='12']"));
	}
	
	public static WebElement economySelect() {
		return driver.findElement(By.id("cabin"));
	}
	
	public static WebElement searchFlightsButton() {
		return explicitlyWait(50,By.xpath("//div//button[text()='Search Flights']"));
	}
}
