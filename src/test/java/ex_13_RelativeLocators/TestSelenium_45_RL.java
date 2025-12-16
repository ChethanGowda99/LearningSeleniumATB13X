package ex_13_RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class TestSelenium_45_RL {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/practice.html");
        driver.manage().window().maximize();
        WebElement element= driver.findElement(By.xpath("//span[text()=\"Years of Experience\"]"));
        driver.findElement(with(By.id("exp-1")).toRightOf(element)).click();
        driver.close();

    }
}
