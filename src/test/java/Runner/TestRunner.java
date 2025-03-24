package Runner;



import org.testng.annotations.BeforeClass;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features ={"src/test/resources/features"},
          glue={"StepDefinitions"},

                 monochrome=true,tags="@Regression",

plugin= {"pretty" ,"html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",

		"junit:target/CucumberReports/CucumberReportxml",

		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

})    

                                                                                                                                                                                                                                       
public class TestRunner extends AbstractTestNGCucumberTests{	

	
	@BeforeClass

    public static void setup() {

        System.setProperty("allure.results.directory", "target/allure-results"); // Set correct directory

    }

	
	@Override

	  @DataProvider(parallel = false)

	  public Object[][] scenarios() {

			return super.scenarios();
						
	}

}