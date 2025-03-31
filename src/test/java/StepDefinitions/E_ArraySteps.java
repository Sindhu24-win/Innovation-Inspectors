package StepDefinitions;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import Utilities.LoggerReader;

public class E_ArraySteps {

	ArrayPage arraypage;
	HomePage homepage;
	LoginPage loginpage;
	
	public E_ArraySteps() {
		arraypage = new ArrayPage();
		homepage = new HomePage();
		loginpage = new LoginPage();
	}
	
	@Given("The user is in the Home page after Sign in with valid credentials")
	public void the_user_is_in_the_home_page_after_sign_in_with_valid_credentials() {
		homepage.Gethomeurl();
	}

	@When("The user clicks the Getting Started button in Array Panel")
	public void the_user_clicks_the_getting_started_button_in_array_panel() {
		arraypage.ArrayGetStarted();
	}

	@Then("The user should be directed to Array Data Structure Page")
	public void the_user_should_be_directed_to_array_data_structure_page() {
		Assert.assertEquals(LoginPage.getTitle(), "Array");
		LoggerReader.info("User is in the Array Page");
	}

	@Given("The user is in the Array page after Sign in")
	public void the_user_is_in_the_array_page_after_sign_in() {
		LoginPage.getCurrentUrl();
	}

	@When("The user clicks Arrays in Python link")
	public void the_user_clicks_arrays_in_python_link() {
		arraypage.ArraysPython();
	}

	@Then("The user should be redirected to Arrays in Python page")
	public void the_user_should_be_redirected_to_arrays_in_python_page() {
		Assert.assertEquals(LoginPage.getTitle(), "Arrays in Python");
	}

	@Given("The user is on the Arrays in Python page")
	public void the_user_is_on_the_arrays_in_python_page() {
		LoginPage.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Arrays in Python page")
	public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
		arraypage.Tryherebtn();
	}

	@Given("The user is in the tryEditor page for Arrays in Python page")
	public void the_user_is_in_the_try_editor_page_for_arrays_in_python_page() {
		homepage.Gethomeurl();
		arraypage.ArrayGetStarted();
		arraypage.ArraysPython();
		arraypage.Tryherebtn();
	}

	@Then("The user should be able to see error message in alert pop-up")
	public void the_user_should_be_able_to_see_error_message_in_alert_pop_up() {
		assert arraypage.TryEditor.isDisplayed();
		assert arraypage.Run.isDisplayed();
	}

	@Given("The user is in the tryEditor page Arrays in Python page")
	public void the_user_is_in_the_try_editor_page_arrays_in_python_page() {
		homepage.Gethomeurl();
		arraypage.ArrayGetStarted();
		arraypage.ArraysPython();
		arraypage.Tryherebtn();
	}

	@When("The user reads the invalid python code from  excel {string}  and {int} and  enters in the Editor and clicks on Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should be able to see an error message in alert pop-up")
	public void the_user_should_be_able_to_see_an_error_message_in_alert_pop_up() {
		Assert.assertEquals(LoginPage.getTitle(), "Assessment");
	}

	@When("The user reads the valid python code from excel {string} and {int} and  enters in the Editor and click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_the_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		arraypage.Run.click();
	}

	@Given("The user is on the Arrays using List page")
	public void the_user_is_on_the_arrays_using_list_page() {
		LoginPage.navigate();
		arraypage.ArraysList();
	}

