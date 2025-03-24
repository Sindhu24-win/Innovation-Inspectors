package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize PageFactory elements
    public homePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
    
    
    @FindBy(xpath = "//button[text()='Get Started']")
    WebElement DSAlgoGetstart;

    @FindBy(id = "id_username")
    WebElement userName;

    @FindBy(id = "id_password")
    @CacheLookup
    WebElement Password;

    @FindBy(xpath = "//*[@value='Login']")
    @CacheLookup
    WebElement LoginBtn;

    @FindBy(xpath = "//div[@class='nav-item dropdown show']")
    public WebElement dataStructuresDropdown;

    @FindBy(xpath = "//a[text()='Arrays']")
    public WebElement arraysOption;

    @FindBy(xpath = "//a[text()='Linked List']")
    public WebElement linkedListOption;

    @FindBy(xpath = "//a[text()='Stack']")
    public WebElement stackOption;

    @FindBy(xpath = "//a[text()='Queue']")
    public WebElement queueOption;

    @FindBy(xpath = "//a[text()='Tree']")
    public WebElement treeOption;

    @FindBy(xpath = "//a[text()='Graph']")
    public WebElement graphOption;

    @FindBy(xpath = "/html/body/div[2]")
    public WebElement warning;

    @FindBy(xpath="/html/body/div[2]")
    public WebElement loginMessage;

    @FindBy(xpath="//a[@href='/register']")
    public WebElement registerLink;

    @FindBy(xpath="//a[text()='Sign in']")
    public WebElement loginLink;

    @FindBy(xpath="//div[@role='alert']")
    public WebElement logoutMessage;

    @FindBy(xpath = "/html/body/div[1]/div/div/a/button")
    public WebElement dsIntroGetStarted;

    @FindBy(xpath = "//a[@href='array']")
    public WebElement arrayGetStarted;

    @FindBy(xpath = "//a[@href='linked-list']")
    public WebElement linkedListGetStarted;

    @FindBy(xpath = "//a[@href='stack']")
    public WebElement stackGetStarted;

    @FindBy(xpath = "//a[@href='queue']")
    public WebElement queueGetStarted;

    @FindBy(xpath = "//a[@href='tree']")
    public WebElement treeGetStarted;

    @FindBy(xpath = "//a[@href='graph']")
    public WebElement graphGetStarted;

    @FindBy(xpath = "//a[text()='Sign out']")
	@CacheLookup
	WebElement signOut;

    @FindBy(xpath = "//a[text()='Sign in']")
	@CacheLookup
	WebElement signIn;
    
    @FindBy(xpath = "//div[@class='nav-item dropdown']")
	@CacheLookup
	WebElement dropdownMenu;

	@FindBy(xpath = "//a[text()='Tree']")
	@CacheLookup
	WebElement selectTree_DropdownMenu;

	@FindBy(xpath = "//title[text()='Tree']")
	@CacheLookup
	WebElement titleTree;
    public void signOut() {
		signOut.click();
	}

    public String getStatus() {
		return loginMessage.getText();
	}

    public String getStatus1() {
		return logoutMessage.getText();
	}

    public void dropdownMenuClick() {
		dropdownMenu.click();
	}

	public void clickTreeFromDropdown() {
		selectTree_DropdownMenu.click();
	}

	public String titleTree() {
		return titleTree.getText();
	}
	public void GetStarted() {
		DSAlgoGetstart.click();
	}

	public void signIn() {
		signIn.click();
	}

	public String warning()
	{
		return warning.getText();
	}
	public void clickLogin(String username, String password) {
		userName.sendKeys(username);
		Password.sendKeys(password);
		LoginBtn.click();

	}
   
}
