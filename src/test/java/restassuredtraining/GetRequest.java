package restassuredtraining;


	import org.testng.Assert;
	import org.testng.annotations.Test;

	import io.restassured.RestAssured;
	import io.restassured.http.Method;
	import io.restassured.response.Response;
	import io.restassured.specification.RequestSpecification;

	public class GetRequest
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
			
			int statuscode=response.getStatusCode();
			System.out.println("the status code is" + statuscode);
			Assert.assertEquals(statuscode, 200);
			
			String statusline=response.statusLine();
			System.out.println("status line is" + statusline);
			
			
			
		}
	}

