package pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class homePage {

    WebDriver driver;
    WebDriverWait wait;

    // Constructor to initialize PageFactory elements
    public homePage(WebDriver driver) {
        this.driver = driver;  // ✅ Set driver before using it
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10)); // ✅ Initialize WebDriverWait correctly
        PageFactory.initElements(driver, this);
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

    @FindBy(xpath="//a[@href='/logout']")
    public WebElement signOutLink;

    // ✅ Fix WebDriverWait initialization in constructor
    public void openDropdown() {
        WebElement dropdown = driver.findElement(By.xpath("//a[@href='#']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dropdown)).click();
    }

    // ✅ Ensure elements are clickable before interacting
    public void dropdown(String string) {

    	dataStructuresDropdown.click();
		switch (string) {
		case "Arrays":
			
			arraysOption.click();
			break;
		case "Linkedlist":
			
			linkedListOption.click();
			break;
		case "Stack":
			
			stackOption.click();
			break;
		case "Queue":
			
			queueOption.click();
			break;
		case "Tree":
			
			treeOption.click();
			break;
		case "Graph":
			
			graphOption.click();
			break;
		}
		}

    public void clickLogin(String username, String password) {
        wait.until(ExpectedConditions.visibilityOf(userName)).sendKeys(username);
        wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(LoginBtn)).click();
    }

    public void clickArrayGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(arrayGetStarted)).click();
    }

    public void GetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(DSAlgoGetstart)).click();
    }

    public void clickLinkedListGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(linkedListGetStarted)).click();
    }

    public void clickStackGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(stackGetStarted)).click();
    }

    public void clickQueueGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(queueGetStarted)).click();
    }

    public void clickTreeGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(treeGetStarted)).click();
    }

    public void clickGraphGetStarted() {
        wait.until(ExpectedConditions.elementToBeClickable(graphGetStarted)).click();
    }

    public void clickSignOut() {
        wait.until(ExpectedConditions.elementToBeClickable(signOutLink)).click();
    }

    public void clickSignIn() {
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
       // WebElement signInButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Sign in')]")));
    	loginLink.click();
    }
    public void clickRegister() {
        wait.until(ExpectedConditions.elementToBeClickable(registerLink)).click();
    }

    public String getWelcomeMessage() {
        return wait.until(ExpectedConditions.visibilityOf(loginMessage)).getText();
    }

    public String getLogoutMessage() {
        return wait.until(ExpectedConditions.visibilityOf(logoutMessage)).getText();
    }
}
