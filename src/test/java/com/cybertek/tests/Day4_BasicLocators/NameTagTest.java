package com.cybertek.tests.Day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameTagTest {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullnameInput = driver.findElement(By.tagName("input"));
        fullnameInput.sendKeys("Yavuz Semiz with Tag Name");
        WebElement emailInput=driver.findElement(By.name("email"));
        emailInput.sendKeys("test@gmail.com");
        WebElement signupButton= driver.findElement(By.tagName("button"));
        signupButton.click();

        System.out.println( driver.findElement(By.tagName("h3")).getText());




    }
}