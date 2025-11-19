package ex_02_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testselenium12_Navigations {

    @Description("Open the URL")
    @Test
    public void test_Url(){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com"); // 95%



        //  Use Navigation Commands
        // driver.get("url") -> Navigate to a URL

        //  navigate.to()


        // Use navigation methods
        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();



    }

}