	@When("The user clicks Try Here button in Arrays using List page")
	public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
		arraypage.Tryherebtn();
	}

	@Given("The user is in the tryEditor page Arrays using List page")
	public void the_user_is_in_the_try_editor_page_arrays_using_list_page() {
		homepage.Gethomeurl();
		arraypage.ArrayGetStarted();
		arraypage.ArraysPython();
		arraypage.Tryherebtn();
	}

	@When("The user reads  the invalid python code from excel {string} and {int} and enters in Arrays using List Editor and click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_arrays_using_list_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message in alert pop-up")
	public void the_user_should_able_to_see_an_error_message_in_alert_pop_up() {
		Assert.assertEquals(LoginPage.getTitle(), "Assessment");
	}

	@When("The user reads  the valid python code from excel {string} and {int} and  enters in Arrays using List Editor and click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_arrays_using_list_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		arraypage.Run.click();
	}

	@Then("The user should able to see output for Arrays using list in the console")
	public void the_user_should_able_to_see_output_for_arrays_using_list_in_the_console() {
		Assert.assertEquals("Hello World", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@Given("The user is on the Basic Operations in Lists page")
	public void the_user_is_on_the_basic_operations_in_lists_page() {
		LoginPage.navigate();
		arraypage.Basicoperation();
	}

	@When("The user clicks Try Here button in Basic Operations in Lists page")
	public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
		arraypage.Tryherebtn();
	}

	@Given("The user is in the tryEditor page Basic Operations in Lists page")
	public void the_user_is_in_the_try_editor_page_basic_operations_in_lists_page() {
		homepage.Gethomeurl();
		arraypage.ArrayGetStarted();
		arraypage.ArraysPython();
		arraypage.Tryherebtn();
	}

	@When("The user read the invalid python code from excel {string} and {int} and  enters in Basic Operations Editor and click the Run Button")
	public void the_user_read_the_invalid_python_code_from_excel_and_and_enters_in_basic_operations_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@Then("The user should able to see an error message for Basic Operations in alert pop-up")
	public void the_user_should_able_to_see_an_error_message_for_basic_operations_in_alert_pop_up() {
		Assert.assertEquals(LoginPage.getTitle(), "Assessment");
	}

	@When("The user write the valid python code from excel {string} and {int} and enters in Basic Operations Editor and click the Run Button")
	public void the_user_write_the_valid_python_code_from_excel_and_and_enters_in_basic_operations_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		arraypage.Run.click();
	}

	@Then("The user should able to see output for Basic Operations in the console")
	public void the_user_should_able_to_see_output_for_basic_operations_in_the_console() {
		Assert.assertEquals("Hello World", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@When("The user clicks Applications of Array link")
	public void the_user_clicks_applications_of_array_link() {
		LoginPage.navigate();
		arraypage.ApplicationsArray();
		LoggerReader.info("User clicks Applications of Array link");
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		Assert.assertEquals(LoginPage.getTitle(), "Applications of Array");
	}

	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		LoginPage.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Application of Arrays page")
	public void the_user_clicks_try_here_button_in_application_of_arrays_page() {
		arraypage.Tryherebtn();
	}

	@Given("The user is in the tryEditor page Applications of Array page")
	public void the_user_is_in_the_try_editor_page_applications_of_array_page() {
		homepage.Gethomeurl();
		arraypage.ArrayGetStarted();
		arraypage.ArraysPython();
		arraypage.Tryherebtn();
	}

	@When("The user reads the invalid python code from excel {string} and {int} and enters  in  Applications of Arrays Editor and click the Run Button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_applications_of_arrays_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	
	}

	@Then("The user should able to see error message in alert pop-up")
	public void the_user_should_able_to_see_error_message_in_alert_pop_up() {
		Assert.assertEquals(LoginPage.getTitle(), "Assessment");
	}

	@When("The user reads the valid  python code from excel {string} and {int} and  enters in Application of Arrays Editor and click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_application_of_arrays_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		arraypage.Run.click();
	}

	@Then("The user should able to see output for Application of Arrays in the console")
	public void the_user_should_able_to_see_output_for_application_of_arrays_in_the_console() {
		Assert.assertEquals("Hello World", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@When("The user clicks Practice Questions link Applications of Array page")
	public void the_user_clicks_practice_questions_link_applications_of_array_page() {
		LoginPage.navigate();;
		arraypage.Practicequestions();
		LoggerReader.info("User is in Practice Questions link");
	}

	@Given("The user is in the practice page")
	public void the_user_is_in_the_Practice_page() {
		LoginPage.getCurrentUrl();
	}

	@When("The user clicks the Search the array link")
	public void the_user_clicks_the_search_the_array_link() {
		arraypage.SearchArray();
	}

	@Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit button")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_button() {
		assert arraypage.TryEditor.isDisplayed();
		assert arraypage.Run.isDisplayed();
	}

	@Given("The user is in the try editor in question page")
	public void the_user_is_in_the_try_editor_in_question_Page() {
		arraypage.PracticeTryEditor();
	}

	@When("The user did not  write the code for search element in  Editor and Click the Run Button")
	public void the_user_did_not_write_the_code_for_search_element_in_editor_and_click_the_run_button() {
		arraypage.PracticeNoCodeinput();
	}

	@Then("The user should be able to see error message for search element  in alert pop-up")
	public void the_user_should_be_able_to_see_error_message_for_search_element_in_alert_pop_up() {
		Assert.assertEquals(LoginPage.getTitle(), "Assessment");
	}

	@When("The user reads the valid python code for search element from excel {string} and {int} and enters in Editor and Click the Run Button")
	public void the_user_reads_the_valid_python_code_for_search_element_from_excel_and_and_enters_in_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidInputPracticeQn(sheetName, rowNumber);
		arraypage.Run.click();
		System.out.println("Search Array Program entered Successfully  ");
	}

	@Then("The user should able to see output for search element  in the console")
	public void the_user_should_able_to_see_output_for_search_element_in_the_console() {
		Assert.assertEquals("Element Found", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@Given("The user is in the practice  page")
	public void the_user_is_in_the_Practice_Page() {
		LoginPage.navigate();
		Assert.assertEquals(LoginPage.getTitle(), "Practice Questions");
	}

	@When("The user clicks the Max ConsecutiveOnes link")
	public void the_user_clicks_the_max_consecutive_ones_link() {
		arraypage.Maxconsecutive();
	}

	@Given("The user is in the tryEditor in question page")
	public void the_user_is_in_the_try_editor_in_question_page() {
		arraypage.PracticeTryEditor();
		arraypage.PracticeNoCodeinput();
	}

	@When("The user reads the valid python code from excel {string} and {int} and enters in Editor for maximum number of consecutive ones and Click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_editor_for_maximum_number_of_consecutive_ones_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidInputPracticeQn(sheetName, rowNumber);
		arraypage.Run.click();
		System.out.println("Max Consecutive Program entered Successfully  ");
	}

	@Then("The user should able to see output for maximum number of consecutive ones  in the console")
	public void the_user_should_able_to_see_output_for_maximum_number_of_consecutive_ones_in_the_console() {
		Assert.assertEquals("2", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@When("The user clicks the Find Numbers with Even Number of Digits link")
	public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
		LoginPage.navigate();
		arraypage.FindEvenNumbers();
	}

	@When("The user reads the valid python code from excel {string} and {int} and  enters in Editor for even number of integers and Click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_editor_for_even_number_of_integers_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidInputPracticeQn(sheetName, rowNumber);
		arraypage.Run.click();
		System.out.println("Find Even Numbers  Program entered Successfully  ");
	}

	@Then("The user should able to see output for even number of integers in the console")
	public void the_user_should_able_to_see_output_for_even_number_of_integers_in_the_console() {
		Assert.assertEquals("1", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@Given("The user is in the  practice  page")
	public void the_user_is_in_the_practice_page() {
		LoginPage.navigate();
		Assert.assertEquals(LoginPage.getTitle(), "Practice Questions");
	}

	@When("The user clicks the Squares of a Sorted Array link")
	public void the_user_clicks_the_squares_of_a_sorted_array_link() {
		arraypage.SquaresSortedArray();
	}

	@When("The user reads the valid python code from excel {string} and {int} and enters in Editor for squares of each number in Editor and Click the Run Button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_editor_for_squares_of_each_number_in_editor_and_click_the_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidInputPracticeQn(sheetName, rowNumber);
		arraypage.Run.click();
		System.out.println("Squares of sorted Array program  entered Successfully  ");
	}

	@Then("The user should able to see output for squares of each number  in the console")
	public void the_user_should_able_to_see_output_for_squares_of_each_number_in_the_console() {
		Assert.assertEquals("[4, 9, 9, 49, 121]", arraypage.GetConsoleOutput());
		System.out.println("======Valid python code output is ===" + arraypage.GetConsoleOutput());
	}

	@Given("The user is in Practice Questions page")
	public void the_user_is_in_practice_questions_page() {
		LoginPage.navigate();
		Assert.assertEquals(LoginPage.getTitle(), "Practice Questions");
	}
}