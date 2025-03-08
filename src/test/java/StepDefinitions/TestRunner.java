package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",  // Path to feature files
        glue = "StepDefinitions",                 // Package name where step definitions exist
        plugin = {"pretty", "html:target/cucumber-reports"},
        monochrome = true
)
public class TestRunner {
 HEAD

	
	
 b4db99f (pushing to darshana branch)
}