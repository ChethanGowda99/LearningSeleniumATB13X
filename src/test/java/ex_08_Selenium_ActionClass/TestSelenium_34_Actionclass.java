package ex_08_Selenium_ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;

public class TestSelenium_34_Actionclass
{
    @Test
    public void test_action()
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.spicejet.com/";
        driver.get(url);
        WebElement from_input=driver.findElement(By.xpath("//div[@data-testid=\"to-testID-origin\"]/div/div/input"));
        WebElement destination=driver.findElement(By.xpath("//div[@data-testid=\"to-testID-destination\"]/div/div/input"));
        Actions action =new Actions(driver);
        action.moveToElement(from_input).click().sendKeys("BLR").build().perform();
        action.moveToElement(destination).click().sendKeys("DLR").build().perform();
       driver.close();


    }
}
