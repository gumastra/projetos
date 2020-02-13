package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/features/validaBusca.feature",
		glue = "steps",
		plugin = {"pretty", "html:target/report-html", "json:target/cucumber-reports/cucumber.json"},
		monochrome = true,
		strict = false)
public class RunnerTest {

}
