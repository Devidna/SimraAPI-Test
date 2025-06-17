package com.juaracoding.apitest.checkout;

import com.juaracoding.apitest.DriverSingleton;
import com.juaracoding.apitest.pages.AddToCartPage;
import com.juaracoding.apitest.pages.ProductListPage;
import com.juaracoding.apitest.pages.SignInPage;
import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AddToCartTest {

    WebDriver driver;
    SignInPage signInPage;
    ProductListPage productListPage;
    AddToCartPage cartPage;


    @Given("User logs in with valid credentials")
    public void userLogsIn() {
        driver = DriverSingleton.createOrGetDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");

        signInPage = new SignInPage(driver);
        productListPage = new ProductListPage(driver);
        signInPage.login("standard_user", "secret_sauce");
    }

    @When("User clicks the Add to Cart button on the first product")
    public void clickAddToCart() {
        driver = DriverSingleton.createOrGetDriver();
        productListPage = new ProductListPage(driver);

        cartPage = new AddToCartPage(driver);
        cartPage.clickAddToCartFirstItem();
    }

    @And("User clicks the cart icon")
    public void clickCartIcon() {
        cartPage.clickCartIcon();
    }

    @Then("The selected product is displayed in the cart page")
    public void verifyProductInCart() {
        Assert.assertTrue(cartPage.isProductInCartDisplayed());
    }
}
