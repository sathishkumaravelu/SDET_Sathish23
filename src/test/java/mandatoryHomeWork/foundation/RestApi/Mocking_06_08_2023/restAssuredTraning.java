package mandatoryHomeWork.foundation.RestApi.Mocking_06_08_2023;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class restAssuredTraning {
	
	@org.testng.annotations.Test
	public void createBooking() {
		
			
		Response response = RestAssured.given()
		.baseUri("https://restful-booker.herokuapp.com/")
		.basePath("booking/")
		.contentType(ContentType.JSON)
		.body("{\r\n"
				+ "    \"firstname\": \"Sathish\",\r\n"
				+ "    \"lastname\": \"kumaravelu\",\r\n"
				+ "    \"totalprice\": 101,\r\n"
				+ "    \"depositpaid\": true,\r\n"
				+ "    \"bookingdates\": {\r\n"
				+ "        \"checkin\": \"2023-08-09\",\r\n"
				+ "        \"checkout\": \"2023-08-09\"\r\n"
				+ "    },\r\n"
				+ "    \"additionalneeds\": \"Breakfast\"\r\n"
				+ "}")
		.log().everything()
		.post();
		
		response.prettyPrint();
		System.out.println(response.statusCode());
		response.then().assertThat().statusCode(200);
		//Assert.assertEquals(200, response.statusCode());
	}
}
