package com.testingacademy.Selenium.ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_25_implicitWait
{
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Implicit Wait (Global wait for all findElement calls)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @Description("Verify Amazon search results load using Implicit Wait")
    @Test
    public void testAmazonSearch() {

        driver.get("https://www.amazon.in");
        try {
            WebElement popup = driver.findElement(By.cssSelector("input[data-action-type='DISMISS']"));
            popup.click();
            System.out.println("Popup closed");
        } catch (Exception e) {
            System.out.println("No popup");
        }


        // Search box
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("laptop");

        // Click search
        driver.findElement(By.id("nav-search-submit-button")).click();

        // Amazon loads results dynamically → implicit wait handles this
        WebElement firstResult = driver.findElement(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));

        System.out.println("First Search Result: " + firstResult.getText());
        assert firstResult.isDisplayed();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}