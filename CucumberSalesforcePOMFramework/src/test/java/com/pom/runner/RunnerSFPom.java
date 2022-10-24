package com.pom.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(plugin = { "pretty", "html:target/cucumber-reports/cucumber.html","json:target/cucumber-reports/cucumber.json" },
		features={"src/test/resources/SalesforcePomFeature.feature"},
		glue= {"com.salesforcepom.steps"}
		)
		
		
		

public class RunnerSFPom extends AbstractTestNGCucumberTests {

}
