package com.cybertek.tests.Day7_Types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class elementDisable {
    @Test
    public  void test1(){
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement ElementDisableButton= driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[5]"));
        System.out.println("ElementDisableButton.isEnabled() = " + ElementDisableButton.isEnabled());

        Assert.assertFalse(ElementDisableButton.isEnabled(),"Green button is not enabled");
    }

@Test
    public  void test2(){

    WebDriver driver= WebDriverFactory.getDriver("chrome");
    driver.get("http://practice.cybertekschool.com/dynamic_controls");

    WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

    System.out.println("inputBox.isEnabled() = " + inputBox.isEnabled());

    inputBox.sendKeys("Yavuz Semiz");


}

}
