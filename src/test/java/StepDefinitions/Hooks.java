package StepDefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

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
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	@After
	public void takeScreenshot(Scenario scenario) {

		if (scenario.getStatus().equals(Status.FAILED)) { // Corrected method
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			final byte[] sourcePath = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName);
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}
}