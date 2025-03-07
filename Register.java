package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {

	@Given("The user is in the home page")
	public void the_user_is_in_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("hi");
	   
	}

	@When("The user clicks {string} link on the Home page")
	public void the_user_clicks_link_on_the_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The user should be redirected to Register form")
	public void the_user_should_be_redirected_to_register_form() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user clicks Register button with all fields empty")
	public void the_user_clicks_register_button_with_all_fields_empty() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The error {string} appears below Username textbox during registration")
	public void the_error_appears_below_username_textbox_during_registration(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user clicks Register button after entering Username with other fields empty")
	public void the_user_clicks_register_button_after_entering_username_with_other_fields_empty() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The error message {string} appears below Password textbox during registration")
	public void the_error_message_appears_below_password_textbox_during_registration(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Given("The user is on the registration page")
	public void the_user_is_on_the_registration_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user enters a username longer than {int} characters")
	public void the_user_enters_a_username_longer_than_characters(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("An error message should be displayed stating {string}")
	public void an_error_message_should_be_displayed_stating(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user clicks Register button after entering Password and Password Confirmation with Username fields empty")
	public void the_user_clicks_register_button_after_entering_password_and_password_confirmation_with_username_fields_empty() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The error message {string} appears below Password Confirmation textbox")
	public void the_error_message_appears_below_password_confirmation_textbox(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi"); 
	}

	@When("The user clicks Register button after entering a username with spacebar characters other than digits and @\\/.\\/+\\/-\\/_")
	public void the_user_clicks_register_button_after_entering_a_username_with_spacebar_characters_other_than_digits_and() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}
	@Then("^An error message should be displayed stating \"Username can only contain letters, digits, and @/./+/-/_.\"$")
	public void verify_invalid_username_error_message() {
	   // WebElement errorMessage = driver.findElement(By.id("username-error")); // Replace with actual ID
	    //Assert.assertEquals("Username can only contain letters, digits, and @/./+/-/_.", errorMessage.getText());
	}
	@When("The user clicks Register button after entering a password with numeric data")
	public void the_user_clicks_register_button_after_entering_a_password_with_numeric_data() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user enters a password that is commonly used")
	public void the_user_enters_a_password_that_is_commonly_used() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user clicks {string} button after entering different passwords in Password and Password Confirmation fields")
	public void the_user_clicks_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The user should be able to see a password warning message {string}")
	public void the_user_should_be_able_to_see_a_password_warning_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user clicks Register button after entering a valid username, password, and password confirmation in related textboxes")
	public void the_user_clicks_register_button_after_entering_a_valid_username_password_and_password_confirmation_in_related_textboxes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The user should be redirected to Home Page of DS Algo with message {string}")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@When("The user clicks on the {string} link on registration page")
	public void the_user_clicks_on_the_link_on_registration_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi");
	}

	@Then("The user should be redirected to the login page")
	public void the_user_should_be_redirected_to_the_login_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("hi"); 
	}



}
