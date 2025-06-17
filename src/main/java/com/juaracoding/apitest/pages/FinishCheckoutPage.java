package com.juaracoding.apitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishCheckoutPage {

    WebDriver driver;

    public FinishCheckoutPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id=\"checkout_summary_container\"]/div/div[2]/div[8]/a[2]")
    WebElement buttonFinish;

    @FindBy(xpath = "//*[@id=\"checkout_complete_container\"]/h2")
    WebElement successMessage;

    public void clickFinish() {
        buttonFinish.click();
    }

    public boolean isSuccessMessageDisplayed() {
        return successMessage.isDisplayed() &&
                successMessage.getText().trim().equalsIgnoreCase("THANK YOU FOR YOUR ORDER");
    }


}
