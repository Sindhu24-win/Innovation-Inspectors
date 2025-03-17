package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelReader {
	
public static void main(String[] args) throws IOException {

		

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		

		driver.get("https://dsportalapp.herokuapp.com/home");

		driver.manage().window().maximize();

		System.out.println("Page opened successfully");

		

		WebElement signIn = driver.findElement(By.linkText("Sign in"));

		signIn.click();

		System.out.println("Sign In clicked successfully");

		

		WebElement userName = driver.findElement(By.id("id_username"));

		userName.sendKeys("darshana");

		System.out.println("User name enetered successfully");

		

		WebElement password = driver.findElement(By.id("id_password"));

		password.sendKeys("zenithhp4987");

		System.out.println("Password enetered successfully");

		

		WebElement logInButton = driver.findElement(By.xpath("//input[@type='submit']"));

		logInButton.click();

		System.out.println("Login button clicked successfully");

		

		WebElement arrayButton = driver.findElement(By.xpath("//a[@href='array']"));

		arrayButton.click();

		System.out.println("Array button clicked successfully");

		

		WebElement arraysInPythonLink = driver.findElement(By.xpath("//a[@href='arrays-in-python']"));

		arraysInPythonLink.click();

		System.out.println("arraysInPythonLink clicked successfully");

		

		WebElement practiceQuestions = driver.findElement(By.linkText("Practice Questions"));

		wait.until(ExpectedConditions.elementToBeClickable(practiceQuestions));

		practiceQuestions.click();

		System.out.println("practiceQuestions clicked successfully");

		

		WebElement searchTheArray = driver.findElement(By.linkText("Search the array"));

		wait.until(ExpectedConditions.elementToBeClickable(searchTheArray));

		searchTheArray.click();

		System.out.println("search the array clicked successfully");

		

		JavascriptExecutor js = (JavascriptExecutor) driver;

		

		//The below code is to read python code from excel

		

		String excelFilePath = "/Users/sasikumarkathirvel/eclipse-workspace/selenium-demo/selenium-demo/src/test/resources/Excel_Login_Pythoncode.xlsx";

        String pythonCode = readPythonCodeFromExcel(excelFilePath);

        System.out.println("Extracted Python Code: \n" + pythonCode);

        

        



		// Locate the CodeMirror editor

		WebElement codeMirrorDiv = driver.findElement(By.className("CodeMirror"));



		// Clear the editor using JavaScript

		js.executeScript("arguments[0].CodeMirror.setValue('');", codeMirrorDiv);

		System.out.println("Code input field cleared successfully");



		// Set new content in the editor

		js.executeScript("arguments[0].CodeMirror.setValue(arguments[1]);", codeMirrorDiv, pythonCode);

		System.out.println("New code entered successfully");

		

		// Click Run and Validate Output

        WebElement runButton = driver.findElement(By.xpath("//button[text()='Run']"));

        runButton.click();

        System.out.println("Code executed");

        

     // Wait for output to appear

        WebElement outputDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("output")));



        // Validate output contains "Element Found"

        String outputText = outputDiv.getText();

        if (outputText.contains("Element Found")) {

            System.out.println("Test Passed: Expected output found");

        } else {

            System.out.println("Test Failed: Expected output not found");

        }

		

		

	}

	

	private static String readPythonCodeFromExcel(String filePath) throws IOException {

        FileInputStream file = new FileInputStream(new File(filePath));

        Workbook workbook = new XSSFWorkbook(file);

        Sheet sheet = workbook.getSheet("pythonCode");

        Row row = sheet.getRow(1); // A2 is in row index 1 (0-based)

        Cell cell = row.getCell(0); // A column index is 0 (0-based)

        String pythonCode = cell.getStringCellValue();

        workbook.close();

        return pythonCode;

    }



}





