package com.juaracoding.apitest.hooks;

import com.juaracoding.apitest.DriverSingleton;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class Hook {
    @BeforeAll
    public static void initialize() {
        DriverSingleton.createOrGetDriver();
    }

    @AfterAll
    public static void finalTeardown() {
        DriverSingleton.quitDriver();
    }
}
