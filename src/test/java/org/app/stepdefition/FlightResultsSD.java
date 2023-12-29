package org.app.stepdefition;

import org.app.exe.FlightResultsExe;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlightResultsSD extends FlightResultsExe{

	@When("handle the pop up")
	public void handle_the_pop_up() {
	    mailAddress();
	    getDeals();
	    viewFligth();
	}
	@When("select the departing fligth")
	public void select_the_departing_fligth() {
	    selectFligth();
	}
	@Then("validate the flight result page")
	public void validate_the_flight_result_page() {
	    System.out.println("successfully validated the flight result page");
	}
}
