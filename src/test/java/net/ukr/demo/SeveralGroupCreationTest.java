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
        driver.get("https://www.i.ua/");
        driver.findElementByXPath("//input[@name='login']").click();
        driver.findElementByXPath("//input[@name='login']").clear();
        driver.findElementByXPath("//input[@name='login']").sendKeys("ittest2");
        driver.findElementByXPath("//input[@name='pass']").click();
        driver.findElementByXPath("//input[@name='pass']").clear();
        driver.findElementByXPath("//input[@name='pass']").sendKeys("337774a");
        driver.findElementByXPath("//input[@value='Войти']").click();
        driver.findElementByXPath("/html/body/div[1]/div[5]/ul/li[3]/a").click();
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