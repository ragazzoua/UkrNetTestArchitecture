package net.ukr.demo.appmanager;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * created by FAMILY 13.07.2019
 */

public class ApplicationManager {

    private final GroupHelper groupHelper = new GroupHelper();

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
        groupHelper.driver = new ChromeDriver();
        groupHelper.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper.driver.manage().window().maximize();
        login("ittest2", "337774a");
    }

    private void login(String username, String password) {
        groupHelper.driver.get("https://www.i.ua/");
        groupHelper.driver.findElementByXPath("//input[@name='login']").click();
        groupHelper.driver.findElementByXPath("//input[@name='login']").clear();
        groupHelper.driver.findElementByXPath("//input[@name='login']").sendKeys(username);
        groupHelper.driver.findElementByXPath("//input[@name='pass']").click();
        groupHelper.driver.findElementByXPath("//input[@name='pass']").clear();
        groupHelper.driver.findElementByXPath("//input[@name='pass']").sendKeys(password);
        groupHelper.driver.findElementByXPath("//input[@value='Войти']").click();
    }

    public void goToContacts() {
        groupHelper.driver.findElementByXPath("/html/body/div[1]/div[5]/ul/li[3]/a").click();
    }

    public void stop() {
        groupHelper.driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }
}
