package restassuredTests;

/*
1)Test code
2)log response
3)verifying single content in the body
4)verifying multiple content in the body
5)Setting parameter and headers  */

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicValidationsJson {
	
	
	//1)Test code
	@Test(priority=1)
	public void testCode() {
		
//		RestAssured.baseURI="https://reqres.in";
//		RestAssured.basePath="/api/users/1";
		
		given()
		.when()
			.get("https://reqres.in/api/user/1")
		.then()
		.statusCode(200)
		
		.log().all();
				
		
	}
	
	//logresponse
	@Test(priority=2)
	public void testLogin() {
		
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.log().all();
			
	}
	
	//3)verifying single content in the body
	
	@Test(priority=3)	
	public void testSingleContent() {
		
		given()
		.when()
		
		
			.get("https://reqres.in/api/users/2")
		.then()
			.statusCode(200)
			.log().all()
			.body("data.email",equalTo("janet.weaver@reqres.in"));	   //.body("data.email",equalTo(""));  XML 
			
	}
	
	@Test(priority=4)	
	public void testMultipleContent() {
		
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.log().all()
			.body("data.first_name",hasItems("Michael","Tobias","Byron","George"));		//.body("data.text()",equalTo("Michael","Tobias","Byron","George"));  XML 
		
			
	}
	
	//5)Setting parameter and headers
	@Test(priority=5)	
public void settingParameter() {
		
		given()
		.when()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.log().all()
			.body("data.first_name",hasItems("Michael","Tobias","Byron","George"));		
			
	}

	
	
	

}
