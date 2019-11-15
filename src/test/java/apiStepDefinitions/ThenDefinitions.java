package apiStepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ThenDefinitions {
	Response resp = WhenDefinitions.resp;
	RequestSpecification requestSpec = WhenDefinitions.requestSpec;
	
	@Then("User should get status code {string}")
	public void user_should_get_status_code(String statusCode) {
		requestSpec.then().statusCode(Integer.parseInt(statusCode));
	}

	@Then("Response data should have an email")
	public void response_data_should_have_an_email() {
		System.out.println(resp.body().jsonPath().get("data[0].email").toString());
		Assert.assertEquals(resp.body().jsonPath().get("data[0].email").toString(),  "george.bluth@reqres.in",	"Error");
	}
	@Then("Response data should be a json")
	public void response_data_should_be_a_json() {
	    
	}
}
