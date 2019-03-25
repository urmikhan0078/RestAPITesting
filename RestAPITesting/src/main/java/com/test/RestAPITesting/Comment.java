package com.test.RestAPITesting;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Comment {
	
	
	private String email;
@Test
	public void JsonArrayToArray()
	{
	 //** Write POJO class named 'Comment' that will represent the call from the previous exercise.

//Retrieve the comments from endpoint /comments and deserialize response into the collection of objects 'Comment'**//
	 RestAssured.baseURI = "https://jsonplaceholder.typicode.com/";
	 RequestSpecification request = RestAssured.given();
	 
	 Response response = request.get();
	 System.out.println("Response Body -> " + response.body().asString());
	 
	 
	 Comment[] comments = response.jsonPath().getObject("comment",Comment[].class );
	 
	 for(Comment comment : comments)
	 {
	 System.out.println("Email " + comment.email);
	 }
	 

	}

}
