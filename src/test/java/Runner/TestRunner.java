package Runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "StepDefinitions" },

		monochrome = false, tags = "@DsAlgo_Cucumber",

		plugin = { "pretty", "html:target/cucumber.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

		})

public class TestRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {

		return super.scenarios();
	}
}




