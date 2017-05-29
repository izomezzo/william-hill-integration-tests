package sports.williamhill.com.integration.tests;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by Ian on 28/05/2017.
 */
@CucumberOptions(
        features = {"src/test/resources/features/football/betting.feature"}, dryRun = false,
        format = {"pretty", "html:target/resources"}
)
@RunWith(Cucumber.class)
public class RunCukesTest {

}
