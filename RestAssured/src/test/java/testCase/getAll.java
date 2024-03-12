package testCase;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class getAll {
	
	@Test
	public void getAllIncidents() {
		
		given()
			.baseUri("https://dev190914.service-now.com/api/now/table")
			.auth().basic("admin", "pN6^BvoX8*Kk")
			.accept("application/json")
			.log().all().
		when()
			.get("incident").
		then()
			.statusCode(200)
			.log().all();

	}

}
