<<<<<<< HEAD:src/test/java/stepdefs/TestRunner.java
package stepdefs;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefs"},
        tags = {"@TC001"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:output/report.html"}
)
public class TestRunner {
    @AfterClass
    public static void setup() {
        Reporter.loadXMLConfig(new File("extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Mac OSX");
        Reporter.setTestRunnerOutput("Sample test runner output message");
    }
}
=======
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = {"@TC001"},
         glue = {"stepdefs"},
        monochrome = true
        
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
>>>>>>> dc88d52b3ac7f07664bd1cc2d5a923bcecccdd04:src/test/java/TestRunner.java
