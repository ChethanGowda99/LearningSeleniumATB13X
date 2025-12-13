package ex_09_Selenium_Windows;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Set;

public class TesSelenium_40_Window
{
    @Test
    public void window() {
        WebDriver driver = new ChromeDriver();

        String url = "https://the-internet.herokuapp.com/windows";
        driver.get(url);

        String parent =driver.getWindowHandle();

        WebElement parent_link=driver.findElement(By.xpath("//a[text()=\"Click Here\"]"));
        parent_link.click();

        Set<String> windows=driver.getWindowHandles();
        System.out.println(windows);

        // How do I switch to the child window and
        // verify that there is a text with the name of new window?
        for(String window : windows)
        {
            driver.switchTo().window(window);
            if(driver.getPageSource().contains("New Window")) {
                System.out.println("Test case is passed");
            }
        }

        driver.switchTo().window(parent);
   driver.quit();
    }


}
