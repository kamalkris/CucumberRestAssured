package com.BookApiPost;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"D:\\Workspace\\CucumberRestAssured\\src\\test\\resources\\com\\BookApiPostCall\\PostBookDetails.feature"},
		glue= {"com.BookApiPost"},
		//dryRun=false,
		//monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report.json"
				
		}
		)

public class Runner1Test {

	
}

