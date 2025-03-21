package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = { "src/test/resources/Features" }, glue = { "StepDefinitions","HooksFile" },

		monochrome = true, tags = " ",

		plugin = { "pretty", "html:target/cucumber.html", "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",

				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
			

		})


public class TestRunner extends AbstractTestNGCucumberTests {
	

}