package com.fannie.tests;



import static com.jayway.restassured.RestAssured.given;
import static com.jayway.restassured.RestAssured.when;


import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.empty;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.fannie.beans.Message;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.http.ContentType;


import static org.junit.Assert.*;

import org.junit.Test;

public class MessageTest {

	// the init section 
		// this is executed only once and before all method could be 
		// executed 
		@BeforeClass
		public static void init(){
			String url ="http://localhost:9090/RestFullWorks/resources";
			RestAssured.baseURI =url;
		}
		@Test
		public void getMessageNegative(){
			when()
				.get("/message")
				.then()
				.statusCode(200)
					.body("", is(empty()));
		}
	
		@Test
		public void getMessageWithIdTest(){
			int id =102;
			/*
			 *  {
				    "messageId": 102,
				    "msg": "Hello There.... this is for testing for update",
				    "author": "Kanchan"
	  			}
			 */
			given().
					pathParam("messageId", id)
			.when().
					get("/message/{messageId}").
			then()
				.statusCode(200)
				.body("messageId", is(id))
				.body("msg", is("Hello There...."))
				.body("author", is("Kanchan"));
				
				
		}
	
		
		@Test
		public void postMessageTest(){
			Message message = new Message();
			message.setMessageId(103);
			message.setMsg("Test From RA");
			message.setAuthor("RA");
			
			given().
				contentType(ContentType.JSON)
				.body(message)
			.when()
				.post("/message")
			.then()
				.statusCode(200)
				.body("messageId", is(message.getMessageId()))
				.body("msg", is(message.getMsg()))
				.body("author", is(message.getAuthor()));
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	@Ignore
	@Test
		public void googleTest() {
			given().
			// there can be conditions 
				when()
			// there can be conditions 
				.get("http://google.com").then().statusCode(200);
		
		}

}
