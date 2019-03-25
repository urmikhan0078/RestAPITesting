package com.test.RestAPITesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RestWebserviceTest {

//GET on /comments endpoint 
	@Test
	public void GetendpointDetails()
	 {   
	 // Specify the base URL to the RESTful web service
	 RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
	 
	 RequestSpecification httpRequest = RestAssured.given();
	 
	// will assert the response code and will assert that number of comments is greater than 0 
	 Response response = httpRequest.get("/ Jayne_Kuhic@sydney.com");
	 int statusCode = response.getStatusCode();
	 Assert.assertEquals(statusCode , 200 , "number of comments is greater than 0 ");
	// assert that body has comment with email: "Jayne_Kuhic@sydney.com" 
	 ResponseBody bodybd = response.getBody();
	 String bodyAsString = bodybd.asString();
	 Assert.assertEquals(bodyAsString.contains("Jayne_Kuhic@sydney.com"), true, "Response body contains Jayne_Kuhic@sydney.com ");
}
}