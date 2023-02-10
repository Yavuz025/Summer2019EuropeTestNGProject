package com.cybertek.tests.Day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locator_id {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

       //driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
       WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));
       Thread.sleep(3000);
       dontClickButton.click();

       WebElement button4 = driver.findElement(By.id("check_button"));
       Thread.sleep(5000);
       driver.quit();
    }
}
