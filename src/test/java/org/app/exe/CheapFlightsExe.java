package org.app.exe;

import java.util.ArrayList;

import org.app.locator.Purchase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class CheapFlightsExe extends Purchase{

	public static void browserlaunch() {
		browserlaunch(prop_reuse("url"));
	}
	
	public static void trip(int i) {
		WebElement element = explicitlyWait(50,By.xpath("(//span[@class='tgl-btn'])["+i+"]"));
		if (!element.isSelected()) {
			element.click();
		}
	}
	
	public  static void from() {
		input_Data_clear_Enter(departureLocation(), "Madras, India");
	}
	
	public static void to() {
		input_Data_Enter(destinationLocation(), "Delhi, India");
	}
	
	public static void dateOfDepart() {
		click_Value(Date(3));
	}
	
	public static void dateOfReturn() {
		click_Value(Date(6));
	}
	
	public static void adult() {
		click_Value(addPersonAdult());
	}
	
	public static void seniors() {
		click_Value(addPersonSeniors());
	}
	
	public static void children() {
		click_Value(addPersonChildren());
	}
	
	public static void infantsInLap() {
		click_Value(addPersonInfantsInLap());
	}
	
	public static void economy() {
		dropdpown_Value(economySelect(), "W");
	}
	
	public static void searchFlights(){
		String s=driver.getTitle();
		while (s.equals("Cheap Flights, Airline Tickets & Airfare Deals - CheapAir")){
			driver.navigate().refresh();
			((JavascriptExecutor)driver).executeScript("window.scrollBy(0,350)");
			click_Value(searchFlightsButton());
			s=driver.getTitle();
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		browserlaunch();
		trip(1);
		from();
		to();
		Thread.sleep(2000);
		dateOfDepart();
		dateOfReturn();
		adult();
		seniors();
		children();
		infantsInLap();
		economy();
		searchFlights();
		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
		input_Data(explicitlyWait(50,By.xpath("//input[@kind='primary']")), "kabilanaiite2023@gmail.com");
		click_Value(explicitlyWait(50,By.xpath("//div[text()='Get Deals']")));
		click_Value(explicitlyWait(50,By.xpath("//div[text()='View Flight Options']")));
		String x=driver.getTitle();
		javascript_Click((explicitlyWait(50,By.xpath("(//span[@class='sc-kmtlux gEcEWQ'])[1]"))));
		while (x.equals(driver.getTitle())) {
			javascript_Click((explicitlyWait(50,By.xpath("(//span[@class='sc-kmtlux gEcEWQ'])[1]"))));
		}
//		click_Value(explicitlyWait(50,By.xpath("//button//div[text()='Continue']")));
//		click_Value(explicitlyWait(50,By.xpath("//button//span[@rotate='0']")));
//		input_Data(explicitlyWait(50, By.id("firstName1")), "KABILAN");
//		input_Data(explicitlyWait(50, By.id("lastName1")),"S");
//		dropdpown_Value(explicitlyWait(50, By.id("suffix1")), "Jr");
//		dropdpown_Value(explicitlyWait(50, By.id("gender1")), "M");
//		dropdpown_Value(explicitlyWait(50, By.id("dobMonth1")), "09");
//		input_Data(explicitlyWait(50, By.id("dobDay1")), "25");
//		input_Data(explicitlyWait(50, By.id("dobYear1")), "2002");
//		input_Data(explicitlyWait(50, By.id("ccNum1")), "1234567890123456");
//		dropdpown_Value(explicitlyWait(50, By.id("expMonth1")), "09");
//		dropdpown_Value(explicitlyWait(50, By.id("expYear1")), "2025");
//		input_Data(explicitlyWait(50, By.id("cvv1")), "333");
//		input_Data(explicitlyWait(50, By.id("paymentName1")), "kabilan.S");
//		dropdpown_Value(explicitlyWait(50, By.id("paymentCountry1")), "IN");
//		input_Data(explicitlyWait(50, By.id("paymentAddress1")), "Venkateswarapuram");
//		input_Data(explicitlyWait(50, By.id("paymentAddress21")), "Alangulam");
//		input_Data(explicitlyWait(50, By.id("paymanetCity1")), "Tenkasi");
//		input_Data(explicitlyWait(50, By.id("paymentPhone1")), "7397007397");
//		input_Data(explicitlyWait(50, By.id("email")), "kabilanaiite2023@gmail.com");
//		input_Data(explicitlyWait(50, By.id("password")), "12345678");
//		input_Data(explicitlyWait(50, By.id("confirmPassword")), "12345678");
//		click_Value(explicitlyWait(50, By.id("termsCheck")));
//		click_Value(explicitlyWait(50, By.id("purchaseBtn")));
//		driver.close();
	}
}
