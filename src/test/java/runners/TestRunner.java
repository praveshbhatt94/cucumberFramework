package runners;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginFeature.feature", 
glue = {"seleniumTests"},
plugin = { "pretty", "json:target/cucumber.json" }
		)
public class TestRunner {

}
