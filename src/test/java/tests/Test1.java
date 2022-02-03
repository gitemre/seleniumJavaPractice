package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Emre\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.instagram.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());

        driver.get("https://www.yahoo.com/");
        driver.navigate().back();


    }
}
