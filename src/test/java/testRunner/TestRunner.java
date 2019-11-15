package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		features = "src/test/resources/features/cart.feature", 
		glue = {"stepDefinitions"},
		tags = {"not @ignore"}
		
		
		)
public class TestRunner extends AbstractTestNGCucumberTests {

	
}
