package restfulBookingApp;

import io.restassured.RestAssured;
import io.restassured.specification.RequestSpecification;

public class Baseclass {

	public void baseClass() {
		RequestSpecification request = RestAssured.given()
				  .baseUri("https://restful-booker.herokuapp.com")
				  .headers("Content-Type","application/json");
		
		
	}
	
}
