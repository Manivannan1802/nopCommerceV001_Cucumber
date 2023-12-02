package testRunner;

import org.junit.runner.RunWith;
import org.testng.annotations.Test;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions
(
		features=".//Features/customers.feature",
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		//plugin= {"pretty","html:test-output"}
		// Corrected plugin configuration
		plugin = {"pretty", "html:C:/Users/sanma/eclipse-workspace/nopCommerceV001_Cucumber/test-output"}

		
		)

@Test
public class TestRun {

}
