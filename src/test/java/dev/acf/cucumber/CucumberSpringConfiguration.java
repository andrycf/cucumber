package dev.acf.cucumber;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
public class CucumberSpringConfiguration {
    @Then("bye")
    public void bye() {
        System.out.println("#### Bye !!!");
    }
}
