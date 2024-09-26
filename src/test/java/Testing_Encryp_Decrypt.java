import java.util.Base64;
import java.util.List;

import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import com.jayway.jsonpath.*;
import static io.restassured.RestAssured.*;

public class Testing_Encryp_Decrypt {

	public static void main(String[] args) throws Exception
	{
		
		Response resp = given()
		.contentType(ContentType.JSON).when().post();
		
		List<String> list = resp.jsonPath().getList("content[*].name");
		System.out.println(list+" "+list.get(2));
		
		//List<String> list1 = com.jayway.jsonpath.JsonPath.read("content[*].id");
		
		
		
		String pass = "abc@1212gmail.com";
		
		byte[] encrypt = Base64.getEncoder().encode(pass.getBytes());
		
		System.out.println("Encryption is:-> "+new String(encrypt));
		
		byte[] decrypt = Base64.getDecoder().decode(encrypt);
		
		System.out.println("Decryption is:-> "+ new String(decrypt));
		
		
	}
}
