package StepDefinitions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class C_HomeSteps {

	WebDriverWait wait;
	HomePage homePageobj;
	LoginPage loginobj;
	DataStructurePage dataobj;
	
	public C_HomeSteps() {
		
		homePageobj = new HomePage();
		loginobj = new LoginPage();
		dataobj = new DataStructurePage();
	}

	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
		homePageobj.Geturl();
		LoggerReader.info("User is Checking HomePage Links");
	}

	@When("The user clicks the Get Started button")
	public void the_user_clicks_the_get_started_button() {
		homePageobj.GetStarted();
		homePageobj.signout();
	}

	@Then("The user should be navigated to the home page")
	public void the_user_should_be_navigated_to_the_home_page() {
		Assert.assertTrue(LoginPage.getTitle().contains("NumpyNinja"));
		LoggerReader.info("User navigated to Home Page");
	}

	@When("The user selects Tree Data Structures from the drop-down without Sign in")
	public void the_user_selects_tree_data_structures_from_the_drop_down_without_sign_in() {
		homePageobj.dropdownMenuClick();
		homePageobj.clickTreeFromDropdown();
	}

	@Then("The user should see a warning message")
	public void the_user_should_see_a_warning_message() {
		assert homePageobj.warning1.isDisplayed();
	}

}