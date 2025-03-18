package pageObjects;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arraypage {

	String username = "darshana";
	String password = "zenithhp4987";

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

	@FindBy(xpath = "/html/body/div[2]")
	@CacheLookup
	WebElement Login_Success;

	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/a")
	@CacheLookup
	WebElement ArrayGetStart;

	@FindBy(xpath = "//a[text()='Arrays in Python']")
	@CacheLookup
	WebElement Arrays_Python;

	@FindBy(xpath = "//a[text()='Try here>>>']")
	@CacheLookup
	WebElement Arrays_InPython_Tryhere;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement TryHere;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	@CacheLookup
	public

	WebElement TryEditor;

	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	public

	WebElement Run;

	@FindBy(xpath = "//pre[@id='output']")
	@CacheLookup
	WebElement TryEditor_Console;

	@FindBy(xpath = "//a[text()='Arrays Using List']")
	@CacheLookup
	WebElement Arrays_Using_List;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement Arrays_UsingList_TryHere;

	@FindBy(xpath = "//a[text()='Basic Operations in Lists']")
	@CacheLookup
	WebElement Basic_Operation;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement Basic_Operation_Tryhere;

	@FindBy(xpath = "//a[text()='Applications of Array']")
	@CacheLookup
	WebElement Applications_Of_Array;

	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	@CacheLookup
	WebElement Applications_OfArray_TryHere;

	@FindBy(xpath = "//*[@id=\"content\"]/a")
	@CacheLookup
	WebElement Practice_Questions;

	@FindBy(xpath = "//a[text()='Search the array']")
	@CacheLookup
	WebElement SearchThe_Array;

	@FindBy(className = "CodeMirror")
	@CacheLookup
	WebElement codeMirrorDiv;

	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	public WebElement Submit;

	@FindBy(xpath = "//pre[text()='Error occurred during submission']")
	@CacheLookup
	WebElement Errormessage;

	@FindBy(xpath = "//a[text()='Max Consecutive Ones']")
	@CacheLookup
	WebElement MaxConsecutive_Ones;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	@CacheLookup
	WebElement MaxConsecutiveOnes_Question;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/button")
	@CacheLookup
	WebElement MaxConsecutiveOnes_Run;

	@FindBy(xpath = "//a[text()='Find Numbers with Even Number of Digits']")
	@CacheLookup
	WebElement Find_Numbers_Evennumber_Digits;

	@FindBy(xpath = "//a[text()='Squares of  a Sorted Array']")
	@CacheLookup
	WebElement SquaresOf_SortedArray;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	@CacheLookup
	WebElement SquaresOfSortedArray_Question;

	@FindBy(xpath = "//*[@id=\"answer_form\"]/button")
	@CacheLookup
	WebElement SquaresOfSortedArray_Run;

	private WebDriver driver;

	public Arraypage(WebDriver driver) {

		PageFactory.initElements(driver, this);
		this.driver = driver;

	}

	public void DsAlgoStarting() {
		DSAlgoGetStart.click();
	}

	public void Usersignin() {
		Signin.click();
	}

	public void Entercredentials() {
		Username.sendKeys(username);
		Password.sendKeys(password);
	}

	public void Userlogin() {
		Login.click();

	}

	public String LoginMessage() {
		return Login_Success.getText();
	}

	public void ArrayGetStarted() {
		ArrayGetStart.click();
	}

	public void ArraysPython() {
		Arrays_Python.click();

	}

	public void ArraysPythonTry() {
		Arrays_InPython_Tryhere.click();
	}

	public void Tryherebtn() {
		TryHere.click();
	}

	public void ArraysPythonTryEditorNocode() {
		Actions actions = new Actions(driver);

		actions.moveToElement(TryEditor).click().sendKeys("").build().perform();

	}

	public void RunBtn() {
		Run.click();
	}

	public void InvalidPythoncode() {
		Actions actions = new Actions(driver);

		actions.moveToElement(TryEditor).click().sendKeys("print Hello").build().perform();
		Run.click();

	}

	public String alertMessage() {
		return driver.switchTo().alert().getText();

	}

	public void ValidPythoncode() {
		Actions actions = new Actions(driver);
		actions.moveToElement(TryEditor).sendKeys("print'hello world'").build().perform();
		Run.click();

	}

	public String GetConsoleOutput() {
		return TryEditor_Console.getText();

	}

	public void ArraysList() {

		Arrays_Using_List.click();
	}

	public void ArraysListTryhere() {
		Arrays_UsingList_TryHere.click();

	}

	public void Basicoperation() {

		Basic_Operation.click();
	}

	public void BasicOperationTry() {
		Basic_Operation_Tryhere.click();
	}

	public void BasicOperationText() {
		Actions actions = new Actions(driver);
		actions.moveToElement(TryEditor).click().build().perform();
	}

	public void ApplicationsArray() {
		driver.navigate().back();
		Applications_Of_Array.click();
	}

	public void Practicequestions() {
		Practice_Questions.click();
	}

	public void PracticeNoCodeinput() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].CodeMirror.setValue('');", codeMirrorDiv);

		System.out.println("Code input field cleared successfully");

	}

//	public void PracticeValidinput() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].CodeMirror.setValue(arguments[1]);", codeMirrorDiv, pythonCode);
//
//		System.out.println("New code entered successfully");
//	}

	public void SearchArray() {
		SearchThe_Array.click();
	}

	public String Errormsg() {
		return Errormessage.getText();
	}

	public void Maxconsecutive() {
		driver.navigate().back();
		MaxConsecutive_Ones.click();
	}

	public void FindEvenNumbers() {
		driver.navigate().back();
		Find_Numbers_Evennumber_Digits.click();
	}

	public void SquaresSortedArray() {
		driver.navigate().back();
		SquaresOf_SortedArray.click();
	}

}
