package com.basic.MyGoogleRestAssured;



import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BasicOfRestAssure {
	
	@Test
	public void TestGoogle(){
		
		Response res = RestAssured.get("https://google.com");
		int actualStateCode = res.getStatusCode();
		System.out.println("actualStateCode ="+actualStateCode);
		Assert.assertTrue(200==actualStateCode);
			
	}
	
	@Test
	public void TestF1(){
		
		Response res = RestAssured.get("http://ergast.com/api/f1/2017/circuits.json");
		int actualStateCode = res.getStatusCode();
		System.out.println("actualStateCode ="+actualStateCode);
		
		Assert.assertTrue(200==actualStateCode);
		
		String actualData =res.getBody().asString();
		System.out.println("Data =  "+actualData);
		
		
		
		
	}
	

}
