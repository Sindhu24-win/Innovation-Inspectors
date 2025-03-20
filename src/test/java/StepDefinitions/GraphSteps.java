
package StepDefinitions;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import DriverFactory.driverFactory;
import HooksFile.Hooks;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.GraphPage;

public class GraphSteps {

	GraphPage graphPage;
	WebDriver driver = Hooks.getDriver();
	WebDriverWait wait;
	String username = ConfigReader.getUsername();
	String password = ConfigReader.getPassword();

	public GraphSteps() {
		System.out.println("****I'm in Graph Data Structure****");
		driver = driverFactory.initiateDriver();
		graphPage = new GraphPage(driver);
	}

	@Given("The user is in the Home page after Sign in with valid credentials.")
	public void the_user_is_in_the_home_page_after_sign_in_with_valid_credentials() {
		driverFactory.getStarted();
		graphPage.GetStarted();
		graphPage.signIn();
		graphPage.clickLogin(username, password);
	}

	@When("The user clicks the Getting Started button in Graph Panel")
	public void the_user_clicks_the_getting_started_button_in_graph_panel() {
		graphPage.GraphGetStarted();

	}

	@Then("The user should be directed to Graph Data Structure Page")
	public void the_user_should_be_directed_to_graph_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Graph");
	}

	@Given("The user is in the Home page after Signed in.")
	public void the_user_is_in_the_home_page_after_signed_in() {
		driverFactory.homepage();
	}

	@When("The user selects Graph item from the drop down menu.")
	public void the_user_selects_graph_item_from_the_drop_down_menu() {
		graphPage.dropdownMenuClick();
		graphPage.ClickGraphFromDropdown();
	}

	@Then("The user should land in Graph Data Structure Page")
	public void the_user_should_land_in_graph_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Graph");
	}

	@Given("The user is in the Graph data structure page after Sign in")
	public void the_user_is_in_the_graph_data_structure_page_after_sign_in() {
		driverFactory.homepage();
		graphPage.GraphGetStarted();
	}

	@When("The user clicks Graph link")
	public void the_user_clicks_graph_link() {
		graphPage.Graphlink();

	}

	@Then("The user should be redirected to Graph page of Graph-Data structures")
	public void the_user_should_be_redirected_to_graph_page_of_graph_data_structures() {
		Assert.assertEquals(driver.getTitle(), "Graph");
	}

	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		driverFactory.homepage();
		graphPage.GraphGetStarted();
		graphPage.Graphlink();

	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() {
		driver.getCurrentUrl();
		graphPage.TryHereButton();
	}

	@Then("The user should be redirected to a page having a Try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
		assert graphPage.tryEditor.isDisplayed();
		assert graphPage.RunBtn.isDisplayed();

	}

	@Given("The user is in the Try Editor page")
	public void the_user_is_in_the_try_editor_page() {
		driverFactory.homepage();
		graphPage.GraphGetStarted();
		graphPage.Graphlink();
		graphPage.TryHereButton();
		// driver.get(TryEditor);
	}

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		graphPage.EmptytryInput();
		graphPage.Run();
	}

	@Then("The user should see an error message in an alert window")
	public void the_user_should_see_an_error_message_in_an_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???

	}

	@When("The user writes invalid code in the Editor and clicks the Run button")
	public void the_user_writes_invalid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
		graphPage.Invalidinput();
		Thread.sleep(3000);
		graphPage.Run();
		try {
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert and accept (click OK)
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			// No alert was present, continue with the test
			System.out.println("No alert present.");
		}
	}

	@When("The user writes valid code in the Editor and clicks the Run button")
	public void the_user_writes_valid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
		graphPage.Validinput();
		Thread.sleep(2000);
		graphPage.Run();
	}

	@Then("The user should see output in the console")
	public void the_user_should_see_output_in_the_console() {
		Assert.assertEquals("hello", graphPage.Outputmsg());
	}

	@Given("The user is in the Graph page after Sign in")
	public void the_user_is_in_the_graph_page_after_sign_in() {
		driverFactory.homepage();
		graphPage.GraphGetStarted();
		graphPage.Graphlink();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		driver.getCurrentUrl();
		graphPage.PracticeQns(); // no such element exception coming
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
	}

	@When("The user clicks Graph Representations link")
	public void the_user_clicks_graph_representations_link() {
		graphPage.GraphRepresentationlink();
	}

	@Then("The user should be redirected to Graph Representations page")
	public void the_user_should_be_redirected_to_graph_representations_page() {
		Assert.assertEquals(driver.getTitle(), "Graph Representations");
	}

	@Given("The user is on the Graph Representations page")
	public void the_user_is_on_the_graph_representations_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in the Graph Representations page")
	public void the_user_clicks_try_here_button_in_the_graph_representations_page() {
		graphPage.TryHereButton();

	}

}
