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

public class TestSelenium_33_SVG
{
    @Test
    public void test_map()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.amcharts.com/svg-maps/?map=india";
        driver.get(url);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //WaitHelpers waitHelpers = new WaitHelpers();
       // waitHelpers.waitJVM(3000);
                WebElement search = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']")
                )
        );
                List<WebElement> states=driver.findElements(By.xpath("//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[name()='path']"));

                for( WebElement state  :states)
                {
                    System.out.println(state.getDomAttribute("aria-label"));

                    if(state.getDomAttribute("aria-label").contains("Tripura "))
                    {
                        state.click();
                    }
                }
       driver.close();
    }
}
