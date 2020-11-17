package com.utm.end_game.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.utm.end_game.web_driver_singleton.WebDriverSingleton.getDriver;

public class SignIn {
    public WebElement getName() {
        return name;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSignInButton() {
        return signInButton;
    }

    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/div[1]/input")
    private WebElement name;
    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/div[2]/input")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"myModal\"]/div/div/div[2]/div[1]/form/input")
    private WebElement signInButton;


    public SignIn() {
        PageFactory.initElements(getDriver(), this);
    }
}
