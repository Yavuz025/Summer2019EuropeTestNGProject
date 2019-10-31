package com.cybertek.tests;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallWebDriverFactory {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
       // WebDriver driver1= WebDriverFactory.getDriver("firefox");
        driver.get("http://www.google.com");
    }
}
