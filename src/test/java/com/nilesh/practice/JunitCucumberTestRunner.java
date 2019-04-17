package com.nilesh.practice;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features="classpath:"
    ,dryRun = false
    ,tags = "@DummyTest"
    ,plugin = {"html:target"}

)
public class JunitCucumberTestRunner {
}
