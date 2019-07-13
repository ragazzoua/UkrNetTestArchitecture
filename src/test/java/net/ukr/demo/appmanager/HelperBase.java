package net.ukr.demo.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class HelperBase {
    protected ChromeDriver driver;

    public HelperBase(ChromeDriver driver) {
        this.driver = driver;
    }

    protected void click(String locator) {
        driver.findElementByXPath(locator).click();
    }

    protected void type(String locator, String text) {
        driver.findElementByXPath(locator).sendKeys(text);
    }
}
