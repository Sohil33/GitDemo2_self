import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;

import org.hamcrest.MatcherAssert.*;

import file.payload;

@SuppressWarnings("unused")
public class Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Validate if Add place API is working as expected
// Rest Assured works with 3 methods
		//Given - all inputs details
		//When - Submit the API --resource and http method
		//Then - Validate the response
		/*
		 * RestAssured.baseURI= "https://rahulshettyacademy.com";
		 * given().log().all().queryParam("key","qaclick123").header("Content-Type",
		 * "application/json")
		 * .body(payload.AddPlace()).when().post("maps/api/place/add/json").then().log()
		 * .all().assertThat().statusCode(200) .body("scope",
		 * equals("APP")).header("server", "Apache/2.4.18 (Ubuntu)");
		 */
		
		System.out.println("Solution 1");
		System.out.println("Solution 2");
		System.out.println("Solution 3");
		System.out.println("Solution 4");
		

	}

	
	

}
