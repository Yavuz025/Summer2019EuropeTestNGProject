package com.cybertek.tests.Day10_sync;



import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ThreadSleepExample {

        WebDriver driver;

        @BeforeMethod
        public void setUpMethod(){
            driver = WebDriverFactory.getDriver("firefox");

        }

        @AfterMethod
        public void tearDownMethod() throws InterruptedException {
            Thread.sleep(3000);
            driver.quit();

        }
        @Test
    public void test1() throws InterruptedException {
            driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

            Thread.sleep(5000);
            driver.findElement(By.id("username")).sendKeys("Mike Smith");


        }
}
