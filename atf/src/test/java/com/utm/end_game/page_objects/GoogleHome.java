package com.utm.end_game.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

import static com.utm.end_game.web_driver_singleton.WebDriverSingleton.getDriver;

public class GoogleHome {

    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input")
    private WebElement search;
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[1]")
    private WebElement searchButton;
    @FindBy(xpath = "//*[@id=\"taw\"]/div[2]/div/p/span")
    private WebElement didYouMean;
    @FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div[1]/div[3]/center/input[2]")
    private WebElement luckyButton;
    @FindBy(xpath = "//*[@id=\"rso\"]")
    private WebElement resultsDiv;


    public WebElement getLuckyButton() {
        return luckyButton;
    }

    public WebElement getDidYouMean() {
        return didYouMean;
    }

    public WebElement getResultsDiv() {
        return resultsDiv;
    }
    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getSearch() {
        return search;
    }

    public GoogleHome() {
        PageFactory.initElements(getDriver(), this);
    }
}
