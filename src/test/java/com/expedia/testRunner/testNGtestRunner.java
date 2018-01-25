package com.expedia.testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class testNGtestRunner {
	
	@CucumberOptions(
	        features = "Features",
	        glue="com.expedia.stepdef",
	        tags = {"@FlightSearch"}
	    
	        
	  
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
