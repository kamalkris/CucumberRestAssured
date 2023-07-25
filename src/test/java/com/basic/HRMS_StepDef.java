package com.basic;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HRMS_StepDef {
	
	@Given("Login with admin user")
	public void login_with_admin_user() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Login with admin user");
	    
	}

	@When("Go to PIM Tab")
	public void go_to_pim_tab() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Go to PIM Tab");
	   
	}

	@Then("validate user gettting searched")
	public void validate_user_gettting_searched() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate user gettting searched");
	 
	}

	@Then("validate user not gettting searched")
	public void validate_user_not_gettting_searched() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("validate user not gettting searched");
	   
	}

}
