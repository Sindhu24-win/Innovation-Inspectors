package StepDefinitions;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import DriverFactory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import pageObjects.Linkedlistpage;
import Utilities.LoggerReader;

public class F_LinkedListSteps {
	
	WebDriver driver;
	ArrayPage arraypage;
	HomePage homepage;
	Linkedlistpage linkedlistpage;
	
	public F_LinkedListSteps() {
		driver = driverFactory.initiateDriver();
		linkedlistpage = new Linkedlistpage(driver);
		homepage = new HomePage(driver);
		arraypage = new ArrayPage(driver);
	}

	@Given("The user is in home page after sign-in")
	public void the_user_is_in_home_page_after_sign_in() {
		homepage.Gethomeurl();
	}

	@When("The user clicks Get Started button in Linkedlist panel")
	public void the_user_clicks_get_started_button_in_linkedlist_panel() {
		linkedlistpage.Getstarted();
	}

	@Then("The user should land on LinkedList page")
	public void the_user_should_land_on_linked_list_page() {
		Assert.assertEquals(driver.getTitle(), "Linked List");
	}

	@Given("The user is in the Linked List page after Sign in")
	public void the_user_is_in_the_linked_list_Page_after_sign_in() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Introduction link")
	public void the_user_clicks_introduction_link() {
		linkedlistpage.Introductionpage();
	}

	@Then("The user should be redirected to Introduction page")
	public void the_user_should_be_redirected_to_introduction_page() {
		Assert.assertEquals(driver.getTitle(), "Introduction");
	}

	@Given("The user is on the Introduction page")
	public void the_user_is_on_the_introduction_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Introduction page")
	public void the_user_clicks_try_here_button_in_introduction_page() {
		linkedlistpage.Tryhere();
	}

