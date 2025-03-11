package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.homePage;

public class Homestep {
	
	
	 
	WebDriver driver;
	// driver.manage().window().maximize();
	 
	    homePage homePageobj;

	@Given("The user is on the home page and logged in with valid credentials")
	public void the_user_is_on_the_home_page_and_logged_in_with_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://dsportalapp.herokuapp.com/home"); // URL of the home page
        
        // Initialize Page Object
        homePageobj = new homePage(driver);
	    
	}

	@When("The user clicks on the sign out button")
	public void the_user_clicks_on_the_sign_out_button() {
	    // Write code here that turns the phrase above into concrete actions
	  homePageobj.clickSignOut();
	}

	@Then("The user should be able to sign out of the portal and see success message")
	public void the_user_should_be_able_to_sign_out_of_the_portal_and_see_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The user is on the DS Algo Portal")
	public void the_user_is_on_the_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks the {string} button in home page")
	public void the_user_clicks_the_button(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user should be navigated to the home page, which displays the {string} and {string} links")
	public void the_user_should_be_navigated_to_the_home_page_which_displays_the_and_links(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The user is on the Home page")
	public void the_user_is_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://dsportalapp.herokuapp.com/home"); // URL of the home page
        
        // Initialize Page Object
        homePageobj = new homePage(driver);
	}

	@When("The user clicks the Data Structures dropdown")
	public void the_user_clicks_the_data_structures_dropdown() {
	    // Write code here that turns the phrase above into concrete actions
	  homePageobj.openDropdown();
	}

	@Then("The user should be able to see {int} options {string} in the dropdown menu")
	public void the_user_should_be_able_to_see_options_in_the_dropdown_menu(Integer int1, String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("The user selects {string} from the drop-down without Sign in")
	public void the_user_selects_from_the_drop_down_without_sign_in(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user should see a warning message {string}")
	public void the_user_should_see_a_warning_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	
	@When("The user clicks {string} button of {string} on the homepage without Sign in")
	public void the_user_clicks_button_of_on_the_homepage_without_sign_in(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The user is logged in to the DS Algo portal")
	public void the_user_is_logged_in_to_the_ds_algo_portal() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user clicks on the dropdown menu and selects the {string} tab")
	public void the_user_clicks_on_the_dropdown_menu_and_selects_the_tab(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user lands on the Stack page")
	public void the_user_lands_on_the_stack_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("The user has the DS Algo portal link or web address")
	public void the_user_has_the_ds_algo_portal_link_or_web_address() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("The user enters the DS Algo portal web address in the browser")
	public void the_user_enters_the_ds_algo_portal_web_address_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user should land on the DS Algo portal in the browser")
	public void the_user_should_land_on_the_ds_algo_portal_in_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user lands on the Array page")
	public void the_user_lands_on_the_array_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user lands on the Linked List page")
	public void the_user_lands_on_the_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("The user lands on the Queue page")
	public void the_user_lands_on_the_queue_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("The user lands on the Tree page")
	public void the_user_lands_on_the_tree_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("The user lands on the Graph page")
	public void the_user_lands_on_the_graph_page() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}
	
	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
	    // Write code here that turns the phrase above into concrete actions
	   WebDriver driver=new ChromeDriver();
	   driver.manage().window().maximize();
       driver.get("https://dsportalapp.herokuapp.com/home"); // URL of the home page
       
       // Initialize Page Object
       homePageobj = new homePage(driver);
	   
	}

	@When("The user clicks {string} on home page")
	public void the_user_clicks_on_home_page(String string) {
	    // Write code here that turns the phrase above into concrete actions
	  //  homePageobj.clickSignIn("Sign In");
	}

	@Then("The user should be redirected to the home page with message {string}")
	public void the_user_should_be_redirected_to_the_home_page_with_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	

}
