package com.cybertek.tests.day2_Webdriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class getUrlandTitle {
    public static void main(String[] args) {


            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://practice.cybertekschool.com");
            //getTitle()--> get you the title of the page
            String title = driver.getTitle();
            //soutv
            System.out.println("title = " + title);

            //getCurrentUrl()--> gets the current url of the page
            String currentUrl = driver.getCurrentUrl();
            System.out.println("currentUrl = " + currentUrl);

            //getPageSource() ->gets th source code of the pace
            String pageSource = driver.getPageSource();
            System.out.println("pageSource = " + pageSource);
        }


    }
