package ex_02_SeleniumBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium5
{    public static void main(String[] args) {
    WebDriver driver = new ChromeDriver();
    driver.get("https://app.vwo.com");
}
}
