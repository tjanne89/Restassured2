package restassuredtraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class QuearyParameter 
{

	
	/*@Test
	public void QueryParameter() 
	{
		RestAssured.baseURI="https://samples.openweathermap.org/data/2.5/";
		RequestSpecification request=RestAssured.given();
		
		Response response=request.queryParam("q", "London,Uk").
				queryParam("appiq","2b1fd2d7f77ccf1b7de9b441571b39b8")
				.get("/weather");
		String jsonString=response.asString();
		System.out.println(response.getStatusCode());
		
		Assert.assertEquals(jsonString.contains("London"),true);
		
		String responsebody=response.getBody().asString();
		System.out.println("ResponseBody IS:"+responsebody);

		
		
	}*/
	
	@Test
	public void queryParameter()
	{
					
	RestAssured.baseURI ="https://samples.openweathermap.org/data/2.5/"; 
	RequestSpecification request = RestAssured.given();
				
	Response response = request.queryParam("q", "London,UK") 
		 .queryParam("appid", "2b1fd2d7f77ccf1b7de9b441571b39b8") 
		 .get("/weather");
				
		String jsonString = response.asString();
		System.out.println(response.getStatusCode()); 
		Assert.assertEquals(jsonString.contains("London"), true);
				
		String responsebody=response.getBody().asString();
		System.out.println("Response body is:"+ responsebody);


	}

}
