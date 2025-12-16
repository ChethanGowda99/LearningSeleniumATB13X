package com.testingacademy.Selenium.ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_26_Explicit_Wait {

    @Description("Verify orangehrm search results load using explicit Wait")
    @Test
    public void test(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        // 2️⃣ Explicit Wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        //Wait until username field is visible
        WebElement username = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        username.sendKeys("Admin");
        // Wait until password field is visible
        WebElement password = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        password.sendKeys("admin123");

        // Wait until login button is clickable
        WebElement loginBtn = wait.until(
                ExpectedConditions.elementToBeClickable(By.cssSelector("button[type='submit']")));
        loginBtn.click();

        System.out.println("Login Successful!");

        driver.quit();
    }
}





