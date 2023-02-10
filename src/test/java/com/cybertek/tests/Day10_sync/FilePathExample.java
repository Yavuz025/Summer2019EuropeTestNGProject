package com.cybertek.tests.Day10_sync;

import org.testng.annotations.Test;

public class FilePathExample {
    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));
       // \Users\toshiba\IdeaProjects\Summer2019EuropeTestNGProject
      //  \src\test\resources\testfile.txt

        String projectPath =System.getProperty("user.dir");
        String relativePath ="C:\\Users\\toshiba\\Desktop\\file.txt";

        String filePath = projectPath+"/"+relativePath;
        System.out.println(filePath);
    }
}
