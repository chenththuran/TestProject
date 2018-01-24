package tests;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/feature",
		glue={"src/stepdefinition"},tags = {"@SmokeTest"}	)
public class TestRun {

}
