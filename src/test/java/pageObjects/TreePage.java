package pageObjects;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TreePage {

	WebDriverWait wait;
	String loginName = "darshana";
	String loginPassword = "zenithhp4987";
	public String homeurl = "https://dsportalapp.herokuapp.com/";

	@FindBy(className = "btn")
	@CacheLookup
	WebElement GetStarted;

	@FindBy(xpath = "//*[@id='navbarCollapse']/div[2]/ul/a[3]")
	@CacheLookup
	WebElement signIn;

	@FindBy(id = "id_username")
	@CacheLookup
	WebElement userName;

	@FindBy(id = "id_password")
	@CacheLookup
	WebElement password;

	@FindBy(xpath = "//*[@value='Login']")
	@CacheLookup
	WebElement LoginBtn;

	@FindBy(xpath = "//*[@class ='alert alert-primary']")
	@CacheLookup
	WebElement LoginStatus;

	@FindBy(xpath = "//a[@href='tree']")
	@CacheLookup
	WebElement TreeGetStarted;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	@CacheLookup
	WebElement dropdownMenu;

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

	@FindBy(linkText = "NumpyNinja")
	@CacheLookup
	WebElement NumpyNinjaHomePage;
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

	public void clickLogin() {
		userName.sendKeys(loginName);
		password.sendKeys(loginPassword);
		LoginBtn.click();
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

	public void dropdownMenuClick() {
		dropdownMenu.click();
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

	public void EmptytryInput() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInp).click().sendKeys("").build().perform();
	}

	public String alertMessage() {
		return driver.switchTo().alert().getText();
	}

	public void Invalidinput() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInp).click().sendKeys("System.out.println('Hello, World!');").build().perform();
	}

	public void Validinput() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorInp).click().sendKeys("print 'hello'").build().perform();
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
