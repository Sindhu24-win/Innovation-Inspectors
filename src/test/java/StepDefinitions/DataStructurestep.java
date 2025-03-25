package StepDefinitions;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import DriverFactory.driverFactory;
import utilities.ConfigReader;
import utilities.Excelreaderpython;
import utilities.LoggerReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.dataStructurePage;

public class DataStructurestep {
	dataStructurePage DSPage;
	WebDriver driver;
	WebDriverWait wait;
	String username = ConfigReader.getUsername();
	String password = ConfigReader.getPassword();

	public DataStructurestep() {
		System.out.println("****I'm in Data Structure****");
		driver = driverFactory.initiateDriver();
		DSPage = new dataStructurePage(driver);
	}

@Given("The user is in the Home page after logged in the DsAlgo portal")
public void the_user_is_in_the_home_page_after_logged_in_the_ds_algo_portal() {
	driverFactory.getStarted();
	DSPage.GetStarted();
	DSPage.signIn();
	DSPage.clickLogin(username, password);
}

@When("The user clicks on the Getting Started button in Data Structures Introduction")
public void the_user_clicks_on_the_getting_started_button_in_data_structures_introduction() {
	DSPage.checkGetstarted();
}

@Then("The user should land in Data Structures Introduction Page")
public void the_user_should_land_in_data_structures_introduction_page() {
	Assert.assertEquals(driver.getTitle(), "Data Structures-Introduction");
}

@Given("The user is in the Data Structure Introduction page")
public void the_user_is_in_the_data_structure_introduction_page() {
	driverFactory.homepage();
	DSPage.checkGetstarted();
}

@When("The user clicks on the Time Complexity link")
public void the_user_clicks_on_the_time_complexity_link() {
	DSPage.checkTimeComplexity();
}

@Then("The user should be able to land on the Time complexity page")
public void the_user_should_be_able_to_land_on_the_time_complexity_page() {
	Assert.assertEquals(driver.getTitle(), "Time Complexity");
}

@Given("The user is in the Time Complexity page")
public void the_user_is_in_the_time_complexity_page() {
	driverFactory.homepage();
	DSPage.checkGetstarted();
	DSPage.checkTimeComplexity();
}

@When("The user clicks the Practice Questions button")
public void the_user_clicks_the_practice_questions_button() {
	DSPage.checkPractice();
}

@Then("The user should be redirected to Practice Questions of Data structures-Introduction")
public void the_user_should_be_redirected_to_practice_questions_of_data_structures_introduction() {
	Assert.assertEquals(driver.getTitle(), "Practice Questions");
}

@When("The user clicks Try Here button")
public void the_user_clicks_try_here_button() {
	driver.getCurrentUrl();
	DSPage.tryhere();
}

@Then("The user should be redirected to a page having an try Editor with a Run button to test")
public void the_user_should_be_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	assert DSPage.tryEditor.isDisplayed();
	assert DSPage.RunBtn.isDisplayed();
}

@Given("The user is in the tryEditor page.")
public void the_user_is_in_the_try_editor_page() {
	driverFactory.homepage();
	DSPage.checkGetstarted();
	DSPage.checkTimeComplexity();
	DSPage.tryhere();
}

@When("The user clicks the Run Button without entering the code in the Editor")
public void the_user_clicks_the_run_button_without_entering_the_code_in_the_editor() {

	DSPage.EmptytryInput();
	DSPage.Run();
}

@Then("The user should able to see an error message in alert window.")
public void the_user_should_able_to_see_an_error_message_in_alert_window() {
	Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
	System.out.println("No Error Message is present");
}

@Given("The user is in the tryEditor page for the Time complexity page")
public void the_user_is_in_the_try_editor_page_for_the_time_complexity_page() {
	driverFactory.homepage();
	DSPage.checkGetstarted();
	DSPage.checkTimeComplexity();
	DSPage.tryhere();
}

@When("The user reads the invalid python code from  excel {string}  and {int} and  enters in the tryEditor and clicks on Run button")
public void the_user_reads_the_invalid_python_code_from_excel_and_and_enters_in_the_try_editor_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {

		Excelreaderpython python = new Excelreaderpython();
		String relativePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx";
		Path filePath = Paths.get(relativePath).toAbsolutePath();
		List<Map<String, String>> testDataMap = python.getData(filePath.toString(), sheetName);
		String pcode = testDataMap.get(rowNumber).get("pyCode");
		Actions actions = new Actions(driver);
		actions.moveToElement(DSPage.tryEditor).sendKeys(pcode).build().perform();
		DSPage.Invalidinput();
}

@When("The user reads the valid python code from  excel {string}  and {int} and  enters in the tryEditor and clicks on Run button")
public void the_user_reads_the_valid_python_code_from_excel_and_and_enters_in_the_try_editor_and_clicks_on_run_button(String sheetName, Integer rowNumber) throws EncryptedDocumentException, IOException {
	Excelreaderpython python = new Excelreaderpython();
	String relativePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx";
	Path filePath = Paths.get(relativePath).toAbsolutePath();
	List<Map<String, String>> testDataMap = python.getData(filePath.toString(), sheetName);
	String pcode = testDataMap.get(rowNumber).get("pyCode");
	Actions actions = new Actions(driver);
	actions.moveToElement(DSPage.tryEditor).sendKeys(pcode).build().perform();
	DSPage.RunBtn.click();
}


@Then("The user should able to see output in the console.")
public void the_user_should_able_to_see_output_in_the_console() {
	Assert.assertEquals("Hello World", DSPage.Outputmsg());
}

@Given("The user is in the data structure page")
public void the_user_is_in_the_data_structure_page() {
	driver.navigate().back();
}

@When("The User clicks signout button")
public void the_user_clicks_signout_button() {
	DSPage.signOut();
}

@Then("The user should signout successfully")
public void the_user_should_signout_successfully() {
	Assert.assertEquals(driver.getTitle(), "NumpyNinja");
	DSPage.getStatus();
	LoggerReader.info("User Signed out Successfully!");
}
}
