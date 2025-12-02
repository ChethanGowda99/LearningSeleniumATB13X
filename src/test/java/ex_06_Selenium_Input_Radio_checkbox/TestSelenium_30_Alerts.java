package ex_06_Selenium_Input_Radio_checkbox;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_30_Alerts {
    @Test
    public void test_alerts() {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        System.out.println(driver.getTitle());
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        element.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.id("result")).getText();
        Assert.assertEquals(result, "You successfully clicked an alert");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        driver.quit();
    }

        @Test
        public void test_alert2() {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            System.out.println(driver.getTitle());
            driver.manage().window().maximize();
            WebElement element = driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));

            element.click();
            Alert alert = driver.switchTo().alert();
            alert.accept();
            String result = driver.findElement(By.id("result")).getText();
            Assert.assertEquals(result, "You clicked: Ok");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();
        }

            @Test
            public void test_alert3()
        {
            ChromeDriver driver = new ChromeDriver();
            driver.get("https://the-internet.herokuapp.com/javascript_alerts");
            System.out.println(driver.getTitle());
            driver.manage().window().maximize();
            WebElement element = driver.findElement(By.xpath("//button[@onclick='jsPrompt()']"));

            element.click();
            Alert alert = driver.switchTo().alert();
            alert.sendKeys("chethan");
            alert.accept();
            String result = driver.findElement(By.id("result")).getText();
            Assert.assertEquals(result, "You entered: chethan");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();





        }
}
