package restassuredTests;

import java.util.HashMap;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.RestAssured;

public class DemoPostRequest {
	
	public static HashMap map=new HashMap();
	
	@BeforeClass
	public void postData() {
		
		map.put("name",RestUtils.name());
		map.put("job", RestUtils.getLastName());
		
		//RestAssured.baseURI="https://reqres.in";
		//RestAssured.basePath="/api/users";
		
	}
	@Test
	public void testPost() {
		
		
		given()
			.contentType("application/json")
			.body(map)
			
		.when()
			.post("https://reqres.in/api/users")
			
		.then()
		
			.statusCode(201)
			.log().all();
			
			
		
		
		
	}

}
