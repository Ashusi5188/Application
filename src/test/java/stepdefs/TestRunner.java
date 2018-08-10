package stepdefs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
/*@CucumberOptions(
        features = "src/test/resources/features"
        ,glue={"stepdefs"},
        tags = {"@TC001"}
)*/
@CucumberOptions(features = "src/test/resources/features", // Test scenarios
        glue = {"src.test.java.stepdefs"}, // Steps definitions
        format = {"pretty", // Cucumber report formats and location to store them in phone/emulator
                "html:/mnt/sdcard/cucumber-reports/cucumber-html-report",
                "json:/mnt/sdcard/cucumber-reports/cucumber.json",
                "junit:/mnt/sdcard/cucumber-reports/cucumber.xml"
            // Note: if you don't have write access to /mnt/sdcard/ on the phone use instead
            // the following path here and in the build.gradle: /data/data/com.neoranga55.cleanguitestarchitecture/cucumber-reports/
        },
        tags={"@TC001"}
)
/*@CucumberOptions(features = {"src/test/resources/features"},
        glue={"src/test/java/stepdefs"},
        tags = {"@TC001"},
        monochrome = true)*/
public class TestRunner {
}
