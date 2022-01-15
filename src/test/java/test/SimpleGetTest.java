package test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimpleGetTest {

	
	@Test
	public void GetWeatherDetails() {
		RestAssured.baseURI="http://192.168.3.163:8000";
		RequestSpecification httpRequest = RestAssured.given();
		Response response = httpRequest.request(Method.GET, "/game/2");
		String responseBody = response.getBody().asString();
		String statusLine = response.getStatusLine();
	//	Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");
		
		System.out.println("Response Body is =>  " + responseBody);
		System.out.println("statusline =>  " + statusLine);
	}
	//
	//test
	
	//test
}
