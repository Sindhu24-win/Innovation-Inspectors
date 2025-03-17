package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", glue = {"StepDefinitions"},
monochrome = true,

plugin = {"pretty", "html:target/htmlReports/HTMLreports.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm","junit:target/JUnitReport/report.xml"})




public class TestRunner {

}
