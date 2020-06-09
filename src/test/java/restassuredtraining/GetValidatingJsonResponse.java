package restassuredtraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetValidatingJsonResponse
{
@Test
public void getweatherdetails() 
	{
	
	RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	
	RequestSpecification httpsrequest=RestAssured.given();
	Response response=httpsrequest.request(Method.GET,"/Delhi");
	
	String responsebody=response.getBody().asString();
	System.out.println("Response Body is:"+ responsebody);
	
	Assert.assertEquals(responsebody.contains("Delhi"), true);
	}

}
