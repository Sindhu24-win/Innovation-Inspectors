
package pageObjects;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class QueuePage {
	private WebDriver driver;
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
	
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/form/input[4]")
	@CacheLookup
	WebElement Login;
	
	@FindBy(xpath = "/html/body/div[2]")
	@CacheLookup
	WebElement LoginStatus;
	
	@FindBy(xpath = "//a[@href='queue']")
	@CacheLookup
	WebElement queueGetStartedBtn;
	
	@FindBy(xpath = "//a[text()='Implementation of Queue in Python']")
	@CacheLookup
	WebElement ImplementationOfQueueInPython;
	
	@FindBy(xpath = "//a[text()='Try here>>>']")
	@CacheLookup
	WebElement TryHere;
	
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]")
	@CacheLookup
	public
	WebElement tryEditor;
	
	@FindBy(xpath = "//button[@type='button']")
	@CacheLookup
	public
	WebElement RunButton;
	
	@FindBy(xpath = "//*[@id='output']")
	@CacheLookup
	WebElement Outputmsg;
	
	@FindBy(xpath = "//a[text()='Practice Questions']")
	@CacheLookup
	WebElement QueuePracticeQns;
	
	@FindBy(xpath = "//a[text()='Implementation using collections.deque']")
	@CacheLookup
	WebElement ImplementationUsingCollectionsDequeue;
	
	@FindBy(xpath = "//a[text()='Implementation using array']")
	@CacheLookup
	WebElement ImplementationUsingArray;
	
	@FindBy(xpath = "//a[text()='Queue Operations']")
	@CacheLookup
	WebElement QueueOperations;
	
	@FindBy(xpath = "//a[text()='Sign out']")
	@CacheLookup
	WebElement Signout;
	
	
	public QueuePage(WebDriver driver) {
     
        PageFactory.initElements(driver,this);
        this.driver = driver;
    }
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
	public void clickQueueGetStartedBtn() {
		queueGetStartedBtn.click();
	}
	public void clickImplementationOfQueueInPython() {
		ImplementationOfQueueInPython.click();
		}
	public void clickTryHereBtn() {
		TryHere.click();
	}
	public void clickRunButton() {
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
		actions.moveToElement(tryEditor).click().sendKeys("print 'Hello'").build().perform();
	}
	public String Outputmsg() {
		return Outputmsg.getText();
	}

	
	
	public void clickQueuePracticeQuestionsBtn() {
		QueuePracticeQns.click();
	}
	public void clickImplementationUsingCollectionsDequeue() {
		ImplementationUsingCollectionsDequeue.click();
	}
	public void clickImplementationUsingArray() {
		ImplementationUsingArray.click();
	}
	public void clickQueueOperations() {
		QueueOperations.click();
	}
	//public void Signout() {
		//Actions actions = new Actions(driver);
		//actions.moveToElement(Signout).click().build().perform();
	//}
		
		}
