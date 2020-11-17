package com.utm.end_game.page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.utm.end_game.web_driver_singleton.WebDriverSingleton.getDriver;

public class ElliteShoppyHome {

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    @FindBy(xpath = "//*[@id=\"horizontalTab\"]/div/div[1]/div[1]/div/div[2]/div[2]/form/fieldset/input[10]")
    private WebElement addToCartButton;

    public WebElement getYourShoppingCartIsEmpty() {
        return yourShoppingCartIsEmptyMessage;
    }

    @FindBy(xpath = "//*[@id=\"PPMiniCart\"]/form/div/p")
    private WebElement yourShoppingCartIsEmptyMessage;
    public WebElement getDeleteFromCartButton() {
        return deleteFromCartButton;
    }

    @FindBy(xpath = "//*[@id=\"PPMiniCart\"]/form/ul/li/div[3]/button")
    private WebElement deleteFromCartButton;

    public WebElement getCartIcon() {
        return cartIcon;
    }

    public WebElement getClosePopUpButton() {
        return closePopUpButton;
    }

    @FindBy(xpath = "/html/body/div[3]/div/div[2]/div/form/button")
    private WebElement cartIcon;
    @FindBy(xpath = "//*[@id=\"PPMiniCart\"]/form/button")
    private WebElement closePopUpButton;
    @FindBy(xpath = "//*[@id=\"home\"]/div/ul/li[1]/a")
    private WebElement signInButton;

    public WebElement getContactTab() {
        return contactTab;
    }

    @FindBy(xpath = "//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[5]/a")
    private WebElement contactTab;

    @FindBy(xpath = "//div[11]/div/div/ul/li/a/div[2]/i")
    private WebElement facebookIcon;

    @FindBy(xpath = "//*[@id=\"home\"]/div/ul/li[2]/a")
    private WebElement signUpButton;

    public WebElement getName() {
        return name;
    }

    public WebElement getEmail() {
        return email;
    }

    public WebElement getSubject() {
        return subject;
    }

    public WebElement getMessage() {
        return message;
    }

    public WebElement getSendButton() {
        return sendButton;
    }

    @FindBy(xpath = "/html/body/div[9]/div/div/div[1]/div[2]/form/div[1]/input")
    private WebElement name;
    @FindBy(xpath = "/html/body/div[9]/div/div/div[1]/div[2]/form/div[2]/input")
    private WebElement email;
    @FindBy(xpath = "/html/body/div[9]/div/div/div[1]/div[2]/form/div[3]/input")
    private WebElement subject;
    @FindBy(xpath = "/html/body/div[9]/div/div/div[1]/div[2]/form/div[4]/textarea")
    private WebElement message;
    @FindBy(xpath = "/html/body/div[9]/div/div/div[1]/div[2]/form/input")
    private WebElement sendButton;

    public WebElement getSearchButton() {
        return searchButton;
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/form/input[2]")
    private WebElement searchButton;

    public WebElement getSearch() {
        return search;
    }

    @FindBy(xpath = "/html/body/div[2]/div/div[1]/form/input[1]")
    private WebElement search;

    public WebElement getSignInButton() {
        return signInButton;
    }

    public WebElement getSignUpButton() {
        return signUpButton;
    }

    public WebElement getFacebookIcon() {
        return facebookIcon;
    }

    public ElliteShoppyHome() {
        PageFactory.initElements(getDriver(), this);
    }
}
