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
 * created by FAMILY 07.07.2019
 */

public class GroupCreationTest extends TestBase {
    ChromeDriver driver;

    @BeforeMethod
    public void setUp() throws Exception {
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


    @Test
    public void groupCreationTest() {

        //driver.findElementByXPath("//p[@class='make_message']/a").click();
        goToContacts();
        clickAddNewGroup();
        selectGroupNameField();
        fillGroupForm(new GroupData("new group"));
        submitGroupCreation();


    }

    private void submitGroupCreation() {
        driver.findElementByXPath("//input[@ct='CreateGroup']").click();
    }

    private void fillGroupForm(GroupData groupData) {
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").sendKeys(groupData.getGroupName());
    }

    private void selectGroupNameField() {
        driver.findElementByXPath("//*[@id='workBody']/div[2]/div[1]/div[2]/div[3]/ul/li[1]/p/input[1]").click();
    }

    private void clickAddNewGroup() {
        driver.findElementByXPath("//*[@id='add_group']/i").click();
    }

    private void goToContacts() {
        driver.findElementByXPath("/html/body/div[1]/div[5]/ul/li[3]/a").click();
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