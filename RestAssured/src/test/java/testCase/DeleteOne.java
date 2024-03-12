package testCase;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class DeleteOne {
	

	String baseUri;
	HashMap<String,String> deleteIncident;
	String fileName;
	String username;
	String password;
	String incidentId;
	
	
	public DeleteOne() {
		baseUri = "https://dev182000.service-now.com/api/now/table";
		deleteIncident = new HashMap<String,String>();
		fileName = "src\\main\\java\\Update.json";
		username = "admin";
		password = "@2@rEJsyJNf8";
}
	
	public Map<String,String> deleteIncidentMap(){
		
		deleteIncident.put("sys_id", "3416a1869752011045a6732e6253af18");
		return deleteIncident;
	}
	
	@Test (priority =1)
	public void deleteOneIncident() {
		
		Response response =

				given().baseUri(baseUri)

						.auth().basic(username, password).header("Content-Type", "application/json")
						.queryParams(deleteIncidentMap()).
				when()
						.delete("incident").

			    then()
			    		.extract().response();

		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 204);

		String responseBody = response.getBody().asString();
		System.out.println("Response Body:" + responseBody);

		JsonPath jp = new JsonPath(responseBody);
		String incidentMessage = jp.get("message");
		Assert.assertEquals(incidentMessage, "Incident is updated", "Priority and Category updated!");
	
	}
		
	 @Test (priority = 2)
	    public void getOneIncident() {
			
	        Response response = 
					
			given()
				.baseUri(baseUri)
				.auth().basic(username, password)
				.accept("application/json")
				.queryParam("sys_id", incidentId).
				
			when()
				.get("incident").
				
			then()
			.extract().response();
			
			
			int statusCode = response.getStatusCode();
			System.out.println(statusCode);
			Assert.assertEquals(statusCode, 404);
			
			String responseBody = response.getBody().asString();
			System.out.println(responseBody);
			
			JsonPath jp = new JsonPath(responseBody);
			
		    String number = jp.get("result[0].number");
		    System.out.println(number);
		    
		    String priority = jp.get("result[0].priority");
		    System.out.println(priority);
		    
		    String desc = jp.get("result[0].short_description");
		    System.out.println(desc);

		}

}
