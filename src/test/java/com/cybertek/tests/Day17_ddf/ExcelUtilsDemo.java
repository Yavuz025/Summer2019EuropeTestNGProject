package com.cybertek.tests.Day17_ddf;

import com.cybertek.utilities.ExcelUtil;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ExcelUtilsDemo {


    @Test
    public void readExcelFile() {

        //create an object from ExcelUtil
        //it accepts two argument
        //Argument 1: location of the file(path)
        //Argument 2: sheet that we want to open (sheetName)

        ExcelUtil qa3short = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA3-short");

        //how many rows in the sheet
        System.out.println("Row count: " + qa3short.rowCount());

        //how many columns in the sheets
        System.out.println("Column count: " + qa3short.columnCount());

        //get all column names
        System.out.println("Column names: " + qa3short.getColumnsNames());


        List<Map<String, String>> dataList = qa3short.getDataList();

        //System.out.println(dataList.get(0));


        for (Map<String, String> onerow : dataList) {
            System.out.println(onerow);
        }
        String[][] dataArray = qa3short.getDataArray();
        System.out.println(Arrays.deepToString(dataArray));


    }
}



