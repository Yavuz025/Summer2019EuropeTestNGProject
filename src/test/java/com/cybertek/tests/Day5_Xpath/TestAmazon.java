package com.cybertek.tests.Day5_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestAmazon {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://www.amazon.com/");
            WebElement searchButton= driver.findElement(By.id("twotabsearchtextbox"));
            searchButton.sendKeys("skechers man  memory form");

        WebElement goButton=driver.findElement(By.xpath("//input[contains(@value,'Go')]"));
        goButton.click();
        WebElement manShoes= driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/div[3]/span/div[1]/span/div/div/div[1]/ul/li[4]/span/a/span"));
        manShoes.click();

WebElement clickBox = driver.findElement(By.xpath("//*[@id=\"p_89/Skechers\"]/span/a/div/label/i"));
clickBox.click();
    }
}
