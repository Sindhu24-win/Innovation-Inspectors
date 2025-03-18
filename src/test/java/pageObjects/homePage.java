package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import io.cucumber.messages.types.Duration;

public class homePage {

	  WebDriver driver;
	  WebDriverWait wait;

	    // Locating the Data Structures dropdown menu
	    @FindBy(xpath = "//a[contains(text(),'Data Structures')]")
	    private WebElement dataStructuresDropdown;

	    // Locating the "Arrays" option in the dropdown
	    @FindBy(xpath = "//a[text()='Arrays']")
	    private WebElement arraysOption;

	    // Locating the "Linked List" option in the dropdown
	    @FindBy(xpath = "//a[text()='Linked List']")
	    private WebElement linkedListOption;

	    // Locating the "Stack" option in the dropdown
	    @FindBy(xpath = "//a[text()='Stack']")
	    private WebElement stackOption;

	    // Locating the "Queue" option in the dropdown
	    @FindBy(xpath = "//a[text()='Queue']")
	    private WebElement queueOption;

	    // Locating the "Tree" option in the dropdown
	    @FindBy(xpath = "//a[text()='Tree']")
	    private WebElement treeOption;

	    // Locating the "Graph" option in the dropdown
	    @FindBy(xpath = "//a[text()='Graph']")
	    private WebElement graphOption;
	    
	   
	
	//By logoutmessage=By.xpath("//div[@role='alert']");
	
	
    @FindBy(xpath="/html/body/div[2]")WebElement loginMessage;
	@FindBy(xpath="//a[@href='/register']")WebElement registerLink;
    @FindBy(xpath="//a[@href='/login']")WebElement loginLink;
    @FindBy(xpath="//div[@role='alert']")WebElement logoutMessage;
    
    // Locating the "Get Started" button for Data Structures Introduction
    @FindBy(xpath = "//a[@href='data-structures-introduction']")
    private WebElement dsIntroGetStarted;

    // Locating the "Get Started" button for Array
    @FindBy(xpath = "//a[@href='array']")
    private WebElement arrayGetStarted;

    // Locating the "Get Started" button for Linked List
    @FindBy(xpath = "//a[@href='linked-list']")
    private WebElement linkedListGetStarted;

    // Locating the "Get Started" button for Stack
    @FindBy(xpath = "//a[@href='stack']")
    private WebElement stackGetStarted;

    // Locating the "Get Started" button for Queue
    @FindBy(xpath = "//a[@href='queue']")
    private WebElement queueGetStarted;

    // Locating the "Get Started" button for Tree
    @FindBy(xpath = "//a[@href='tree']")
    private WebElement treeGetStarted;

    // Locating the "Get Started" button for Graph
    @FindBy(xpath = "//a[@href='graph']")
    private WebElement graphGetStarted;

    // Locating the "Sign Out" link
    @FindBy(xpath="//a[@href='/logout']")
    private WebElement signOutLink;

    
  
    // Constructor to initialize PageFactory elements
    public homePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
       // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    
    // Method to click on the dropdown menu
    public void openDropdown() {
        wait.until(ExpectedConditions.elementToBeClickable(dataStructuresDropdown)).click();
    }
    
 // Method to select a specific option from the dropdown
    public void selectDropdownOption(String option) {
        openDropdown(); // Ensure dropdown is opened before selection

        switch (option.toLowerCase()) {
            case "arrays":
                wait.until(ExpectedConditions.elementToBeClickable(arraysOption)).click();
                break;
            case "linked list":
                wait.until(ExpectedConditions.elementToBeClickable(linkedListOption)).click();
                break;
            case "stack":
                wait.until(ExpectedConditions.elementToBeClickable(stackOption)).click();
                break;
            case "queue":
                wait.until(ExpectedConditions.elementToBeClickable(queueOption)).click();
                break;
            case "tree":
                wait.until(ExpectedConditions.elementToBeClickable(treeOption)).click();
                break;
            case "graph":
                wait.until(ExpectedConditions.elementToBeClickable(graphOption)).click();
                break;
            default:
                System.out.println("Invalid dropdown option: " + option);
        }
    }
    // Methods to click on "Get Started" buttons
    public void clickDSIntroGetStarted() {
        dsIntroGetStarted.click();
    }

    public void clickArrayGetStarted() {
        arrayGetStarted.click();
    }

    public void clickLinkedListGetStarted() {
        linkedListGetStarted.click();
    }

    public void clickStackGetStarted() {
        stackGetStarted.click();
    }

    public void clickQueueGetStarted() {
        queueGetStarted.click();
    }

    public void clickTreeGetStarted() {
        treeGetStarted.click();
    }

    public void clickGraphGetStarted() {
        graphGetStarted.click();
    }

    public void clickSignOut() {
        signOutLink.click();
    }
    public void clickSignIn(String login) {
    	loginLink.click();
    }
	
	public void clickRegister()
	{
		registerLink.click();
	}
	public String getWelcomeMessage() {
		return loginMessage.getText();
	}
	
}
