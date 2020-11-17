package com.utm.end_game.steps;

import com.utm.end_game.AssertThatWrapper;
import com.utm.end_game.ScenarioContext;
import com.utm.end_game.ScenarioKeys;
import com.utm.end_game.web_driver_singleton.WebDriverSingleton;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static com.utm.end_game.AssertThatWrapper.assertThat;
import static org.hamcrest.Matchers.is;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static com.utm.end_game.steps.GenericActions.*;

public class GeneralSteps {
    private static final String allowedCharacters = "[^a-zA-Z0-9:]";


    //TODO throw custom exception
    @When("User clicks on {string} {string}")
    public void clickOnTheElement(String element, String elementType) {
        String methodName = "get" + element + elementType;
        click(getElementByName(methodName));
    }

    @When("User enters {string} in {string} field")
    public void enterValueInTheField(String value, String field) {
        String methodName = "get" + field;
        enterValue(getElementByName(methodName), value);
    }

    public static WebElement getElementByName(String methodName) {
        WebElement webElement = null;
        methodName = methodName.replaceAll(allowedCharacters, "");
        Object pageObj = ScenarioContext.getInstance().getData(ScenarioKeys.PAGE);
        try {
            Method[] methods = pageObj.getClass().getMethods();
            for (Method method : methods) {
                if (method.getName().toLowerCase().equals((methodName).toLowerCase())) {
                    webElement = (WebElement) method.invoke(pageObj);
                }
            }
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return webElement;
    }

    @Then("User is on {string} page")
    public void getPageName(String pageName) {
        try {
            pageName = pageName.replaceAll(allowedCharacters, "");
            Class<?> classname = Class.forName("com.utm.end_game.page_objects." + pageName);
            ScenarioContext.getInstance().saveData(ScenarioKeys.PAGE, classname.newInstance());
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }
    }

    public void assertMessage(String methodName, String message) {
        waitElement(getElementByName(methodName));
        AssertThatWrapper.assertThat(getElementByName(methodName).getText(), is(message));
    }

    @Then("{string} message is displayed")
    public void messageIsDisplayed(String message) {
        String methodName = "get" + message + "Message";
        assertMessage(methodName, message);
    }

    @Then("{string} message is displayed under {string} field")
    public void messageIsDisplayedUnderField(String message, String field) {
        String methodName = "get" + message + "MessageUnder" + field;
        assertMessage(methodName, message);

    }


    @Then("{string} file is downloaded")
    public void fileIsDownloaded(String fileName) {
        String expectedMessage = "File is downloaded";
        String home = System.getProperty("user.home");
        String path = home + "/Downloads";
        AssertThatWrapper.assertThat(isFileDownloaded(path, fileName), is(expectedMessage));
    }

    public String isFileDownloaded(String downloadPath, String fileName) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        File dir = new File(downloadPath);
        File[] dirContents = dir.listFiles();

        for (int i = 0; i < dirContents.length; i++) {
            if (dirContents[i].getName().contains(fileName)) {
                dirContents[i].delete();
                return "File is downloaded";
            }
        }
        return "File is not downloaded";
    }


    @Then("{string} message is displayed on page")
    public void messageIsDisplayedOnPage(String message) {
        String methodName = "get" + message + "Message";
        waitElement(getElementByName(methodName));
        assertThat(getElementByName(methodName).getText(), is(message));
    }

    @Disabled("CAL-5")
    @Then("User is registered successfully")
    public void userIsRegisteredSuccessfully() {
        //Implement after update site
    }

    @Disabled("CAL-8")
    @Then("User is logged in successfully")
    public void userIsLoggedInSuccessfully() {
        //Implement after update site
    }

    @Then("User clicks on Back to Site button")
    public void userClicksOnBackToSiteButton() {

        WebDriver driver = WebDriverSingleton.getDriver();
        driver.navigate().back();
    }

    @When("User scroll down to the bottom of page")
    public void userScrollDownToTheBottomOfPage() {
//        WebDriver driver = WebDriverSingleton.getDriver();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//        System.out.println("hi");
    }

    @Disabled("CAL-18")
    @Then("Social media Page is opened")
    public void socialMediaPageIsOpened() {
        //Implement after update site
    }

    @And("User clicks on {string} icon")
    public void userClicksOnSocialMediaIcon(String element) {
        WebDriver driver = WebDriverSingleton.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        String methodName = "get" + element + "icon";
        click(getElementByName(methodName));

    }

    @Disabled("CAL-2")
    @Then("Products with word {string} in name are displayed")
    public void productsWithWordProductNameInNameAreDisplayed(String keyWord) {
        //Implement after update site
    }

    @And("User scroll down to the contact form")
    public void userScrollDownToTheContactForml() {
        WebDriver driver = WebDriverSingleton.getDriver();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Disabled("CAL-7")
    @Then("Message is sent successfully")
    public void messageIsSentSuccessfully() {
        //Implement after update site
    }

}