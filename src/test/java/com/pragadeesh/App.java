package com.pragadeesh;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;

import java.io.File;

import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App 
{
	/*@Test
    public void getAllEmp()
    {
        RestAssured
        .given()
        .baseUri("http://localhost:3000")
        .queryParam("id", "2")
        .when().get("posts").prettyPrint();    
    } */
	@Test
	public void addEmp()
	{
		File jsonfile=new File("C:\\Users\\praga\\eclipse-workspace\\Rest_assured\\src\\test\\java\\com\\pragadeesh\\textPostData.json");
	    RestAssured.baseURI="http://localhost:3000";
	    given()
        .header("Content-Type", "application/json; charset=UTF-8")
        .body(jsonfile)
        .when().post("/posts").then().assertThat().statusCode(201).log().all();
	    
	}
		@Test
	    public void getAllEmp()
	    {
	        RestAssured
	        .given().log().all()
	        .baseUri("http://localhost:3000")
	        .queryParam("id", "4")
	        .when().get("posts").prettyPrint();    
	    }
}
