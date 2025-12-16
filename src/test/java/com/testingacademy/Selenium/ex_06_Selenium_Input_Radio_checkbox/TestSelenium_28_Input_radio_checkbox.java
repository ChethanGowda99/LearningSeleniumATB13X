package com.testingacademy.Selenium.ex_06_Selenium_Input_Radio_checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium_28_Input_radio_checkbox
{
    public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        //input
        WebElement inputbox= driver.findElement(By.name("firstname"));
        inputbox.sendKeys("test");
        //WebElement xpath= driver.findElement(By.xpath("//input[@name='firstname']"));
        //RadioButton
        WebElement Radio= driver.findElement(By.xpath("//input[@id='exp-1']"));
        Radio.click();
        //
        WebElement checkbox= driver.findElement(By.xpath("//input[@id='profession-0']"));
        checkbox.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // CHeck Box
        driver.quit();




    }
}
