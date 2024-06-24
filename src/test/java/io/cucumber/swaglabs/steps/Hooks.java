package io.cucumber.swaglabs.steps;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.swaglabs.utils.DriverManager;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
        driver = DriverManager.getDriver();
    }

    @After
    public void tearDown() {
        DriverManager.closeDriver();
    }
}
