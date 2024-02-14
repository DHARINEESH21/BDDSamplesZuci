package runners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		features = "src//test//resources//features//GooglePageSearch.feature",
		glue = {"stepDefinitions"},
	//	dryRun = true,
		monochrome=true, //to get the clear output
		plugin = {"pretty", //has some junk characters in the output
				"html:target/Reports/HtmlReport.html",
				"json:target/Reports/JsonReport.json",
				"usage:target/Reports/UsageReport",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				}
		)

      
//to run it as a each steps as a test we use the AbstractNGCucumberTests
public class GooglrPageRunner extends AbstractTestNGCucumberTests{
	
	

}
