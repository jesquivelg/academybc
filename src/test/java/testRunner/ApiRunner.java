package testRunner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "src/test/resources/apiFeatureFiles", 
		glue = {"apiStepDefinitions"},
		tags = {"not @ignore"}
		
		)
public class ApiRunner extends AbstractTestNGCucumberTests {

}
