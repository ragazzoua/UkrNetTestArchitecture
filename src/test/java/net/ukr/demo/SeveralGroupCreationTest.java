package net.ukr.demo;

import io.github.bonigarcia.wdm.DriverManagerType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * created by FAMILY 13.07.2019
 */

public class SeveralGroupCreationTest extends TestBase {


    @Test
    public void severalGroupCreationTest() {

        goToContacts();
        driver.findElementByXPath("//*[@id='add_group']/i").click();
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").click();
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").sendKeys("groupname");
        driver.findElementByXPath("//input[@ct='CreateGroup']").click();
        driver.findElementByXPath("//*[@id='add_group']/i").click();
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").click();
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").sendKeys("groupname1");
        driver.findElementByXPath("//input[@ct='CreateGroup']").click();
    }


}