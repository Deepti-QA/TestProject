package com.vwfs.qa.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\SELENIUM\\Selenium practice\\VolkswagenFinancialServices\\src\\main\\java\\com\\vwfs\\qa\\features\\VerifyRegNo.feature",
                 glue= {"com.vwfs.qa.stepDefinitions"},
                 tags= {"@AcceptanceCriteriaTest"},
                 format= {"pretty","html:target/test_output"},
                 monochrome=true,
                 strict=true,
                 dryRun=true
)
public class TestRunner {
	
	

}
