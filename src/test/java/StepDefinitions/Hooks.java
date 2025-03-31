package StepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import DriverFactory.driverFactory;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks {
	private static WebDriver driver;

	@BeforeClass
	public static void setUp() {
// //Initialize WebDriver only once before all tests
		if (driver == null) {
			driver = new ChromeDriver();
		}
	}

	@AfterClass
	public static void tearDown() {
// Quit WebDriver after all tests are finished
		driverFactory.quitDriver();
	}

	  public void afterStep(Scenario scenario) {
	        WebDriver driver = driverFactory.getDriver(); // Get WebDriver for current thread

	        if (scenario.isFailed()) {
	            // Capture screenshot if scenario fails
	            TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
	            final byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(screenshot, "image/png", "My screenshot");
	            Allure.addAttachment("Myscreenshot", new String(screenshot));
	        }
	    }

	

}