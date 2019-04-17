package com.nilesh.practice;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DummyTestSteps {


    @When("a dummy step is written")
    public void a_dummy_step_is_written() {
        System.out.println("a dummy step is written");
    }

    @Then("a dummy step validation should be successful")
    public void a_dummy_step_validation_should_be_successful() {
        System.out.println("a dummy step validation should be successful");
    }
}
