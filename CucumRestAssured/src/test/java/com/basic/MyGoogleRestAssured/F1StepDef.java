package com.basic.MyGoogleRestAssured;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class F1StepDef {
	Response res;
	
	@When("I hit F1 app")
	public void I_hit_F1_app() throws Throwable {

		res = RestAssured.get("https://google.com/");
	}

	@Then("^I validate the status code of F1 app$")
	public void i_validate_the_status_code_of_F_app() throws Throwable {
		
		int actualStatCode = res.getStatusCode();
		System.out.println("actualStatCode ="+actualStatCode);

	}


}
