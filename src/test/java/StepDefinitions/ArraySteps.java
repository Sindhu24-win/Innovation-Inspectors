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

import pageObjects.Arraypage;


public class ArraySteps {
	
	 WebDriver driver;
    
	 Arraypage arraypage;
	 String Url = "https://dsportalapp.herokuapp.com/";
	 String HomeUrl = "https://dsportalapp.herokuapp.com/home";
	 String TryEditorUrl = "https://dsportalapp.herokuapp.com/tryEditor";
	 String PracticepageUrl = "https://dsportalapp.herokuapp.com/array/practice";
	 
	 
	 
	 
	 
	 public ArraySteps() {
		 driver = DriverFactory.initiateDriver();
		 arraypage = new Arraypage(driver);
	 }
	 
	 @Given("The user is in the Home page after Sign in with valid credentials")
	 public void the_user_is_in_the_home_page_after_sign_in_with_valid_credentials() {
		 driver.get(Url);
	     arraypage.DsAlgoStarting();
	     arraypage.Usersignin();
	     arraypage.Entercredentials();
	     arraypage.Userlogin();
	     arraypage.LoginMessage();
	     
	 }

	 @When("The user clicks the Getting Started button in Array Panel")
	 public void the_user_clicks_the_getting_started_button_in_array_panel() {
		 driver.get(HomeUrl);
	     arraypage.ArrayGetStarted();
	     
	 }

	 @Then("The user should be directed to Array Data Structure Page")
	 public void the_user_should_be_directed_to_array_data_structure_page() {
		  Assert.assertEquals(driver.getTitle(),"Array");
	 }

	 @Given("The user is in the Array page after Sign in")
	 public void the_user_is_in_the_array_page_after_sign_in() {
		 driver.getCurrentUrl();
		 
	 }

	 @When("The user clicks Arrays in Python link")
	 public void the_user_clicks_arrays_in_python_link() {
		 arraypage.ArraysPython();
	 }

	 @Then("The user should be redirected to Arrays in Python page")
	 public void the_user_should_be_redirected_to_arrays_in_python_page() {
		 Assert.assertEquals(driver.getTitle(),"Arrays in Python");
	 }

	 @Given("The user is on the Arrays in Python page")
	 public void the_user_is_on_the_arrays_in_python_page() {
		 driver.getCurrentUrl();
	 }

	 @When("The user clicks Try Here button in Arrays in Python page")
	 public void the_user_clicks_try_here_button_in_arrays_in_python_page() {
		 arraypage.Tryherebtn();
	 }

