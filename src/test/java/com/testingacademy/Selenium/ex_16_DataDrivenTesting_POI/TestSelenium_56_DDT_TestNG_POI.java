package com.testingacademy.Selenium.ex_16_DataDrivenTesting_POI;
import com.testingacademy.Selenium.utils.UtilExcel;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestSelenium_56_DDT_TestNG_POI
{
    @Test(dataProvider = "getData")
    public  void test_vwo_login(String username,String password)
    {
        System.out.println("Running  ");
        System.out.println(username + " - " + password);
        System.out.println();
    }

    //
    @DataProvider
    public Object[][] getData()
    {
        // READ THE DATA FROM THE EXCEL FILE
        // GIVE THEM IN THE 2D ARRAY
        return UtilExcel.getTestDataFromExcel("Sheet1");
    }



}

