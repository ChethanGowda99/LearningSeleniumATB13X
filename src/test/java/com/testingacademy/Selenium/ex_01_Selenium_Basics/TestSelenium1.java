package com.testingacademy.Selenium.ex_01_Selenium_Basics;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium1 {
    public static void main(String[] args) {

        // Just create ChromeDriver object (Selenium Manager auto-handles driver)
        WebDriver driver = new ChromeDriver();

        // Open website
        driver.get("https://www.chrome.com");

        // Maximize browser window
        driver.manage().window().maximize();

        // Wait for 5 seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.quit();

    }
}
