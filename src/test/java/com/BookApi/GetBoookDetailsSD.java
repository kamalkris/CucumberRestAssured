package com.BookApi;

import java.util.List;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GetBoookDetailsSD {
	
Response response;
	
	@Given("hit the URI")
	public void hit_the_uri() {
	    // Write code here that turns the phrase above into concrete actions
	   response = RestAssured.get("https://demoqa.com/BookStore/v1/Books");
	   System.out.println("Got the response");
	}
	
	
	@Then("Validate the title {string} and pages {string} of application")
	public void validate_the_title_and_pages_of_application(String title, String pageNo) {
		String data =  response.getBody().asString();
		System.out.println("Response data :"+data);
		String actualTitle = response.getBody().jsonPath().getString("books[0].title");
		Assert.assertEquals(actualTitle, title);
		String actualPageNo = response.getBody().jsonPath().getString("books[0].pages");
		System.out.println(actualPageNo);
		Assert.assertEquals(actualPageNo, pageNo);
		System.out.println("passed");
	}
	
	
	@Then("Validate the isbn {string} from get book request")
	public void validate_the_isbn_from_get_book_request(String isbn) {
	    // Write code here that turns the phrase above into concrete actions
		String actualisbn = response.getBody().jsonPath().getString("books[0].isbn");
		Assert.assertEquals(actualisbn, isbn);
		System.out.println("Verified ISBN");
		
	}

	@Then("Validate the author {string} from get book request")
	public void validate_the_author_from_get_book_request(String author) {
	    // Write code here that turns the phrase above into concrete actions
		String actualauthor = response.getBody().jsonPath().getString("books[0].author");
		Assert.assertEquals(actualauthor, author);
		System.out.println("Verified author");
		
	}

	@Then("Validate the publisher {string} from get book request")
	public void validate_the_publisher_from_get_book_request(String publisher) {
	    // Write code here that turns the phrase above into concrete actions
		String actualpublisher = response.getBody().jsonPath().getString("books[0].publisher");
		Assert.assertEquals(actualpublisher, publisher);
		System.out.println("Verified publisher");
		
	}

	@Then("Validate the subTitle {string} from get book request")
	public void validate_the_sub_title_from_get_book_request(String subTitle) {
	    // Write code here that turns the phrase above into concrete actions
		String actualsubTitle = response.getBody().jsonPath().getString("books[0].subTitle");
		Assert.assertEquals(actualsubTitle, subTitle);
		System.out.println("Verified subTitle");
		
	}
	
	@Then("Validate the value for {string} is {string}")
	public void validate_the_value_for(String str1, String str2) {
	  	String actualsubTitle = response.getBody().jsonPath().getString(str1);
		Assert.assertEquals(actualsubTitle, str2);
		System.out.println("Verified subTitle");
		
	}

	@Then("validate value for attribute {string} is {string} present in response")
	public void validate_value_for_attribute_is_present_in_response(String str1, String expValue) {
		
		List<Object> allItem = response.getBody().jsonPath().getList("books."+str1);
		System.out.println("==="+allItem.toString());
		Assert.assertTrue(allItem.contains(expValue));
		
	}
	
	@Then("Validate the value for below data")
	public void Validate_the_value_for_below_data(DataTable dataTable) {
        List<List<String>> data = dataTable.asLists(String.class);

        for(int i = 0; i< data.size();i++) {
			String actualTitleString = response.getBody().jsonPath().getString( data.get(i).get(0));
			Assert.assertTrue(actualTitleString.equals(data.get(i).get(1)));
		}
		
		
		
	}
	

}


//isbn, author, publisher