package com.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		
		
		features="features",
		glue="com.stepdefinition",
		dryRun=false,// it is used to compile feature file
		monochrome=true,// to readable output
		plugin="html:target",
		tags="@jbk"// tags are used to specific scenario
)




public class TestRunner {

}
