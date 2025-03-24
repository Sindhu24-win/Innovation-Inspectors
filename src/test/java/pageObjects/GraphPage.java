
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

import Utilities.LoggerReader;

public class GraphPage {

	WebDriverWait wait;
	// String loginName = "darshana";
	// String loginPassword = "zenithhp4987";
	// public String baseUrl="https://dsportalapp.herokuapp.com/";

	@FindBy(className = "btn")
	@CacheLookup
	WebElement GetStarted;

	@FindBy(xpath = "//*[@id='navbarCollapse']/div[2]/ul/a[3]")
	@CacheLookup
	WebElement signIn;

	@FindBy(xpath = "//*[@id='navbarCollapse']/div[2]/ul/a[3]")
	@CacheLookup
	WebElement SignOut;

	@FindBy(id = "id_username")
	@CacheLookup
	WebElement userName;

	@FindBy(id = "id_password")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//*[@value='Login']")
	@CacheLookup
	WebElement LoginBtn;

	@FindBy(xpath = "//*[@class ='alert alert-primary']")
	@CacheLookup
	WebElement LoginStatus;

	@FindBy(xpath = "//a[@href='graph']")
	@CacheLookup
	WebElement GraphGetStarted;

	@FindBy(xpath = "//title[text()='Graph']")
	@CacheLookup
	WebElement GraphTitle;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	@CacheLookup
	WebElement dropdownMenu;

	@FindBy(xpath = "//a[text()='Graph']")
	@CacheLookup
	WebElement selectGraph_DropdownMenu;

	@FindBy(xpath = "//a[@href='graph']")
	@CacheLookup
	WebElement GraphLink;

	@FindBy(xpath = "//a[@href='/tryEditor']")
	@CacheLookup
	WebElement TryhereBtn;

	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	@CacheLookup
	WebElement tryEditorTxt;

	@FindBy(xpath = "//div[@class='CodeMirror-code']")
	@CacheLookup
	WebElement tryEditorInp;

	@FindBy(className = "CodeMirror")
	@CacheLookup
	public WebElement tryEditor;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	public WebElement RunBtn;

	@FindBy(xpath = "//pre[@id='output']")
	@CacheLookup
	WebElement OutPutmsg;

	@FindBy(linkText = "Practice Questions")
	@CacheLookup
	WebElement Practice_QuestionsLink;

	@FindBy(linkText = "Graph Representations")
	@CacheLookup
	WebElement GraphRepresentationsLink;

	private WebDriver driver;

	public GraphPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public void GetStarted() {
		GetStarted.click();
	}

	public void signIn() {
		signIn.click();
	}

	public void signOut() {
		SignOut.click();
	}

	public void clickLogin(String username, String password) {
		userName.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();
		LoggerReader.info("User Signed in Successfully");
	}

	public String getStatus() {
		return LoginStatus.getText();
	}

	public String GraphTitle() {
		return GraphTitle.getText();
	}

	public void GraphGetStarted() {
		GraphGetStarted.click();
	}

	public void dropdownMenuClick() {
		dropdownMenu.click();
	}

	public void ClickGraphFromDropdown() {
		selectGraph_DropdownMenu.click();
	}

	public void Graphlink() {
		GraphLink.click();
		
	}

	public void TryHereButton() {
		TryhereBtn.click();
		LoggerReader.info("User clicked on Graph Try here link");
	}

	
	

	public String RunBtnText() {
		return RunBtn.getText();
	}

	public void Run() {
		RunBtn.click();
	}

	public void EmptytryInput() {
		Actions actions = new Actions(driver);
		actions.moveToElement(tryEditorTxt).click().sendKeys("").build().perform();
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

	public void GraphRepresentationlink() {
		GraphRepresentationsLink.click();
	}

	public void PracticeQns() {
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Practice_QuestionsLink);
		wait.until(ExpectedConditions.elementToBeClickable(Practice_QuestionsLink)).click();
	}

}