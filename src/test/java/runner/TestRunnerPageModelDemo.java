package runner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features/SignInAndSearch.feature",
        glue = {"steps"},
        tags = "@SearchSignIn",
        monochrome=true
        )


public class TestRunnerPageModelDemo extends AbstractTestNGCucumberTests{
	
	
}
