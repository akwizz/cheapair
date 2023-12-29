package org.app.stepdefition;

import org.app.exe.PurchaseExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PurchaseSD extends PurchaseExe{

	@Given("enter the adult details {string}")
	public void enter_the_adult_details(String string) {
		i=Integer.parseInt(string);
		suffix("Jr");
	}

	@Given("enter the seniors details {string}")
	public void enter_the_seniors_details(String string) {
		i=Integer.parseInt(string);
		suffix("Sr");
	}

	@Given("enter the children details {string}")
	public void enter_the_children_details(String string) {
		i=Integer.parseInt(string);
		suffix("II");
	}

	@Given("enter the infants in lap details {string}")
	public void enter_the_infants_in_lap_details(String string) {
		i=Integer.parseInt(string);
		suffix("III");
	}

	@When("enter the first name {string}")
	public void enter_the_first_name(String string) {
		firstName(string);
	}

	@When("enter the last name {string}")
	public void enter_the_last_name(String string) {
		lastName(string);
	}

	@When("dropdown the gender")
	public void dropdown_the_gender() {
		gender("M");
	}

	@When("dropdown the day of date of birth {string}")
	public void dropdown_the_day_of_date_of_birth(String string) {
		dayOfDOB(string);
	}

	@When("enter the month of date of birth {string}")
	public void enter_the_month_of_date_of_birth(String string) {
		monthOfDOB(string);
	}

	@When("enter the year of date of birth {string}")
	public void enter_the_year_of_date_of_birth(String string) {
		yearOfDOB(string);
	}

	@Then("I validate the adult details")
	public void i_validate_the_adult_details() {
		System.out.println("Successfully enter the adult details");
	}
	
	@Then("I validate the seniors details")
	public void i_validate_the_seniors_details() {
		System.out.println("Successfully enter the seniors details");
	}
	
	@Then("I validate the children details")
	public void i_validate_the_children_details() {
		System.out.println("Successfully enter the children details");
	}
	
	@Then("I validate the infants in lap details")
	public void i_validate_the_infants_in_lap_details() {
		System.out.println("Successfully enter the infants in lap details");
	}

	@When("click the credit card button")
	public void click_the_credit_card_button() {
		
	}

	@When("enter the credit card number")
	public void enter_the_credit_card_number() {
		creditCardNumber();
	}

	@When("dropdown expired month")
	public void dropdown_expired_month() {
		expiredMonth();
	}

	@When("dropdown expired year")
	public void dropdown_expired_year() {
		expiredYear();
	}

	@When("enter the CVV number")
	public void enter_the_cvv_number() {
		cvv();
	}

	@When("enter the card holder name")
	public void enter_the_card_holder_name() {
		cardHolderName();
	}

	@When("dropdown country")
	public void dropdown_country() {
		country();
	}

	@When("enter the billing address")
	public void enter_the_billing_address() {
		billingAddress1();
		billingAddress2();
	}

	@When("enter the city")
	public void enter_the_city() {
		paymentCity();
	}

	@When("enter the billing phone number")
	public void enter_the_billing_phone_number() {
		paymentPhone();
	}

	@When("enter the contact mail id")
	public void enter_the_contact_mail_id() {
		email();
	}

	@When("enter create password")
	public void enter_create_password() {
		password();
	}

	@When("enter confirm password")
	public void enter_confirm_password() {
		confirmPassword();
	}

	@When("selecting the agree ratio button")
	public void selecting_the_agree_ratio_button() {
		agreeRatioButton();
	}

	@When("click the purchase button")
	public void click_the_purchase_button() {
		purchaseButton();
	}

	@Then("validate the purchase")
	public void validate_the_purchase() {
		System.out.println("Successfully validated the purchase page");
	}
}
