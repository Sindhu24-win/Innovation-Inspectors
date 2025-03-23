package pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class loginPage {
    
    private WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath="//input[@name='username']")
	public WebElement usernameLoginpage;
    @FindBy(xpath="//input[@name='password']")
	public WebElement passwordLoginpage;
    @FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[4]")
	public WebElement loginButton;
    @FindBy(xpath="//a[@href='/register']") WebElement registerlinkLoginPage;
   
    @FindBy(xpath="//div[@role='alert']")
	public WebElement Error;  // Fixed xpath for username error
   
    @FindBy(className = "btn")
    @CacheLookup
    WebElement getStartedButton;  // Renamed WebElement to avoid method conflict

    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
       this.wait = new WebDriverWait(driver,Duration.ofSeconds(5)); // Initializing WebDriverWait with a timeout of 10 seconds
    }
    public void clickGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(getStartedButton));  // Wait until clickable
        getStartedButton.click();
    }

    // Method to enter the username
    public void enterUsername(String username) {
        wait.until(ExpectedConditions.visibilityOf(usernameLoginpage));  // Wait until username field is visible
        usernameLoginpage.sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
        wait.until(ExpectedConditions.visibilityOf(passwordLoginpage));  // Wait until password field is visible
        passwordLoginpage.sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
        wait.until(ExpectedConditions.elementToBeClickable(loginButton));  // Wait until login button is clickable
        loginButton.click();
    }

    // Method to perform login action
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    // Method to click on the Register link
    public void register() {
        wait.until(ExpectedConditions.elementToBeClickable(registerlinkLoginPage));  // Wait until Register link is clickable
        registerlinkLoginPage.click();
    }

    // Method to perform invalid login
    public void invalidLogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }

    // Get the error message for username
    public String getErrorMessage() {
        
        return Error.getText();
    }

   public boolean isLoginPageDisplayed() {
       return driver.getTitle().equals("Login");
    }
   
   
   public boolean isErrorMessageForUsernameDisplayed() {
	    return Error.isDisplayed(); // Assuming 'usernameErrorMessage' is a WebElement for the error message below the username field
	}
}
