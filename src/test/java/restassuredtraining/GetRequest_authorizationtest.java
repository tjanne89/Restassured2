package restassuredtraining;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest_authorizationtest
{

		@Test
		public void getweatherdeatails()
		{
			//Specify base url
			RestAssured.baseURI="http://restapi.demoqa.com/authentication/CheckforAuthentication";
			
			PreemptiveBasicAuthScheme authscheme=new PreemptiveBasicAuthScheme();
			authscheme.setUserName("ToolsQA");
			authscheme.setUserName("TestPassword");
			
			RestAssured.authentication=authscheme;
			
		    //request object
			RequestSpecification httprequest=RestAssured.given();
			//response object
			Response response =httprequest.request(Method.GET,"/");
			
			String responsebody=response.getBody().asString();
			System.out.println("Response body is:"+ responsebody);

		}
	
}
