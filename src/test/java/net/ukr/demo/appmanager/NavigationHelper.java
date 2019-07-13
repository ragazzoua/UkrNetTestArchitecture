package net.ukr.demo.appmanager;

import org.openqa.selenium.chrome.ChromeDriver;

/**
 * created by FAMILY 13.07.2019
 */

public class NavigationHelper extends HelperBase {


    public NavigationHelper(ChromeDriver driver) {
        super(driver);
    }

    public void goToContacts() {
        click("/html/body/div[1]/div[5]/ul/li[3]/a");
    }
}
