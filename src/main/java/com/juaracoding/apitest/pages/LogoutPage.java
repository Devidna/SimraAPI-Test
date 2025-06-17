package com.juaracoding.apitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"menu_button_container\"]/div/div[3]/div")
    WebElement menuButton;

    @FindBy(xpath = "//a[@id='logout_sidebar_link']")
    WebElement logoutLink;

    @FindBy(xpath = "//input[@id='user-name']")
    WebElement usernameField;

    public void clickMenuButton() {
        menuButton.click();
    }

    public void clickLogout() {
        logoutLink.click();
    }

    public boolean isOnLoginPage() {
        return usernameField.isDisplayed();
    }
}
