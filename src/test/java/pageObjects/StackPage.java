package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class StackPage {
	WebDriver driver;
	
	String url = "https://dsportalapp.herokuapp.com/home";
	 @FindBy(xpath = "//a[@href='stack']")
	 WebElement GetStarted;
	 @FindBy(xpath = "/html/body/div[2]/ul[1]/a")
	 WebElement OperationsInStack;
	 @FindBy(xpath = "/html/body/div[2]/ul[2]/a")
	WebElement Implementation;
	 @FindBy(xpath = "/html/body/div[2]/ul[3]/a")
	WebElement Application;
	@FindBy(xpath = "//*[@id=\"content\"]/a")
	WebElement PracticeQuestions;
	@FindBy(xpath = "/html/body/div[2]/div/div[2]/a")
	WebElement TryHere;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/button")
	WebElement RunButton;
	@FindBy(xpath = "//*[@id=\"answer_form\"]/div/div/div[6]/div[1]/div/div/div/div[5]/div/pre")
	WebElement TryEditor;
	
			public StackPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver,this);
	    }
			public void stack() {

	 GetStarted.click();
	 OperationsInStack.click();
	 Implementation.click();
	 Application.click();
	 PracticeQuestions.click();
	 TryHere.click();
	 RunButton.click();
	 TryEditor.sendKeys(print("Hello"));

}
}
