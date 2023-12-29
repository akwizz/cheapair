package org.app.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "G:\\Kabil\\maven project\\Cheapair\\src\\test\\java\\org\\app\\feature",
glue = "org.app.stepdefition",dryRun = false,tags = "@Round_trip",monochrome = false,
plugin ={"pretty","html:target/cucumber_reports"})

public class Runner {

}
