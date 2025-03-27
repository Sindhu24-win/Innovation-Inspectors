package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Linkedlistpage {

	
	@FindBy(xpath = "//button[text()='Get Started']")
	@CacheLookup
	WebElement DSAlgoGetStart;

	@FindBy(xpath = "//a[text()='Sign in']")
	@CacheLookup
	WebElement Signin;

	@FindBy(xpath = "//input[@name='username']")
	@CacheLookup
	WebElement Username;

	@FindBy(xpath = "//input[@name='password']")
	@CacheLookup
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement Login;

	@FindBy(xpath = "//div[@role='alert']")
	@CacheLookup
	WebElement Login_Success;

	@FindBy(xpath = "//a[@href='linked-list']")
	@CacheLookup()
	WebElement Linked_List;

	@FindBy(linkText = "Introduction")
	@CacheLookup()
	WebElement Introduction_page;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	@CacheLookup()
	WebElement Tryherebtn;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	@CacheLookup()
	public WebElement Tryeditor;

	@FindBy(xpath = "//button[text()='Run']")
	@CacheLookup()
	public WebElement Runbtn;

	@FindBy(id = "output")
	@CacheLookup()
	WebElement Console_Output;

	@FindBy(linkText = "Creating Linked LIst")
	@CacheLookup()
	WebElement Creating_LinkedList;

	@FindBy(xpath = "//a[text()='Types of Linked List']")
	@CacheLookup()
	WebElement Types_LinkedList;

	@FindBy(xpath = "//a[text()='Implement Linked List in Python']")
	@CacheLookup()
	WebElement Implementing_LinkedList;

	@FindBy(xpath = "//a[text()='Traversal']")
	@CacheLookup()
	WebElement Traversal_link;

	@FindBy(linkText = "Insertion")
	@CacheLookup()
	WebElement Insertion_link;

	@FindBy(linkText = "Deletion")
	@CacheLookup()
	WebElement Deletion_link;

	@FindBy(linkText = "Practice Questions")
	@CacheLookup()
	WebElement Practice_Questions;

	@FindBy(xpath = "//a[text()='Sign out']")
	@CacheLookup
	WebElement Signout;

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement logoutMsg;

	private WebDriver driver;

	public Linkedlistpage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void DsAlgoStarting() {
		DSAlgoGetStart.click();
	}

	public void signingin() {
		Signin.click();
	}

	public void EnterCredentials() {
		//Username.sendKeys(username);
		//Password.sendKeys(password);
	}

	public void login() {
		Login.click();
	}

	public String LoginStatus() {
		return Login_Success.getText();
	}

	public void Getstarted() {
		Linked_List.click();

	}
	public void invalid() {
		Runbtn.click();
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

	public void Introductionpage() {
		Introduction_page.click();
	}

	public void Tryhere() {
		Tryherebtn.click();
	}

	public void Run() {
		Runbtn.click();
	}

	public void Nocode() {
		Actions actions = new Actions(driver);
		actions.moveToElement(Tryeditor).click().sendKeys("").build().perform();

	}

	public String alertMessage() {
		return driver.switchTo().alert().getText();

	}

	public void EmptyTryEditorpage() {
		Tryeditor.clear();

	}

	public String ValidOutput() {
		return Console_Output.getText();
	}

	public void CreatingLinkedlist() {
		Creating_LinkedList.click();
	}

	public void TypesLinkedlist() {
		Types_LinkedList.click();
	}

	public void ImplementingList() {
		Implementing_LinkedList.click();
	}

	public void Traversal() {
		Traversal_link.click();
	}

	public void Insertion() {
		Insertion_link.click();
	}

	public void Deletion() {
		Deletion_link.click();

	}

	public void PracticeQuestion() {
		Practice_Questions.click();
	}

	public void LinkedlistSigningout() {
		Signout.click();
	}

	public String Logout() {
		return logoutMsg.getText();
	}

}