package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src\\test\\java\\feature",
		glue = {"stepDefinition","hooks"},
		dryRun = false,
		plugin = {"pretty","summary","html:target/CucumberReport.html"},
		monochrome= false,
	    tags = "@save"
)
public class RunnerClass {

}
