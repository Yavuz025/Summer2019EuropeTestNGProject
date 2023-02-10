package com.cybertek.tests.Day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorClass {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement homeLink= driver.findElement(By.className("nav-link"));
        homeLink.click();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement multipleButtons = driver.findElement(By.className("h3"));
         String message= "Multiple buttons";
        System.out.println(message);

        System.out.println(driver.findElement(By.className("h3")).getText());

    }


}
