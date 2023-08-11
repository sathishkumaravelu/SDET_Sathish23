package mandatoryHomeWork.foundation.RedoDailyConnect;

import org.junit.Test;
import org.testng.Assert;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class restAssuredTraning {
	
	@Test
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
		Assert.assertEquals(200, response.statusCode());
	}
}
