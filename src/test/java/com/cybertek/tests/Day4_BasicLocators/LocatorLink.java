package com.cybertek.tests.Day4_BasicLocators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LocatorLink {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading");

      //  WebElement link3= driver.findElement(By.linkText("Example 3: Element on page that is hidden and become visible after 5 seconds"));
       // link3.click();


        driver.findElement(By.partialLinkText("Example 6")).click();
Thread.sleep(5000);
        driver.findElement(By.linkText("Home")).click();



        WebDriver driver1=WebDriverFactory.getDriver("firefox");
        driver1.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement homeLink=driver1.findElement(By.partialLinkText("Home"));
        homeLink.click();

        Thread.sleep(3000);
        driver1.close();
    }

}
