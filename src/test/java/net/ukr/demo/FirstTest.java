package net.ukr.demo;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * created by FAMILY 07.07.2019
 */

public class FirstTest {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Test
    public void testUkrNetOpening() {
        driver.get("https://www.ukr.net/");
        driver.findElement(By.id("search-input"));
        driver.findElement(By.id("search-input")).clear();
        driver.findElement(By.id("search-input")).click();
        driver.findElement(By.id("search-input")).sendKeys("Test");
        driver.findElement(By.id("search-input")).clear();
        driver.findElement(By.id("search-input")).sendKeys("Second Test");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.ukr.net/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public static boolean isAlertPresent(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
