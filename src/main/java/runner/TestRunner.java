package runner;

import cucumber.api.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/LoginLogoutFunctionality.feature",
        glue = {
                "stepDefinition/LoginPageStepsDef.java"
        },
        plugin = {
                "pretty"
        },
        monochrome = true, dryRun = false)


public class TestRunner {
}
