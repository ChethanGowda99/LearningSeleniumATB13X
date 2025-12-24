package com.testingacademy.Selenium.ex_16_DataDrivenTesting_POI;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestSelenium_55_DDT_TestNG_POI
{
    @Test(dataProvider = "getdata")
    public void test_vwo_login(String username,String password){
        System.out.println(" Login");
        System.out.println(username+"-"+password);
        System.out.println();

    }
    @DataProvider
    public Object[][] getdata(){
       return new Object[][]
               {
                new Object[]{"admin@test.com","@1234"},
                       new Object[]{"admin@test.com","@1234"},
                       new Object[]{"admin@test.com","@1234"}
        };
    }
}
