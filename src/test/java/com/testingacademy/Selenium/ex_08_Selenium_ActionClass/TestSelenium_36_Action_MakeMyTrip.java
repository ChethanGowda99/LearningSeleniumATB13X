package com.testingacademy.Selenium.ex_08_Selenium_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class TestSelenium_36_Action_MakeMyTrip {
    @Test
    public void test_make() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.makemytrip.com/";
        driver.get(url);
        // Keys - Action classes
        // We need to for the modal and close it
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@data-cy=\"closeModal\"]")));
        WebElement model = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        // close
        model.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@data-cy=\"fromCity\"]")));
        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));
        WebElement toCity = driver.findElement(By.xpath("//input[@data-cy=\"toCity\"]"));

        Actions actions = new Actions(driver);

        actions.moveToElement(fromCity).click().sendKeys("IXC").build().perform();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li")));

        List<WebElement> list_auto_complete = driver.findElements(By.xpath("//ul[@class=\"react-autosuggest__suggestions-list\"]/li"));

        try {
            for (WebElement e : list_auto_complete) {
                if (e.getText().contains("Chandigarh")) {
                    e.click();
                }
            }
        }
         catch(Exception e)
            {
          e.printStackTrace();
            }
        }

    }



