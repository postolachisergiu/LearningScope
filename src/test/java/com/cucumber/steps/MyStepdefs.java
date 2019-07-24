package com.cucumber.steps;

import cucumber.api.java8.En;

public class MyStepdefs implements En {
    public MyStepdefs() {
        Given("^I would like to see how looks Cucumber-java(\\d+)$", (Integer arg0) ->
                System.out.println("\n" + arg0)
        );
    }
}
