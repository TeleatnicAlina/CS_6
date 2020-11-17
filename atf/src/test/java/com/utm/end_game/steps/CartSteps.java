package com.utm.end_game.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.utm.end_game.AssertThatWrapper.assertThat;
import static com.utm.end_game.steps.GeneralSteps.getElementByName;
import static com.utm.end_game.steps.GenericActions.click;
import static org.hamcrest.Matchers.containsString;

public class CartSteps {

    @When("User delete product from cart")
    public void userDeleteProductFromCart() {
        String methodName = "getDeleteFromCartButton";
        click(getElementByName(methodName));
    }

    @Then("^The following message appears$")
    public void yourShoppingCartIsEmptyMessageAppears(String message) {
        String methodName;
        if (message.contains("dorit")) {
             methodName= "get" + "didyoumean";
        } else {
           methodName = "get" + message;
        }

        assertThat("assert that message appears", getElementByName(methodName).getText(), containsString(message));

    }
}
