package com.cybertek.tests.Activities;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class harun_day1 {
    
    /*Test Case 1:
}
     /*Step1: Go to "https://www.airbnb.co.in/"
       Step2: get the title and print it
       Step3: get the current url of the page
       Step4: get the Page Source (the codes of the page)
       */

    @Test
    public void getTitleTest() {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
driver.get("https://www.airbnb.co.in/");
        String title= driver.getTitle();
        System.out.println("Title "+title);
        String currentUrl= driver.getCurrentUrl();
        System.out.println("CurrentUrl "+currentUrl);
        String  pageSource= driver.getPageSource();
        System.out.println("PageSource "+pageSource);
driver.quit();




}}
