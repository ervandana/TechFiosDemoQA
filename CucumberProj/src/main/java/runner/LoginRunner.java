package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "./Feature/DemoQALogin.feature",
		glue = {"StepDefinition"}
		)
public class LoginRunner {

}
