
package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilities.ConfigReader;

public class TreePage {

	WebDriverWait wait;
	String url = ConfigReader.getProperty("tree");
	
	@FindBy(className = "btn")
	@CacheLookup
	WebElement GetStarted;

	@FindBy(xpath = "//a[text()='Sign in']")
	@CacheLookup
	WebElement signIn;
	@FindBy(xpath = "//a[text()='Sign out']")
	@CacheLookup
	WebElement signOut;

	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement userName;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//*[@value='Login']")
	@CacheLookup
	WebElement LoginBtn;

	@FindBy(xpath = "//div[@role='alert']")
	@CacheLookup
	WebElement LoginStatus;

	@FindBy(xpath = "//a[@href='tree']")
	@CacheLookup
	WebElement TreeGetStarted;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	@CacheLookup
	WebElement dropdownmenu;

	@FindBy(xpath = "//a[text()='Tree']")
	@CacheLookup
	WebElement selectTree_DropdownMenu;

	@FindBy(xpath = "//title[text()='Tree']")
	@CacheLookup
	WebElement titleTree;

	@FindBy(xpath = "//a[text()='Overview of Trees']")
	@CacheLookup
	WebElement overviewOfTrees;

	@FindBy(linkText = "Try here>>>")
	@CacheLookup
	WebElement overviewOfTreesTryHere;

	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	@CacheLookup
	WebElement tryEditorInp;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	@CacheLookup
	WebElement TryhereBtn;

	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	@CacheLookup
	WebElement tryEditorTxt;

	@FindBy(className = "CodeMirror")
	@CacheLookup
	public WebElement tryEditor;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	public WebElement RunBtn;

	@FindBy(xpath = "//pre[@id='output']")
	@CacheLookup
	WebElement OutPutmsg;

	@FindBy(linkText = "Terminologies")
	@CacheLookup
	WebElement TerminologiesLink;

	@FindBy(linkText = "Types of Trees")
	@CacheLookup
	WebElement TypesOfTreeslink;

	@FindBy(linkText = "Tree Traversals")
	@CacheLookup
	WebElement TreeTraversals_link;

	@FindBy(linkText = "Traversals-Illustration")
	@CacheLookup
	WebElement Traversals_Illustration_Link;

	@FindBy(linkText = "Binary Trees")
	@CacheLookup
	WebElement BinmaryTreesLink;

	@FindBy(linkText = "Types of Binary Trees")
	@CacheLookup
	WebElement Types_ofBinaryTreesLink;

	@FindBy(linkText = "Implementation in Python")
	@CacheLookup
	WebElement Implementation_inPythonLink;

	@FindBy(linkText = "Binary Tree Traversals")
	@CacheLookup
	WebElement BinaryTreeTraversals_link;

	@FindBy(linkText = "Implementation of Binary Trees")
	@CacheLookup
	WebElement ImplementationOfBiTreeLink;

	@FindBy(linkText = "Applications of Binary trees")
	@CacheLookup
	WebElement AppliOfBitrees_Link;

	@FindBy(linkText = "Binary Search Trees")
	@CacheLookup
	WebElement BinarySearchTreesLink;

	@FindBy(linkText = "Implementation Of BST")
	@CacheLookup
	WebElement ImplementationOfBSTLink;

	@FindBy(linkText = "Practice Questions")
	@CacheLookup
	WebElement Practice_QuestionsLink;

	public WebDriver driver;

	public TreePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	

	public void GetStarted() {
		GetStarted.click();
	}

	public void signIn() {
		signIn.click();
	}

	public void clickLogin(String username, String password) {
		userName.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();

	}

	public void signOut() {
		signOut.click();
	}

	public String getStatus() {
		return LoginStatus.getText();
	}

	public void treeGetStarted() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TreeGetStarted);
		wait.until(ExpectedConditions.elementToBeClickable(TreeGetStarted)).click();
	}

	public void TreeGetStarted() {
		TreeGetStarted.click();
	}

	public void dropdownmenuClick() {
		dropdownmenu.click();
	}

	public void clickTreeFromDropdown() {
		selectTree_DropdownMenu.click();
	}

	public String titleTree() {
		return titleTree.getText();
	}

	public void overviewOfTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTrees);
		wait.until(ExpectedConditions.visibilityOf(overviewOfTrees)).click();
	}

	public void overviewOfTreesTryHere(WebDriver driver) {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", overviewOfTreesTryHere);
		wait.until(ExpectedConditions.elementToBeClickable(overviewOfTreesTryHere)).click();
	}

	public void TryHereButton() {
		TryhereBtn.click();
	}

	public void clickRun() {
		RunBtn.click();
	}
	public void Geturl() {
		driver.get(url);
	}
	
	public void EmptytryInput() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInp).click().sendKeys("").build().perform();
	}

	public String alertMessage() {
		return driver.switchTo().alert().getText();
	}

	public void Invalidinput() {
		RunBtn.click();
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

	public String Outputmsg() {
		return OutPutmsg.getText();
	}

	public void Terminoligies() {
		TerminologiesLink.click();
	}

	public void TypesofTrees() {
		TypesOfTreeslink.click();
	}

	public void TreeTraversals() {
		TreeTraversals_link.click();
	}

	public void Traversal_Illustration() {
		Traversals_Illustration_Link.click();
	}

	public void Binary_Trees() {
		BinmaryTreesLink.click();
	}

	public void TypesOfBinaryTrees() {
		Types_ofBinaryTreesLink.click();
	}

	public void ImplementationInPython() {
		Implementation_inPythonLink.click();
	}

	public void BinaryTreeTraversals() {
		BinaryTreeTraversals_link.click();
	}

	public void ImplementationOfBinaryTrees() {
		ImplementationOfBiTreeLink.click();
	}

	public void ApplicationOfBinaryTrees() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AppliOfBitrees_Link);
		wait.until(ExpectedConditions.visibilityOf(AppliOfBitrees_Link)).click();
	}

	public void BinarySearchTrees() {
		BinarySearchTreesLink.click();
	}

	public void ImplementationOfBST() {
		ImplementationOfBSTLink.click();
	}

	public void PracticeQns() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Practice_QuestionsLink);
		wait.until(ExpectedConditions.elementToBeClickable(Practice_QuestionsLink)).click();
	}
}