package Rest_assured.Rest_assured;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {
	/*@Test
	public void getAllEmp() {
		RestAssured.baseURI = "http://localhost:3000";https://reqres.in/api/users
		RestAssured.when().get("/posts").prettyPrint();
	}*/
	@Test
	public void AddEmp() {
		File JsonFile =new File("C:\\Users\\praga\\eclipse-workspace\\Rest_assured\\PostData.json");
		RestAssured.
		baseURI = "https://reqres.in";
		given().body(JsonFile);
		when().post("/api/users").prettyPrint();
	}
}
