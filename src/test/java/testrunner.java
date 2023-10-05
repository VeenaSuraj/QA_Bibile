import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(


        features = {"src/test/java/featureFiles/Login.feature"},
        glue = {"StepDefenisions"},
        plugin = {
                "pretty","json:target/Cucumber.json",
                "html:target/cucumber-html-report"
        },
        dryRun = false,
        tags = "@smoke"
)

public class testrunner {
}
