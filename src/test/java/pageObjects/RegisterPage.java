package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	 public WebDriver driver;
	 WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")
	WebElement ErrorMessage;
	
	@FindBy(css=("input:invalid"))
	public WebElement alert;
	
    @FindBy(xpath="//input[@id='id_username']") 
    private WebElement usernameField;
   
    
    @FindBy(xpath="//input[@id='id_password1']") 
    private WebElement passwordField;

	@FindBy(className = "btn")
	WebElement GetStarted;
	@FindBy(xpath = "//[@id='navbarCollapse']/div[2]/ul/a[2]")
	WebElement registerlink;
    
    @FindBy(xpath="//input[@id='id_password2']") 
    private WebElement confirmPasswordField;

    // Locating the Register button
    @FindBy(xpath = "//input[@value='Register']") 
    private WebElement registerButton;
    
    @FindBy(xpath="/html/body/div[2]")public WebElement success;

    
    public RegisterPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver=driver;
    }

    // Method to enter Username
    public void enterUsername(String username) {
        usernameField.sendKeys(username);
    }

    // Method to enter Password
    public void enterPassword(String password) {
        passwordField.sendKeys(password);
    }

    // Method to enter Password Confirmation
    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }
    public void GetStarted() {
		GetStarted.click();
    }
    public void register() {
    	registerlink.click();
    }

    // Method to click Register button
    public void clickRegister() {
        registerButton.click();
    }

    // Method to fill and submit the registration form
    public void valid_register(String username, String password, String confirmPassword) {
        enterUsername(username);
        enterPassword(password);
        enterConfirmPassword(confirmPassword);
        clickRegister();
    }
    public String getErrorMessage()
    {
    	return ErrorMessage.getText();
    }
	public String successMessage()
	{
		return success.getText();
				
	}
	public String alertmsg() {
		return alert.getText();
	}
	public void GetUrl() { 
	driver.get("https://dsportalapp.herokuapp.com/register");//
	}
	public void Getbaseurl() { 
		driver.get("https://dsportalapp.herokuapp.com");//
	}
	
}