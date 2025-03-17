
package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;


public class StackPage {
	WebDriver driver;
	WebDriverWait wait;
	String url = "https://dsportalapp.herokuapp.com/home";
	
	@FindBy(className = "btn")
	@CacheLookup
	WebElement GetStartedIntro;
	
	@FindBy(xpath = "//*[@id=\"navbarCollapse\"]/div[2]/ul/a[3]")
	@CacheLookup
	WebElement SignIn;
	
	@FindBy(id = "id_username")
	@CacheLookup
	WebElement UserName;
	
	@FindBy(id = "id_password")
	@CacheLookup
	WebElement Password;
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath = "/html/body/div[2]")
	@CacheLookup
	WebElement LoginStatus;
	
	 @FindBy(xpath = "//a[@href='stack']")
	 @CacheLookup
	 WebElement GetStarted;
	 
	 @FindBy(xpath = "//a[text()='Operations in Stack']")
	 @CacheLookup
	 WebElement OperationsInStack;
	 
	 @FindBy(xpath = "//a[text()='Try here>>>']")
	 @CacheLookup
	WebElement TryHere;
	 
	@FindBy(xpath = "//button[@type='button']")
	 @CacheLookup
	public
	WebElement RunButton;
	
	@FindBy(xpath = "//*[@id=\\\"answer_form\\\"]/div/div/div[6]")
	 @CacheLookup
	public
	WebElement tryEditor;
	
	@FindBy(xpath = "//*[@id='output']")
	@CacheLookup
	WebElement consoleOutput;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	 @CacheLookup
	WebElement StackPracticeQns;
	
	 @FindBy(xpath = "//a[text()='Implementation']")
	 @CacheLookup
	WebElement Implementation;
	 
	 @FindBy(xpath = "//a[text()='Applications']")
	 @CacheLookup
	WebElement Application;
	
	
			public StackPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }
			public void GetStartedIntro() {
				GetStartedIntro.click();
			}
			public void SignIn() {
				SignIn.click();
			}
			public void Login(String loginname,String loginpassword) {
				UserName.sendKeys(loginname);
				Password.sendKeys(loginpassword);
				Login.click();
			}
			
			public String getStatus() {
				return LoginStatus.getText();
				
			}
			public void StackGetStarted() {
              GetStarted.click();
			}
			public void OperationInStack() {
	 OperationsInStack.click();
			}
			public void TryHere() {
				TryHere.click();
			}
			public void RunButton() {
				RunButton.click();
				}
			public void EmptytryEditor() {
				Actions actions = new Actions(driver);
				actions.moveToElement(tryEditor).click().sendKeys("").build().perform();
			}
			public String alertMessage() {
				return driver.switchTo().alert().getText();
			}

			public void Invalidinput() {
				Actions actions = new Actions(driver);
				actions.moveToElement(tryEditor).click().sendKeys("System.out.println('Hello, World!');").build().perform();
			}

			public void Validinput() {
				Actions actions = new Actions(driver);
				actions.moveToElement(tryEditor).click().sendKeys("print 'hello'").build().perform();
			}

			public String consoleOutput() {
				return consoleOutput.getText();
				}
			
			public void StackPracticeQuestions() {
				StackPracticeQns.click();
			}
			public void Implementation() {
	 Implementation.click();
			}
			public void Application() {
	 Application.click();
	
}
}
