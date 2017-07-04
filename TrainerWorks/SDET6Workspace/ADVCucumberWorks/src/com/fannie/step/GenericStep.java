package com.fannie.step;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class GenericStep {

	// if you have @Before from cucumber then they are called global hooks 
	
	@Before
	public void userHasToRegister(){
		System.out.println("%%%%%User has to register%%%%%");
	}
	
	@After
	public void logout(){
		System.out.println("^^^^^^^Make sure you log out^^^^^^^^");
	}
}