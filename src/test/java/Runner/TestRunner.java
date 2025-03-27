package Runner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import DriverFactory.driverFactory;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "StepDefinitions" },

		monochrome = false,

		tags = "@Regression",

		plugin = { "pretty", "html:target/cucumber.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

		})

public class TestRunner extends AbstractTestNGCucumberTests {

	@BeforeClass
	@Parameters("browser")
	public static void setup(@Optional("chrome") String browser) {
		System.out.println("Setting up driver for browser: " + browser);
		driverFactory.setBrowser(browser);
		
	}

	@Override
	@DataProvider(parallel = false) // Enable parallel execution
	public Object[][] scenarios() {
		return super.scenarios();
	}
}