package runners;

import com.williamhill.promotions.utils.BaseTests;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue={"com.williamhill.promotions.stepdefs"})

public class TestRunner {

    @BeforeClass
    public static void setUp(){
        BaseTests.launchApplication();
    }

    @AfterClass
    public static void tearDown(){
        BaseTests.closeBrowser();
    }


}