package cucumberTestRunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/features",
		glue="stepDefinations",  monochrome=true,
		plugin= {"pretty", "html:target/cucumber", "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-report/report.html"})

public class testRunner {
	
	@AfterClass
	public static void writeExtentReport()
	{
		Reporter.loadXMLConfig(new File("config/report.xml"));
		
	}
}

