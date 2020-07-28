package cucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="src/test/java/features",//feature file path
		glue="stepDefinition")//classname
		
//give feature file
public class testRunner extends AbstractTestNGCucumberTests {
 
}
