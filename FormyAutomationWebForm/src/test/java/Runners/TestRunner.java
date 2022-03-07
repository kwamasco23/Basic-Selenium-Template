package Runners;



import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;

//import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
        (features="src/main/resources/Features",
                glue="src/test/java/StepDefinitions",
                dryRun = false,
                tags = "@test"

        )

public class TestRunner {
}
