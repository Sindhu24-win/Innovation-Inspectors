
package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.QueuePage;

public class QueueSteps {
	WebDriverWait wait;
	WebDriver driver;
	QueuePage queuePage = new QueuePage(driver);
	String Url = "https://dsportalapp.herokuapp.com";
	String HomeUrl = "https://dsportalapp.herokuapp.com/home";
	String TryEditor = "https://dsportalapp.herokuapp.com/tryEditor";

	public QueueSteps() {
		System.out.println("****I'm in Queue Data Structure****");
		driver = DriverFactory.initiateDriver();
		queuePage = new QueuePage(driver);
	}

	@Given("The user is signed into the  DSAlgo Portal")
	public void the_user_is_signed_into_the_ds_algo_portal() {
		driver.get(Url);
		queuePage.GetStartedIntro();
		queuePage.SignIn();
		queuePage.Login();

	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
		driver.get(Url);
		queuePage.GetStartedIntro();
		queuePage.SignIn();
		queuePage.Login();
		driver.get(HomeUrl);

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
		// driver.get(HomeUrl);//DriverFactory.homepage();
		// queuePage.clickQueueGetStartedBtn();;
		// queuePage.clickImplementationOfQueueInPython();;
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in Queue in Python page")
	public void the_user_clicks_try_here_button_in_queue_in_python_page() {
		// driver.getCurrentUrl();
		queuePage.clickTryHereBtn();
	}

	@Then("The user should be redirected to a page having a try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
		assert queuePage.tryEditor.isDisplayed();
		assert queuePage.RunButton.isDisplayed();

	}

	@Given("The user is on the try editor page in the Implementation of Queue on Python page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_of_queue_on_python_page() {

		driver.get(TryEditor);
	}

	@When("The user clicks the Run Button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		// queuePage.EmptytryEditor();
		queuePage.clickRunButton();

	}

	@Then("The user should see an error message in the alert window")
	public void the_user_should_see_an_error_message_in_the_alert_window() {

		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@When("The user writes invalid code in the Editor and clicks the Run Button")
	public void the_user_writes_invalid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
		queuePage.Invalidinput();
		Thread.sleep(3000);
		queuePage.clickRunButton();
		try {
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert and accept (click OK)
			Alert alert = driver.switchTo().alert();
			alert.accept(); // Or alert.dismiss() if you want to dismiss the alert

		} catch (NoAlertPresentException e) {
			// No alert was present, continue with the test
			System.out.println("No alert present.");
		}

	}

	@Given("The user is on the try editor page in the Implementation of Queue in Python page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_of_queue_in_python_page() {

		driver.get(TryEditor);
	}

	@When("The user writes valid code in the Editor and clicks the Run Button")
	public void the_user_writes_valid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
		queuePage.Validinput();
		Thread.sleep(2000);
		queuePage.clickRunButton();

	}

	@Then("The user should see the output in the console")
	public void the_user_should_see_the_output_in_the_console() {

		Assert.assertEquals("Hello", queuePage.Outputmsg());
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

		driver.get(TryEditor);
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
	public void the_user_is_on_the_try_Editor_page_in_the_implementation_using_array_page() {
		driver.getCurrentUrl();
		queuePage.clickTryHereBtn();
	}

	@Given("The user is on the try editor page  in the Implementation using array page")
	public void the_user_is_on_the_Try_Editor_page_in_the_implementation_using_array_page() {
		driver.get(TryEditor);

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
		driver.get(TryEditor);
		// queuePage.Signout();

	}

}
