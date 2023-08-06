package mandatoryHomeWork.foundation.RestApi.Mocking_06_08_2023;

import org.testng.annotations.Test;

import com.github.tomakehurst.wiremock.client.WireMock;

public class CreateStub {

	@Test
	public void create() {
		
		WireMock.stubFor(WireMock.post("/api/now/table/incident")
				.willReturn(WireMock.aResponse()
						.withStatus(201)
						.withBody("{\"short_description\":\"Created by sathish in stub testing\"}")));
		
	}
}
