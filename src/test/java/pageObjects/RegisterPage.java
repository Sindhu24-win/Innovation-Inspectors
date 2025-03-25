package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegisterPage {

	 public WebDriver driver;
	 WebDriverWait wait;
	
	@FindBy(xpath="//div[@class='alert alert-primary']")WebElement ErrorMessage;
	
	 // Locating the Username field
    @FindBy(xpath="//input[@id='id_username']") // Change if the actual attribute is different
    private WebElement usernameField;

    // Locating the Password field
    @FindBy(xpath="//input[@id='id_password1']") // Change if the actual attribute is different
    private WebElement passwordField;

    // Locating the Password Confirmation field
    @FindBy(xpath="//input[@id='id_password2']") // Change if the actual attribute is different
    private WebElement confirmPasswordField;

    // Locating the Register button
    @FindBy(xpath = "//input[@value='Register']") // Change if needed
    private WebElement registerButton;
    
    @FindBy(xpath="/html/body/div[2]")public WebElement success;

    // Constructor to initialize the PageFactory
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
 
}