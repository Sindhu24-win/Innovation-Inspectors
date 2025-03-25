package StepDefinitions;

//import static org.junit.Assert.assertArrayEquals;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
//import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.junit.Assert;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.NoAlertPresentException;
//import org.openqa.selenium.Alert;
//import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.driverFactory;
import Utilities.ConfigReader;
import Utilities.Excelreaderpython;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;

public class QueueSteps {
	WebDriverWait wait;
	WebDriver driver;
	QueuePage queuePage;
	String username = ConfigReader.getProperty("username");
	String password = ConfigReader.getProperty("password");
	// String Url = "https://dsportalapp.herokuapp.com";
	// String HomeUrl = "https://dsportalapp.herokuapp.com/home";
	String TryEditor = "https://dsportalapp.herokuapp.com/tryEditor";

	public QueueSteps() {
		System.out.println("****I'm in Queue Data Structure****");
		driver = driverFactory.initiateDriver();
		queuePage = new QueuePage(driver);
		// wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		driverFactory.getStarted();
		queuePage.GetStartedIntro();
		queuePage.SignIn();
		
		queuePage.clickLogin(username, password);

	}

	@When("The user selects Getting Started in Queue Panel or the user selects Queue item from the drop down menu")
	public void the_user_selects_getting_started_in_queue_panel_or_the_user_selects_queue_item_from_the_drop_down_menu() {
		queuePage.clickQueueGetStartedBtn();

	}

