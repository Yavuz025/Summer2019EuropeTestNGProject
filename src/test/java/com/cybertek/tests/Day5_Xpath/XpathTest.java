package com.cybertek.tests.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com");
        //WebElement homeLink= driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        //homeLink.click();
        //WebElement button1= driver.findElement(By.xpath("//button[@onclick='button1()']"));
       // button1.click();
        WebElement signUp= driver.findElement(By.xpath("//*[.='Sign Up']"));
        signUp.click();
    }
}
