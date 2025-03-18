package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pageObjects.Arraypage;
import utilities.ConfigReader;

public class ArraySteps {

	WebDriver driver;

	Arraypage arraypage;
	String username = ConfigReader.getUsername();
	String password = ConfigReader.getPassword();
	String TryEditorUrl = "https://dsportalapp.herokuapp.com/tryEditor";
	String PracticepageUrl = "https://dsportalapp.herokuapp.com/array/practice";

	public ArraySteps() {
		driver = DriverFactory.initiateDriver();
		arraypage = new Arraypage(driver);
	}
	
	@Given("The user is in the Home page")
	public void the_user_is_in_the_home_page() {
	    DriverFactory.getstarted();
	    arraypage.DsAlgoStarting();
	}

	@When("The user clicks on Sign in and enter username and password and clicks on Login button")
	public void the_user_clicks_on_sign_in_and_enter_username_and_password_and_clicks_on_login_button() {
	    arraypage.Usersignin();
	    arraypage.Entercredentials();
	    arraypage.Userlogin();
	}

	@Then("The user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
		Assert.assertEquals("You are logged in",arraypage.LoginMessage());
	   
	}

	@Given("The user is in the Home page after Sign in with valid credentials")
	public void the_user_is_in_the_home_page_after_sign_in_with_valid_credentials() {
	   DriverFactory.homepage();
	}

	@When("The user clicks the Getting Started button in Array Panel")
	public void the_user_clicks_the_getting_started_button_in_array_panel() {
	    arraypage.ArrayGetStarted();
	}

	@Then("The user should be directed to Array Data Structure Page")
	public void the_user_should_be_directed_to_array_data_structure_page() {
		Assert.assertEquals(driver.getTitle(),"Array");
	}

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
	   driver.getCurrentUrl();
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {
	    arraypage.ArraysPython();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Assert.assertEquals(driver.getTitle(),"Arrays in Python");
	    
	}

	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
	    driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
	    arraypage.Tryherebtn();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	   
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see error message in alert window")
	public void the_user_should_be_able_to_see_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user gets the invalid python code from excel SheetName {string} and {int} and enters in the Editor and clicks on Run Button")
	public void the_user_gets_the_invalid_python_code_from_excel_sheet_name_and_and_enters_in_the_editor_and_clicks_on_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see an error message in alert window")
	public void the_user_should_be_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the  valid python code from excel SheetName {string} and {int} and enters in the Editor and click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_and_enters_in_the_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the Arrays using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button in Arrays using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the invalid python code from excel SheetName {string} and {int} in Arrays using List Editor and click the Run Button")
	public void the_user_write_the_invalid_python_code_from_excel_sheet_name_and_in_arrays_using_list_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid python code from excel SheetName {string} and {int} in Arrays using List Editor and click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_in_arrays_using_list_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for Arrays using list in the console")
	public void the_user_should_able_to_see_output_for_arrays_using_list_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the invalid python code from excel SheetName {string} and {int}  in Basic Operations Editor and click the Run Button")
	public void the_user_write_the_invalid_python_code_from_excel_sheet_name_and_in_basic_operations_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see an error message for Basic Operations in alert window")
	public void the_user_should_able_to_see_an_error_message_for_basic_operations_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid python code from excel SheetName {string} and {int} in Basic Operations Editor and click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_in_basic_operations_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for Basic Operations in the console")
	public void the_user_should_able_to_see_output_for_basic_operations_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Try Here button in Application of Arrays page")
	public void the_user_clicks_try_here_button_in_application_of_arrays_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the invalid python code from excel SheetName {string} and {int}  in  Applications of Arrays Editor and click the Run Button")
	public void the_user_write_the_invalid_python_code_from_excel_sheet_name_and_in_applications_of_arrays_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see error message in alert window")
	public void the_user_should_able_to_see_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid  python code from excel SheetName {string} and {int} in Application of Arrays Editor and click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_in_application_of_arrays_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for Application of Arrays in the console")
	public void the_user_should_able_to_see_output_for_application_of_arrays_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the practice page")
	public void the_user_is_in_the_practice_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit button")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the try editor in question page")
	public void the_user_is_in_the_Try_editor_in_question_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user did not  write the code for search element in  Editor and Click the Run Button")
	public void the_user_did_not_write_the_code_for_search_element_in_editor_and_click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to see error message for search element  in alert window")
	public void the_user_should_be_able_to_see_error_message_for_search_element_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid python code for search element from excel SheetName {string} and {int} in Editor and Click the Run Button")
	public void the_user_write_the_valid_python_code_for_search_element_from_excel_sheet_name_and_in_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for search element  in the console")
	public void the_user_should_able_to_see_output_for_search_element_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the practice  page")
	public void the_user_is_in_the_Practice_Page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Max ConsecutiveOnes link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the tryEditor in question page")
	public void the_user_is_in_the_try_editor_in_question_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid python code from excel SheetName {string} and {int} in Editor for maximum number of consecutive ones and Click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_in_editor_for_maximum_number_of_consecutive_ones_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for maximum number of consecutive ones  in the console")
	public void the_user_should_able_to_see_output_for_maximum_number_of_consecutive_ones_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid python code from excel SheetName {string} and {int} in Editor for even number of integers and Click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_in_editor_for_even_number_of_integers_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for even number of integers in the console")
	public void the_user_should_able_to_see_output_for_even_number_of_integers_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the  practice  page")
	public void the_user_is_in_the_Practice_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid python code from excel SheetName {string} and {int} for squares of each number in Editor and Click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_sheet_name_and_for_squares_of_each_number_in_editor_and_click_the_run_button(String string, Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output for squares of each number  in the console")
	public void the_user_should_able_to_see_output_for_squares_of_each_number_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}



	
	
	
}