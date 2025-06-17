package com.juaracoding.apitest.checkout;

import com.juaracoding.apitest.DriverSingleton;
import com.juaracoding.apitest.pages.*;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckoutListTest {

    WebDriver driver;
    CheckoutListPage checkoutListPage;

    @And("User clicks Checkout button")
    public void clickCheckoutButton() {
        driver = DriverSingleton.createOrGetDriver();

        checkoutListPage = new CheckoutListPage(driver);
        checkoutListPage.clickCheckout();
    }

    @And("User enters customer information with first name {string}, last name {string}, and postal code {string}")
    public void enterCustomerInformation(String firstName, String lastName, String postalCode) {
        checkoutListPage.enterCustomerInformation(firstName, lastName, postalCode);
    }

    @And("User clicks Continue")
    public void clickContinue() {
        checkoutListPage.clickContinue();
    }

    @Then("User is redirected to the order summary page")
    public void verifyOrderSummaryPage() {
        Assert.assertTrue(checkoutListPage.isOrderSummaryDisplayed());
    }

}
