package com.testingacademy.Selenium.ex_02_SeleniumBasics;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestSelenium3
{
    @Test
    public void test_Selenium01()
    {

        // start and stop itself.
        //  If it was a Selenium 3, then we have to do this.

        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        // You need to setup the Driver(browser)

    }
}

