package com.cybertek.tests.Day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAttribute {
    @Test
    public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("Chrome");

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement radioButton= driver.findElement(By.id("blue"));
        System.out.println(radioButton.getAttribute("name"));
        System.out.println(radioButton.getAttribute("id"));
        System.out.println(radioButton.getAttribute("type"));
        System.out.println(radioButton.getAttribute("checked"));
        System.out.println(radioButton.getAttribute("href"));

        WebElement radioButton2= driver.findElement(By.id("red"));
        radioButton2.click();
        System.out.println(radioButton.getAttribute("outerHTML"));
        System.out.println(radioButton2.getAttribute("checked"));

        Thread.sleep(3000);
        driver.close();


    }
}
