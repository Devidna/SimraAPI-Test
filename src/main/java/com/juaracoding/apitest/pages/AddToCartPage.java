package com.juaracoding.apitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class AddToCartPage {

    WebDriver driver;

    public AddToCartPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='inventory_list']//div[1]//div[3]//button[1]")
    List<WebElement> buttonAddToCart;

    @FindBy(xpath = "//*[@id=\"shopping_cart_container\"]")
    WebElement cartIcon;

    @FindBy(xpath = "//*[@id=\"contents_wrapper\"]/div[2]")
    WebElement cartItem;

    public void clickAddToCartFirstItem() {
        buttonAddToCart.get(0).click();
    }

    public void clickCartIcon() {
        cartIcon.click();
    }

    public boolean isProductInCartDisplayed() {
        return cartItem.isDisplayed();
    }
}
