package com.testingacademy.Selenium.ex_14_Selenium_Exceptions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.NoSuchElementException;

public class TestSelenium_49_fix
{

    @Test
    public void exceptions() {


        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/");


        try {
            driver.findElement(By.id("pramod"));
        } catch (NoSuchElementException e) {
            System.out.println("Element not found!!");
        }

        // org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#pramod"}
        //  (Session info: chrome=139.0.7258.139)

    }
}
