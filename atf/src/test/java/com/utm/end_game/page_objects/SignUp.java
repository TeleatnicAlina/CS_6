package com.utm.end_game.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.utm.end_game.web_driver_singleton.WebDriverSingleton.getDriver;

public class SignUp {
    public WebElement getName() {
        return name;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getPassword() {
        return password;
    }

    public WebElement getConfirmPassword() {
        return confirmPassword;
    }

    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[1]/input")
    private WebElement name;
    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[2]/input")
    private WebElement email;
    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[3]/input")
    private WebElement password;
    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/div[4]/input")
    private WebElement confirmPassword;
    @FindBy(xpath = "//*[@id=\"myModal2\"]/div/div/div[2]/div[1]/form/input")
    private WebElement signUpButton;


    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public SignUp() {
        PageFactory.initElements(getDriver(), this);
    }
}
