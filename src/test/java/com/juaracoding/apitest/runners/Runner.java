package com.juaracoding.apitest.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//not (@Web or (@Mobile and @SmokeTest) or @NewFeature)
@CucumberOptions(features = {
        "src/test/resources/features"
}, plugin = { "pretty:target/pretty.txt",
        "html:target/cucumber-reports/index.html",
        "json:target/cucumber-reports/index.json",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
}, glue = {
        "com.juaracoding.apitest.hooks",
        "com.juaracoding.apitest.authentications",
        "com.juaracoding.apitest.products",
        "com.juaracoding.apitest.checkout",
})
public class Runner extends AbstractTestNGCucumberTests {

}