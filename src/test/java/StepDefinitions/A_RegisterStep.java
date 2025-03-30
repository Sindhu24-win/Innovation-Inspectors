package StepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.HomePage;
import pageObjects.RegisterPage;
import Utilities.ExcelReader;
import Utilities.LoggerReader;

public class A_RegisterStep {

	RegisterPage registerobj;
	HomePage homeObj;
	ExcelReader excelReader = new ExcelReader();
	String filePath = "src/test/resources/TestData/Excel_Login_Pythoncode.xlsx"; // Excel file path
	String sheetName = "Register";

	public A_RegisterStep() {
		registerobj = new RegisterPage();
		homeObj = new HomePage();
	}

	@Given("The user is on the user registration page")
	public void the_user_is_on_the_user_registration_page() {
		homeObj.Gethomeurl();
		registerobj.register();
		LoggerReader.info("User is on the User Registration page");
	}

	@When("The user clicks Register button with \"username\" , \"password\" and \"confirm_password\" empty")
	public void the_user_clicks_register_button_with_and_empty() {
		registerobj.clickRegister();

	}

	@Then("The error message should be displayed under username")
	public void the_error_message_should_be_displayed_under_username() {
		assertTrue(registerobj.alert.isDisplayed());
	}

	@When("The user clicks Register button after entering Password and Password Confirmation with Username field empty {int}")
	public void the_user_clicks_register_button_after_entering_password_and_password_confirmation_with_username_field_empty(
			Integer rowIndex) throws IOException {
		ExcelReader.loadExcel(filePath);
		String username = ExcelReader.getCellData(sheetName, rowIndex, 0);
		String password = ExcelReader.getCellData(sheetName, rowIndex, 1);
		String password2 = ExcelReader.getCellData(sheetName, rowIndex, 2);
		registerobj.enterUsername(username);
		registerobj.enterPassword(password);
		registerobj.enterConfirmPassword(password2);
		registerobj.clickRegister();
	}

	@Then("The error message should be displayed {string}")
	public void the_error_message_should_be_displayed(String error) {
		assertTrue(registerobj.alert.isDisplayed());
	}

	@When("The user clicks Register button after entering different passwords in Password and Password Confirmation fields {int}")
	public void the_user_clicks_register_button_after_entering_different_passwords_in_password_and_password_confirmation_fields(
			Integer rowIndex) throws IOException {
		ExcelReader.loadExcel(filePath);
		String username = ExcelReader.getCellData(sheetName, rowIndex, 0);
		String password = ExcelReader.getCellData(sheetName, rowIndex, 1);
		String password2 = ExcelReader.getCellData(sheetName, rowIndex, 2);
		registerobj.enterUsername(username);
		registerobj.enterPassword(password);
		registerobj.enterConfirmPassword(password2);
		registerobj.clickRegister();
	}

	@Then("The user should be able to see a password warning {string}")
	public void the_user_should_be_able_to_see_a_password_warning(String string) {
		assertEquals(string, registerobj.getErrorMessage());
	}

	@When("The user clicks Register button after entering a valid username, password, and password confirmation in related textboxes {int}")
	public void the_user_clicks_register_button_after_entering_a_valid_username_password_and_password_confirmation_in_related_textboxes(
			Integer rowIndex) throws IOException {
		ExcelReader.loadExcel(filePath);
		String username = ExcelReader.getCellData(sheetName, rowIndex, 0);
		String password = ExcelReader.getCellData(sheetName, rowIndex, 1);
		String password2 = ExcelReader.getCellData(sheetName, rowIndex, 2);
		registerobj.enterUsername(username);
		registerobj.enterPassword(password);
		registerobj.enterConfirmPassword(password2);
		registerobj.clickRegister();
	}

	@Then("The user should be redirected to Home Page of DS Algo with success message")
	public void the_user_should_be_redirected_to_home_page_of_ds_algo_with_success_message() {
		assert homeObj.warning1.isDisplayed();

	}

}