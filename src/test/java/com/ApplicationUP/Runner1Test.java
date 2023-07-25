package com.ApplicationUP;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/Users/kamakris/Documents/Eclipse_Projects/CucumberRestAssured/src/test/resources/com/ApplicationUP/ValidateApplicationUP.feature"},
		glue= {"com.ApplicationUP"},
		//dryRun=false,
		//monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport.html",
				"json:target/cucumber-report.json"
				
		}
		)

public class Runner1Test {

	
}
