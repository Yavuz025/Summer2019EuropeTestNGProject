package com.cybertek.tests.Day5_Xpath;


import com.cybertek.tests.Day10_sync.ThreadSleepExample;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestXpath {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        // driver.get("http://practice.cybertekschool.com/multiple_buttons");
       // WebElement homeLink=driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
       // homeLink.click();
       // WebElement messageLink= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p"));
        //messageLink.getText();
        //System.out.println(driver.findElement(By.xpath("/html/body/div/div[2]/div/div/p")).getText());

       // WebElement button1Button= driver.findElement(By.xpath("//*[@*='button1()']"));
      //  button1Button.click();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement signupButton=driver.findElement(By.xpath("//*[text()='Sign Up']"));
        signupButton.click();
        Thread.sleep(3000);
       driver.close();

    }
}
