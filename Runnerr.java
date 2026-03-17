
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources", 
    glue = "com.cucumber.framework", 
    plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class Runnerr {

}
