package restassuredtraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest_allheaders
{
	@Test
	public void getweatherdeatails()
	{
		//Specify base url
		RestAssured.baseURI="http://restapi.demoqa.com/utilities/weather/city";
		
		RequestSpecification httprequest=RestAssured.given();
		Response response =httprequest.request(Method.GET,"/Hyderabad");
		
		String responsebody=response.getBody().asString();
		System.out.println("Response body is:"+ responsebody);
		
       Headers allheaders = response.headers();
       
       for (Header header:allheaders)
       {
    	   System.out.println(header.getName()+"    :    " + header.getValue());
    	   
    	   
       }
	}

}
