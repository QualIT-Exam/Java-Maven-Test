package testRunners.smokeRun;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions
(
        features = "src/test/resources/features",
        glue = {"stepdefinitions"},
        monochrome = true,
        plugin = {"pretty", "html:target/cucumber-html-report", "json:target/cucumber.json"}
)
public class CukesRunnerTest extends AbstractTestNGCucumberTests {
}
