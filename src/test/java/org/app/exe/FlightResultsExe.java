package org.app.exe;

import org.openqa.selenium.By;

public class FlightResultsExe extends CheapFlightsExe{

	public static void mailAddress() {
		input_Data(popUpMail(), prop_reuse("gmail"));
	}
	public static void getDeals() {
		click_Value(popUpGetDeals());
	}
	public static void viewFligth() {
		click_Value(popUpViewFligth());
	}
	public static void selectFligth() {
		String x=driver.getTitle();
		javascript_Click(departingFligth());
		while (x.equals(driver.getTitle())) {
			javascript_Click((explicitlyWait(50,By.xpath("(//span[@class='sc-kmtlux gEcEWQ'])[1]"))));
		}
	}
}
