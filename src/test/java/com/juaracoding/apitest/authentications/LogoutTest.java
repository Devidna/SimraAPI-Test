package com.juaracoding.apitest.authentications;

import com.juaracoding.apitest.DriverSingleton;
import com.juaracoding.apitest.pages.LogoutPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LogoutTest {

    WebDriver driver;
    LogoutPage logoutPage;

    @And("User clicks menu icon")
    public void clickMenuIcon() {
        driver = DriverSingleton.createOrGetDriver();
        logoutPage = new LogoutPage(driver);
        logoutPage.clickMenuButton();
    }

    @And("User clicks Logout")
    public void clickLogout() {
        logoutPage.clickLogout();
    }

    @Then("User is redirected to login page")
    public void redirectedToLogin() {
        Assert.assertTrue(logoutPage.isOnLoginPage());
    }
}
