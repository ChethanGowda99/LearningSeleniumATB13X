package com.testingacademy.Selenium.ex_06_Selenium_Input_Radio_checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_31_CombinedElementsHandlingTest
{


    @Test
    public void test1() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        /*
         * 1️⃣ HANDLE INPUT BOX
         */
        driver.get("https://demoqa.com/text-box");

        WebElement nameInput = driver.findElement(By.id("userName"));
        nameInput.clear();
        nameInput.sendKeys("Chethan MS");

        WebElement emailInput = driver.findElement(By.id("userEmail"));
        emailInput.sendKeys("chethan@example.com");

        System.out.println("Entered Name: " + nameInput.getAttribute("value"));
        Thread.sleep(2000);
        driver.quit();
    }
    @Test
    public void test2() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/radio-button");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement yesRadio = driver.findElement(By.xpath("//label[@for='yesRadio']"));
        yesRadio.click();

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //HANDLE STANDARD DROPDOWN <select>


        WebElement oldStyleDropdown = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldStyleDropdown);

        select.selectByVisibleText("Green");  // select option
        Thread.sleep(1000);
        driver.quit();
    }

    @Test
    public void test4() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/select-menu");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // 1️⃣ Click the custom dropdown
        WebElement customDropdown = driver.findElement(By.id("withOptGroup"));
        customDropdown.click();
        Thread.sleep(500);

        // 2️⃣ Select the option from the dropdown list
        WebElement option = driver.findElement(By.xpath("//div[contains(text(),'Group 1, option 1')]"));
        option.click();

        Thread.sleep(1000);
        driver.quit();
    }




    @Test
    public void test5() throws InterruptedException
    {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demoqa.com/radio-button");


        /*
         * 5️⃣ HANDLE ALERTS (Simple, Confirm, Prompt)
         */
        driver.get("https://demoqa.com/alerts");

        // Simple Alert
        driver.findElement(By.id("alertButton")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println("Simple Alert Text: " + alert.getText());
        alert.accept();

        // Confirm Alert
        driver.findElement(By.id("confirmButton")).click();
        alert = driver.switchTo().alert();
        System.out.println("Confirm Alert Text: " + alert.getText());
        alert.dismiss();    // clicking Cancel

        // Prompt Alert
        driver.findElement(By.id("promtButton")).click();
        alert = driver.switchTo().alert();
        alert.sendKeys("Chethan Typed This");
        alert.accept();

        Thread.sleep(2000);
        driver.quit();





    }
}

