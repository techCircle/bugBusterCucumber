package stepDefinitions;

import Utilities.BaseClass;
import Utilities.commonMethods;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginStepDef extends commonMethods{
	
	@When("the user enters the correct username and password")
	public void the_user_enters_the_correct_username_and_password() {
		commonMethods.sendKeys(BaseClass.getProperty("Username"), lp.usernameField);
		commonMethods.sendKeys(BaseClass.getProperty("Password"), lp.passwordField);		
	}

	@When("the user clicks on the login button")
	public void the_user_clicks_on_the_login_button() {
		commonMethods.click(lp.loginButton);
	}

	@Then("the user is redirected to the homepage")
	public void the_user_is_redirected_to_the_homepage() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("a welcome message is displayed")
	public void a_welcome_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	
	@When("the user enters an incorrect username or password")
	public void the_user_enters_an_incorrect_username_or_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("an error message is displayed")
	public void an_error_message_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
