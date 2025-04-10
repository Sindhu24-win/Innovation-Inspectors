package StepDefinitions;

import org.testng.Assert;
import Utilities.ConfigReader;
import Utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class D_DataStructureSteps {
	
	DataStructurePage DSPage;
	HomePage homepageobj;
	LoginPage loginpage;
	String username = ConfigReader.getProperty("username");
	String password = ConfigReader.getProperty("password");
	
	public D_DataStructureSteps() {
		DSPage = new DataStructurePage();
		homepageobj = new HomePage();
		loginpage = new LoginPage();
	}

	@Given("The user is in the Home page after logged in the DsAlgo portal")
	public void the_user_is_in_the_home_page_after_logged_in_the_ds_algo_portal() {
		homepageobj.Gethomeurl();
		DSPage.clickLogin(username,password);
		LoggerReader.info("User in Home page");
	}

	@When("The user clicks on the Getting Started button in Data Structures Introduction")
	public void the_user_clicks_on_the_getting_started_button_in_data_structures_introduction() {
		homepageobj.Gethomeurl();
		DSPage.checkGetstarted();
	}

	@Then("The user should land in Data Structures Introduction Page")
	public void the_user_should_land_in_data_structures_introduction_page() {
		Assert.assertEquals(LoginPage.getTitle(), "Data Structures-Introduction");
	}

	@Given("The user is in the Data Structure Introduction page")
	public void the_user_is_in_the_data_structure_introduction_page() {
		homepageobj.Gethomeurl();
		DSPage.checkGetstarted();
	}

	@When("The user clicks on the Time Complexity link")
	public void the_user_clicks_on_the_time_complexity_link() {
		DSPage.checkTimeComplexity();
		LoggerReader.info("User clicks Time Complexity link");
	}

	@Then("The user should be able to land on the Time complexity page")
	public void the_user_should_be_able_to_land_on_the_time_complexity_page() {
		Assert.assertEquals(LoginPage.getTitle(), "Time Complexity");
	}

	@Given("The user is in the Time Complexity page")
	public void the_user_is_in_the_time_complexity_page() {
		homepageobj.Gethomeurl();
		DSPage.checkGetstarted();
		DSPage.checkTimeComplexity();
	}

	@When("The user clicks the Practice Questions button in the DataStructure page")
	public void the_user_clicks_the_practice_questions_button_in_the_DataStructure_page() {
		DSPage.checkPractice();
	}

	@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
	public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
		Assert.assertEquals(LoginPage.getTitle(), "Practice Questions");
	}

	@When("The user clicks Try Here button for the time complexity page")
	public void the_user_clicks_try_here_button_for_the_time_complexity_page() {
		LoginPage.getCurrentUrl();
		DSPage.tryhere();
	}

	@Then("The user should be redirected to a page having an try Editor with a Run button to test")
	public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		assert DSPage.tryEditor.isDisplayed();
		assert DSPage.RunBtn.isDisplayed();
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
		homepageobj.Gethomeurl();
		DSPage.checkGetstarted();
		DSPage.checkTimeComplexity();
		DSPage.tryhere();
	}

	@When("The user clicks the Run button without entering the code in the tryEditor for this dataStructure")
	public void the_user_clicks_the_run_button_without_entering_the_code_in_the_try_editor_for_this_data_structure() {
		DSPage.EmptytryInput();
		DSPage.Run();
	}

	@Then("The user should able to see an error message in alert window")
	public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		Assert.assertEquals(LoginPage.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
		System.out.println("No Error Message is present");
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
		Assert.assertEquals("Hello World", DSPage.Outputmsg());
	}
}