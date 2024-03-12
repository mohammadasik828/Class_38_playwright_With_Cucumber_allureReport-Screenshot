package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src//test//resources//features"},
		glue = {"stepDefinition"},
		plugin={"pretty","html:test-output"},
		//tags = "@Sanity",
		monochrome = true,
		dryRun = false
		)
public class Runner {

}
