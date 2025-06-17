package com.juaracoding.apitest.products;

import com.juaracoding.apitest.DriverSingleton;
import com.juaracoding.apitest.pages.ProductListPage;
import com.juaracoding.apitest.pages.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class VerifikasiProdukTest {
    WebDriver driver;
    SignInPage signInPage;
    ProductListPage produkListPage;

    @Given("Pretest verifikasi, login dengan user valid")
    public void testStep01() {
        driver = DriverSingleton.createOrGetDriver();
        driver.get("https://www.saucedemo.com/v1/index.html");

        signInPage = new SignInPage(driver);
        produkListPage = new ProductListPage(driver);
        signInPage.login("standard_user", "secret_sauce");
    }

    @When("Verifikasi semua produk ditampilkan")
    public void testStep02() {
        Assert.assertTrue(produkListPage.hasAProducts());
    }

    @Then("Daftar produk muncul lengkap dengan nama, harga, dan tombol Add to Cart")
    public void testStep03() {
        Assert.assertTrue(produkListPage.checkProperty());
    }
}
