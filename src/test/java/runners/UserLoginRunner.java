//package runners;
//
//
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import io.cucumber.testng.AbstractTestNGCucumberTests;
//import io.cucumber.testng.CucumberOptions;
//
//
//@CucumberOptions(
//		features = "src//test//resources//features//",
//		glue = {"stepDefinitions"},
//		dryRun = true,
//		monochrome=true, //to get the clear output
//		plugin = {"pretty", //has some junk characters in the output
//				"html:target/Reports/HtmlReport.html",
////			    "json:target/Reports/JsonReport.json",
////				"usage:target/Reports/UsageReport",
////				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
//				}
//		)
//public class UserLoginRunner extends AbstractTestNGCucumberTests{
//            
//	  @DataProvider(parallel=true)
//	  public Object[][] scenarios(){
//		  return super.scenarios();
//	  }
//}
