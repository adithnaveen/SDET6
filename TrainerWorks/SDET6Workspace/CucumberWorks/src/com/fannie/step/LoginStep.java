package com.fannie.step;

import java.util.List;
import java.util.Map;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {

	@Given("^Browser is open$")
	public void browser_is_open() throws Throwable {
		System.out.println("launching the browser......");
	}

	@When("^user name and password is entered$")
	public void user_name_and_password_is_entered(DataTable dataTable) 
				throws Throwable {
		System.out.println("username and password goes here... ");
		
		List<Map<String, String>> dataList = dataTable.asMaps
				(String.class, String.class);
		System.out.println("-------------------------------------------");
		for(Map<String, String> temp : dataList){
		System.out.println("User Name " + temp.get("username"));
		System.out.println("Password " + temp.get("password"));
		System.out.println("Designation  " + temp.get("designation"));
		}
		System.out.println("-------------------------------------------");
		
	}

	@When("^click on submit$")
	public void click_on_submit() throws Throwable {
		System.out.println("submit the form..... ");
	}

	@Then("^Validate the user details$")
	public void validate_the_user_details() throws Throwable {
		System.out.println("Validation code goes here.... ");
	}

}
