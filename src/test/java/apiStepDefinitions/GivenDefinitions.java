package apiStepDefinitions;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GivenDefinitions {
	public static Response resp;
	public static RequestSpecification request;
	
	@Given("User send an id {string}")
	public void user_send_an_id(String id) {
		RestAssured.baseURI = "https://reqres.in/";
		request = RestAssured.given();
		request.pathParam("id", Integer.parseInt(id));
		resp = request.when().get("/api/users/" + id);
	}
}
