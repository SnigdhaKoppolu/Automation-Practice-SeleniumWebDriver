package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
     features= "./Features/Login.feature", //----> if we want to execute single file
	//if we want to execute multiple files "./Features"
    //features = "./Features",    //location path of the feature file= (name of the folder where feature files kept) 
    glue = "stepDefinition",//provide glue code= (name of the package where glue code kept)
    
    //tags="@wip"  
    //tags="@all"
    //dryRun = true  //(dryrun=false it will open the chrome, by default dryrun is false)
    //dryRun=true then it will checks there is proper step definition or not. it will not open the chrome 
    plugin={"html:./Reports/myport.html" , 
    		"json:./Reports/myjsonreport.json"}
    
		)
public class TestRunner {

}
