package com.juaracoding.apitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutListPage {

    WebDriver driver;

    public CheckoutListPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[@class='btn_action checkout_button']")
    WebElement buttonCheckout;

    @FindBy(xpath = "//input[@id='first-name']")
    WebElement inputFirstName;

    @FindBy(xpath = "//input[@id='last-name']")
    WebElement inputLastName;

    @FindBy(xpath = "//input[@id='postal-code']")
    WebElement inputPostalCode;

    @FindBy(xpath = "//*[@id=\"checkout_info_container\"]/div/form/div[2]/input")
    WebElement buttonContinue;

    @FindBy(xpath = "//div[@class='subheader']")
    WebElement checkoutOverviewHeader;

    public void clickCheckout() {
        buttonCheckout.click();
    }

    public void enterCustomerInformation(String firstName, String lastName, String postalCode) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputPostalCode.sendKeys(postalCode);
    }

    public void clickContinue() {
        buttonContinue.click();
    }

    public boolean isOrderSummaryDisplayed() {
        return checkoutOverviewHeader.isDisplayed();
    }

}
