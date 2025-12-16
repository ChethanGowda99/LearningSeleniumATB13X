package com.testingacademy.Selenium.ex_08_Selenium_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_37_Project
{
    @Test
    public void project()
    {
       // Requirements
        // Open Flipkart
        // Close login popup
        //  Hover “Electronics” category
        //  Hover “Laptop Accessories” → click “Mouse”
        // Scroll down using Actions
        //Click filter using Actions
        // Scroll again
        // Open first product using Actions

        // Open Flipkart
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        // Close login popup
        //driver.findElement(By.xpath("//span[text()='✕']")).click();
        Actions act = new Actions(driver);
// Hover electronics
        WebElement electronics = driver.findElement(By.xpath("//div[text()='Electronics']"));
        act.moveToElement(electronics).perform();


// Hover subcategory
        WebElement laptopAcc = driver.findElement(By.xpath("//a[text()='Laptop Accessories']"));
        act.moveToElement(laptopAcc).perform();

// Click 'Mouse'
        WebElement mouse = driver.findElement(By.xpath("//a[text()='Mouse']"));
        act.moveToElement(mouse).click().perform();

// Scroll down
        act.scrollByAmount(0, 600).perform();

// Click a filter using Actions
        WebElement filter = driver.findElement(By.xpath("//div[text()='Logitech']"));
        act.moveToElement(filter).click().perform();

// Scroll again
        act.scrollByAmount(0, 600).perform();

// Open first product
        WebElement product = driver.findElement(By.cssSelector("a[class*='s1Q9rs']"));
        act.moveToElement(product).click().perform();

    }
}
