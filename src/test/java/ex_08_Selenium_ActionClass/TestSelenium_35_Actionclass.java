package ex_08_Selenium_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestSelenium_35_Actionclass
{
    @Test
    public void test() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://awesomeqa.com/practice.html";
        driver.get(url);
        // Keys - Action classes
        WebElement firstName = driver.findElement(By.name("firstname"));
        Actions actions = new Actions(driver);
        actions.keyDown(Keys.SHIFT)
                .sendKeys(firstName, "the testing academy")
                .keyUp(Keys.SHIFT).build().perform();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();


    }
}
