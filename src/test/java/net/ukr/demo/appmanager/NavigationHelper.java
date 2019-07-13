package net.ukr.demo.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class NavigationHelper {
    ChromeDriver driver;

    public void goToContacts() {
        driver.findElementByXPath("/html/body/div[1]/div[5]/ul/li[3]/a").click();
    }
}
