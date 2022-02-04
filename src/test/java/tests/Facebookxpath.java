package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emre\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://facebook.com");

        // -- xPATH syntax //tagname[attribute=value]
        /*driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("xpath");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("hello");
        driver.findElement(By.xpath("//*[@value=\"1\"]")).click();*/


        // css selector syntax tagname[attribute=value]
        driver.findElement(By.cssSelector("input[name='email']")).sendKeys("mywoncss");
        driver.findElement(By.cssSelector("[value='1']")).click();


    }
}
