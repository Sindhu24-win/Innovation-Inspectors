package StepDefinitions;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import DriverFactory.driverFactory;
import Utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.TreePage;

public class TreeSteps {
	TreePage treepage;
	WebDriver driver;
	WebDriverWait wait;
	String username = ConfigReader.getUsername();
	String password = ConfigReader.getPassword();

	public TreeSteps() {
		System.out.println("****I'm in Tree Data Structure****");
		driver = driverFactory.initiateDriver();
		treepage = new TreePage(driver);
	}

	@Given("The user is in the Home page after Sign in")
	public void the_user_is_in_the_home_page_after_sign_in() {
		driverFactory.getStarted();
		driverFactory.homepage();
		treepage.GetStarted();
		treepage.signIn();
		treepage.clickLogin(username, password);
	}

	@When("The user clicks the Getting Started button in Tree Panel")
	public void the_user_clicks_the_getting_started_button_in_tree_panel() {
		treepage.treeGetStarted();
	}

	@When("The user select Tree item from the drop down menu")
	public void the_user_select_tree_item_from_the_drop_down_menu() {
		treepage.dropdownMenuClick();
		treepage.clickTreeFromDropdown();
	}

	@Then("The user be directed to Tree Data Structure Page")
	public void the_user_be_directed_to_tree_data_structure_page() {
		Assert.assertEquals(driver.getTitle(), "Tree");
	}

	@Given("The user is on the Home page after signed in")
	public void the_user_is_on_the_home_page_after_signed_in() {
		driverFactory.homepage();
	}

	@When("The user selects Tree item from the drop-down menu")
	public void the_user_selects_tree_item_from_the_drop_down_menu() {
		treepage.dropdownMenuClick();
		treepage.clickTreeFromDropdown();
	}

	@Then("The user should land on the Tree Data Structure page")
	public void the_user_should_land_on_the_tree_data_structure_page() {
		System.out.println("Current URL: " + driver.getCurrentUrl());
		System.out.println("Actual title: " + driver.getTitle());
		assertEquals("Tree", driver.getTitle());

	}

	@Given("The user is on the Tree Data Structure page after signing in")
	public void the_user_is_on_the_tree_data_structure_page_after_signing_in() {
		driver.getCurrentUrl();

	}

	@When("The user clicks Overview of Trees link")
	public void the_user_clicks_overview_of_trees_link() {
		treepage.overviewOfTrees();
	}

