import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class SimplePostRequest {

	private static String requestBody = "{\n" +
            "  \"name\": \"Test\",\n" +
            "  \"price\": \"20\",\n" +
            "  \"rate\": \"3\" \n}";
	
	@Test
	public void GetWeatherDetails() {
		RestAssured.baseURI="http://192.168.3.163:8000";
		RequestSpecification httpRequest = RestAssured.given().header("Content-type", "application/json").body(requestBody);
		Response response = httpRequest.request(Method.POST, "/game");
	//	response.body(requestBody);
		//String responseBody = response.getBody().asString();
		String statusLine = response.getStatusLine();
	//	Assert.assertEquals(statusLine /*actual value*/, "HTTP/1.1 200 OK" /*expected value*/, "Correct status code returned");
		
		//System.out.println("Response Body is =>  " + responseBody);
		System.out.println("statusline =>  " + statusLine);
	}
}
