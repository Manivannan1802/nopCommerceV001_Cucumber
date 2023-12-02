package restassuredTests;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class demoGetRequest {
	
	@Test
	public void getWeatherDetails() {
		given()
		
		.when()
			.get("https://reqres.in/api/user/1")
		.then()
			.statusCode(200)
			.statusLine("HTTP/1.1 200 OK")
			.assertThat().body("data.name", equalTo("cerulean"))
			.header("Content-Type","application/json; charset=utf-8")
			.log().all();
		
	
	}

}
