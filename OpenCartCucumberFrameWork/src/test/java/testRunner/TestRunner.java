package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features= {".//Features/"},                       //will execute all
		
		 //features= {".//Features/Login.feature"},          //only execute Login
		
		//features= {".//Features/Registration.feature"},   //only execute Registration

		// features= {".//Features/LoginDDTExcel.feature"},  //only execute Data driven test

		features= {".//Features/Login.feature",".//Features/Registration.feature"},  //both Login and Registration

		//features= {"@target/rerun.txt"}, //only rerun -- enable only need to run failure scenarios and disable rest
		

		glue = { "stepDefinitions", "hooks" }, 
		plugin = { "pretty", "html:reports/myreport.html",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", 
				"rerun:target/rerun.txt",  //Keep this rerun every time-- we don't know when failure will happen

		},
		

		dryRun = false, // checks mapping between scenario steps and step definition methods
		monochrome = true, // to avoid junk characters in output
		publish = true // to publish report in cucumber server
		
		
		//tags="@sanity" // this will execute scenarios tagged with @sanity
		
		//tags="@regression"
		
		//tags="@sanity and @regression" //Scenarios tagged with both @sanity and @regression
		
		// tags="@sanity and not @regression" //Scenarios tagged with @sanity but not tagged with @regression
		
		// tags="@sanity or @regression" //Scenarios tagged with either @sanity or @regression
)
public class TestRunner {

}