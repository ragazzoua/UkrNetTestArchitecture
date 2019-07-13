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

    private final NavigationHelper navigationHelper = new NavigationHelper();
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
        navigationHelper.driver = new ChromeDriver();
        navigationHelper.driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        navigationHelper.driver.manage().window().maximize();
        groupHelper = new GroupHelper(navigationHelper.driver);
        login("ittest2", "337774a");
    }

    private void login(String username, String password) {
        navigationHelper.driver.get("https://www.i.ua/");
        navigationHelper.driver.findElementByXPath("//input[@name='login']").click();
        navigationHelper.driver.findElementByXPath("//input[@name='login']").clear();
        navigationHelper.driver.findElementByXPath("//input[@name='login']").sendKeys(username);
        navigationHelper.driver.findElementByXPath("//input[@name='pass']").click();
        navigationHelper.driver.findElementByXPath("//input[@name='pass']").clear();
        navigationHelper.driver.findElementByXPath("//input[@name='pass']").sendKeys(password);
        navigationHelper.driver.findElementByXPath("//input[@value='Войти']").click();
    }

    public void stop() {
        navigationHelper.driver.quit();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }
}
