package stepdefs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/features"},
        tags = {"@TC001"},
        monochrome = true)
public class TestRunner {
}