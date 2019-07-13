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
        clickAddNewGroup();
        selectGroupNameField();
        fillGroupForm(new GroupData("testGroup"));
        submitGroupCreation();
        clickAddNewGroup();
        selectGroupNameField();
        fillGroupForm(new GroupData("testGroup1"));
        submitGroupCreation();
    }


}