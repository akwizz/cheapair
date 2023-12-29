package org.app.stepdefition;

import java.util.ArrayList;

import org.app.exe.CheapFlightsExe;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheapFlightsSD extends CheapFlightsExe{

	@Given("launch the URL")
	public void launch_the_url() {
	    browserlaunch();
	}
	@When("selecting the round trip ratio button {string}")
	public void selecting_the_round_trip_ratio_button(String string) {
	    trip(Integer.parseInt(string));
	}
	@When("choosing the departure location")
	public void choosing_the_departure_location() {
//	    from();
	}
	@When("choosing the destination location")
	public void choosing_the_destination_location() {
	    to();
	}
	@When("choosing the depart date")
	public void choosing_the_depart_date() {
	    dateOfDepart();
	}
	@When("choosing the return date")
	public void choosing_the_return_date() {
	    dateOfReturn();
	}
	@When("click the adult addition button")
	public void click_the_adult_addition_button() {
	    adult();
	}
	@When("click the seniors addition button")
	public void click_the_seniors_addition_button() {
	    seniors();
	}
	@When("click the children addition button")
	public void click_the_children_addition_button() {
	    children();
	}
	@When("click the infants lap addition button")
	public void click_the_infants_lap_addition_button() {
	    infantsInLap();
	}
	@When("dropdown the economy")
	public void dropdown_the_economy() {
	   economy();
	}
	@When("click the search flight button")
	public void click_the_search_flight_button() {
	    searchFlights();
	}
	@Then("validate the Cheap flights page")
	public void validate_the_cheap_flights_page() {
		driver.switchTo().window(new ArrayList<String>(driver.getWindowHandles()).get(1));
	    System.out.println("successfully validated the Cheap flights page");
	}

}
