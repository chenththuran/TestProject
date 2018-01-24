package stepdefinition;

import cucumber.api.java.en.*;

public class OutLineTest {
	
	
	@Given("^user navigates to Facebook$")
	public void user_navigates_to_Facebook() throws Exception {
	    System.out.println("user is on facebook home");
	   
	}

	@When("^I enter Username as \"([^\"]*)\" and Password as \"([^\"]*)\"$")
	public void i_enter_Username_as_and_Password_as(String arg1, String arg2) throws Exception {
	    System.out.println("First argument set is :"+ arg1 + "  "+ arg2);
	   
	}

	@Then("^login should be unsuccessful$")
	public void login_should_be_unsuccessful() throws Exception {
	    System.out.println("user logged out successfully");
	    
	}

}
