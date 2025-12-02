package ex_05_Selenium_Waits;

import io.qameta.allure.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium_27_FluentWait {

    @Description("Verify flipkart search results load using Fluent Wait")
    @Test
    public void FW() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com");
        // Search for Laptop
        WebElement search = driver.findElement(By.name("q"));
        search.sendKeys("Laptop");
        search.submit();

        // 3️⃣ Fluent Wait
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))           // Max wait time

                .pollingEvery(Duration.ofSeconds(2))  // Check every 2 seconds
                .ignoring(NoSuchElementException.class); // Ignore missing element errors

        WebElement price = wait.until(driver1 ->
                driver1.findElement(By.xpath("(//div[@data-id])[1]//div[starts-with(text(),'₹')]"))
        );
        System.out.println("Price Loaded: " + price.getText());

        driver.quit();
    }
}

