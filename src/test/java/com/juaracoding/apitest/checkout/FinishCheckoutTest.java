package com.juaracoding.apitest.checkout;

import com.juaracoding.apitest.DriverSingleton;
import com.juaracoding.apitest.pages.FinishCheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FinishCheckoutTest {
    WebDriver driver;
    FinishCheckoutPage finishCheckoutPage;

    @And("User clicks Finish button")
    public void clickFinishButton() {
        driver = DriverSingleton.createOrGetDriver();
        finishCheckoutPage = new FinishCheckoutPage(driver);
        finishCheckoutPage.clickFinish();
    }

    @Then("User sees a success message")
    public void verifySuccessMessage() {
        Assert.assertTrue(finishCheckoutPage.isSuccessMessageDisplayed());
    }

}
