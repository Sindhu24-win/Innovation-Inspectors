package Runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features ={"src/test/resources/Features"},glue={"StepDefinitions"},

                 monochrome=true,

plugin= {"pretty" ,"html:target/cucumber.html","io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",

		"junit:target/CucumberReports/CucumberReportxml",

		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",

})    

                                                                                                                                                                                                                                       
public class TestRunner extends AbstractTestNGCucumberTests{	

		

}