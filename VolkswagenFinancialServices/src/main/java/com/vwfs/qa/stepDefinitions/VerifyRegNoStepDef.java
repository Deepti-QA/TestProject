package com.vwfs.qa.stepDefinitions;

import com.vwfs.qa.pages.VehicleCheckPage;
import com.vwfs.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;


public class VerifyRegNoStepDef extends TestBase{

	VehicleCheckPage vehiclecheckpage;
	
	
	public VerifyRegNoStepDef() {
		vehiclecheckpage = new VehicleCheckPage();
	}
	


@Given("^the user launches the browser$")
public void the_user_launches_the_browser() throws Exception {
    
		initialization();
}

@Given("^User is on Dealer Portal page$")
public void user_is_on_Dealer_Portal_page() throws Exception {
	Assert.assertTrue("Page title is incorrect", vehiclecheckpage.getPageTitle().equalsIgnoreCase("Dealer Portal"));
}


 

@When("^user enters the vehicle reg number as \"([^\"]*)\"$")
public void user_enters_the_vehicle_reg_number_as(String regNumber) throws Throwable {
	vehiclecheckpage.enterRegNumber(regNumber);

	
}

@Then("^user should be able to see \"([^\"]*)\"$")
public void user_should_be_able_to_see(String expResult) throws Exception {
	
	Assert.assertTrue("Result is not as expected", vehiclecheckpage.validateResult(expResult));
}

	
@Then("^close browser$")
public void close_browser() throws Exception {
    driver.quit();
}
	
	
	
	
}
