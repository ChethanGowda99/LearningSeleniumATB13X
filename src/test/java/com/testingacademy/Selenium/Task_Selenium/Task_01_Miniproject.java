package com.testingacademy.Selenium.Task_Selenium;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Task_01_Miniproject
{
    @Description("TC#1 - Verify that with invalid login, error message is displayed!")
    @Owner("Pramod Dutta")
    @Test

    public void test_login_invalid()
    {
        WebDriver driver= new ChromeDriver();
        driver.get("https://app.vwo.com");
        // Maximize the window
     driver.manage().window().maximize();

           WebElement Startfreetrial_button =driver.findElement(By.linkText("Start a free trial"));

            Startfreetrial_button.click();

            WebElement Email_Input_box= driver.findElement(By.id("page-v1-step1-email"));
            Email_Input_box.sendKeys("abc");

        WebElement checkbox =driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();
        WebElement error_msg = driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");
        driver.quit();


    }


}
