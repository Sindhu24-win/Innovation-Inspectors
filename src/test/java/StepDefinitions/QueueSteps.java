package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;

public class QueueSteps {
	WebDriver driver = new EdgeDriver();
    QueuePage queuePage = new QueuePage(driver);

	@Given("the user is signed in to the dsAlgo Portal")
	public void the_user_is_signed_in_to_the_ds_algo_portal() {
	    System.out.println("queue");
	}

	@Given("the user is on the Home page after signing in")
	public void the_user_is_on_the_home_page_after_signing_in() {
		System.out.println("queue 1");
	}

	@When("the user clicks the {string} button in the Queue Panel or the user selects Queue from the dropdown menu")
	public void the_user_clicks_the_button_in_the_queue_panel_or_the_user_selects_queue_from_the_dropdown_menu(String string) {
		System.out.println("queue 2");
	}

	@Then("the user should be directed to the {string} Data Structure Page")
	public void the_user_should_be_directed_to_the_data_structure_page(String string) {
		System.out.println("queue 3");
	}

	@Given("the user is on the Queue page after signing in")
	public void the_user_is_on_the_queue_page_after_signing_in() {
		System.out.println("queue 4");
	}

	@When("the user clicks the {string} button")
	public void the_user_clicks_the_button(String string) {
		System.out.println("queue 5");
	}

	@Then("the user should be redirected to the {string} page")
	public void the_user_should_be_redirected_to_the_page(String string) {
		System.out.println("queue 6");
	}

	@Given("the user is on the {string} page")
	public void the_user_is_on_the_page(String string) {
		System.out.println("queue 7");
	}

	@Then("the user should be redirected to a page with a try Editor and a Run button to test the code")
	public void the_user_should_be_redirected_to_a_page_with_a_try_editor_and_a_run_button_to_test_the_code() {
		System.out.println("queue 8");
	}

	@Given("the user is on the tryEditor page for {string}")
	public void the_user_is_on_the_try_editor_page_for(String string) {
		System.out.println("queue 9");
	}

	@When("the user clicks the Run Button without entering any code")
	public void the_user_clicks_the_run_button_without_entering_any_code() {
		System.out.println("queue 10");
	}

	@Then("the user should see an error message in an alert window")
	public void the_user_should_see_an_error_message_in_an_alert_window() {
		System.out.println("queue 11");
	}

	@When("the user writes invalid code and clicks the Run Button")
	public void the_user_writes_invalid_code_and_clicks_the_run_button() {
		System.out.println("queue 12");
	}

	@When("the user writes valid code and clicks the Run Button")
	public void the_user_writes_valid_code_and_clicks_the_run_button() {
		System.out.println("queue 13");
	}

	@Then("the user should see output in the console")
	public void the_user_should_see_output_in_the_console() {
		System.out.println("queue 14");
	}





}
