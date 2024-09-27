package com.demo;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class GraphQL_Execution {

	@Test
	public void execute()
	{
		String s ="{ getAllProjects{ projectId status } }";
		
		given()
		 .contentType(ContentType.JSON)
		 .body(s)
		.when()
		 .post("http://49.249.28.218:8091/getAll")
		 .then().log().all();
		
	}
}
