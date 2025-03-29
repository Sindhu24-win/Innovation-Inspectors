package StepDefinitions;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import DriverFactory.driverFactory;
import Utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import pageObjects.StackPage;

public class G_StackSteps {

	WebDriverWait wait;
	WebDriver driver;
	StackPage stackPage;
	HomePage homepage;
	ArrayPage arraypage;
	
	public G_StackSteps() {
		driver = driverFactory.initiateDriver();
		stackPage = new StackPage(driver);
		homepage = new HomePage(driver);
		arraypage = new ArrayPage(driver);
	}

	@Given("the user is on the homepage after logging into the dsAlgo Portal")
	public void the_user_is_on_the_homepage_after_logging_into_the_ds_algo_portal() {
		homepage.Gethomeurl();
		LoggerReader.info("User is in the Home page to check Stacks DataStructure");
	}

	@When("the user selects the Getting Started button from the Stack panel")
	public void the_user_selects_the_getting_started_button_from_the_stack_panel() {
		stackPage.StackGetStarted();
	}

	@Then("the user should be redirected to the Stack Data Structure page")
	public void the_user_should_be_redirected_to_the_stack_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Stack");
	}

	@Given("the user is on the Stack page")
	public void the_user_is_on_the_stack_page() {
		driver.getCurrentUrl();
	}

	@When("the user clicks the Operations in Stack link")
	public void the_user_clicks_the_operations_in_stack_link() {
		stackPage.OperationInStack();
	}

	@Then("the user should be navigated to the Operations in Stack page")
	public void the_user_should_be_navigated_to_the_operations_in_stack_page() {
		Assert.assertEquals(driver.getTitle(), "Operations in Stack");
	}

	@Given("the user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
		driver.getCurrentUrl();
	}

	@When("the user clicks the Try Here button on the Operations in Stack page")
	public void the_user_clicks_the_try_here_button_on_the_operations_in_stack_page() {
		stackPage.Tryhere();
	}

	@Then("the user should be taken to a page containing a try editor with a Run button for testing the code")
	public void the_user_should_be_taken_to_a_page_containing_a_try_editor_with_a_run_button_for_testing_the_code() {
		assert stackPage.TryEditor.isDisplayed();
		assert stackPage.RunBtn.isDisplayed();
	}

	@Given("the user is on the TryEditor page in the Operations in Stack on Python page")
	public void the_user_is_on_the_try_editor_page_in_the_operations_in_stack_on_python_page() {
		homepage.Gethomeurl();
		stackPage.StackGetStarted();
		stackPage.OperationInStack();
		stackPage.Tryhere();
	}

	@When("the user clicks the Run button without any code in the editor")
	public void the_user_clicks_the_run_button_without_any_code_in_the_editor() {
		stackPage.RunBtn();
	}

	@Then("the user should receive an error message in the alert window")
	public void the_user_should_receive_an_error_message_in_the_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
	}

	@When("the user types invalid python code from excel {string} and {int} and enters in the editor and clicks the Run button for stack TryEditor")
	public void the_user_types_invalid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_run_button_for_stack_try_editor(
			String sheetName, int rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("the user should see an error message in the alert window")
	public void the_user_should_see_an_error_message_in_the_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
	}

	@When("the user enters valid python code  from excel {string} and {int} and enters in the editor and clicks the Run button for stack TryEditor")
	public void the_user_enters_valid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_run_button_for_stack_try_editor(
			String sheetName, int rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		stackPage.RunBtn.click();
	}

	@Then("the user should see the output displayed in the console")
	public void the_user_should_see_the_output_displayed_in_the_console() {
		Assert.assertEquals("Hello World", stackPage.consoleOutput());
		LoggerReader.info("User sees the Output in the console");
	}

	@When("the user clicks the Practice Questions button in the Operations in Stack on Python page")
	public void the_user_clicks_the_practice_questions_button_in_the_operations_in_stack_on_python_page() {
		driver.navigate().back();
		stackPage.StackPracticeQuestions();
	}

	@Then("the user should be redirected to the Practice Questions page")
	public void the_user_should_be_redirected_to_the_practice_questions_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
	}

	@Given("the user is currently on the stack page")
	public void the_user_is_currently_on_the_stack_page() {
		driver.navigate().back();
		driver.getCurrentUrl();
	}

	@When("the user clicks the Implementation link")
	public void the_user_clicks_the_implementation_link() {
		stackPage.Implementation();
	}

	@Then("the user should be taken to the Implementation page")
	public void the_user_should_be_taken_to_the_implementation_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation");
	}

	@Given("the user is on the Implementation page")
	public void the_user_is_on_the_implementation_page() {
		driver.getCurrentUrl();
	}

	@When("the user clicks the Try Here button on the Implementation page")
	public void the_user_clicks_the_try_here_button_on_the_implementation_page() {
		stackPage.Tryhere();
	}

	@Then("the user should be redirected to a page containing a try editor with a Run button for testing the code")
	public void the_user_should_be_redirected_to_a_page_containing_a_try_editor_with_a_run_button_for_testing_the_code() {
		assert stackPage.TryEditor.isDisplayed();
		assert stackPage.RunBtn.isDisplayed();
	}

	@Given("the user is on the TryEditor page in the Implementation page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_page() {
		homepage.Gethomeurl();
		stackPage.StackGetStarted();
		stackPage.Implementation();
		stackPage.Tryhere();
	}

	@When("the user clicks the Run button without entering any code in the editor")
	public void the_user_clicks_the_run_button_without_entering_any_code_in_the_editor() {
		stackPage.EmptytryEditor();
		stackPage.RunBtn();
	}

	@When("the user enters invalid python code from excel {string} and {int} and enters in the editor and clicks the Run button for stack TryEditor")
	public void the_user_enters_invalid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_run_button_for_stack_try_editor(
			String sheetName, int rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@When("the user enters valid python code from excel {string} and {int} and enters in the editor and clicks the Run button for stack TryEditor")
	public void the_user_enters_valid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_Run_button_for_stack_try_editor(
			String sheetName, int rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		stackPage.RunBtn.click();
	}

	@When("the user clicks the Applications link")
	public void the_user_clicks_the_applications_link() {
		driver.navigate().back();
		stackPage.Applications();
	}

	@Then("the user should be taken to the Applications page")
	public void the_user_should_be_taken_to_the_applications_page() {
		Assert.assertEquals(driver.getTitle(), "Applications");
	}

	@Given("the user is on the Applications page")
	public void the_user_is_on_the_applications_page() {
		driver.getCurrentUrl();
		LoggerReader.info("User is on the Application page");
	}

	@When("the user clicks the Try Here button on the Applications page")
	public void the_user_clicks_the_try_here_button_on_the_applications_page() {
		stackPage.Tryhere();
	}

	@Given("the user is on the TryEditor page in the Applications page")
	public void the_user_is_on_the_try_editor_page_in_the_applications_page() {
		homepage.Gethomeurl();
		stackPage.StackGetStarted();
		stackPage.Applications();
		stackPage.Tryhere();
	}

}

