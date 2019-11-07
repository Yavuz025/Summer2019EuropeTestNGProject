package com.cybertek.tests.Day_4BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class LinkTextAndPartialText {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //driver.manage().window().maximize();

        //navigate to website
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

    }
}
