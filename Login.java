package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {

	@Given("The user is on the DS Algo Home Page")
	public void the_user_is_on_the_ds_algo_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user clicks the {string} link")
	public void the_user_clicks_the_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user should be redirected to the log in page")
	public void the_user_should_be_redirected_to_the_log_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks on the {string} link")
	public void the_user_clicks_on_the_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user should be redirected to the registration page")
	public void the_user_should_be_redirected_to_the_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user clicks the login button after leaving the {string} textbox and {string} textbox empty")
	public void the_user_clicks_the_login_button_after_leaving_the_textbox_and_textbox_empty(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The error message {string} appears below Username textbox during login")
	public void the_error_message_appears_below_username_textbox_during_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user clicks the login button after entering the {string} and leaves {string} textbox empty")
	public void the_user_clicks_the_login_button_after_entering_the_and_leaves_textbox_empty(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The error message {string} appears below Password textbox during login")
	public void the_error_message_appears_below_password_textbox_during_login(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user clicks the login button after entering the Password only")
	public void the_user_clicks_the_login_button_after_entering_the_password_only() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	  @Then("The error message {string} appears below Username textbox")
	    public void the_error_message_appears_below_username_textbox(String expectedErrorMessage) {
	       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	       // WebElement usernameError = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username-error"))); // Adjust locator
	  }

	@When("The user clicks the login button after entering an invalid username and valid password")
	public void the_user_clicks_the_login_button_after_entering_an_invalid_username_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user should see an error message {string}")
	public void the_user_should_see_an_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks the login button after entering valid username and valid password")
	public void the_user_clicks_the_login_button_after_entering_valid_username_and_valid_password() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user should land in Data Structure Home Page with message {string}")
	public void the_user_should_land_in_data_structure_home_page_with_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks {string} on home page")
	public void the_user_clicks_on_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user should be redirected to the home page with message {string}")
	public void the_user_should_be_redirected_to_the_home_page_with_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}


}
