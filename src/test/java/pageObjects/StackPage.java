
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
	String loginname = "darshana";
	String loginpassword = "zenithhp4987";
	public String url = "https://dsportalapp.herokuapp.com/home";
	
	
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
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath = "//div[@class='alert alert-primary']")
	@CacheLookup
	WebElement LoginStatus;
	
	 @FindBy(xpath = "//a[@href='stack']")
	 @CacheLookup
	 WebElement StackGetStarted;
	 
	 @FindBy(xpath = "//a[text()='Operations in Stack']")
	 @CacheLookup
	 WebElement OperationsInStack;
	 
	 @FindBy(xpath = "//a[text()='Try here>>>']")
	 @CacheLookup
	WebElement Tryhere;
	 
	@FindBy(xpath = "//button[@type='button']")
	 @CacheLookup
	public
	WebElement RunBtn;
	
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	 @CacheLookup
	public
	WebElement TryEditor;
	
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
	WebElement Applications;
	
	
			public StackPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }
			
			// Method to check if the user is logged in based on the URL
		   // public boolean isLoggedIn() {
		     //   String currentUrl = driver.getCurrentUrl();
		        // You can check if the URL contains a part that only appears when logged in, like "home"
		       // return currentUrl.contains("/home");
		    //}// Example: logged-in users will be redirected to a URL containing "/home"
			
		    public void GetStartedIntro() {
				GetStartedIntro.click();
			}
			public void SignIn() {
				SignIn.click();
			}
			public void Login() {
				UserName.sendKeys(loginname);
				Password.sendKeys(loginpassword);
				Login.click();
			}
			
			public String getStatus() {
				return LoginStatus.getText();
				
			}
			public void StackGetStarted() {
              StackGetStarted.click();
			}
			public void OperationInStack() {
	 OperationsInStack.click();
			}
			public void Tryhere() {
				Tryhere.click();
			}
			public void RunBtn() {
				RunBtn.click();
			
				}
			public void EmptytryEditor() {
				Actions actions = new Actions(driver);
				actions.moveToElement(TryEditor).click().sendKeys("").build().perform();
			}
			public String alertMessage() {
				return driver.switchTo().alert().getText();
			}

			public void Invalidinput() {
				Actions actions = new Actions(driver);
				actions.moveToElement(TryEditor).click().sendKeys("System.out.println('Hello, World!');").build().perform();
			}

			public void Validinput() {
				Actions actions = new Actions(driver);
				actions.moveToElement(TryEditor).click().sendKeys("print 'hello'").build().perform();
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
			public void Applications() {
	 Applications.click();
	
}
}
