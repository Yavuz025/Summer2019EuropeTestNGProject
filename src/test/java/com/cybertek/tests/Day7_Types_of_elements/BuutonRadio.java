package com.cybertek.tests.Day7_Types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.impl.HdrDocumentImpl;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BuutonRadio {
    @Test
    public void radioButtonTest(){
        WebDriver driver=WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");

        WebElement radioButtonBlue=driver.findElement(By.id("blue"));
        WebElement radioButtonRed =driver.findElement(By.id("red"));

        System.out.println("radioButtonBlue.isSelected() = " + radioButtonBlue.isSelected());
        System.out.println("radioButtonRed.isSelected() = " + radioButtonRed.isSelected());


        Assert.assertTrue(radioButtonBlue.isSelected(),"Verifyblue is selected");;
        Assert.assertFalse(radioButtonRed.isSelected(),"Red is selected");

        radioButtonRed.click();

        Assert.assertTrue(radioButtonRed.isSelected(),"red is selected");
        Assert.assertFalse(radioButtonBlue.isSelected(),"blue is selected");

    }


}
