package com.cybertek.tests.Day17_ddf;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDFWithDataProvider {


    @DataProvider
    public Object[][] testData() {

        String[][] data = {{"", ""},
                {"GoT", "9"},
                {"HIMYM", "9"},
                {"Friends", "10"},
                {"P of I", "10"},
                {"Breaking Bad", "9"},
                {"Big Bang Theory", "9"},
                {"Chernobyl", "9"},

        };
        return data;
    }
    
    
    
    @Test(dataProvider = "testData")
    public void test1(String tvshow,String Rating){

        System.out.println("Tvshow: " + tvshow+" has rating: "+Rating);
        
        
        
        
    }
}
