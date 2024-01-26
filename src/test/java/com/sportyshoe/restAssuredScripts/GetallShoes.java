package com.sportyshoe.restAssuredScripts;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class GetallShoes {
	@Test(priority='1') public void get_all_shoes() {

		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-shoes")
		.when()
		.get()
		 
		.then()
		.statusCode(200)
		.log().all();
		}
		@Test(priority='2')
		public void get_all_users() {

		RestAssured.given()
		.baseUri("http://localhost:9010")
		.basePath("/get-users")
		.when()
		.get()
		.then()
		.statusCode(200)
		.log().all();
		}

		


}
