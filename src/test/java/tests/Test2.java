package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Emre\\Selenium\\ChromeDriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        /*driver.findElement(By.id("email")).sendKeys("emreoz-turk@outlook.com");
        driver.findElement(By.name("pass")).sendKeys("123456");
        driver.findElement(By.linkText("Şifreni mi Unuttun?")).click();
        */

        driver.findElement(By.cssSelector("#email")).sendKeys("emreoz-turk@outlook.com");
        driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
        driver.findElement(By.xpath("//*[contains(@id,'u_0_a')]/div[3]/a")).click();



    }
}
