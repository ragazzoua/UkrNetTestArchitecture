package net.ukr.demo.appmanager;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * created by FAMILY 13.07.2019
 */

public class ApplicationManager extends NavigationHelper {

    private  GroupHelper groupHelper;

    public static boolean isAlertPresent(ChromeDriver driver) {
        try {
            driver.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        WebDriverManager.getInstance(DriverManagerType.CHROME).setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        groupHelper = new GroupHelper(driver);
        login("ittest2", "337774a");
    }

    private void login(String username, String password) {
        driver.get("https://www.i.ua/");
        driver.findElementByXPath("//input[@name='login']").click();
        driver.findElementByXPath("//input[@name='login']").clear();
        driver.findElementByXPath("//input[@name='login']").sendKeys(username);
        driver.findElementByXPath("//input[@name='pass']").click();
        driver.findElementByXPath("//input[@name='pass']").clear();
        driver.findElementByXPath("//input[@name='pass']").sendKeys(password);
        driver.findElementByXPath("//input[@value='Войти']").click();
    }

    public void stop() {
        driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
