package com.cybertek.tests.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {
       /** WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com");
        WebElement search = driver.findElement(By.xpath("//*[@type = 'text']"));
         search.sendKeys("Selenium");

        WebElement go = driver.findElement(By.xpath("//*[@type = 'submit']"));
        go.click();*/



            /**
             * navigate to amazon.com
             * type selenium in the searchbox
             * click search button
             */


                WebDriver driver = WebDriverFactory.getDriver("chrome");

                //driver.manage().window().maximize();

                driver.get("https://www.amazon.com");

                //locate searchbox
                WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
                //type selenium
                searchBox.sendKeys("Selenium");


                //locate searchButton
                WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));

                searchButton.click();
                WebElement resultMessage=driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
                System.out.println("resultMessage");
                Thread.sleep(3000);
                driver.quit();

            }
}
