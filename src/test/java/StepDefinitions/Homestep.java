package StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import DriverFactory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.dataStructurePage;
import pageObjects.homePage;
import pageObjects.loginPage;
import utilities.ConfigReader;

public class Homestep {
    
	WebDriver driver;
	WebDriverWait wait;
    
    homePage homePageobj;
    loginPage loginobj;
    dataStructurePage dataobj;
    
    String username = ConfigReader.getUsername();
    String password = ConfigReader.getPassword();
    
    public Homestep() {
    	
    	driver = driverFactory.initiateDriver();
    	
        homePageobj = new homePage(driver);
        loginobj = new loginPage(driver);
        dataobj = new dataStructurePage(driver);
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

    @Given("The user is on the Home page")
    public void the_user_is_on_the_home_page() {
        driverFactory.homepage();
    }

    @When("The user selects Tree Data Structures from the drop-down without Sign in")
    public void the_user_selects_arrays_data_structures_from_the_drop_down_without_sign_in() {
        homePageobj.dropdownMenuClick();
        homePageobj.clickTreeFromDropdown();
    }

    @Then("The user should see a warning message")
    public void the_user_should_see_a_warning_message() {
      Assert.assertEquals("You are not logged in",homePageobj.warning());
    }

    @Given("The user is on the Home page after signed in")
    public void the_user_is_on_the_home_page_after_signed_in() {
        
    	driverFactory.getStarted();
    	homePageobj.GetStarted();
    	homePageobj.signIn();
    	homePageobj.clickLogin(username, password); // Sign in and sign out has the same xpath. 
    	homePageobj.getStatus();	
    }

    @When("The user selects Tree item from the drop-down menu")
    public void the_user_selects_tree_item_from_the_drop_down_menu() {
    	 homePageobj.dropdownMenuClick();
         homePageobj.clickTreeFromDropdown();
    }

    @Then("The user should land on the Tree Data Structure page")
    public void the_user_should_land_on_the_tree_data_structure_page() {
    	assertEquals("Tree", driver.getTitle());
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
    	Assert.assertEquals(driver.getTitle(), "NumpyNinja");
        homePageobj.getStatus1();
    }

}
