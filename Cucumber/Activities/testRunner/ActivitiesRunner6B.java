package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src\\test\\java\\features",
        glue = {"stepDefinitions"},
        tags = "@activity5",
        plugin = {"json: test-reports/json-report.json"},
        monochrome = true
)

public class ActivitiesRunner6B {}