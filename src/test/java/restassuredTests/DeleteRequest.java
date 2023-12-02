package restassuredTests;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class DeleteRequest {
	
	@Test
	public void deleteEmpRecord() {
		
		RestAssured.baseURI="https://reqres.in";
		RestAssured.basePath="/api/users/2";
		Response response=
		given()
		
		.when()
			.delete()
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.log().all()
			.extract().response();
		
		
		String jsonAsString=response.asString();
		Assert.assertEquals(jsonAsString.contains("Successfully! deleted Records"),true);
		
		
		
	
	}

}
