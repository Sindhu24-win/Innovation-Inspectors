package StepDefinitions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Utilities.LoggerReader;
import io.cucumber.java.After;
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
		if (driver != null) {
			driver.quit();
			driver = null;
		}
	}

	
	@After
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerReader.error("Steps Failed , Taking Screenshot");
			TakesScreenshot screenshotTaker = (TakesScreenshot) driver;
			final byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "My screenshot");
			Allure.addAttachment("Myscreenshot",
					new String(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES)));
		}

	}

	

}