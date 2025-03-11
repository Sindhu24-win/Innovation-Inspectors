package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;


public class StackSteps {
	WebDriver driver = new EdgeDriver();
    StackPage stackPage = new StackPage(driver);
	
    @Given("The user is signed in to dsAlgo Portal")
	public void the_user_is_signed_in_to_ds_algo_portal() {
	    driver.get("https://dsportalapp.herokuapp.com");
	}

	@Given("The user is on the Home page after signing in")
	public void the_user_is_on_the_home_page_after_signing_in() {
		 driver.get("https://dsportalapp.herokuapp.com/home");;
	}

	@When("The user clicks the {string} button in the Stack panel or selects Stack item from the dropdown menu")
	public void the_user_clicks_the_button_in_the_stack_panel_or_selects_stack_item_from_the_dropdown_menu(String string) {
		  System.out.println("\n I am here 2");
	}

	@Then("The user should be directed to the {string} Data Structure Page")
	public void the_user_should_be_directed_to_the_data_structure_page(String string) {
		  System.out.println("\n I am here 3");
	}

	@Given("The user is on the Stack page after signing in")
	public void the_user_is_on_the_stack_page_after_signing_in() {
		  System.out.println("\n I am here 4");
	}

	@When("The user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		  System.out.println("\n I am here 5");
	}
	@Then("The user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		  System.out.println("\n I am here 6");
	}

	@Given("The user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
		  System.out.println("\n I am here 7");
	}

	@When("The user clicks the {string} button in Stack in Python page")
	public void the_user_clicks_the_button_in_stack_in_python_page(String string) {
		  System.out.println("\n I am here 8");
	}

	@Then("The user should be redirected to a page with a Try Editor and a Run button to test")
	public void the_user_should_be_redirected_to_a_page_with_a_try_editor_and_a_run_button_to_test() {
		  System.out.println("\n I am here 9");
	}

	@Given("The user is in the Try Editor page")
	public void the_user_is_in_the_try_editor_page() {
		  System.out.println("\n I am here 10");
	}

	@When("The user clicks the Run button without entering code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_code_in_the_editor() {
		  System.out.println("\n I am here 11");
	}

	@Then("The user should see an error message in an alert window")
	public void the_user_should_see_an_error_message_in_an_alert_window() {
		  System.out.println("\n I am here 12");
	}

	@When("The user writes invalid code in the Editor and clicks the Run button")
	public void the_user_writes_invalid_code_in_the_editor_and_clicks_the_run_button() {
		  System.out.println("\n I am here 13");
	}

	@When("The user writes valid code in the Editor and clicks the Run button")
	public void the_user_writes_valid_code_in_the_editor_and_clicks_the_run_button() {
		  System.out.println("\n I am here 14");
	}

	@Then("The user should see output in the console")
	public void the_user_should_see_output_in_the_console() {
		  System.out.println("\n I am here 15");
	}

	@Then("The user should be able to see the expected content in the {string} page")
	public void the_user_should_be_able_to_see_the_expected_content_in_the_page(String string) {
		  System.out.println("\n I am here 16");
	}




}
