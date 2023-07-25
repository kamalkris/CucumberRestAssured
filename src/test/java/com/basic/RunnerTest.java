package com.basic;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"/Users/kamakris/Documents/Eclipse_Projects/CucumberRestAssured/src/test/resources/com/basics/Hrms.feature"},
		glue= {"com.basic"},
		//dryRun=false,
		//monochrome=true,
		plugin= {"pretty",
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json"
				
		}
		)

public class RunnerTest {

	
}
