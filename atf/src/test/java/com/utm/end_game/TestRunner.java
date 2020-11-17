package com.utm.end_game;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/lab_6",
        glue = "com.utm.end_game.steps",
        plugin = {"pretty","json:target/cucumber.json","html:target/site/cucumber-pretty"},
        stepNotifications = true,
        monochrome = true
)
public class TestRunner {
}