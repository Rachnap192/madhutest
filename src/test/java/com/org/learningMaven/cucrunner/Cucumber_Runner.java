package com.org.learningMaven.cucrunner;
import org.junit.runner.RunWith;


import com.org.learningMaven.Project.dummy;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
	 features={"src/test/java/com/org/learningMaven/Feature"},
			   glue = {"com.org.learningMaven.StepDefinition"},
			    format = {"pretty", "html:build/cucumber-html-report"}
)

public class Cucumber_Runner  {
	public void test01() throws InterruptedException
	{
	
			
	}

}
