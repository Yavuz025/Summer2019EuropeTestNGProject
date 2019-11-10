package com.cybertek.tests.Day_5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement search = driver.findElement(By.xpath("//*[@type = 'text']"));
         search.sendKeys("Selenium");

        WebElement go = driver.findElement(By.xpath("//*[@type = 'submit']"));
        go.click();
    }
}
