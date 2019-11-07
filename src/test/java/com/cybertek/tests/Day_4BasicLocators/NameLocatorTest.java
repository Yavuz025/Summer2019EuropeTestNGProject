package com.cybertek.tests.Day_4BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class NameLocatorTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();







    }
}
