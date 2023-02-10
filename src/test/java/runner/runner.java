package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import Pages.BasePage;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/features" }, glue = { "steps" }, plugin = {
                "pretty" }, monochrome = true, tags = {
                                "@books" })

public class runner {

        @AfterClass
        public static void closeDriver() {
                BasePage.closeBrowser();
        }
}
