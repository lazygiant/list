import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;

public class Execution {

	@Test
	public void execute()
	{
		String file = "{ \"company\": \r\n"
				+ "               {\r\n"
				+ "\r\n"
				+ "   		\"employee\": [\r\n"
				+ "\r\n"
				+ "			     { \r\n"
				+ "				 \"id\": 1,\r\n"
				+ "\r\n"
				+ "  				 \"name\": \"TechGeekNextUser1\",\r\n"
				+ "\r\n"
				+ "   				 \"role\": \"Admin\"\r\n"
				+ "\r\n"
				+ " 			    },\r\n"
				+ "\r\n"
				+ "			    {\r\n"
				+ "				 \"id\": 2,\r\n"
				+ "\r\n"
				+ "   				 \"name\": \"TechGeekNextUser2\",\r\n"
				+ "\r\n"
				+ "   				 \"role\": \"User\"\r\n"
				+ "\r\n"
				+ "			    },\r\n"
				+ "\r\n"
				+ "			    { \r\n"
				+ "				\"id\": 3,\r\n"
				+ "\r\n"
				+ "   				\"name\": \"TechGeekNextUser3\",\r\n"
				+ "\r\n"
				+ "  			        \"role\": \"User\"\r\n"
				+ "\r\n"
				+ "			    }\r\n"
				+ "\r\n"
				+ "  			    ]\r\n"
				+ "\r\n"
				+ " 		 }\r\n"
				+ "\r\n"
				+ " }";
		
		Response resp = given()
				
		  .contentType(ContentType.JSON)
		  .body(file)
		.when().get("/all");
		 
		JsonPath json =resp.jsonPath();
		
		List<String> Id = json.get("company.employee.id");
		
		System.out.println(Id);
		
		
		
		
		/*
		 * Response resp = given().request(Method.GET,"/all");
		 * 
		 * 
		 * JsonPath json =resp.jsonPath();
		 * 
		 * List<String> empID= json.get("company.employee.id");
		 * 
		 * System.out.println(empID);
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
