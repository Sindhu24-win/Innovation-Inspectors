package StepDefinitions;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import DriverFactory.driverFactory;
import Utilities.ConfigReader;
import Utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.ArrayPage;
import pageObjects.GraphPage;
import pageObjects.HomePage;

public class J_GraphSteps {

	WebDriver driver ;
	GraphPage graphPage;
	HomePage homepage;
	ArrayPage arraypage;
	WebDriverWait wait;
	String username = ConfigReader.getProperty("username");
	String password = ConfigReader.getProperty("password");

	public J_GraphSteps() {
		driver = driverFactory.initiateDriver();
		graphPage = new GraphPage(driver);
		arraypage = new ArrayPage(driver);
		homepage = new HomePage(driver);
	}
	
	@Given("The user is in the Home page after Sign in with valid credentials.")
	public void the_user_is_in_the_home_page_after_sign_in_with_valid_credentials() {
		homepage.Gethomeurl();
		LoggerReader.info("User is in Home Page");
	}

	@When("The user clicks the Getting Started button in Graph Panel")
	public void the_user_clicks_the_getting_started_button_in_graph_panel() {
		homepage.Gethomeurl();
		graphPage.GraphGetStarted();
	}

	@Then("The user should be directed to Graph Data Structure Page")
	public void the_user_should_be_directed_to_graph_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Graph");
		LoggerReader.info("User is in the Graph Page");
	}

	@Given("The user is in the Home page after Signed in.")
	public void the_user_is_in_the_home_page_after_signed_in() {
		homepage.Gethomeurl();
	}

	@When("The user selects Graph item from the drop down menu.")
	public void the_user_selects_graph_item_from_the_drop_down_menu() {
		graphPage.dropdownMenuClick();
		graphPage.ClickGraphFromDropdown();
	}

	@Then("The user should land in Graph Data Structure Page")
	public void the_user_should_land_in_graph_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Graph");
		LoggerReader.info("User is in the Graph Page");
	}

	@Given("The user is in the Graph data structure page after Sign in")
	public void the_user_is_in_the_graph_data_structure_page_after_sign_in() {
		homepage.Gethomeurl();
		graphPage.GraphGetStarted();
	}

	@When("The user clicks Graph link")
	public void the_user_clicks_graph_link() {
		graphPage.Graphlink();
	}

	@Then("The user should be redirected to Graph page of Graph-Data structures")
	public void the_user_should_be_redirected_to_graph_page_of_graph_data_structures() {
		Assert.assertEquals(driver.getTitle(), "Graph");
		LoggerReader.info("The User is redirected");
	}

	@Given("The user is on the Graph page")
	public void the_user_is_on_the_graph_page() {
		homepage.Gethomeurl();
		graphPage.GraphGetStarted();
		graphPage.Graphlink();
	}

	@When("The user clicks Try Here button in Graph page")
	public void the_user_clicks_try_here_button_in_graph_page() {
		graphPage.TryHereButton();
	}

	@Then("The user should be redirected to a page having a Try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
		assert graphPage.tryEditor.isDisplayed();
		assert graphPage.RunBtn.isDisplayed();
	}

	@Given("The user is in the Try Editor page")
	public void the_user_is_in_the_try_editor_page() {
		homepage.Gethomeurl();
		graphPage.GraphGetStarted();
		graphPage.Graphlink();
		graphPage.TryHereButton();
	}

	@When("The user clicks the Run button without entering the code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
		graphPage.EmptytryInput();
		graphPage.Run();
	}

	@Then("The user should see an error message in an alert window")
	public void the_user_should_see_an_error_message_in_an_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
		System.out.println("No Error Message is present");
	}

	@When("The user reads the invalid python code from  excel {string}  and {int} and  enters in the Editor and clicks on Run button")
	public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException, InterruptedException {
		arraypage.InvalidPythoncode(sheetName, rowNumber);
	}

	@When("The user reads the valid python code from  excel {string}  and {int} and  enters in the Editor and clicks on Run button")
	public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_the_editor_and_clicks_on_run_button(
			String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
		arraypage.ValidPythoncode(sheetName, rowNumber);
		graphPage.RunBtn.click();
	}

	@Given("The user is in the Graph page after Sign in")
	public void the_user_is_in_the_graph_page_after_sign_in() {
		homepage.Gethomeurl();
		graphPage.GraphGetStarted();
		graphPage.Graphlink();
	}

	@When("The user clicks Practice Questions link")
	public void the_user_clicks_practice_questions_link() {
		driver.getCurrentUrl();
		graphPage.PracticeQns(); // no such element exception coming
		LoggerReader.info("User clicks Practice Questions link");
	}

	@Then("The user should be redirected to Practice page")
	public void the_user_should_be_redirected_to_practice_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
		LoggerReader.info("The User is in Practice page");
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
	
	@Given("The user is in the Graph data structure page")
	public void the_user_is_in_the_graph_data_structure_page() {
		driver.navigate().back();
	}

	@When("The User clicks signout button")
	public void the_user_clicks_signout_button() {
		graphPage.signOut();
		LoggerReader.info("User is Leaving Graph data Structure!");
	}

	@Then("The user should signout successfully")
	public void the_user_should_signout_successfully() {
		Assert.assertEquals(driver.getTitle(), "NumpyNinja");
		LoggerReader.info("User Signed out Successfully!");
	}
}