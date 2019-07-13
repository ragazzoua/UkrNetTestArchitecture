package net.ukr.demo.appmanager;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.ukr.demo.model.GroupData;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * created by FAMILY 13.07.2019
 */

public class ApplicationManager extends GroupHelper {
    ChromeDriver driver;

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

    public void submitGroupCreation() {
        driver.findElementByXPath("//input[@ct='CreateGroup']").click();
    }

    public void fillGroupForm(GroupData groupData) {
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").sendKeys(groupData.getGroupName());
    }

    public void selectGroupNameField() {
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").click();
    }

    public void clickAddNewGroup() {
        driver.findElementByXPath("//*[@id='add_group']/i").click();
    }

    public void goToContacts() {
        driver.findElementByXPath("/html/body/div[1]/div[5]/ul/li[3]/a").click();
    }

    public void stop() {
        driver.quit();
    }
}
