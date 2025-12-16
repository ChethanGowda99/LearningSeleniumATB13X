package com.testingacademy.Selenium.ex_02_SeleniumBasics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium11 {
    public static void main(String[] args) {
        FirefoxDriver driver = new FirefoxDriver();
//        driver.get("bing.com"); // HTTPs is important.
        driver.get("https://bing.com"); // HTTPs is important.
        driver.quit();
    }

}
