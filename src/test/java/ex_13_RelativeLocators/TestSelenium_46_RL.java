package ex_13_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.Commontoall;
import static org.openqa.selenium.support.locators.RelativeLocator.*;



public class TestSelenium_46_RL extends Commontoall
{
    @Test
    public void test_relative_locator_codepen()
    {

        WebDriver driver = new ChromeDriver();
        driver.get("https://codepen.io/AbdullahSajjad/full/LYGVRgK");
        driver.manage().window().maximize();
        driver.switchTo().frame("result");
        driver.findElement(By.xpath("//form[@id=\"form\"]/button")).click();
        // //button[text()="Submit"]
        WebElement username_element = driver.findElement(By.xpath("//input[@id='username']"));
        WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));
       // WebElement error_element = driver.findElement(with(By.tagName("small")).below(username_element));
        String errorText = error_element.getText();
        Assert.assertEquals(errorText,"Username must be at least 3 characters");

    }
}

