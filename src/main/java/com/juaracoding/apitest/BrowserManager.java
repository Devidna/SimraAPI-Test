package com.juaracoding.apitest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserManager {
    public static WebDriver build() {
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--start-maximized");

        return new FirefoxDriver(options);
    }
}
