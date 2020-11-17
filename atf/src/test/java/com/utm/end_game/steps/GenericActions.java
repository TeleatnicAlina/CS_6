package com.utm.end_game.steps;

import com.utm.end_game.web_driver_singleton.WebDriverSingleton;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.time.Duration;

import static com.utm.end_game.web_driver_singleton.WebDriverSingleton.getDriver;

public class GenericActions {
    private static final long timeout = 20L;

    public static void click(WebElement webElement) {
        waitElement(webElement);
        webElement.click();
    }
    public static void waitElement(WebElement webElement) {
        Wait<WebDriver> wait = new FluentWait<>(getDriver())
                .withTimeout(Duration.ofSeconds(timeout))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOf(webElement));
    }
    public static void enterValue(WebElement webElement, String value){
        waitElement(webElement);
        webElement.clear();
        webElement.sendKeys(value);
    }
    public static void getText(WebElement webElement){
        webElement.getText().trim();
    }
    public static void refreshPage(){
        WebDriver driver = WebDriverSingleton.getDriver();
        driver.navigate().refresh();
    }

    public static void navigateToUrl(String url) throws AWTException {
        WebDriver driver = WebDriverSingleton.getDriver();
        driver.navigate().to(url);
    }
}
