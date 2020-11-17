package com.utm.end_game.steps;

import io.cucumber.java.en.When;

import static com.utm.end_game.steps.GenericActions.refreshPage;

public class ConfigurationModifySteps {

        @When("User refresh page")
        public void userRefreshPage() {
            refreshPage();
        }
}
