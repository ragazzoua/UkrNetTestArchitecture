package net.ukr.demo.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class HelperBase {
    protected WebDriver driver;

    public HelperBase(WebDriver driver) {
        this.driver = driver;
    }

    protected void click(String locator) {
        driver.findElement(By.xpath(locator)).click();
    }

    protected void type(String locator, String text) {
        driver.findElement(By.xpath(locator)).sendKeys(text);
    }

    public boolean isAlertPresent() {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }
}