	@Then("The user should be directed to the Queue Data Structure Page")
	public void the_user_should_be_directed_to_the_queue_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Queue");

	}

	@Given("The user is on the Queue page")
	public void the_user_is_on_the_queue_page() {
		driver.getCurrentUrl();

	}

	@When("The user clicks Implementation of Queue in Python button")
	public void the_user_clicks_implementation_of_queue_in_python_button() {
		queuePage.clickImplementationOfQueueInPython();
	}

	@Then("The user should be redirected to Implementation of Queue in Python page")
	public void the_user_should_be_redirected_to_implementation_of_queue_in_python_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation of Queue in Python");
	}

	@Given("The user is on the Implementation of Queue in Python page")
	public void the_user_is_on_the_implementation_of_queue_in_python_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Queue in Python page")
	public void the_user_clicks_try_here_button_in_queue_in_python_page() {
		queuePage.clickTryHereBtn();
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
		assert queuePage.tryEditor.isDisplayed();
		assert queuePage.RunButton.isDisplayed();

	}

	@Given("The user is on the try editor page in the Implementation of Queue on Python page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_of_queue_on_python_page() {
		driverFactory.homepage();
		queuePage.clickQueueGetStartedBtn();
		queuePage.clickImplementationOfQueueInPython();
		queuePage.clickTryHereBtn();

		// driver.getCurrentUrl();
		// driver.get(TryEditor);
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		queuePage.clickRunButton();
	}

	@Then("The user should see an error message in the alert window")
	public void the_user_should_see_an_error_message_in_the_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");// no alert is printed

	}

	@When("The user writes invalid python code from excel {string} and {int} and enters in the Editor and clicks the Run Button for queue tryEditor")
	public void the_user_writes_invalid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_Run_button_for_queue_try_editor(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		Excelreaderpython python = new Excelreaderpython();
		String relativePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx";
		Path filePath = Paths.get(relativePath).toAbsolutePath();
		List<Map<String, String>> testDataMap = python.getData(filePath.toString(), sheetName);

		String pcode = testDataMap.get(rowNumber).get("pyCode");
		// wait.until(ExpectedConditions.visibilityOf(queuePage.tryEditor));
		// System.out.println("Code read from Excel: " + pcode);
		Actions actions = new Actions(driver);
		actions.moveToElement(queuePage.tryEditor).sendKeys(pcode).build().perform();
		queuePage.Invalidinput();

	}

	@Given("The user is on the try editor page in the Implementation of Queue in Python page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_of_queue_in_python_page() {
		driverFactory.homepage();
		queuePage.clickQueueGetStartedBtn();
		queuePage.clickImplementationOfQueueInPython();
		queuePage.clickTryHereBtn();
		// driver.get(TryEditor);
		// driver.getCurrentUrl();
		// queuePage.Validinput();
	}

	@When("The user writes valid python code from excel {string} and {int} and enters in the Editor and clicks the Run Button  for queue tryEditor")
	public void the_user_writes_valid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_run_Button_for_queue_try_editor(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		// queuePage.RunButton.click();
		Excelreaderpython python = new Excelreaderpython();
		String relativePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx";
		Path filePath = Paths.get(relativePath).toAbsolutePath();
		List<Map<String, String>> testDataMap = python.getData(filePath.toString(), sheetName);
		String pcode = testDataMap.get(rowNumber).get("pyCode");
		// wait.until(ExpectedConditions.visibilityOf(queuePage.tryEditor));
		Actions actions = new Actions(driver);
		actions.moveToElement(queuePage.tryEditor).sendKeys(pcode).build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(queuePage.RunButton));
		// Thread.sleep(2000);
		queuePage.RunButton.click();

	}

	@Then("The user should see the output in the console")
	public void the_user_should_see_the_output_in_the_console() {
		Assert.assertEquals("Hello World", queuePage.Outputmsg());
		// System.out.println("======Valid python code output is ==="
		// +queuePage.Outputmsg());

	}

	@When("The user clicks Practice Questions button in the Implementation of Queue in Python page")
	public void the_user_clicks_practice_questions_button_in_the_implementation_of_queue_in_python_page() {
		driver.navigate().back();
		queuePage.clickQueuePracticeQuestionsBtn();
	}

	@Then("The user should be redirected to the Practice Questions page")
	public void the_user_should_be_redirected_to_the_practice_questions_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
	}

	@When("The user clicks Implementation using collections.deque button page")
	public void the_user_clicks_implementation_using_collections_deque_button_page() {
		driver.navigate().back();
		queuePage.clickImplementationUsingCollectionsDequeue();

	}

	@Then("The user should be redirected to the Implementation using collections.deque page")
	public void the_user_should_be_redirected_to_the_implementation_using_collections_deque_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation using collections.deque");
	}

	@Given("The user is on the Implementation using collections.deque page")
	public void the_user_is_on_the_implementation_using_collections_deque_page() {
		driver.getCurrentUrl();
	}

	@Given("The user is on the try editor page in the Implementation using collections.deque page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_using_collections_deque_page() {
		driverFactory.homepage();
		queuePage.clickQueueGetStartedBtn();
		queuePage.clickImplementationUsingCollectionsDequeue();
		queuePage.clickTryHereBtn();
		// driver.get(TryEditor);
	}

	@When("The user writes invalid python code from excel {string} and {int} and enters in the Editor and clicks the Run Button  for queue tryEditor")
	public void the_user_writes_invalid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_run_button_for_queue_try_editor(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		Excelreaderpython python = new Excelreaderpython();
		String relativePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx";
		Path filePath = Paths.get(relativePath).toAbsolutePath();
		List<Map<String, String>> testDataMap = python.getData(filePath.toString(), sheetName);
		String pcode = testDataMap.get(rowNumber).get("pyCode");
		// wait.until(ExpectedConditions.visibilityOf(queuePage.tryEditor));
		Actions actions = new Actions(driver);
		actions.moveToElement(queuePage.tryEditor).sendKeys(pcode).build().perform();
		queuePage.Invalidinput();
	}

	@When("The user clicks Implementation using array button")
	public void the_user_clicks_implementation_using_array_button() {
		driver.navigate().back();
		queuePage.clickImplementationUsingArray();
	}

	@Then("The user should be redirected to the Implementation using array page")
	public void the_user_should_be_redirected_to_the_implementation_using_array_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation using array");
	}

	@Given("The user is on the Implementation using array page")
	public void the_user_is_on_the_implementation_using_array_page() {
		driver.getCurrentUrl();
	}

	@Given("The user is on the try editor page in the Implementation using array page")
	public void the_user_is_on_the_try_editor_page_in_the_Implementation_using_array_page() {
		driverFactory.homepage();
		queuePage.clickQueueGetStartedBtn();
		queuePage.clickImplementationUsingArray();
		queuePage.clickTryHereBtn();
		// driver.get(TryEditor);

	}

	@Given("The user is on the try editor page  in the Implementation using array page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_using_array_page() {
		driverFactory.homepage();
		queuePage.clickQueueGetStartedBtn();
		queuePage.clickImplementationUsingArray();
		queuePage.clickTryHereBtn();
		// driver.getCurrentUrl();
	}

	@When("The user clicks Queue Operations button")
	public void the_user_clicks_queue_operations_button() {
		driver.navigate().back();
		queuePage.clickQueueOperations();
	}

	@Then("The user should be redirected to the Queue Operations page")
	public void the_user_should_be_redirected_to_the_queue_operations_page() {
		Assert.assertEquals(driver.getTitle(), "Queue Operations");
	}

	@Given("The user is on the Queue Operations page")
	public void the_user_is_on_the_queue_operations_page() {
		driver.getCurrentUrl();

	}

	@Given("The user is on the try editor page in the Queue Operations page")
	public void the_user_is_on_the_try_editor_page_in_the_queue_operations_page() {
		driverFactory.homepage();
		queuePage.clickQueueGetStartedBtn();
		queuePage.clickImplementationUsingArray();
		queuePage.clickTryHereBtn();
		// driver.get(TryEditor);
		// queuePage.clickRunButton();
	}

	@When("The user writes valid python code from excel {string} and {int} and enters in the Editor and clicks the Run Button for queue tryEditor")
	public void the_user_writes_valid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_the_run_button_for_queue_try_editor(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {

		Excelreaderpython python = new Excelreaderpython();
		String relativePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx";
		Path filePath = Paths.get(relativePath).toAbsolutePath();
		List<Map<String, String>> testDataMap = python.getData(filePath.toString(), sheetName);
		String pcode = testDataMap.get(rowNumber).get("pyCode");
		// wait.until(ExpectedConditions.visibilityOf(queuePage.tryEditor));
		Actions actions = new Actions(driver);
		actions.moveToElement(queuePage.tryEditor).sendKeys(pcode).build().perform();
		// wait.until(ExpectedConditions.elementToBeClickable(queuePage.RunButton));
		queuePage.RunButton.click();

	}

	@Given("The user is in the Queue data structure page")
	public void the_user_is_in_the_queue_data_structure_page() {
		driver.navigate().back();
	}

	@When("The User clicks signout button.")
	public void the_user_clicks_signout_button() {
		queuePage.SignOut();
	}

	@Then("The user should signout successfully.")
	public void the_user_should_signout_successfully() {
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
		queuePage.getStatus();

	}
}