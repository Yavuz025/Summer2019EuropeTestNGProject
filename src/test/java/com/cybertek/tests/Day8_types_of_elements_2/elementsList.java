package com.cybertek.tests.Day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class elementsList {
    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("Button.size() = "+buttons.size());

        Assert.assertEquals(buttons.size(),6,"Verify  we gat 6 buttons");

         for (WebElement button : buttons) {
            System.out.println(button.getText());
        }


        Thread.sleep(3000);
        driver.close();
    }
}
