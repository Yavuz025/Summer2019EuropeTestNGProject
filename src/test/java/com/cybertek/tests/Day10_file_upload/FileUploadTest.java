package com.cybertek.tests.Day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.reporters.jq.BasePanel;

import java.awt.*;

public class FileUploadTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");


    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
      //  driver.quit();

    }

    /**
     *  go to website http://practice.cybertekschool.com/upload
     *  upload file.txt
     *  click upload
     *  verify file name is displayed in the next page
     */
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        //file path unique for each computer
        driver.findElement(By.name("file")).sendKeys("/C:/Users/yavuz/Downloads/CV NL I4M.docx/");
        //clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of webelement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is displayed in the next page
        Assert.assertEquals(actualFilename,"JavaNotes_BootCamp(1).txt","Verify the file name");


    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");

        String projectPath = System.getProperty("user.dir");
        String relativePath = "src/test/resources/testfile.txt";

        String filePath = projectPath+"/"+relativePath;

        driver.findElement(By.name("file")).sendKeys(filePath);
        //clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of webelement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is displayed in the next page
        Assert.assertEquals(actualFilename,"testfile.txt","Verify the file name");


    }
}
