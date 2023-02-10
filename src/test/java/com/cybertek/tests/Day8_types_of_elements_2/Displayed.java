package com.cybertek.tests.Day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Displayed {


    @Test
     public void test1() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");

       driver.get("http://practice.cybertekschool.com/dynamic_loading/1");
        WebElement username= driver.findElement(By.id("username"));
        WebElement startButton=driver.findElement(By.xpath("//*[@id=\"start\"]/button"));

        startButton.click();
        Thread.sleep(5000);


        System.out.println(username.isDisplayed());
        Assert.assertTrue(username.isDisplayed(),"username is displayed");

        Thread.sleep(3000);
        driver.close();
    }
}
