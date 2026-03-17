package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
		features="./Features/form.feature",
		glue="stepDefinition"
		//dryRun=true
		
		//if we set dryRun=true what does it mean-----> it will check the step defenition for this form.feature

		)




public class TestRunnerForm {

}