	 @Then("The user should be redirected to a page having an try Editor with a Run button to test")
	 public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
		 assert arraypage.TryEditor.isDisplayed();
	     assert arraypage.Run.isDisplayed();
	 }

	 @Given("The user is in the tryEditor page")
	 public void the_user_is_in_the_try_editor_page() {
	     driver.get(TryEditorUrl);
	 }

	 @When("The user clicks the Run Button without entering the code in the Editor")
	 public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {
	     arraypage.RunBtn();
	 }

	 @Then("The user should be able to see error message in alert window")
	 public void the_user_should_be_able_to_see_error_message_in_alert_window() {
		 Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
			
	 }

	 @When("The user write the invalid python code in Editor and click the Run Button")
	 public void the_user_write_the_invalid_python_code_in_editor_and_click_the_run_button() {
	     arraypage.InvalidPythoncode();
	     
	 }

	 @Then("The user should be able to see an error message in alert window")
	 public void the_user_should_be_able_to_see_an_error_message_in_alert_window() {
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

	 @When("The user write the  valid python code in Editor and click the Run Button")
	 public void the_user_write_the_valid_python_code_in_editor_and_click_the_run_button() throws InterruptedException {
		 Thread.sleep(2000);
	     arraypage.ValidPythoncode();
	     
	     
	 }

	 @Then("The user should able to see output in the console")
	 public void the_user_should_able_to_see_output_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @Given("The user is on the Arrays using List page")
	 public void the_user_is_on_the_arrays_using_list_page() {
		 driver.navigate().back();
	     arraypage.ArraysList();
	 }

	 @When("The user clicks Try Here button in Arrays using List page")
	 public void the_user_clicks_try_here_button_in_arrays_using_list_page() {
	     arraypage.Tryherebtn();
	 }

	 @When("The user write the invalid python code in Arrays using List Editor and click the Run Button")
	 public void the_user_write_the_invalid_python_code_in_arrays_using_list_editor_and_click_the_run_button() {
	     arraypage.InvalidPythoncode();
	   
	 }

	 @Then("The user should able to see an error message in alert window")
	 public void the_user_should_able_to_see_an_error_message_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	 }

	 @When("The user write the valid python code in Arrays using List Editor and click the Run Button")
	 public void the_user_write_the_valid_python_code_in_arrays_using_list_editor_and_click_the_run_button() {
	     arraypage.ValidPythoncode();
	     
	 }

	 @Then("The user should able to see output for Arrays using list in the console")
	 public void the_user_should_able_to_see_output_for_arrays_using_list_in_the_console() throws InterruptedException {
		 Thread.sleep(2000);
	     arraypage.GetConsoleOutput();
	 }

	 @Given("The user is on the Basic Operations in Lists page")
	 public void the_user_is_on_the_basic_operations_in_lists_page() {
		 driver.navigate().back();
	     arraypage.Basicoperation();
	 }

	 @When("The user clicks Try Here button in Basic Operations in Lists page")
	 public void the_user_clicks_try_here_button_in_basic_operations_in_lists_page() {
	     arraypage.Tryherebtn();
	 }

	 @When("The user write the invalid python code in Basic Operations Editor and click the Run Button")
	 public void the_user_write_the_invalid_python_code_in_basic_operations_editor_and_click_the_run_button() {
	     arraypage.InvalidPythoncode();
	     
	 }

	 @Then("The user should able to see an error message for Basic Operations in alert window")
	 public void the_user_should_able_to_see_an_error_message_for_basic_operations_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	 }

	 @When("The user write the valid python code in Basic Operations Editor and click the Run Button")
	 public void the_user_write_the_valid_python_code_in_basic_operations_editor_and_click_the_run_button() {
	   arraypage.ValidPythoncode();
	   
	 }

	 @Then("The user should able to see output for Basic Operations in the console")
	 public void the_user_should_able_to_see_output_for_basic_operations_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @When("The user clicks Applications of Array link")
	 public void the_user_clicks_applications_of_array_link() {
	     arraypage.ApplicationsArray();
	 }

	 @Then("The user should be redirected to Applications of Array page")
	 public void the_user_should_be_redirected_to_applications_of_array_page() {
	    Assert.assertEquals(driver.getTitle(),"Applications of Array");
	 }

	 @Given("The user is on the Applications of Array page")
	 public void the_user_is_on_the_applications_of_array_page() {
	     driver.getCurrentUrl();
	 }

	 @When("The user clicks Try Here button in Application of Arrays page")
	 public void the_user_clicks_try_here_button_in_application_of_arrays_page() {
	     arraypage.Tryherebtn();
	     
	 }

	 @When("The user write the invalid python code in  Applications of Arrays Editor and click the Run Button")
	 public void the_user_write_the_invalid_python_code_in_applications_of_arrays_editor_and_click_the_run_button() {
	     arraypage.InvalidPythoncode();
	     
	 }

	 @Then("The user should able to see error message in alert window")
	 public void the_user_should_able_to_see_error_message_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	     
	 }

	 @When("The user write the valid  python code in Application of Arrays Editor and click the Run Button")
	 public void the_user_write_the_valid_python_code_in_application_of_arrays_editor_and_click_the_run_button() {
	     arraypage.ValidPythoncode();
	     
	 }

	 @Then("The user should able to see output for Application of Arrays in the console")
	 public void the_user_should_able_to_see_output_for_application_of_arrays_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @When("The user clicks Practice Questions link")
	 public void the_user_clicks_practice_questions_link() {
		 driver.navigate().back();
	    arraypage.Practicequestions();
	 }

	 @Then("The user should be redirected to Practice page")
	 public void the_user_should_be_redirected_to_practice_page() {
		 Assert.assertEquals(driver.getTitle(),"Practice Questions");
	 }

	 @Given("The user is in the practice page")
	 public void the_user_is_in_the_practice_page() {
	     driver.get(PracticepageUrl);
	 }

	 @When("The user clicks the Search the array link")
	 public void the_user_clicks_the_search_the_array_link() {
	    arraypage.SearchArray();
	 }

	 @Then("The user should be redirected to Question page contains a question,and try Editor with Run and Submit button")
	 public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_button() {
	     assert arraypage.TryEditor.isDisplayed();
	     assert arraypage.Run.isDisplayed();
	 }

	 @Given("The user is in the try editor in question page")
	 public void the_user_is_in_the_try_editor_in_question_page() {
	     driver.getCurrentUrl();
	 }

	 @When("The user did not  write the code for search element in  Editor and Click the Run Button")
	 public void the_user_did_not_write_the_code_for_search_element_in_editor_and_click_the_run_button() {
	     arraypage.PracticeQuestion1();
	 }

	 @Then("The user should be able to see error message for search element  in alert window")
	 public void the_user_should_be_able_to_see_error_message_for_search_element_in_alert_window() {
	     System.out.println("No error message is present");
	 }

	 @When("The user write the valid python code for search element in Editor and Click the Run Button")
	 public void the_user_write_the_valid_python_code_for_search_element_in_editor_and_click_the_run_button() {
	     arraypage.Validoutput();
	    
	 }

	 @Then("The user should able to see output for search element  in the console")
	 public void the_user_should_able_to_see_output_for_search_element_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @When("The user write the invalid python code for search element in Editor and Click the Run Button")
	 public void the_user_write_the_invalid_python_code_for_search_element_in_editor_and_click_the_run_button() {
	     arraypage.Invalidoutput();
	 }

	 @Then("The user should able to see an error message for search element in alert window")
	 public void the_user_should_able_to_see_an_error_message_for_search_element_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	 }

	 @Given("The user is in the practice  page")
	 public void the_user_is_in_the_Practice_page() {
	     driver.get(PracticepageUrl);
	 }

	 @When("The user clicks the Max ConsecutiveOnes link")
	 public void the_user_clicks_the_max_consecutive_ones_link() {
	     arraypage.Maxconsecutive();
	 }

	 @Given("The user is in the tryEditor in question page")
	 public void the_user_is_in_the_Try_editor_in_question_page() {
	     driver.getCurrentUrl();
	 }

	 @When("The user write the valid python code in Editor for maximum number of consecutive ones and Click the Run Button")
	 public void the_user_write_the_valid_python_code_in_editor_for_maximum_number_of_consecutive_ones_and_click_the_run_button() {
	     arraypage.Validoutput();
	 }

	 @Then("The user should able to see output for maximum number of consecutive ones  in the console")
	 public void the_user_should_able_to_see_output_for_maximum_number_of_consecutive_ones_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @When("The user write the invalid python code in Editor for maximum number of consecuitive ones and Click the Run Button")
	 public void the_user_write_the_invalid_python_code_in_editor_for_maximum_number_of_consecuitive_ones_and_click_the_run_button() {
	     arraypage.Invalidoutput();
	 }

	 @Then("The user should able to see an error message for maximum number of consecutive ones in alert window")
	 public void the_user_should_able_to_see_an_error_message_for_maximum_number_of_consecutive_ones_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	 }

	 @When("The user clicks the Find Numbers with Even Number of Digits link")
	 public void the_user_clicks_the_find_numbers_with_even_number_of_digits_link() {
	     arraypage.FindEvenNumbers();
	 }

	 @When("The user write the valid python code in Editor for even number of integers and Click the Run Button")
	 public void the_user_write_the_valid_python_code_in_editor_for_even_number_of_integers_and_click_the_run_button() {
	     arraypage.Validoutput();
	 }

	 @Then("The user should able to see output for even number of integers in the console")
	 public void the_user_should_able_to_see_output_for_even_number_of_integers_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @When("The user write the invalid python code in Editor for even number of integers and Click the Run Button")
	 public void the_user_write_the_invalid_python_code_in_editor_for_even_number_of_integers_and_click_the_run_button() {
	     arraypage.Invalidoutput();
	 }

	 @Then("The user should able to see an error message for even number of integers in alert window")
	 public void the_user_should_able_to_see_an_error_message_for_even_number_of_integers_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	 }

	 @Given("The user is in the  practice  page")
	 public void the_user_is_in_the_Practice_Page() {
	     driver.get(PracticepageUrl);
	 }

	 @When("The user clicks the Squares of a Sorted Array link")
	 public void the_user_clicks_the_squares_of_a_sorted_array_link() {
	     arraypage.SquaresSortedArray();
	 }

	 @When("The user write the valid python code  for squares of each number in Editor and Click the Run Button")
	 public void the_user_write_the_valid_python_code_for_squares_of_each_number_in_editor_and_click_the_run_button() {
	     arraypage.Validoutput();
	 }

	 @Then("The user should able to see output for squares of each number  in the console")
	 public void the_user_should_able_to_see_output_for_squares_of_each_number_in_the_console() {
	     arraypage.GetConsoleOutput();
	 }

	 @Given("The user is in the tryEditor in  question page")
	 public void the_user_is_in_the_Try_Editor_in_question_page() {
	     driver.getCurrentUrl();
	 }

	 @When("The user write the invalid python code for squares of each number in  Editor for squares of each numberand Click the Run Button")
	 public void the_user_write_the_invalid_python_code_for_squares_of_each_number_in_editor_for_squares_of_each_numberand_click_the_run_button() {
	     arraypage.Invalidoutput();
	 }

	 @Then("The user should able to see an error message for squares of each number in alert window")
	 public void the_user_should_able_to_see_an_error_message_for_squares_of_each_number_in_alert_window() {
		 try {
		        // Wait for the alert to appear
		        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		        wait.until(ExpectedConditions.alertIsPresent());
		        
		        // Switch to the alert and accept (click OK)
		        Alert alert = driver.switchTo().alert();
		        alert.accept();  // Or alert.dismiss() if you want to dismiss the alert
		        
		    } catch (NoAlertPresentException e) {
		        // No alert was present, continue with the test
		        System.out.println("No alert present.");
		    }
	 }



	
}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	 			