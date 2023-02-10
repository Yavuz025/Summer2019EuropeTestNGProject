package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
    @Test
    public void test1(){
        Assert.assertEquals("1","1");

    }
    @Test
    public void test2() {
        String actualTitle = "Yavuz";
        String expectedTitle = "Y";
        System.out.println("first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitle), "Verify title starts");
        Assert.assertTrue("yasin@mail".contains("@"),"Verify @ in email");


    }
         @Test
         public void test3(){

        Assert.assertNotEquals("one","two","one shouldnt be equal to two");

    }
        @Test
         public void test4(){
          Assert.assertFalse(1<0);
    }
       @Test
       public  void test5(){

}


    }

