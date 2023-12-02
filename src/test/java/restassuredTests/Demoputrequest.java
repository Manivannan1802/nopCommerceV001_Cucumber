package restassuredTests;

import java.util.HashMap;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Demoputrequest {
	
	
	public static HashMap map=new HashMap();
	
	String empname=RestUtils.empName();
	String sal=RestUtils.empSal();
	int empid=12345;
	
	@BeforeClass
	public void putData() {
		
		map.put("name",RestUtils.getFirstName());
		map.put("job", RestUtils.getLastName());
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users/2";
		
		
	}
	@Test
	public void testPut() {
		
		given()
			.contentType("application/json")
			.body(map)
		.when()
			.put()
		.then()
		.statusCode(200)
		.log().all();	
			
	}
	

}
