package StepDefinitions;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.DriverFactory;
import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Linkedlistpage;

public class LinkedlistSteps {
	WebDriver driver;
	Linkedlistpage linkedlistpage;
	

	 String username = "darshana";
	 String password = "zenithhp4987";
	 
	 String HomeUrl = "https://dsportalapp.herokuapp.com/home";
	 String TryEditorUrl = "https://dsportalapp.herokuapp.com/tryEditor";
	 String PracticepageUrl = "https://dsportalapp.herokuapp.com/array/practice";
	 
	 
	 public LinkedlistSteps() {
		 driver = DriverFactory.initiateDriver();
		 linkedlistpage = new Linkedlistpage(driver);
		  
	 }
	 

@Given("The user is in the Home Page")
public void the_user_is_in_the_home_page() {
    driver.get(HomeUrl);
}

@When("The user clicks the Sign in button to enter username and password")
public void the_user_clicks_the_sign_in_button_to_enter_username_and_password() {
    linkedlistpage.signingin();
    linkedlistpage.EnterCredentials(username, password);
    
}

@Then("The user clicks on Login and sees logged in message")
public void the_user_clicks_on_login_and_sees_logged_in_message() {
  linkedlistpage.login();
  linkedlistpage.LoginStatus();
}

@Given("The user is in home page after sign in")
public void the_user_is_in_home_page_after_sign_in() {
    driver.get(HomeUrl);
}

@When("The user clicks Get Started button in Linkedlist panel")
public void the_user_clicks_get_started_button_in_linkedlist_panel() {
    linkedlistpage.Getstarted();
}

@Then("The user should land on LinkedList page")
public void the_user_should_land_on_linked_list_page() {
	Assert.assertEquals(driver.getTitle(),"Linked List");
}

@Given("The user is in the Linked List page after Sign in")
public void the_user_is_in_the_Linked_list_page_after_sign_in() {
    driver.getCurrentUrl();
}

@When("The user clicks Introduction link")
public void the_user_clicks_introduction_link() {
	linkedlistpage.Introductionpage();
}

@Then("The user should be redirected to Introduction page")
public void the_user_should_be_redirected_to_introduction_page() {
	Assert.assertEquals(driver.getTitle(),"Introduction");
}

@Given("The user is on the Introduction page")
public void the_user_is_on_the_introduction_page() {
    driver.getCurrentUrl();
}

@When("The user clicks Try Here button in Introduction page")
public void the_user_clicks_try_here_button_in_introduction_page() {
    linkedlistpage.Tryhere();
}

@Given("The user is in the tryEditor page for Introduction")
public void the_user_is_in_the_try_editor_page_for_introduction() {
    driver.get(TryEditorUrl);
}

@When("The user clicks the Run Button without entering the code in the Introduction Try Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_introduction_try_editor() {
    linkedlistpage.Nocode();
}

@Then("The user should be able to see error message for Introduction  in alert window")
public void the_user_should_be_able_to_see_error_message_for_introduction_in_alert_window() {
	 Assert.assertEquals(driver.getTitle(),"Assessment");//No Alert present
}

@Given("The user is in the Introduction tryEditor page")
public void the_user_is_in_the_introduction_try_editor_page() {
    driver.get(TryEditorUrl);
}

@When("The user write the valid python code in Introduction Try Editor and click the Run Button")
public void the_user_write_the_valid_python_code_in_introduction_try_editor_and_click_the_run_button() {
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Introduction in the console")
public void the_user_should_able_to_see_output_for_introduction_in_the_console() {
	 Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@When("The user write the invalid python code in Introduction Try Editor and click the Run Button")
public void the_user_write_the_invalid_python_code_in_introduction_try_editor_and_click_the_run_button() {
    linkedlistpage.Invalidcode();
}

@Then("The user should able to see an error message for Introduction in alert window")
public void the_user_should_able_to_see_an_error_message_for_introduction_in_alert_window() {
	 try {
	        // Wait for the alert to appear
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
	        wait.until(ExpectedConditions.alertIsPresent());
	        
	        // Switch to the alert and accept (click OK)
	        Alert alert = driver.switchTo().alert();
	        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
	        
	    } catch (NoAlertPresentException e) {
	        // No alert was present, continue with the test
	        System.out.println("No alert present.");
	    }
}


@Given("The user is on the Creating Linked List page")
public void the_user_is_on_the_creating_linked_list_page() {
   driver.navigate().back();
   linkedlistpage.CreatingLinkedlist();
}

@When("The user clicks Try Here button in Creating Linked List page")
public void the_user_clicks_try_here_button_in_creating_linked_list_page() {
    linkedlistpage.Tryhere();
}

@Then("The user should be redirected to Creating Linked list page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_creating_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
	 assert linkedlistpage.Tryeditor.isDisplayed();
	   assert linkedlistpage.TryeditorRun.isDisplayed();
}

@Given("The user is in the tryEditor page for Creating Linked List page")
public void the_user_is_in_the_try_editor_page_for_creating_linked_list_page() {
    driver.get(TryEditorUrl);
}

@When("The user clicks the Run Button without entering the code in the Creating Linked List Try Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_creating_linked_list_try_editor() {
    linkedlistpage.Nocode();
}

@Then("The user should be able to see error message for Creating Linked List  in alert window")
public void the_user_should_be_able_to_see_error_message_for_creating_linked_list_in_alert_window() {
	 Assert.assertEquals(driver.getTitle(),"Assessment");//No Alert present
    
}

@When("The user write the invalid python code in Creating Linked List Try Editor and click the Run Button")
public void the_user_write_the_invalid_python_code_in_creating_linked_list_try_editor_and_click_the_run_button() {
   linkedlistpage.Invalidcode();
}

@Then("The user should able to see an error message for Creating Linked List in alert window")
public void the_user_should_able_to_see_an_error_message_for_creating_linked_list_in_alert_window() {
	try {
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        // Switch to the alert and accept (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
        
    } catch (NoAlertPresentException e) {
        // No alert was present, continue with the test
        System.out.println("No alert present.");
    }
    
}

@When("The user write the valid python code in  Creating Linked List Try Editor and click the Run Button")
public void the_user_write_the_valid_python_code_in_creating_linked_list_try_editor_and_click_the_run_button() {
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Creating Linked List  in the console")
public void the_user_should_able_to_see_output_for_creating_linked_list_in_the_console() {
	 Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@Given("The user is on the Types of Linked List page")
public void the_user_is_on_the_types_of_linked_list_page() {
    driver.navigate().back();
    linkedlistpage.TypesLinkedlist();
}

@When("The user clicks Try Here button in Types of Linked List page")
public void the_user_clicks_try_here_button_in_types_of_linked_list_page() {
    linkedlistpage.Tryhere();
}

@Then("The user should be redirected to Types of Linked List page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_types_of_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
	 assert linkedlistpage.Tryeditor.isDisplayed();
	   assert linkedlistpage.TryeditorRun.isDisplayed();
}

@Given("The user is in the tryEditor page for Types of Linked List page")
public void the_user_is_in_the_try_editor_page_for_types_of_linked_list_page() {
    driver.get(TryEditorUrl);
}

@When("The user write the invalid python code in Types of Linked List Try Editor and click the Run Button")
public void the_user_write_the_invalid_python_code_in_types_of_linked_list_try_editor_and_click_the_run_button() {
    linkedlistpage.Invalidcode();
}

@Then("The user should able to see an error message for Types of Linked List in alert window")
public void the_user_should_able_to_see_an_error_message_for_types_of_linked_list_in_alert_window() {
	try {
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        // Switch to the alert and accept (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
        
    } catch (NoAlertPresentException e) {
        // No alert was present, continue with the test
        System.out.println("No alert present.");
    }
}

@When("The user write the valid python code in  Types of Linked List Try Editor and click the Run Button")
public void the_user_write_the_valid_python_code_in_types_of_linked_list_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Types of Linked List  in the console")
public void the_user_should_able_to_see_output_for_types_of_linked_list_in_the_console() throws InterruptedException {
	Thread.sleep(2000);
	 Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@Given("The user is in the  Linked List  page after Sign in")
public void the_user_is_in_the_linked_list_page_after_sign_in() {
    driver.navigate().back();
    
    
    
    
}

@When("The user clicks Implement Linked List in Python link")
public void the_user_clicks_implement_linked_list_in_python_link() {
	
    linkedlistpage.ImplementingList();
}

@Then("The user should be redirected to Implement Linked List in Python page")
public void the_user_should_be_redirected_to_implement_linked_list_in_python_page() {
	Assert.assertEquals(driver.getTitle(),"Implement Linked List in Python");
}

@Given("The user is on the Implement Linked List in Python page")
public void the_user_is_on_the_implement_linked_list_in_python_page() {
    driver.getCurrentUrl();
}

@When("The user clicks Try Here button in Implement Linked List in Python page")
public void the_user_clicks_try_here_button_in_implement_linked_list_in_python_page() {
    linkedlistpage.Tryhere();
}

@Then("The user should be redirected to Implement Linked List page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_implement_linked_list_page_having_an_try_editor_with_a_run_button_to_test() {
	 assert linkedlistpage.Tryeditor.isDisplayed();
	   assert linkedlistpage.TryeditorRun.isDisplayed();
}

@Given("The user is in the tryEditor page for Implement Linked List")
public void the_user_is_in_the_try_editor_page_for_implement_linked_list() {
    driver.get(TryEditorUrl);
}

@When("The user clicks the Run Button without entering the code in the Implement Linked List Try Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_implement_linked_list_try_editor() {
    linkedlistpage.Nocode();
}

@Then("The user should be able to see error message for Implement Linked List   in alert window")
public void the_user_should_be_able_to_see_error_message_for_implement_linked_list_in_alert_window() {
	 Assert.assertEquals(driver.getTitle(),"Assessment");//No Alert present
}

@When("The user clicks the Run Button with entering the invalid python code in the Implement Linked List Try Editor")
public void the_user_clicks_the_run_button_with_entering_the_invalid_python_code_in_the_implement_linked_list_try_editor() {
    linkedlistpage.Invalidcode();
}

@Then("The user should able to see an error message for Implement Linked List  in alert window")
public void the_user_should_able_to_see_an_error_message_for_implement_linked_list_in_alert_window() {
	try {
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        // Switch to the alert and accept (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
        
    } catch (NoAlertPresentException e) {
        // No alert was present, continue with the test
        System.out.println("No alert present.");
    }
   
}

@When("The user write the valid python code in Implement Linked List Try Editor and click the Run Button")
public void the_user_write_the_valid_python_code_in_implement_linked_list_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Implement Linked List in the console")
public void the_user_should_able_to_see_output_for_implement_linked_list_in_the_console() {
	 Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@Given("The user is on Traversal page")
public void the_user_is_on_traversal_page() {
    driver.navigate().back();
}

@When("The user clicks Traversal link")
public void the_user_clicks_traversal_link() {
    linkedlistpage.Traversal();
}

@Then("The user should be redirected to Traversal page")
public void the_user_should_be_redirected_to_traversal_page() {
	Assert.assertEquals(driver.getTitle(),"Traversal");
}

@Given("The user is on the  Traversal page")
public void the_user_is_on_the_traversal_page() {
	driver.getCurrentUrl();
    
}

@When("The user clicks the Try here  button in Traversal page")
public void the_user_clicks_the_try_here_button_in_traversal_page() {
    linkedlistpage.Tryhere();
}

@Then("The user should be redirected to Try Editor page when clicking on Try here button")
public void the_user_should_be_redirected_to_try_editor_page_when_clicking_on_try_here_button() {
	Assert.assertEquals(driver.getTitle(),"Assessment");
}

@Given("The user is on the tryEditor  page for Traversal")
public void the_user_is_on_the_try_editor_page_for_traversal() {
    driver.get(TryEditorUrl);
}

@When("The user did not  write the code in  Traversal Try Editor and Click the Submit Button")
public void the_user_did_not_write_the_code_in_traversal_try_editor_and_click_the_submit_button() {
   linkedlistpage.Nocode();
}

@Then("The user should be able to see error message for Traversal  in alert window")
public void the_user_should_be_able_to_see_error_message_for_traversal_in_alert_window() {
	Assert.assertEquals(driver.getTitle(),"Assessment");//No Alert present
    
}

@When("The user write the invalid python code in  Traversal Try Editor and Click the Run Button")
public void the_user_write_the_invalid_python_code_in_traversal_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Invalidcode();
}

@Then("The user should able to see an error message for Traversal  in alert window")
public void the_user_should_able_to_see_an_error_message_for_traversal_in_alert_window() {
	try {
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        // Switch to the alert and accept (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
        
    } catch (NoAlertPresentException e) {
        // No alert was present, continue with the test
        System.out.println("No alert present.");
    }
}

@When("The user write the valid python code in Traversal Try Editor and Click the Run Button")
public void the_user_write_the_valid_python_code_in_traversal_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Traversal  in the console")
public void the_user_should_able_to_see_output_for_traversal_in_the_console() throws InterruptedException {
	Thread.sleep(2000);
	 Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@Given("The user is on the Linked List page")
public void the_user_is_on_the_linked_list_page() {
   driver.navigate().back();
   
}

@When("The user clicks the Insertion  link")
public void the_user_clicks_the_insertion_link() {
    linkedlistpage.Insertion();
}

@Then("The user should be redirected to Insertion page from Linked List page")
public void the_user_should_be_redirected_to_insertion_page_from_linked_list_page() {
	Assert.assertEquals(driver.getTitle(),"Insertion");
   
}

@Given("The user is on the Insertion page")
public void the_user_is_on_the_insertion_page() {
    driver.getCurrentUrl();
}

@When("The user clicks the Try here button in Insertion page")
public void the_user_clicks_the_try_here_button_in_insertion_page() {
   linkedlistpage.Tryhere();
}

@Then("The user should be redirected to Try Editor page from Insertion page")
public void the_user_should_be_redirected_to_try_editor_page_from_insertion_page() {
	Assert.assertEquals(driver.getTitle(),"Assessment");
    
}

@Given("The user is on the Try Editor page for Insertion")
public void the_user_is_on_the_try_editor_page_for_insertion() {
    driver.get(TryEditorUrl);
}

@When("The user did not  write the code in  Insertion Try Editor and Click the Submit Button")
public void the_user_did_not_write_the_code_in_insertion_try_editor_and_click_the_submit_button() {
    linkedlistpage.Nocode();
}

@Then("The user should be able to see error message for Insertion in alert window")
public void the_user_should_be_able_to_see_error_message_for_insertion_in_alert_window() {
	Assert.assertEquals(driver.getTitle(),"Assessment");//No Alert Present
}

@When("The user write the valid code in Insertion Try Editor and Click the Run Button")
public void the_user_write_the_valid_code_in_insertion_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Insertion  in the console")
public void the_user_should_able_to_see_output_for_insertion_in_the_console() throws InterruptedException {
	Thread.sleep(2000);
	 Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@When("The user write the invalid code in Insertion Try Editor and Click the Run Button")
public void the_user_write_the_invalid_code_in_insertion_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Invalidcode();
}

@Then("The user should able to see an error message for Insertion  in alert window")
public void the_user_should_able_to_see_an_error_message_for_insertion_in_alert_window() {
	try {
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        // Switch to the alert and accept (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
        
    } catch (NoAlertPresentException e) {
        // No alert was present, continue with the test
        System.out.println("No alert present.");
    }
    
}

@Given("The user is on the Deletion page")
public void the_user_is_on_the_deletion_page() {
    driver.navigate().back();
}

@When("The user clicks the Deletion link")
public void the_user_clicks_the_deletion_link() {
    linkedlistpage.Deletion();
}

@Then("The user should be redirected to Deletion page")
public void the_user_should_be_redirected_to_deletion_page() {
	Assert.assertEquals(driver.getTitle(),"Deletion");
    
}

@When("The user clicks the Try Here  button in Deletion page")
public void the_user_clicks_the_try_here_button_in_deletion_page() {
    linkedlistpage.Tryhere();
}

@Then("The user should be redirected to Deletion  Try Editor  page")
public void the_user_should_be_redirected_to_deletion_try_editor_page() {
	Assert.assertEquals(driver.getTitle(),"Assessment");
}

@Given("The user is on the tryEditor  page for Deletion")
public void the_user_is_on_the_try_editor_page_for_Deletion() {
    driver.getCurrentUrl();
}

@When("The user did not  write the code in Deletion Try Editor and Click the Submit Button")
public void the_user_did_not_write_the_code_in_deletion_try_editor_and_click_the_submit_button() {
   linkedlistpage.Nocode();
}

@Then("The user should be able to see error message for Deletion  in alert window")
public void the_user_should_be_able_to_see_error_message_for_deletion_in_alert_window() {
	Assert.assertEquals(driver.getTitle(),"Assessment");//No Alert present
	}


@Given("The user is on the Try Editor  page for Deletion")
public void the_user_is_on_the_try_editor_page_for_deletion() {
    driver.getCurrentUrl();
}

@When("The user  write the invalid python code in Deletion Try Editor and Click the Submit Button")
public void the_user_write_the_invalid_python_code_in_deletion_try_editor_and_click_the_submit_button() throws InterruptedException {
	Thread.sleep(2000);
    linkedlistpage.Invalidcode();
}

@Then("The user should  be able to see an error message for Deletion in the alert window")
public void the_user_should_be_able_to_see_an_error_message_for_deletion_in_the_alert_window() {
	try {
        // Wait for the alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.alertIsPresent());
        
        // Switch to the alert and accept (click OK)
        Alert alert = driver.switchTo().alert();
        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
        
    } catch (NoAlertPresentException e) {
        // No alert was present, continue with the test
        System.out.println("No alert present.");
    }
    
}

@When("The user write the valid python code in Deletion Try Editor and Click the Run Button")
public void the_user_write_the_valid_python_code_in_deletion_try_editor_and_click_the_run_button() throws InterruptedException {
	Thread.sleep(2000);
	driver.get(TryEditorUrl);
    linkedlistpage.Validcode();
}

@Then("The user should able to see output for Deletion in the console")
public void the_user_should_able_to_see_output_for_deletion_in_the_console() throws InterruptedException {
	Thread.sleep(2000);
    Assert.assertEquals("('Banana', 'Apple', 'Orange')",linkedlistpage.ValidOutput());
}

@Given("The user is on the Practice Questions  page")
public void the_user_is_on_the_practice_questions_page() {
    driver.navigate().back();
}

@When("The user clicks on Practice Questions link in Linked List page")
public void the_user_clicks_on_practice_questions_link_in_linked_list_page() {
    linkedlistpage.PracticeQuestion();
}

@Then("The user should be redirected to Practice Questions page")
public void the_user_should_be_redirected_to_practice_questions_page() {
	Assert.assertEquals(driver.getTitle(),"Practice Questions");//Practice Questions page is empty
}




	
	
	
	
}
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
