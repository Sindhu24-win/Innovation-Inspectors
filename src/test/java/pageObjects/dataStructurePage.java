package pageObjects;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class dataStructurePage {
	
	//WebDriver driver=new ChromeDriver();
	private WebDriver driver;
    WebDriverWait wait;
    
    String username="darshana";
    String password="zenithhp4987";

    @FindBy(xpath="//button[text()='Get Started']")WebElement DSAlgoGetstart;
    @FindBy(xpath="//a[text()='Sign in']")WebElement signIn;
	@FindBy(xpath="//a[@href='data-structures-introduction']")WebElement GetstartedButton;
	@FindBy(className="list-group-item")WebElement timeComplexity;
	@FindBy(xpath="a[href='/tryEditor']")WebElement tryHere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement tryEditorTextBox;
	@FindBy(xpath="//button[text()='Run']")WebElement Runbutton;
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement PracticeQuestions;
	
	public dataStructurePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(5));
	}
	
	public void checkGetstarted()
	{
		wait.until(ExpectedConditions.elementToBeClickable(GetstartedButton));
		GetstartedButton.click();
		
	}
	public void checkTimeComplexity()
	{
		wait.until(ExpectedConditions.elementToBeClickable(timeComplexity));
		timeComplexity.click();
	}
	
	public void tryhere()
	{
		wait.until(ExpectedConditions.elementToBeClickable(tryHere));
		tryHere.click();
	}
	
	public void checkPractice()
	{
		wait.until(ExpectedConditions.elementToBeClickable(PracticeQuestions));
		PracticeQuestions.click();
	}
	
	public void runValidcode()
	{
		wait.until(ExpectedConditions.elementToBeClickable(tryEditorTextBox));
		tryEditorTextBox.sendKeys("print 'hello'");
		wait.until(ExpectedConditions.elementToBeClickable(Runbutton));
		Runbutton.click();
		
	}
	
	public void invalidcode()
	{
		
		tryEditorTextBox.sendKeys("hgvh");
		wait.until(ExpectedConditions.elementToBeClickable(Runbutton));
		Runbutton.click();
	}
		
	
}
 
