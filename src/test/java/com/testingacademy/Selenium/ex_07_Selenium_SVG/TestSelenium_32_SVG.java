package com.testingacademy.Selenium.ex_07_Selenium_SVG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium_32_SVG
{
    @Test
    public void flipkart_search_icon()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String URL="https://flipkart.com/";
        driver.get(URL);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        // Enter search text
        WebElement searchinput = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.name("q"))
        );
        searchinput.sendKeys("mac mini");
        // Correct SVG search icon inside button
        WebElement searchIcon = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.xpath("//button//*[name()='svg']")
                )
        );
        searchIcon.click();

       // List<WebElement> svgelement=driver.findElements(By.xpath("//*[name='svg']"));
       // svgelement.get(0).click();
// Wait for results to load
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@data-id]")));
        List<WebElement> titleresults=driver.findElements(By.xpath("//div[contains(@data-id,'CPU') or contains(@dataid,'MP')]/div/a[2]"));

         for(  WebElement title   : titleresults)
         {
             System.out.println(title.getText());
         }
    }
}
