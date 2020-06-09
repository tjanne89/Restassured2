package restassuredtraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class GetWeatherDetailsJason
{
	
	@Test
	public void getweatherdetails() 
		{
	RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
	
	RequestSpecification httpsrequest=RestAssured.given();
	Response response=httpsrequest.request(Method.GET,"/Delhi");
	
	String responsebody=response.getBody().asString();
	System.out.println("Response Body is:"+ responsebody);
	
	JsonPath jasonpath=response.jsonPath();
	System.out.println(jasonpath.get("City"));
	System.out.println(jasonpath.get("Temperature"));
	System.out.println(jasonpath.get("Humidity"));
	System.out.println(jasonpath.get("WindSpeed"));
	System.out.println(jasonpath.get("WeatherDescription"));
	
	System.out.println(jasonpath.get("WeatherDirectionDegree"));
	
	Assert.assertEquals(jasonpath.get("Temperature"), "33.42 Degree celsius");
	
		}

}
