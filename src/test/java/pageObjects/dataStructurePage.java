package pageObjects;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class dataStructurePage {
	
	//WebDriver driver=new ChromeDriver();
	

	@FindBy(xpath="//a[@href='data-structures-introduction']")WebElement GetstartedButton;
	@FindBy(className="list-group-item")WebElement timeComplexity;
	@FindBy(xpath="a[href='/tryEditor']")WebElement tryHere;
	@FindBy(xpath="//div[@class='CodeMirror-scroll']")WebElement tryEditorTextBox;
	@FindBy(xpath="//button[text()='Run']")WebElement Runbutton;
	@FindBy(xpath="//a[text()='Practice Questions']")WebElement PracticeQuestions;
	
	public dataStructurePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void checkGetstarted()
	{
		GetstartedButton.click();
		
	}
	public void checkTimeComplexity()
	{
		timeComplexity.click();
	}
	
	public void tryhere()
	{
		tryHere.click();
	}
	
	public void checkPractice()
	{
		PracticeQuestions.click();
	}
	
	public void runValidcode(String code)
	{
		tryEditorTextBox.sendKeys(code);
		Runbutton.click();
		
	}
	
	public void invalidcode(String code)
	{
		tryEditorTextBox.sendKeys(code);
		Runbutton.click();
	}
	
	
	
	
}
 
