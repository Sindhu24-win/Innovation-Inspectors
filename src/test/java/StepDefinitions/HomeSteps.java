package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverFactory.driverFactory;
import Utilities.ConfigReader;
import Utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.DataStructurePage;
import pageObjects.HomePage;
import pageObjects.LoginPage;

public class HomeSteps {
	WebDriver driver;
	WebDriverWait wait;
    
    HomePage homePageobj;
    LoginPage loginobj;
    DataStructurePage dataobj;
    
    String username = ConfigReader.getUsername();
    String password = ConfigReader.getPassword();
    
    public HomeSteps() {
    	
    	driver = driverFactory.initiateDriver();
    	
        homePageobj = new HomePage(driver);
        loginobj = new LoginPage(driver);
        dataobj = new DataStructurePage(driver);
    }

@Given("The user is on the DS Algo Portal")
public void the_user_is_on_the_ds_algo_portal() {
	 driverFactory.getStarted();
}

@When("The user clicks the Get Started button")
public void the_user_clicks_the_get_started_button() {
	 homePageobj.GetStarted();
	 
}

@Then("The user should be navigated to the home page")
public void the_user_should_be_navigated_to_the_home_page() {
	Assert.assertTrue(driver.getTitle().contains("NumpyNinja"));
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

@Given("The user is on the home page after logging in")
public void the_user_is_on_the_home_page_after_logging_in() {
	driverFactory.homepage();
	}

@When("The user clicks Sign out on home page")
public void the_user_clicks_sign_out_on_home_page() {
	homePageobj.signOut();
	}

@Then("The user should be redirected to the home page with message {string}")
public void the_user_should_be_redirected_to_the_home_page_with_message(String string) {
	LoggerReader.info("User redirected to the Home Page");
}

}
