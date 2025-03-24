package StepDefinitions;

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
    
    WebDriver driver = Hooks.getDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    
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
        driver.get("https://dsportalapp.herokuapp.com/");
    }

    @When("The user clicks the Get Started button")
    public void the_user_clicks_the_get_started_button() {
        homePageobj.GetStarted();
    }

    @Then("The user should be navigated to the home page")
    public void the_user_should_be_navigated_to_the_home_page() {
        assertTrue(driver.getCurrentUrl().contains("home"));
    }

    @Given("The user is on the Home page")
    public void the_user_is_on_the_home_page() {
        driverFactory.homepage();
    }

    @When("The user selects Data Structures from the drop-down without Sign in")
    public void the_user_selects_data_structures_from_the_drop_down_without_sign_in() {
        //homePageobj.openDropdown();
        homePageobj.dropdown("Arrays");
    }

    @Then("The user should see a warning message {string}")
    public void the_user_should_see_a_warning_message(String expectedMessage) {
        wait.until(ExpectedConditions.visibilityOf(homePageobj.warning));
        Assert.assertTrue(homePageobj.warning.getText().contains(expectedMessage), "Warning message does not match!");
    }

    @When("The user clicks on Login")
    public void the_user_click_on_login() {
        homePageobj.clickSignIn();
    }

    @Then("The user should land on the login page")
    public void the_user_should_land_on_the_login_page() {
        //wait.until(ExpectedConditions.titleContains("Login"));
        Assert.assertTrue(driver.getTitle().contains("Login"));
    }

    @Given("The user is on the login page for home feature")
    public void the_user_is_on_the_login_page_for_home_feature() {
        driverFactory.login();
    }

    @When("The user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {
        homePageobj.clickLogin(username, password);
    }

    @Then("The user should land on the home page with success message")
    public void the_user_should_land_on_the_home_page_with_success_message() {
        wait.until(ExpectedConditions.titleIs("NumpyNinja"));
        Assert.assertEquals(driver.getTitle(), "NumpyNinja");
    }

    @Given("The user is on the home page after logging in")
    public void the_user_is_on_the_home_page_after_logging_in() {
        driverFactory.homepage();
        homePageobj.clickSignIn();
        homePageobj.clickLogin(username, password);
    }

    @When("The user clicks on the dropdown menu and selects the {string} tab")
    public void the_user_clicks_on_the_dropdown_menu_and_selects_the_tab(String tabName) {
        homePageobj.openDropdown();
        homePageobj.dropdown(tabName);
    }

    @Then("The user lands on the Stack page")
    public void the_user_lands_on_the_stack_page() {
        //wait.until(ExpectedConditions.titleContains("Stack"));
        Assert.assertEquals(driver.getTitle(), "Stack");
    }

    @When("The user clicks Sign out on home page")
    public void the_user_clicks_sign_out_on_home_page() {
        homePageobj.clickSignOut();
    }

    @Then("The user should be redirected to the home page with message {string}")
    public void the_user_should_be_redirected_to_the_home_page_with_message(String expectedMessage) {
        wait.until(ExpectedConditions.visibilityOf(homePageobj.logoutMessage));
        Assert.assertTrue(homePageobj.getLogoutMessage().contains(expectedMessage), "Logout message does not match!");
    }
}
