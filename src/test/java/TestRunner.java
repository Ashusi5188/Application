package stepdefs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = {"@TC001"},
         glue = {"CalculatorStepDefinition","classpath:stepdefs"}
        
)
/*@CucumberOptions(features = "src/test/resources/features", // Test scenarios
        glue = {"stepdefs"}, // Steps definitions
        tags={"@TC001"}
)*/
/*@CucumberOptions(features = {"src/test/resources/features"},
        glue={"src/test/java/stepdefs"},
        tags = {"@TC001"},
        monochrome = true)*/
public class TestRunner {
}
