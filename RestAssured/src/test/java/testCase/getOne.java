package testCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

 

public class getOne {
	
	String baseUri;
	
	public getOne() {
		 baseUri = "https://dev190914.service-now.com/api/now/table";
		
	}
	

	
	@Test
	public void getOneIncident() {
		
		/*
		 01.ReadAllProducts
Http method=GET
EndPointUrl=https://techfios.com/api-prod/api/product/read.php
Header:
Content-Type=application/json; charset=UTF-8
AuthorizationType=Basic Auth 
username=demo@techfios.com
password=abc123
StatusCode=200

given: all input details(baseURI,Headers,Authorization,Payload/Body,QueryParameters)
when:  submit api requests(Http method,Endpoint/Resource)
then:  validate response(status code, Headers, responseTime, Payload/Body)
		 */
		Response response = 
				
		given()
			.baseUri(baseUri)
			//.headers("Content-Type", "application/json; charset=UTF-8")
			.auth().basic("admin", "pN6^BvoX8*Kk")
			.accept("application/json")
			.queryParam("sys_id", "1c741bd70b2322007518478d83673af3")
			.log().all().
		when()
			.get("incident").
			
		then()
		.extract().response();
		
		
		int statusCode = response.getStatusCode();
		System.out.println(statusCode);
		Assert.assertEquals(statusCode, 200);
		
		String responseBody = response.getBody().asString();
		System.out.println(responseBody);
		
		JsonPath jp = new JsonPath(responseBody);
		
	    String number = jp.get("result[0].number");
	    System.out.println(number);
		
		
		
		
		
		
	}

}
