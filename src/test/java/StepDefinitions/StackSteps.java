
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
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.StackPage;


public class StackSteps {
	
	WebDriverWait wait;
	WebDriver driver;
	StackPage stackPage;
	String Url = "https://dsportalapp.herokuapp.com";
	String HomeUrl = "https://dsportalapp.herokuapp.com/home";
	String TryEditor = "https://dsportalapp.herokuapp.com/tryEditor";

	public StackSteps() {
		System.out.println("****I'm in Stack Data Structure****");
		driver = DriverFactory.initiateDriver();
		stackPage = new StackPage(driver);
		//wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	}

	@Given("the user is on the homepage after logging into the dsAlgo Portal")
	public void the_user_is_on_the_homepage_after_logging_into_the_ds_algo_portal() {
	   driver.get(Url);
	   stackPage.GetStartedIntro();
		stackPage.SignIn();
		stackPage.Login();
		driver.get(HomeUrl);
	}

	@When("the user selects the Getting Started button from the Stack panel")
	public void the_user_selects_the_getting_started_button_from_the_stack_panel() {
		stackPage.StackGetStarted();

	}

	@Then("the user should be redirected to the Stack Data Structure page")
	public void the_user_should_be_redirected_to_the_stack_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Stack");

	}

	@Given("the user is on the Stack page after logging in")
	public void the_user_is_on_the_stack_page_after_logging_in() {
		 driver.getCurrentUrl();

	}

	@When("the user clicks the Operations in Stack link")
	public void the_user_clicks_the_operations_in_stack_link() {
		stackPage.OperationInStack();

	}

	@Then("the user should be navigated to the Operations in Stack page")
	public void the_user_should_be_navigated_to_the_operations_in_stack_page() {
		Assert.assertEquals(driver.getTitle(), "Operations in Stack");

	}

	@Given("the user is on the Operations in Stack page")
	public void the_user_is_on_the_operations_in_stack_page() {
		driver.getCurrentUrl();
		   

	}

	@When("the user clicks the Try Here button on the Stack in Python page")
	public void the_user_clicks_the_try_here_button_on_the_stack_in_python_page() {
		stackPage.Tryhere();

	}

	@Then("the user should be taken to a page containing a try editor with a Run button for testing the code")
	public void the_user_should_be_taken_to_a_page_containing_a_try_editor_with_a_run_button_for_testing_the_code() {
		assert stackPage.TryEditor.isDisplayed();
		assert stackPage.RunBtn.isDisplayed();

	}

	@Given("the user is on the TryEditor page in the Operations in Stack on Python page")
	public void the_user_is_on_the_try_editor_page_in_the_operations_in_stack_on_python_page() {
		driver.get(Url);
		stackPage.GetStartedIntro();
		stackPage.SignIn();
		stackPage.Login();
		stackPage.StackGetStarted();
		stackPage.OperationInStack();
		stackPage.Tryhere();
	   driver.get(TryEditor);

	}

	@When("the user clicks the Run button without any code in the editor")
	public void the_user_clicks_the_run_button_without_any_code_in_the_editor() {
		stackPage.RunBtn();

	}

	@Then("the user should receive an error message in the alert window")
	public void the_user_should_receive_an_error_message_in_the_alert_window() {
		Assert.assertEquals(driver.getTitle(), "Assessment");

	}

	@When("the user types invalid code in the editor and clicks the Run button")
	public void the_user_types_invalid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
		stackPage.Invalidinput();
		Thread.sleep(3000);
		//wait.until(ExpectedConditions.elementToBeClickable(stackPage.RunBtn));
		stackPage.RunBtn();
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

	@Then("the user should see an error message in the alert window")
	public void the_user_should_see_an_error_message_in_the_alert_window() {
	    
		Assert.assertEquals(driver.getTitle(), "Assessment");
	}

