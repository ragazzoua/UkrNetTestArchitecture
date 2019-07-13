package net.ukr.demo.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class SessionHelper extends HelperBase {


    public SessionHelper(ChromeDriver driver) {
        super(driver);
    }

    public void login(String username, String password) {
        driver.get("https://www.i.ua/");
        driver.findElementByXPath("//input[@name='login']").click();
        driver.findElementByXPath("//input[@name='login']").clear();
        driver.findElementByXPath("//input[@name='login']").sendKeys(username);
        driver.findElementByXPath("//input[@name='pass']").click();
        driver.findElementByXPath("//input[@name='pass']").clear();
        driver.findElementByXPath("//input[@name='pass']").sendKeys(password);
        driver.findElementByXPath("//input[@value='Войти']").click();
    }
}
