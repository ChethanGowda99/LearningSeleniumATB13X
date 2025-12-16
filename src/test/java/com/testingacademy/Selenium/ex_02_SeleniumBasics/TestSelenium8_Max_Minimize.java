package com.testingacademy.Selenium.ex_02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium8_Max_Minimize
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://google.com");
        //driver.manage().window().maximize();
        driver.manage().window().minimize();
        driver.quit();
    }
}
