package mandatoryHomeWork.foundation.RestApi.Mocking_06_08_2023;

import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.client.WireMock;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class MockRecording {

	@Test
	public void record() {	
		/*
		 * RestAssured.baseURI = "http://lo/api/now/table/"; RestAssured.authentication
		 * = RestAssured.basic("admin", "d-J+lC2Hk7Aj"); RequestSpecification req =
		 * RestAssured.given().queryParam("sysparm_fields", "short_description");
		 * 
		 * req.get("incident").prettyPrint();
		 */
		
		RestAssured.baseURI="http://localhost/api/now/table";
		//RestAssured.authentication=RestAssured.basic("admin","d-J+lC2Hk7Aj");
		RequestSpecification inputRequest = RestAssured.given()
	    .queryParam("sysparm_fields", "sys_id,urgency,short_description,number");
		 Response response = inputRequest.get("/incident");
		 response.prettyPrint();
		
	}
}
