package com.cybertek.tests.Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CallsTest {
    @Test
    public void DragAndDropChaining() {

        WebDriver driver = null;
        driver.get("https://www.seleniumeasy.com/test/drag-and-drop-demo.html");

        Actions actions = new Actions(driver);

        WebElement source = driver.findElement(By.xpath("//span[contains(text(),'Draggable 1')]"));
        WebElement target = driver.findElement(By.id("mydropzone"));
        actions.moveToElement(source).clickAndHold().moveToElement(target).release().build().perform();
        // pause()--> wait just like thread.sleep
    }


    }
