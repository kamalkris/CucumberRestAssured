package com.BookApi;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"D:\\Workspace\\CucumberRestAssured\\src\\test\\resources\\com\\BookApi\\GetBookDetails.feature"},
		glue= {"com.BookApi"},
		//dryRun=false,
		//monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report.json"
				
		}
		)

public class Runner1Test {

	
}

