package ex_02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium7_Commands {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());


        // When you are done with the browser,
        // you want to close all the tabs and browser.
        driver.quit();


    }
}