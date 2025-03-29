package StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import DriverFactory.driverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.RegisterPage;
import Utilities.ExcelReader;
import Utilities.LoggerReader;

public class B_LoginSteps {

	WebDriver driver;
	LoginPage loginPageobj;
	HomePage homeObj;
	RegisterPage registerpage;
	ExcelReader excelReader = new ExcelReader();
	String filePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx"; 
	String sheetName = "Sheet1";

	public B_LoginSteps() {
		driver = driverFactory.initiateDriver(); 
		loginPageobj = new LoginPage(driver); 
		homeObj = new HomePage(driver); 
	}

	@Given("The user is on the login page")
	public void the_user_is_on_the_login_page() {
		homeObj.Gethomeurl();
		loginPageobj.signin();
		LoggerReader.info("User is on LoginPage");
	}

	@When("The user clicks on the Register link")
	public void the_user_clicks_on_the_register_link() {
		loginPageobj.register(); 
	}

	@Then("The user should be redirected to the registration page")
	public void the_user_should_be_redirected_to_the_registration_page() {
		assertTrue(driver.getCurrentUrl().contains("register")); 
	}

	@Given("The user is on the DS Algo Sign in Page")
	public void the_user_is_on_the_ds_algo_sign_in_page() {
		homeObj.Gethomeurl();
		loginPageobj.signin();
	}

	@When("The user clicks the login button after leaving the \"Username\" textbox and \"Password\" textbox empty")
	public void the_user_clicks_the_login_button_after_leaving_the_textbox_and_textbox_empty() {
		loginPageobj.clickLoginButton(); 
	}

	@Then("The error message Please fill out this field. appears below Username textbox during login")
	public void the_error_message_please_fill_out_this_field_appears_below_username_textbox_during_login() {
		assertTrue(loginPageobj.alert.isDisplayed());
	}

	@When("The user clicks the login button after entering the \"Username\" and leaves \"Password\" textbox empty")
	public void the_user_clicks_the_login_button_after_entering_the_and_leaves_textbox_empty() {
		loginPageobj.enterUsername("darshana"); 
		loginPageobj.clickLoginButton(); 
	}

	@Then("The error message Please fill out this field. appears below Password textbox during login")
	public void the_error_message_please_fill_out_this_field_appears_below_password_textbox_during_login() {
		assertTrue(loginPageobj.alert.isDisplayed());
	}

	@When("The user clicks the login button after entering the Password only")
	public void the_user_clicks_the_login_button_after_entering_the_password_only() {
		loginPageobj.enterPassword("zenithhp4987"); 
		loginPageobj.clickLoginButton(); 
	}

	@Then("The error message appears below Username textbox")
	public void the_error_message_appears_below_username_textbox() {
		assertTrue(loginPageobj.alert.isDisplayed());
	}

	@When("The user clicks the login button after entering an invalid username and valid password from excel {int}")
	public void the_user_clicks_the_login_button_after_entering_an_invalid_username_and_valid_password_from_excel_and(
			Integer rowIndex) throws EncryptedDocumentException, IOException {
		ExcelReader.loadExcel(filePath);
		String username = ExcelReader.getCellData(sheetName, rowIndex, 0);
		String password = ExcelReader.getCellData(sheetName, rowIndex, 1);
		loginPageobj.enterUsername(username);
		loginPageobj.enterPassword(password);
		loginPageobj.loginButton.click();
	}

	@Then("The user should see an error message {string}")
	public void the_user_should_see_an_error_message(String expected) {
		assertEquals(expected, loginPageobj.getErrorMessage());
	}

	@When("The user clicks the login button after entering valid username and valid password from excel {int}")
	public void the_user_clicks_the_login_button_after_entering_valid_username_and_valid_password_from_excel_and(
			Integer rowIndex) throws EncryptedDocumentException, IOException {
		ExcelReader.loadExcel(filePath);
		String username = ExcelReader.getCellData(sheetName, rowIndex, 0);
		String password = ExcelReader.getCellData(sheetName, rowIndex, 1);
		System.out.println("Attempting login with Username: " + username + " | Password: " + password);
		loginPageobj.enterUsername(username);
		loginPageobj.enterPassword(password);
		loginPageobj.loginButton.click();
	}

	@Then("The user should land in Data Structure Home Page with message You are logged in")
	public void the_user_should_land_in_data_structure_home_page_with_message_you_are_loggen_in() {
		assertEquals("You are logged in", loginPageobj.getErrorMessage());
		LoggerReader.info("User got the message 'You are logged in'");
	}
}