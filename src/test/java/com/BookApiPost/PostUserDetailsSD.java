package com.BookApiPost;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PostUserDetailsSD {
	
Response response;
	
@Given("post the data to create user")
public void post_the_data_to_create_user() {
	response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	System.out.println("Got the response");

}

@Then("validate status code is {int}")
public void validate_status_code_is(Integer int1) {
   
}

@Then("validate id created for user with non null value")
public void validate_id_created_for_user_with_non_null_value() {
   
}

@Then("validate id created for user with non zero value")
public void validate_id_created_for_user_with_non_zero_value() {

}
	

}


//isbn, author, publisher