	@Given("The user is in the tryEditor page for Introduction")
	public void the_user_is_in_the_try_Editor_page_for_introduction() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Introductionpage();
		linkedlistpage.Tryhere();
	}

	@When("The user clicks the Run Button without entering the code in the Introduction TryEditor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_introduction_try_editor() {
		linkedlistpage.Nocode();
		linkedlistpage.Run();
	}

	@Then("The user should be able to see error message for Introduction  in alert window")
	public void the_user_should_be_able_to_see_error_message_for_introduction_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@Given("The user is in the Introduction tryEditor page.")
	public void the_user_is_in_the_introduction_try_editor_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Introductionpage();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the valid python code from excel {string} and {int} and enters in Introduction Try Editor and click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_introduction_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Introduction in the console")
	public void the_user_should_able_to_see_output_for_introduction_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is in the tryEditor page for Introduction.")
	public void the_user_is_in_the_try_editor_page_for_introduction() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Introductionpage();
		linkedlistpage.Tryhere();
	}

	@When("The user reads  the invalid python code from excel {string} and {int} and enters in Introduction Try Editor and click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_introduction_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Introduction in alert window")
	public void the_user_should_able_to_see_an_error_message_for_introduction_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message");
	}

	@When("The user clicks Creating Linked List link")
	public void the_user_clicks_creating_linked_list_link() {
		driver.navigate().back();
		driver.getCurrentUrl();
		linkedlistpage.CreatingLinkedlist();
	}

	@Then("The user should be redirected to Creating Linked List page")
	public void the_user_should_be_redirected_to_creating_linked_list_page() {
		Assert.assertEquals(driver.getTitle(), "Creating Linked LIst");
	}

	@Given("The user is on the Creating Linked List page")
	public void the_user_is_on_the_creating_linked_list_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Creating Linked List page")
	public void the_user_clicks_try_here_button_in_creating_linked_list_page() {
		linkedlistpage.Tryhere();
	}

	@Then("The user should be redirected to Creating Linked list page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_creating_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
		assert linkedlistpage.Tryeditor.isDisplayed();
		assert linkedlistpage.Runbtn.isDisplayed();
	}

	@Given("The user is in the tryEditor page for Creating Linked List page")
	public void the_user_is_in_the_try_editor_page_for_creating_linked_list_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.CreatingLinkedlist();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the invalid python code from excel {string} and {int} and enters in Creating Linked List Try Editor and click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_creating_linked_list_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Creating Linked List in alert window")
	public void the_user_should_able_to_see_an_error_message_for_creating_linked_list_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message");
	}

	@Given("The user is in the tryEditor page  Creating Linked List page")
	public void the_user_is_in_the_try_editor_page_creating_linked_list_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.CreatingLinkedlist();
		linkedlistpage.Tryhere();
	}

	@When("The user raeds the valid python code from excel {string} and {int} and enters in Creating Linked List Try Editor and click the Run Button")
	public void the_user_raeds_the_valid_python_code_from_excel_and_and_enters_in_creating_linked_list_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Creating Linked List  in the console")
	public void the_user_should_able_to_see_output_for_creating_linked_list_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is in the Linked List  page after Sign in")
	public void the_user_is_in_the_linked_list_page_after_Sign_in() {
		driver.navigate().back();
		driver.getCurrentUrl();
	}

	@When("The user clicks Types of Linked List")
	public void the_user_clicks_types_of_linked_list() {
		linkedlistpage.TypesLinkedlist();
	}

	@Then("The user should be redirected to Types of Linked List page")
	public void the_user_should_be_redirected_to_types_of_linked_list_page() {
		Assert.assertEquals(driver.getTitle(), "Types of Linked List");
	}

	@Given("The user is on the Types of Linked List page")
	public void the_user_is_on_the_types_of_linked_list_page() {
		Assert.assertEquals(driver.getTitle(), "Types of Linked List");
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Types of Linked List page")
	public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {
		linkedlistpage.Tryhere();
	}

	@Then("The user should be redirected to Types of Linked List page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_types_of_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
		assert linkedlistpage.Tryeditor.isDisplayed();
		assert linkedlistpage.Runbtn.isDisplayed();
	}

	@Given("The user is in the tryEditor page Types of Linked List page")
	public void the_user_is_in_the_try_editor_page_types_of_linked_list_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.TypesLinkedlist();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the invalid python code from excel {string} and {int} and enters  in Types of Linked List Try Editor and click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_types_of_linked_list_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Types of Linked List in alert window")
	public void the_user_should_able_to_see_an_error_message_for_types_of_linked_list_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message");
	}

	@When("The user reads the valid python code  from excel {string} and {int} and enters in  Types of Linked List Try Editor and click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_types_of_linked_list_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Types of Linked List  in the console")
	public void the_user_should_able_to_see_output_for_types_of_linked_list_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is in the  Linked List  page after Sign in")
	public void the_user_is_in_the_linked_list_page_after_sign_in() {
		driver.navigate().back();
		driver.getCurrentUrl();
	}

	@When("The user clicks Implement Linked List in Python link")
	public void the_user_clicks_implement_linked_list_in_python_link() {
		linkedlistpage.ImplementingList();
	}

	@Then("The user should be redirected to Implement Linked List in Python page")
	public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
		Assert.assertEquals(driver.getTitle(), "Implement Linked List in Python");
	}

	@Given("The user is on the Implement Linked List in Python page")
	public void the_user_is_on_the_implement_linked_list_in_python_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Implement Linked List in Python page")
	public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
		linkedlistpage.Tryhere();
	}

	@Then("The user should be redirected to Implement Linked List page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_implement_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
		assert linkedlistpage.Tryeditor.isDisplayed();
		assert linkedlistpage.Runbtn.isDisplayed();
	}

	@Given("The user is in the tryEditor page Implement Linked List in Python page")
	public void the_user_is_in_the_try_editor_page_implement_linked_list_in_python_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.ImplementingList();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the invalid python code  from excel {string} and {int} and enters in Implement Linked List Try Editor and click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_implement_linked_list_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Implement Linked List  in alert window")
	public void the_user_should_able_to_see_an_error_message_for_implement_linked_list_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message Implement Linked List  ");
	}

	@When("The user reads the valid python code from excel {string} and {int}  and enters in Implement Linked List Try Editor and click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_implement_linked_list_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Implement Linked List in the console")
	public void the_user_should_able_to_see_output_for_implement_linked_list_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is on Linked List page after sign in.")
	public void the_user_is_on_linked_list_page_after_sign_in() {
		driver.navigate().back();
		driver.getCurrentUrl();
	}

	@When("The user clicks Traversal link")
	public void the_user_clicks_traversal_link() {
		linkedlistpage.Traversal();
	}

	@Then("The user should be redirected to Traversal page")
	public void the_user_should_be_redirected_to_traversal_page() {
		Assert.assertEquals(driver.getTitle(), "Traversal");
	}

	@Given("The user is on the  Traversal page")
	public void the_user_is_on_the_traversal_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks the Try here  button in Traversal page")
	public void the_user_clicks_the_try_here_button_in_traversal_page() {
		linkedlistpage.Tryhere();
	}

	@Then("The user should be redirected to Try Editor page when clicking on Try here button")
	public void the_user_should_be_redirected_to_try_editor_page_when_clicking_on_try_here_button() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@Given("The user is on the tryEditor page Traversal page")
	public void the_user_is_on_the_try_editor_page_traversal_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Traversal();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the invalid python code from excel {string} and {int} and enters  in  Traversal Try Editor and Click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_traversal_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Traversal  in alert window")
	public void the_user_should_able_to_see_an_error_message_for_traversal_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message for Traversal page tryeditor");
	}

	@When("The user reads the valid python code from excel {string} and {int} and enters   in Traversal Try Editor and Click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_traversal_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Traversal  in the console")
	public void the_user_should_able_to_see_output_for_traversal_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is on the Linked List page after sign in")
	public void the_user_is_on_the_linked_list_page_After_sign_in() {
		driver.navigate().back();
		driver.getCurrentUrl();
	}

	@When("The user clicks the Insertion  link")
	public void the_user_clicks_the_insertion_link() {
		linkedlistpage.Insertion();
	}

	@Then("The user should be redirected to Insertion page from Linked List page")
	public void the_user_should_be_redirected_to_insertion_page_from_linked_list_page() {
		Assert.assertEquals(driver.getTitle(), "Insertion");
	}

	@Given("The user is on the Insertion page")
	public void the_user_is_on_the_insertion_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks the Try here button in Insertion page")
	public void the_user_clicks_the_try_here_button_in_insertion_page() {
		linkedlistpage.Tryhere();
	}

	@Then("The user should be redirected to Try Editor page from Insertion page")
	public void the_user_should_be_redirected_to_try_editor_page_from_insertion_page() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@Given("The user is on the Try Editor page in Insertion page")
	public void the_user_is_on_the_try_editor_page_in_insertion_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Insertion();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the valid python code  from excel {string} and {int} and enters in Insertion Try Editor and Click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_insertion_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Insertion in the console")
	public void the_user_should_able_to_see_output_for_insertion_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is on the Try Editor page for Insertion")
	public void the_user_is_on_the_try_editor_page_for_insertion() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Insertion();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the invalid python code from excel {string} and {int} and enters in Insertion Try Editor and Click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_insertion_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Insertion  in alert window")
	public void the_user_should_able_to_see_an_error_message_for_insertion_in_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message");
	}

	@Given("The user is on the Linked list page after sign in")
	public void the_user_is_on_the_linked_list_page_after_sign_in() {
		driver.navigate().back();
		driver.getCurrentUrl();
	}

	@When("The user clicks the Deletion link")
	public void the_user_clicks_the_deletion_link() {
		linkedlistpage.Deletion();
	}

	@Then("The user should be redirected to Deletion page")
	public void the_user_should_be_redirected_to_deletion_page() {
		Assert.assertEquals(driver.getTitle(), "Deletion");
	}

	@Given("The user is on the Deletion page")
	public void the_user_is_on_the_deletion_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks the Try Here  button in Deletion page")
	public void the_user_clicks_the_try_here_button_in_deletion_page() {
		linkedlistpage.Tryhere();
	}

	@Then("The user should be redirected to Deletion  Try Editor  page")
	public void the_user_should_be_redirected_to_deletion_try_editor_page() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@Given("The user is on the Try Editor page in Deletion page")
	public void the_User_is_on_the_try_editor_page_in_deletion_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Deletion();
		linkedlistpage.Tryhere();
	}

	@When("The user  reads the invalid python code  from excel {string} and {int} and enters in Deletion Try Editor and Click the Submit Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_deletion_try_editor_and_click_the_submit_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should  be able to see an error message for Deletion in the alert window")
	public void the_user_should_be_able_to_see_an_error_message_for_deletion_in_the_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");
		LoggerReader.error("User able to see an error message");
	}

	@Given("The user is on the tryEditor page in Deletion page")
	public void the_user_is_on_the_try_editor_page_in_deletion_page() {
		homepage.Gethomeurl();
		linkedlistpage.Getstarted();
		linkedlistpage.Deletion();
		linkedlistpage.Tryhere();
	}

	@When("The user reads the valid python code from excel {string} and {int} and enters in Deletion Try Editor and Click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_deletion_try_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		linkedlistpage.Run();
	}

	@Then("The user should able to see output for Deletion in the console")
	public void the_user_should_able_to_see_output_for_deletion_in_the_console() {
		Assert.assertEquals("Hello World", linkedlistpage.ValidOutput());
		System.out.println("======Valid python code output is ===" + linkedlistpage.ValidOutput());
	}

	@Given("The user is on the Linked List  page")
	public void the_user_is_on_the_linked_list_page() {
		driver.navigate().back();
		Assert.assertEquals(driver.getTitle(), "Deletion");
	}

	@When("The user clicks on Practice Questions link in Linked List page")
	public void the_user_clicks_on_practice_questions_link_in_linked_list_page() {
		linkedlistpage.PracticeQuestion();
	}

	@Then("The user should be redirected to Practice Questions page")
	public void the_user_should_be_redirected_to_practice_questions_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
		LoggerReader.info("User is in Practice Questions page for Linked list");
	}

}
