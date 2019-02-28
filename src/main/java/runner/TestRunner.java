package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		// features is the path of feature files.
		features = "C:\\Users\\laqin3\\eclipse-workspace\\cucumber\\FreeCrmBDDFramework\\src\\main\\java\\features\\Login.feature", glue = {
				"stepDefinition" }, // the path of step definition files

		format = { "pretty", "html:test-output", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml" }, // to
																														// generate
																														// different
																														// types
																														// of
																														// reporting
		monochrome = true, // display the console output in a proper readable
							// format

		strict = true, // it will check if any step definition is not defined in step definition file
		dryRun = false // is used to check the mapping is proper between feature file and step
						// definition file.
)

public class TestRunner {

}
