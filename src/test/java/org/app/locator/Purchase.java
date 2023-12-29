package org.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Purchase extends FlightReview {

	public static int i;

	public static WebElement firstNameLocator() {
		return explicitlyWait(50, By.id("firstName" + i));
	}

	public static WebElement lastNameLocator() {
		return explicitlyWait(50, By.id("lastName" + i));
	}

	public static WebElement suffixLocator() {
		return explicitlyWait(50, By.id("suffix"+i));
	}

	public static WebElement genderLocator() {
		return explicitlyWait(50, By.id("gender"+i));
	}

	public static WebElement monthOfDOBLocator() {
		return explicitlyWait(50, By.id("dobMonth"+i));
	}

	public static WebElement dayOfDOBLocator() {
		return explicitlyWait(50, By.id("dobDay"+i));
	}

	public static WebElement yearOfDOBLocator() {
		return explicitlyWait(50, By.id("dobYear"+i));
	}

	public static WebElement creditCardNumberLocator() {
		return explicitlyWait(50, By.id("ccNum1"));
	}

	public static WebElement expiredMonthLocator() {
		return explicitlyWait(50, By.id("expMonth1"));
	}

	public static WebElement expiredYearLocator() {
		return explicitlyWait(50, By.id("expYear1"));
	}

	public static WebElement cvvLocator() {
		return explicitlyWait(50, By.id("cvv1"));
	}

	public static WebElement cardHolderNameLocator() {
		return explicitlyWait(50, By.id("paymentName1"));
	}

	public static WebElement countryLocator() {
		return explicitlyWait(50, By.id("paymentCountry1"));
	}

	public static WebElement billingAddress1Locator() {
		return explicitlyWait(50, By.id("paymentAddress1"));
	}

	public static WebElement billingAddress2Locator() {
		return explicitlyWait(50, By.id("paymentAddress21"));
	}

	public static WebElement paymentCityLocator() {
		return explicitlyWait(50, By.id("paymanetCity1"));
	}

	public static WebElement paymentPhoneLocator() {
		return explicitlyWait(50, By.id("paymentPhone1"));
	}

	public static WebElement emailLocator() {
		return explicitlyWait(50, By.id("email"));
	}

	public static WebElement passwordLocator() {
		return explicitlyWait(50, By.id("password"));
	}

	public static WebElement confirmPasswordLocator() {
		return explicitlyWait(50, By.id("confirmPassword"));
	}

	public static WebElement agreeRatioButtonLocator() {
		return explicitlyWait(50, By.id("termsCheck"));
	}

	public static WebElement purchaseButtonLocator() {
		return explicitlyWait(50, By.id("purchaseBtn"));
	}
}
