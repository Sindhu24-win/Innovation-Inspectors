package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	
	  //WebDriver driver=new ChromeDriver();
	  //System.setProperty("driver","C:\Users\Ashish\chromedriver\chromedriver.exe");

	@FindBy(xpath="//input[@name='username']")WebElement usernameLoginpage;
	@FindBy(xpath="//input[@name='password']")WebElement passwordLoginpage;
	@FindBy(xpath="/html/body/div[2]/div/div[2]/form/input[4]")WebElement loginButton;
	@FindBy(xpath="//a[@href='/register']")WebElement registerlinkLoginPage;
    
    
    public loginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
  //  WebDriver driver=new ChromeDriver();
    //System.setProperty("driver","C:\Users\Ashish\chromedriver\chromedriver.exe");
    
    // Method to enter the username
    public void enterUsername(String username) {
    	usernameLoginpage.sendKeys(username);
    }

    // Method to enter the password
    public void enterPassword(String password) {
    	passwordLoginpage.sendKeys(password);
    }

    // Method to click the login button
    public void clickLoginButton() {
    	loginButton.click();
    }

    // Method to perform login action
    public void login(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
    public void register()
    {
    	registerlinkLoginPage.click();
    }
    public void invalidlogin(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();
    }
}

