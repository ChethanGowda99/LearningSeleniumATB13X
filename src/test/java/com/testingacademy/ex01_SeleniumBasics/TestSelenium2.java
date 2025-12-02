package com.testingacademy.ex01_SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium2
{
    @Test
    public void test_Code()
    {
        Assert.assertEquals("Pramod","Pramod");
    }

    @Test
    public void test_OpenTheTestingAcademy()
    {
        ChromeDriver driver= new ChromeDriver();
        driver.get("https://thetestingacademy.com");



    }


}