package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features ="src/test/resources/features/",
		glue= {"stepdefinitions","hooks"},
		tags= "@smoke and @regression",
		plugin= {"pretty", "html:target/cucumber-report.html"},
		monochrome=false
		)
public class TestRunner extends AbstractTestNGCucumberTests {

}
