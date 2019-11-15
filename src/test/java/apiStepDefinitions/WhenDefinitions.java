package apiStepDefinitions;

import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WhenDefinitions {

	public static Response resp;
	public static RequestSpecification requestSpec;
	
	
	@When("User send a get request to {string}")
	public void user_send_a_get_request_to(String request) {
		RestAssured.baseURI = "https://reqres.in/";
		requestSpec = RestAssured.given();
		resp = requestSpec.when().get(request);
		
	}
	
}
