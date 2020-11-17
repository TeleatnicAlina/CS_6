package com.utm.end_game.steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.utm.end_game.AssertThatWrapper.assertThat;
import static com.utm.end_game.steps.GeneralSteps.getElementByName;
import static com.utm.end_game.steps.GenericActions.click;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsString;

public class CartSteps {

    @When("User delete product from cart")
    public void userDeleteProductFromCart() {
        String methodName = "getDeleteFromCartButton";
        click(getElementByName(methodName));
    }

    @Then("{string} message appears")
    public void yourShoppingCartIsEmptyMessageAppears(String message) {
        String methodName = "get" + message;
        assertThat("assert that message appears", getElementByName(methodName).getText(), containsString(message));
    }
}
