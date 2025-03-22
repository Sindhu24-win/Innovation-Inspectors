package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hooks {
	private static WebDriver driver;

	public Hooks() {

	}

	@Before
	public static void setUp() {
// Initialize WebDriver only once before all tests
		if (driver == null) {
			driver = new ChromeDriver();

		}
	}

	@After
	public static void tearDown() {
// Quit WebDriver after all tests are finished
		if (driver != null) {
			driver.quit();

		}
	}

	@AfterStep
	public void takeScreenshot(Scenario scenario) {
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", scenario.getName());
		}
	}

	public static WebDriver getDriver() {
		return driver;
	}
}