package dev.acf.cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class VersionStepdefs{
    @When("the client calls \\/version")
    public void theClientCallsVersion() {
        System.out.println("#### The client calls version");
    }

    @Then("the client receives status code of {int}")
    public void theClientReceivesStatusCodeOf(int code) {
        System.out.println("#### The client receives status code of "+code);
    }

    @And("the client receives server version {double}")
    public void theClientReceivesServerVersion(double version) {
        System.out.println("#### The client receives server version "+version);
    }
}
