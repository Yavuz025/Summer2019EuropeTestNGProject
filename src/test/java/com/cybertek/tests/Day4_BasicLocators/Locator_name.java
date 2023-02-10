package com.cybertek.tests.Day4_BasicLocators;


import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class Locator_name {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        WebElement fullnameInput= driver.findElement(By.name("full_name"));
        fullnameInput.sendKeys("yavuz semiz");
        WebElement emailInput = driver.findElement(By.name("email"));
        emailInput.sendKeys("test@gmail.com");
        WebElement signupClick= driver.findElement(By.name("wooden_spoon"));
        signupClick.click();
        WebElement signupMessage=driver.findElement(By.name("signup_message"));

        String actualMessage= signupMessage.getText();

        String expectedMessage="Thank you for signing up. Click the button below to return to the home page.";
         if(expectedMessage.equals(actualMessage)){
             System.out.println("Pass");

         }else{
             System.out.println("FAIL");
             System.out.println("expectedMessage = " + expectedMessage);
             System.out.println("actualMessage = " + actualMessage);

         }
Thread.sleep(5000);
driver.close();




        driver.quit();
}
}

