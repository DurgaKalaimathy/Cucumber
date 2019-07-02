package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/resources/cucum6.feature"}, 
		glue="stepdef",
		//plugin="html:target/html-report")
		plugin="json:target/json-report.json")
		//plugin="junit:target/xmlreport.xml",
       // tags={"@smoke"})
       //tags={"@unit","@smoke"})//AND
	   //tags={"@unit,@smoke"})//OR
		//tags={"~@unit"})
public class runnerclass {

}
