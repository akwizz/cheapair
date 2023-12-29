package org.app.exe;

public class PurchaseExe extends FlightReviewExe {

	public static void firstName(String string) {
		input_Data(firstNameLocator(), string);
	}

	public static void lastName(String string) {
		input_Data(lastNameLocator(), string);
	}

	public static void suffix(String string) {
		dropdpown_Value(suffixLocator(), string);
	}

	public static void gender(String string) {
		dropdpown_Value(genderLocator(), string);
	}

	public static void monthOfDOB(String string) {
		dropdpown_Value(monthOfDOBLocator(), string);
	}

	public static void dayOfDOB(String string) {
		input_Data(dayOfDOBLocator(), string);
	}

	public static void yearOfDOB(String string) {
		input_Data(yearOfDOBLocator(), string);
	}

	public static void creditCardNumber() {
		input_Data(creditCardNumberLocator(), prop_reuse("creditCardNumber"));
	}

	public static void expiredMonth() {
		dropdpown_Value(expiredMonthLocator(), prop_reuse("expMonth"));
	}

	public static void expiredYear() {
		dropdpown_Value(expiredYearLocator(), prop_reuse("expYear"));
	}

	public static void cvv() {
		input_Data(cvvLocator(), prop_reuse("cvv"));
	}

	public static void cardHolderName() {
		input_Data(cardHolderNameLocator(), prop_reuse("cardHolderName"));
	}

	public static void country() {
		input_Data(countryLocator(), "IN");
	}

	public static void billingAddress1() {
		input_Data(billingAddress1Locator(), "Venkateswarapuram");
	}

	public static void billingAddress2() {
		input_Data(billingAddress2Locator(), "Alangulam");
	}

	public static void paymentCity() {
		input_Data(paymentCityLocator(), "Tenkasi");
	}

	public static void paymentPhone() {
		input_Data(paymentPhoneLocator(), prop_reuse("phone"));
	}

	public static void email() {
		input_Data(emailLocator(), prop_reuse("gmail"));
	}

	public static void password() {
		input_Data(passwordLocator(), prop_reuse("password"));
	}

	public static void confirmPassword() {
		input_Data(confirmPasswordLocator(), prop_reuse("password"));
	}

	public static void agreeRatioButton() {
		if(agreeRatioButtonLocator().isDisplayed() && agreeRatioButtonLocator().isEnabled() && !agreeRatioButtonLocator().isSelected()) {
			click_Value(agreeRatioButtonLocator());
		}
	}

	public static void purchaseButton() {
		click_Value(purchaseButtonLocator());
	}

}
