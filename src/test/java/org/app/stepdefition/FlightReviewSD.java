package org.app.stepdefition;

import org.app.exe.FlightReviewExe;
import org.openqa.selenium.By;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightReviewSD extends FlightReviewExe{

	@When("click the continue button")
	public void click_the_continue_button() {
	    continueButton();
	}
	@Then("validate the fligth review page")
	public void validate_the_fligth_review_page() {
	    System.out.println("Successfully validate the fligth review page");
		click_Value(explicitlyWait(50,By.xpath("//button//span[@rotate='0']")));
	}
}