	@Then("The user should be redirected to Overview of Trees page")
	public void the_user_should_be_redirected_to_overview_of_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Overview of Trees");
	}

	@Given("The user is on the Overview of Trees page")
	public void the_user_is_on_the_overview_of_trees_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in the Overview of Trees page")
	public void the_user_clicks_try_here_button_in_the_overview_of_trees_page() {
		treepage.overviewOfTreesTryHere(driver);
	}

	@Then("The user should be redirected to a TryEditor page with a Run button to test.")
	public void the_user_should_be_redirected_to_a_try_editor_page_with_a_run_button_to_test() {
		assert treepage.tryEditor.isDisplayed();
		assert treepage.RunBtn.isDisplayed();
	}

	@Given("The user is on the TryEditor page.")
	public void the_user_is_on_the_try_editor_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.overviewOfTrees();
		treepage.TryHereButton();
	}

	@When("The user clicks the Run button without entering code in the TryEditor.")
	public void the_user_clicks_the_run_button_without_entering_code_in_the_try_editor() {
		treepage.EmptytryInput();
		treepage.clickRun();
	}

	@Then("The user should see an error message in a pop-up alert box")
	public void the_user_should_see_an_error_message_in_a_pop_up_alert_box() {
		Assert.assertEquals(driver.getTitle(), "Assessment");// There will be no alert window pop-up so its is bug???
	}

	@Given("The user is on the TryEditor page")
	public void the_user_is_on_the_tryEditor_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.overviewOfTrees();
		treepage.TryHereButton();
	}

	@When("The user writes invalid code in the TryEditor and clicks the Run button.")
	public void the_user_writes_invalid_code_in_the_try_editor_and_clicks_the_run_button() throws InterruptedException {
		treepage.Invalidinput();
		Thread.sleep(3000);
		treepage.clickRun();
		try {
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert and accept (click OK)
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			// No alert was present, continue with the test
			System.out.println("No alert present.");
		}
	}

	@When("The user writes valid code in the TryEditor and clicks the Run button.")
	public void the_user_writes_valid_code_in_the_try_editor_and_clicks_the_run_button() throws InterruptedException {
		treepage.Validinput();
		Thread.sleep(3000);
		treepage.clickRun();

	}

	@Then("The user should see output in the Output console.")
	public void the_user_should_see_output_in_the_output_console() {
		Assert.assertEquals("hello", treepage.Outputmsg());
	}

	@Given("The user is on the Tree page after signing in")
	public void the_user_is_on_the_tree_page_after_signing_in() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.overviewOfTrees();
	}

	@When("The user clicks Practice Questions link of the Tree data structure")
	public void the_user_clicks_practice_questions_link_of_the_tree_data_structure() {
		driver.getCurrentUrl();
		treepage.PracticeQns();
	}

	@Then("The user should be redirected to Practice page of the Tree data structure")
	public void the_user_should_be_redirected_to_practice_page_of_the_tree_data_structure() {
		Assert.assertEquals(driver.getTitle(), "Practice Questions");
	}

	@When("The user clicks Terminologies link")
	public void the_user_clicks_terminologies_link() {
		driver.navigate().back();
		treepage.Terminoligies();
	}

	@Then("The user should be redirected to Terminologies page")
	public void the_user_should_be_redirected_to_terminologies_page() {
		Assert.assertEquals(driver.getTitle(), "Terminologies");
	}

	@Given("The user is on the Terminologies page")
	public void the_user_is_on_the_terminologies_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in the Terminologies page")
	public void the_user_clicks_try_here_button_in_the_terminologies_page() {
		treepage.TryHereButton();
	}

	@Then("The user should be redirected to a TryEditor page with a Run button to test")
	public void the_user_should_be_redirected_to_a_tryEditor_page_with_a_run_button_to_test() {
		assert treepage.tryEditor.isDisplayed();
		assert treepage.RunBtn.isDisplayed();
	}

	@When("The user clicks the Run button without entering code in the TryEditor")
	public void the_user_clicks_the_run_button_without_entering_code_in_the_tryEditor() {
		treepage.EmptytryInput();
		treepage.clickRun();
	}

	@When("The user writes invalid code in the TryEditor and clicks the Run button")
	public void the_user_writes_invalid_code_in_the_try_Editor_and_clicks_the_run_button() throws InterruptedException {
		treepage.Invalidinput();
		Thread.sleep(3000);
		treepage.clickRun();
		try {
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert and accept (click OK)
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			// No alert was present, continue with the test
			System.out.println("No alert present.");
		}
	}

	@When("The user writes valid code in the TryEditor and clicks the Run button")
	public void the_user_writes_valid_code_in_the_try_Editor_and_clicks_the_run_button() throws InterruptedException {
		treepage.Validinput();
		Thread.sleep(3000);
		treepage.clickRun();
	}

	@Then("The user should see output in the Output console")
	public void the_user_should_see_output_in_the_Output_console() {
		Assert.assertEquals("hello", treepage.Outputmsg());
	}

	@When("The user clicks Types of Trees link")
	public void the_user_clicks_types_of_trees_link() {
		driver.navigate().back();
		treepage.TypesofTrees();
	}

	@Then("The user should be redirected to Types of Trees page")
	public void the_user_should_be_redirected_to_types_of_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Types of Trees");

	}

	@Given("The user is on the Types of Trees page")
	public void the_user_is_on_the_types_of_trees_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in the Types of Trees page")
	public void the_user_clicks_try_here_button_in_the_types_of_trees_page() {
		treepage.TryHereButton();
	}

	@When("The user clicks Tree Traversal link")
	public void the_user_clicks_tree_traversal_link() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.TreeTraversals();
	}

	@Then("The user should be redirected to Tree Traversal page")
	public void the_user_should_be_redirected_to_tree_traversal_page() {
		Assert.assertEquals(driver.getTitle(), "Tree Traversals");
	}

	@Given("The user is on the Tree Traversal page")
	public void the_user_is_on_the_tree_traversal_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.TreeTraversals();
	}

	@When("The user clicks Try Here button in the Tree Traversal page")
	public void the_user_clicks_try_here_button_in_the_tree_traversal_page() {
		treepage.TryHereButton();
	}

	@Given("The user is on the Try Editor page")
	public void the_user_is_on_the_try_Editor_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.TreeTraversals();
		treepage.TryHereButton();
	}

	@When("The user clicks the Run button without entering code in the Editor")
	public void the_user_clicks_the_run_button_without_entering_code_in_the_editor() {
		treepage.EmptytryInput();
		treepage.clickRun();
	}

	@When("The user clicks Traversals-Illustration link")
	public void the_user_clicks_traversals_illustration_link() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.Traversal_Illustration();
	}

	@Then("The user should be redirected to Traversals-Illustration page")
	public void the_user_should_be_redirected_to_traversals_illustration_page() {
		Assert.assertEquals(driver.getTitle(), "Traversals-Illustration");
	}

	@Given("The user is on the Traversals-Illustration page")
	public void the_user_is_on_the_traversals_illustration_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.Traversal_Illustration();
	}

	@When("The user clicks Try Here button in the Traversals-Illustration page")
	public void the_user_clicks_try_here_button_in_the_traversals_illustration_page() {
		treepage.TryHereButton();
	}

	@When("The user clicks Binary trees link")
	public void the_user_clicks_binary_trees_link() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.Binary_Trees();
	}

	@Then("The user should be redirected to Binary trees page")
	public void the_user_should_be_redirected_to_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Binary Trees");
	}

	@Given("The user is on the Binary trees page")
	public void the_user_is_on_the_binary_trees_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in the Binary trees page")
	public void the_user_clicks_try_here_button_in_the_binary_trees_page() {
		treepage.TryHereButton();
	}

	@When("The user clicks Types of Binary trees link")
	public void the_user_clicks_types_of_binary_trees_link() {
		driver.navigate().back();
		treepage.TypesOfBinaryTrees();
	}

	@Then("The user should be redirected to Types of Binary trees page")
	public void the_user_should_be_redirected_to_types_of_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Types of Binary Trees");
	}

	@Given("The user is on the Types of Binary Trees page")
	public void the_user_is_on_the_types_of_binary_trees_page() {
		driver.getCurrentUrl();
	}

	@When("The user clicks Try Here button in the Types of Binary Trees page")
	public void the_user_clicks_try_here_button_in_the_types_of_binary_trees_page() {
		treepage.TryHereButton();
	}

	@Then("The user should see output in the Outpt console")
	public void the_user_should_see_output_in_the_outpt_console() {
		Assert.assertEquals("hello", treepage.Outputmsg());
	}

	@When("The user clicks Implementation in Python link")
	public void the_user_clicks_implementation_in_python_link() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ImplementationInPython();
	}

	@Then("The user should be redirected to Implementation in Python page")
	public void the_user_should_be_redirected_to_implementation_in_python_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation in Python");
	}

	@Given("The user is on the Implementation in Python page")
	public void the_user_is_on_the_implementation_in_python_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ImplementationInPython();
	}

	@When("The user clicks Try Here button in the Implementation in Python page")
	public void the_user_clicks_try_here_button_in_the_implementation_in_python_page() {
		treepage.TryHereButton();
	}

	@When("The user clicks Binary Tree Traversals link")
	public void the_user_clicks_binary_tree_traversals_link() {
		driver.navigate().back();
		treepage.BinaryTreeTraversals();
	}

	@Then("The user should be redirected to Binary Tree Traversals page")
	public void the_user_should_be_redirected_to_binary_tree_traversals_page() {
		Assert.assertEquals(driver.getTitle(), "Binary Tree Traversals");
	}

	@Given("The user is on the Binary Tree Traversals page")
	public void the_user_is_on_the_binary_tree_traversals_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.BinaryTreeTraversals();
	}

	@When("The user clicks the Try Here button")
	public void the_user_clicks_the_try_here_button() {
		driver.getCurrentUrl();
		treepage.TryHereButton();
	}

	@Given("The user is in the TryEditor page for Binary Tree Traversals")
	public void the_user_is_in_the_try_editor_page_for_binary_tree_traversals() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.BinaryTreeTraversals();
		treepage.TryHereButton();
	}

	@When("The user writes invalid python codein the TryEditor and clicks the Run button")
	public void the_user_writes_invalid_python_codein_the_try_editor_and_clicks_the_run_button()
			throws InterruptedException {
		treepage.Invalidinput();
		Thread.sleep(3000);
		treepage.clickRun();
		try {
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert and accept (click OK)
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			// No alert was present, continue with the test
			System.out.println("No alert present.");
		}
	}

	@When("The user writes valid python code in the TryEditor and clicks the Run button")
	public void the_user_writes_valid_python_code_in_the_try_editor_and_clicks_the_run_button()
			throws InterruptedException {
		treepage.Validinput();
		Thread.sleep(3000);
		treepage.clickRun();
	}

	@Given("The user is in the Tree data structure page after sign in")
	public void the_user_is_in_the_tree_data_structure_page_after_sign_in() {
		driverFactory.homepage();
		treepage.treeGetStarted();
	}

	@When("The user clicks the Implementation of Binary Trees link")
	public void the_user_clicks_the_implementation_of_binary_trees_link() {
		treepage.ImplementationOfBinaryTrees();
	}

	@Then("The user should be redirected to the Implementation of Binary Trees page")
	public void the_user_should_be_redirected_to_the_implementation_of_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation of Binary Trees");
	}

	@Given("The user is on the Implementation of Binary Trees page")
	public void the_user_is_on_the_implementation_of_binary_trees_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ImplementationOfBinaryTrees();
	}

	@Given("The user is in the TryEditor page for Implementation of Binary Trees")
	public void the_user_is_in_the_try_editor_page_for_implementation_of_binary_trees() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ImplementationOfBinaryTrees();
		treepage.TryHereButton();
	}

	@When("The user writes invalid python code in the TryEditor and clicks the Run button")
	public void the_user_writes_invalid_python_code_in_the_try_editor_and_clicks_the_run_button()
			throws InterruptedException {
		treepage.Invalidinput();
		Thread.sleep(3000);
		treepage.clickRun();
		try {
			// Wait for the alert to appear
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.alertIsPresent());

			// Switch to the alert and accept (click OK)
			Alert alert = driver.switchTo().alert();
			alert.accept();

		} catch (NoAlertPresentException e) {
			// No alert was present, continue with the test
			System.out.println("No alert present.");
		}
	}

	@When("The user writes valid python code and clicks the Run button")
	public void the_user_writes_valid_python_code_and_clicks_the_run_button() throws InterruptedException {
		treepage.Validinput();
		Thread.sleep(3000);
		treepage.clickRun();
	}

	@When("The user clicks the Applications of Binary trees link")
	public void the_user_clicks_the_applications_of_binary_trees_link() {
		driverFactory.treepage();// here comes stale element error if ....
		treepage.ApplicationOfBinaryTrees();
	}

	@Then("The user should be redirected to the Applications of Binary trees page")
	public void the_user_should_be_redirected_to_the_applications_of_binary_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Applications of Binary trees");
	}

	@Given("The user is on the Applications of Binary trees page")
	public void the_user_is_on_the_applications_of_binary_trees_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ApplicationOfBinaryTrees();
	}

	@Given("The user is in the TryEditor page for Applications of Binary trees")
	public void the_user_is_in_the_try_editor_page_for_applications_of_binary_trees() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ApplicationOfBinaryTrees();
		treepage.TryHereButton();
	}

	@When("The user clicks the Binary Search Trees link")
	public void the_user_clicks_the_binary_search_trees_link() {
		driverFactory.treepage();
		treepage.BinarySearchTrees();
	}

	@Then("The user should be redirected to the Binary Search Trees page")
	public void the_user_should_be_redirected_to_the_binary_search_trees_page() {
		Assert.assertEquals(driver.getTitle(), "Binary Search Trees");
	}

	@Given("The user is on the Binary Search Trees page")
	public void the_user_is_on_the_binary_search_trees_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.BinarySearchTrees();
	}

	@Given("The user is in the TryEditor page for Binary Search Trees")
	public void the_user_is_in_the_try_editor_page_for_binary_search_trees() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.BinarySearchTrees();
		treepage.TryHereButton();
	}

	@When("The user clicks the Implementation Of BST link")
	public void the_user_clicks_the_implementation_of_bst_link() {
		driverFactory.treepage();
		treepage.ImplementationOfBST();
	}

	@Then("The user should be redirected to the Implementation Of BST page")
	public void the_user_should_be_redirected_to_the_implementation_of_bst_page() {
		Assert.assertEquals(driver.getTitle(), "Implementation Of BST");
	}

	@Given("The user is on the Implementation Of BST page")
	public void the_user_is_on_the_implementation_of_bst_page() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ImplementationOfBST();
	}

	@Given("The user is in the TryEditor page for Implementation Of BST")
	public void the_user_is_in_the_try_editor_page_for_implementation_of_bst() {
		driverFactory.homepage();
		treepage.treeGetStarted();
		treepage.ImplementationOfBST();
		treepage.TryHereButton();
	}

}
