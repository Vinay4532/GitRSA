package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//cucumber->  TestNG, junit,Post jira2 post jira3

@CucumberOptions(features="src/test/java/cucumber",glue="rahulshettyacademy.stepDefinitions",
monochrome=true, tags = "@Regression", plugin= {"html:target/cucumber.html"})
public class TestNGTestRunner extends AbstractTestNGCucumberTests{

	
}