	@When("the user enters valid code in the editor and clicks the Run button")
	public void the_user_enters_valid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
	  //driver.getCurrentUrl();
		//driver.get(TryEditor);
	   stackPage.Validinput();
	   Thread.sleep(2000);
	  // wait.until(ExpectedConditions.elementToBeClickable(stackPage.RunBtn));
	   stackPage.RunBtn();
	   

	}

	//@Then("the user should see an error message in the alert window")
	//public void the_user_should_see_an_error_message_in_the_alert_Window() {
		//Assert.assertEquals(driver.getTitle(), "Assessment");
	//}

	//@When("the user enters valid code in the editor and clicks the Run button")
	//public void the_user_enters_valid_code_in_the_editor_and_clicks_the_Run_button() throws InterruptedException {
		// stackPage.Validinput();
		  // Thread.sleep(2000);
		  // wait.until(ExpectedConditions.elementToBeClickable(stackPage.RunBtn));
		   //stackPage.RunBtn();
//}

	@Then("the user should see the output displayed in the console")
	public void the_user_should_see_the_output_displayed_in_the_console() {
		Assert.assertEquals("HelloWorld", stackPage.consoleOutput());
 
	}

	@Given("the user is on the Stack page after logging into the dsAlgo Portal")
	public void the_user_is_on_the_stack_page_after_logging_into_the_ds_algo_portal() {
		 driver.get(HomeUrl);
		    stackPage.GetStartedIntro();
		    stackPage.SignIn();
		    stackPage.Login();
		    stackPage.StackGetStarted();
		    stackPage.OperationInStack();

	}

	@When("the user clicks the Practice Questions button in the Operations in Stack on Python page")
	public void the_user_clicks_the_practice_questions_button_in_the_operations_in_stack_on_python_page() {
		 stackPage.StackPracticeQuestions();

	}

	@Then("the user should be redirected to the Practice Questions page")
	public void the_user_should_be_redirected_to_the_practice_questions_page() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");

	}

	@When("the user clicks the Implementation link")
	public void the_user_clicks_the_implementation_link() {
		 driver.navigate().back();
		    stackPage.Implementation();

	}

	@Then("the user should be taken to the Implementation page")
	public void the_user_should_be_taken_to_the_implementation_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation");
		   

	}

	@Given("the user is on the Implementation page")
	public void the_user_is_on_the_implementation_page() {
		driver.getCurrentUrl();
	}

	@Then("the user should be redirected to a page containing a try editor with a Run button for testing the code")
	public void the_user_should_be_redirected_to_a_page_containing_a_try_editor_with_a_run_button_for_testing_the_code() {
		assert stackPage.TryEditor.isDisplayed();
		assert stackPage.RunBtn.isDisplayed();

	}

	@Given("the user is on the TryEditor page in the Implementation page")
	public void the_user_is_on_the_try_editor_page_in_the_implementation_page() {
	   driver.get(TryEditor);
	}

	@When("the user clicks the Run button without entering any code in the editor")
	public void the_user_clicks_the_run_button_without_entering_any_code_in_the_editor() {
		 stackPage.RunBtn();

	}

	@When("the user enters invalid code in the editor and clicks the Run button")
	public void the_user_enters_invalid_code_in_the_editor_and_clicks_the_run_button() throws InterruptedException {
		stackPage.Invalidinput();
		Thread.sleep(3000);
		 //wait.until(ExpectedConditions.elementToBeClickable(stackPage.RunBtn));
		stackPage.RunBtn();
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

	

	@When("the user clicks the Applications link")
	public void the_user_clicks_the_applications_link() {
		driver.getCurrentUrl();
	    stackPage.Application();

	}

	@Then("the user should be taken to the Applications page")
	public void the_user_should_be_taken_to_the_applications_page() {
		Assert.assertEquals(driver.getTitle(), "Applications");
	}

	@Given("the user is on the Applications page")
	public void the_user_is_on_the_applications_page() {
		 driver.getCurrentUrl();
		   

	}

	@Given("the user is on the TryEditor page in the Applications page")
	public void the_user_is_on_the_try_editor_page_in_the_applications_page() {
	  driver.get(TryEditor);
	}




}
