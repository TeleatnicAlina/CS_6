package com.utm.end_game.steps;

import com.utm.end_game.AssertThatWrapper;
import com.utm.end_game.page_objects.GoogleHome;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;

import static com.utm.end_game.AssertThatWrapper.assertThat;
import static com.utm.end_game.steps.GeneralSteps.getElementByName;
import static com.utm.end_game.steps.GenericActions.navigateToUrl;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class GoogleSteps {
    @Then("Lucky Button is displayed")
    public void luckyButtonIsDisplayed() {
        WebElement luckyButton = getElementByName("getLuckyButton");
        boolean displayed = luckyButton.isDisplayed();
        AssertThatWrapper.assertThat(displayed, is(true));
    }

    @When("User navigate to url {string}")
    public void userNavigateToUrlHttpsWwwGoogleCoIn(String url) throws AWTException {
        navigateToUrl(url);
    }

    @Then("^The folowing number of results apperas$")
    public void theFolowingNumberOfResultsApperas(int number) {
        String methodName = "getresultsDiv";
        getElementByName(methodName);
        System.out.println("hi");
        assertThat("assert that message appears", getElementByName(methodName).findElements(By.className("g")).size(), is(number));
    }

}
