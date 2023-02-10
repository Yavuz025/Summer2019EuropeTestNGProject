package com.cybertek.tests.Day8_types_of_elements_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class classSelectTest {

    @Test
    public void test1() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement= driver.findElement(By.id("state"));

        Select stateList=new Select(dropdownElement);

        //Select stateList=new Select(driver.findElement(By.id("state")));
        List<WebElement> options= stateList.getOptions();
        System.out.println("options.size() = " + options.size());

        for (WebElement option : options) {
            System.out.println(option.getText());

        }
        Thread.sleep(3000);
driver.close();
    }
    @Test
    public void test2() throws InterruptedException {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");
        WebElement dropdownElement= driver.findElement(By.id("state"));

        Select stateList=new Select(dropdownElement);
        String expectedOption = "Select a State";
        String ActualOption =stateList.getFirstSelectedOption().getText();

        Assert.assertEquals(ActualOption,expectedOption,"Verify first selection is a state ");
        stateList.selectByVisibleText("Texas");
        ActualOption =stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(ActualOption,"Texas");


        Thread.sleep(2000);
        stateList.selectByIndex(51);

        ActualOption =stateList.getFirstSelectedOption().getText();
        Assert.assertEquals(ActualOption,"Wyoming");
       // System.out.println(stateList.getFirstSelectedOption().getText());





        Thread.sleep(2000);
        stateList.selectByValue("VA");
        System.out.println(stateList.getFirstSelectedOption().getText());


        Thread.sleep(2000);
        driver.close();

    }
}
